
<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC Application</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="row">
        <div class="span8 offset2">
            <h1>objectives</h1>
            <form:form method="post" action="/objective/add" commandName="objective" class="form-horizontal">
            <div class="control-group">
                <form:label cssClass="control-label" path="description">Description:</form:label>
                <div class="controls">
                    <form:input path="description"/>
                </div>
            </div>
            <div class="control-group">
                <form:label cssClass="control-label" path="name">Name:</form:label>
                <div class="controls">
                    <form:input path="name"/>
                </div>
            </div>

            <div class="control-group">
                <form:label cssClass="control-label" path="tasks">Tasks:</form:label>
                <div class="controls">
                    <form:select path="tasks"/>
                </div>
            </div>

            <div class="control-group">
                <div class="controls">
                    <input type="submit" value="Add Objective" class="btn"/>
                    </form:form>
                </div>
            </div>

            <c:if test="${!empty objectives}">
                <h3>Objectives</h3>
                <table class="table table-bordered table-striped">
                    <thead>
                    <tr>
                        <th>Description</th>
                        <th>Name</th>
                        <th>Tasks</th>
                        <th>&nbsp;</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${objectives}" var="objective">
                        <tr>
                            <td>${objective.description}</td>
                            <td>${objective.name}</td>
                            <c:forEach items="${objective.tasks}" var="task">
                                <td>${task.name}</td>
                            </c:forEach>
                            <td>
                                <form action="objective/delete/${objective.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>

</body>
</html>