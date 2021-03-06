<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Visit</title>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/materialize.min.css"/>">
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>
<%@include file="../HomePage/Header.jsp" %>
<main>
    <div class="row row-container">
        <jsp:include page="../HomePage/Navbar.jsp"/>
        <div class="col s3 offset-s3">
            <div class="card">
                <div class="card-content">
                    <h5 class="h4-own center-align"><i class="small material-icons blue-text prefix">list_alt</i>Add
                        visit</h5>
                </div>
            </div>
        </div>
        <div class="col s12 l10">
            <div class="card">
                <form:form method="post" modelAttribute="visit">
                    <div class="row">
                        <div class="card-content">
                            <h5 class="h4-own center-align">Visit</h5>
                            <hr class="solid">
                            <div class="row row-margin0">
                                <div class="input-field col s4 offset-s2">
                                    <i class="material-icons prefix blue-text">date_range</i>
                                    <input id="visitDate" type="text" class="datepicker" name="visitDate" required>
                                    <label for="visitDate">Date of visit</label>
                                    <form:errors cssClass="red-text" path="visitDate"/>
                                </div>
                                <div class="input-field col s4">
                                    <i class="material-icons prefix blue-text">accessibility</i>
                                    <select id="patient" name="patient.id">
                                        <c:forEach var="patient" items="${patient}">
                                            <option value="${patient.id}">${patient.name} ${patient.surname}</option>
                                        </c:forEach>
                                    </select>
                                    <label for="patient">Select patient for visit</label>
                                </div>
                            </div>
                            <div class="row row-margin0">
                                <div class="input-field col s4 offset-s2">
                                    <i class="material-icons prefix blue-text">person</i>
                                    <select id="doctor" name="doctor.id">
                                        <c:forEach var="doctor" items="${doctor}">
                                            <option value="${doctor.id}">${doctor.name} ${doctor.surname}</option>
                                        </c:forEach>
                                    </select>
                                    <label for="doctor">Select doctor for visit</label>
                                </div>
                                <div class="input-field col s4">
                                    <i class="material-icons prefix blue-text">control_point</i>
                                    <select id="medicalExamination" name="medicalExamination.id">
                                        <c:forEach var="medical" items="${medical}">
                                            <option value="${medical.id}">${medical.type}</option>
                                        </c:forEach>
                                    </select>
                                    <label for="medicalExamination">Select medical examination</label>
                                </div>
                            </div>
                            <div class="row row-margin0">
                                <div class="input-field col s4 offset-s2">
                                    <i class="material-icons prefix blue-text">location_on</i>
                                    <input id="location" type="text" name="location" required>
                                    <label for="location">Location</label>
                                    <form:errors cssClass="red-text" path="location"/>
                                </div>
                                <div class="input-field col s4">
                                    <i class="material-icons prefix blue-text">attach_money</i>
                                    <input id="charge" type="number" min="0" step="5" name="charge" required>
                                    <label for="charge">Charge</label>
                                    <form:errors cssClass="red-text" path="charge"/>
                                </div>
                            </div>
                            <div class="row row-margin0">
                                <div class="input-field col s12">
                                    <i class="material-icons prefix blue-text">add</i>
                                    <textarea id="visitDescription" class="materialize-textarea" name="visitDescription"
                                              data-length="120"></textarea>
                                    <label for="visitDescription">Description</label>
                                </div>
                            </div>
                            <button class="btn waves-effect waves-light right blue" type="submit">
                                Save <i class="material-icons right">send</i>
                            </button>
                            <button class="btn waves-effect waves-light red" type="reset">
                                Reset <i class="material-icons right">autorenew</i>
                            </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
</main>


<script type="text/javascript" src="<c:url value="/js/jquery-3.4.1.slim.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/js/materialize.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/js/functions.js"/>"></script>
</body>
</html>

