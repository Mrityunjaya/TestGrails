<%@ page import="com.src.Constants" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Link Sharing App</title>

</head>

<body class="container">

<div class="col-md-8 col-lg-9">
    <p class="center-block"
       style="display:${(userAdded) ? 'block' : 'none'}; color:${(userAdded) ? 'green' : 'red'}">
        ${(userAdded) ? 'User Registered' : 'UserNot registered'}</p>

    <p class="center-block"
       style="display:${(passwordReset) ? 'block' : 'none'}; color:${(passwordReset) ? 'green' : 'red'}">
        ${(passwordReset) ? Constants.pswdReset : Constants.invalidPswd}</p>

    <p class="center-block"
       style="display:${(userAdded) ? 'block' : 'none'}; color:${(userAdded) ? 'green' : 'red'}">
        ${(resetPswd) ? 'Password Reset' : 'Invalid Password: Either same as previous or less than 6 Characters long'}</p>
    <g:render template="/templates/recentShares"></g:render>
</div>

<div class="col-md-4 col-lg-3">
    <g:render template="/templates/login"></g:render>
    <g:render template="/templates/register"></g:render>
</div>
</body>
</html>
