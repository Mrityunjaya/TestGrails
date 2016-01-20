<%--
  Created by IntelliJ IDEA.
  User: mj
  Date: 20/1/16
  Time: 4:07 PM
--%>

<%@ page import="com.src.Constants" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body class="container">
<g:uploadForm controller="login" action="resetPassword" method="post">
    <div class="input-group center-block" style="width:30%">
        <p class="center-block"
           style="display:${(passwordNotReset) ? 'block' : 'none'}; color:${(passwordNotReset) ? 'red' : 'green'}">
            ${(passwordNotReset) ? Constants.invalidPswd : Constants.pswdReset}</p>
        <p class="center-block"
           style="display:${(nullUser) ? 'block' : 'none'}; color:${(nullUser) ? 'red' : 'green'}">
            ${(nullUser) ? Constants.userNotFound : Constants.userFound}</p>

        <p style="display:${(nullUser) ? 'block' : 'none'}; color:red">Unknown User</p>
        <input placeholder="Username/email" class="form-control" type="text" name="name" required><br>
        <input placeholder="Password" class="form-control" type="password" name="pswd" required><br>
        <input placeholder="Confirm Password" class="form-control" type="password" name="confirmPswd" required><br>
        <button type="submit">Reset</button>
    </div>
</g:uploadForm>
</body>
</html>