/**
 * Created with IntelliJ IDEA.
 * User: haoleitao
 * Date: 13-9-4
 * Time: 下午1:03
 * To change this template use File | Settings | File Templates.
 */

var _cti_server=null;



var beforeSubmit = function(citServer){
$.ajax({
    type : "post",
    url : citServer+"/cti/saveCtiInfo",
    data :  {agentId: $("#j_username").val(),areacode:$("#j_cti_server").val(),softphone:$("#softphone").attr("checked")?"1":"2" },
    async : false,
    dataType:"json",
    success : function(data){

    }
});
}

function loader() {
    try {
        var b = document.login.j_username.value;
        null !== b && 0 < b.length ? document.login.j_password.focus() : document.login.j_username.focus()
    } catch (a) {
        if (window == top)throw a;
    }
}

function checkCaps(b) {
    var a = 0, c = !1, a = document.all ? b.keyCode : b.which, c = b.shiftKey;
    b = document.getElementById("pwcaps");
    var d = 65 <= a && 90 >= a, a = 97 <= a && 122 >= a;
    if (d && !c || a && c)b.style.display = "block"; else if (a && !c || d && c)b.style.display = "none"
};


function validateForm(){
   if( $('#j_username').val().length>0){

   }else{
       $("#loginError").html("");
   }


}

