<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>用户主页</title>
</head>
<body>

    <div>
        卡号：${account1.cardNo} <a href="${ctx}/account/logout">退出登录</a>
    </div>
    <div style="float: left ; width: 100px ;height: 300px; ;margin-top: 20px">
        <div style="height: 15px;"><a href="${ctx}/account/balance/${account1.cardNo}">查询余额</a></div>
        <div style="height: 15px;margin-top: 10px"><a href="${ctx}/account/transferTo">转账</a></div>
        <div style="height: 15px;margin-top: 10px"><a href="#">查询交易记录</a></div>
        <div style="height: 15px;margin-top: 10px"><a href="#">修改密码</a></div>
    </div>
    <div style="float: left;margin-top: 20px;width: 300px;height: 300px;border:8px #777777 solid">
        <c:if test="${page eq 'balance'}">
            <jsp:include page="./balance.jsp"/>
        </c:if>
        <c:if test="${page eq 'transfer'}">
            <jsp:include page="./transfer.jsp"/>
        </c:if>
    </div>

</div>
</body>
</html>
