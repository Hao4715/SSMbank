<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: UNOmoist
  Date: 2019/4/8
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<h2>转账</h2>
<form action="${ctx}/account/transfer" method="post">
    转入账号：<input type="text" name="cardNo"/><br/>
    转入金额：<input type="text" name="transactionAmount"/><br/>
    <input type="submit" value="确认转账"/>
</form>
