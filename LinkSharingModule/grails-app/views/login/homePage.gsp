<%--
  Created by IntelliJ IDEA.
  User: mj
  Date: 20/1/16
  Time: 3:44 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home - ${session['name']}

    </title>
</head>

<body>

<div class="alert alert-success alert-dismissible" role="alert" id="messageDiv"
     style="display:${((flash.message != null) && (flash.message != "")) ? 'block' : 'none'};">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span>
    </button>
    ${flash.message}
</div>


<div class="col-md-5 col-lg-5">
    <g:render template="/templates/profileTemplate"></g:render>
    <g:render template="/templates/subscriptions"></g:render>
    <g:render template="/templates/trending"></g:render>
</div>

<div class="col-md-7 col-lg-7">
    <g:render template="/templates/inbox"></g:render>
    <g:render template="/templates/shareLink"></g:render>
    <g:render template="/templates/shareDocument"></g:render>
</div>

</body>
</html>