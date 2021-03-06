package com.chinadrtv.oms.suning.biz;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinadrtv.oms.suning.dto.OrderConfig;
import com.chinadrtv.oms.suning.service.FeedbackService;
import com.chinadrtv.runtime.jms.receive.JmsListener;

/**
 * 
 * <dl>
 *    <dt><b>Title:</b></dt>
 *    <dd>
 *    	none
 *    </dd>
 *    <dt><b>Description:</b></dt>
 *    <dd>
 *    	<p>none
 *    </dd>
 * </dl>
 *
 * @author andrew
 * @version 1.0
 * @since 2014-11-12 下午1:51:48 
 *
 */
public class FeedbackTopicListener extends JmsListener<Object> {

	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(FeedbackTopicListener.class);

	private AtomicBoolean isRun = new AtomicBoolean(false);

	private List<OrderConfig> configList;
	
	@Autowired
	private FeedbackService feedbackService;

	public FeedbackTopicListener() {
		logger.info("SuNing FeedbackTopicListener created");
	}
	
	
	@Override
	public void messageHandler(Object msg) throws Exception {

		if (isRun.compareAndSet(false, true)) {
			try {
				
				feedbackService.feedback(configList);
			} catch (Exception e) {
				logger.error("feed back error:", e);
			} finally {
				isRun.set(false);
				logger.info("end feed back!");
			}
		} else {
			logger.error("feed back is running!");
		}
	}


	public List<OrderConfig> getConfigList() {
		return configList;
	}
	public void setConfigList(List<OrderConfig> configList) {
		this.configList = configList;
	}
}
