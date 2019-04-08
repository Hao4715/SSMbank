<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>登录</title>
    <!-- 引入jquery-->
    <script type="text/javascript" src="${ctx}/static/jQuery/jquery-3.3.1.min.js"></script>
    <!-- 引入样式-->
    <link href="${ctx}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${ctx}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div align="center">
    <form action="${ctx}/account/login" method="post" onsubmit="return check()">
        <h1>个人网上银行</h1>
        卡号：<input type="text" name="cardNo" id="cardNo"/><br>
        密码：<input type="password" name="password" id="password"/><br>
        <input type="submit" value="登录"/>

    </form>
</div>
<script>
    var errorMsg = '${errorMsg}';
    if(errorMsg != null && errorMsg != undefined && errorMsg != '')
        alert(errorMsg);

    function check() {
        var cardNo = document.getElementById('cardNo').value;
        if(cardNo.length != 16){
            alert("卡号必须为16位");
            return false;
        }
        var password = document.getElementById("password").value;
        if(password.length == 0){
            alert("密码不可为空");
            return false;
        }else if(password.length != 6){
            alert("密码必须为6位");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
