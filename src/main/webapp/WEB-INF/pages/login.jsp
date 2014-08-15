
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

        <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
        <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="span8 offset2">
                    <h1>Login</h1>
                </div>
            </div>
            <form action="/login" method="post">
                <div class="control-group">
                    <label>Username:</label>
                    <div class="controls">
                        <input type="text"/>
                    </div>
                </div>
                <div class="control-group">
                    <label>Password:</label>
                    <div class="controls">
                        <input type="text"/>
                    </div>
                </div>
                <input type="submit" value="ok" />
            </form>
        </div>
    </body>
</html>