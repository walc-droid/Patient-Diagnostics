<%--
  Created by IntelliJ IDEA.
  User: walcu
  Date: 13.03.2021
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Patient web app</title>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/materialize.min.css"/>">
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>
<%@include file="Header.jsp" %>
<main>
    <div class="row row-container">
        <jsp:include page="Navbar.jsp"/>
            <div class="col s3 offset-s3">
                <div class="card">
                    <div class="card-content">
                        <h5 class="h4-own center-align"> <i class="small material-icons blue-text prefix">accessibility</i>Patients web-app</h5>
                    </div>
                </div>
            </div>
        <div class="col s12 l10">
            <div class="card">
                <div class="card-content">
                    <h5 class="h4-own center-align">News</h5>
                    <hr class="solid">
                </div>
            </div>
        </div>
    </div>
</main>

<script type="text/javascript" src="<c:url value="/js/jquery-3.4.1.slim.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/js/materialize.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/js/functions.js"/>"></script>
</body>
</html>
