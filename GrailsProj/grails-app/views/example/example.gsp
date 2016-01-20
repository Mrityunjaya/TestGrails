<%--
  Created by IntelliJ IDEA.
  User: mj
  Date: 18/1/16
  Time: 11:20 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title></title>
</head>

<body>
<p>This is Example view page</p>

<p>Name = ${name}</p>
<g:render template="/abc/demoTemplate" model="[name: name]"></g:render>
</body>
</html>