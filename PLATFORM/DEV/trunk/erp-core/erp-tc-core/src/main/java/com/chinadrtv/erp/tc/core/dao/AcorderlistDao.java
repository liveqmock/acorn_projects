package com.chinadrtv.erp.tc.core.dao;

import com.chinadrtv.erp.core.dao.GenericDao;
import com.chinadrtv.erp.model.Acorderlist;

import java.util.List;

/**
 * Created with (TC).
 * User: 徐志凯
 * Date: 13-2-20
 * 橡果国际-系统集成部
 * Copyright (c) 2012-2013 ACORN, Inc. All rights reserved.
 */
public interface AcorderlistDao extends GenericDao<Acorderlist,Long> {
    List<Acorderlist> findAcorderListFromOrderId(String orderId);
}
