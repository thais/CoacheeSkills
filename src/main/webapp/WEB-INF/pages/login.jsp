
<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta charset="utf-8">
        <title>Coachee Skills</title>

        <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
        <!-- Latest compiled and minified JavaScript -->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="/css/login.css">
    </head>

    <body>
        <div class="container">
            <div class="row">
                <h1>Login</h1>
            </div>
            <div class="row">
                <div class="jumbotron">
                        <form class="form-signin" action="/login" method="post">
                            <div class="form-group">
                                <label>Username:</label>
                                <input class="form-control" type="text" placeholder="Username"/>
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input class="form-control" type="password" placeholder="Password"/>
                            </div>
                            <button type="submit" class="btn btn-default btn-lg">Go, go, Power Ranger!</button>
                        </form>
                </div>
            </div>
            <div class="row">
            </div>
        </div>
    </body>
</html>