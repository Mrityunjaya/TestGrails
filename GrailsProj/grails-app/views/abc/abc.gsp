<%--
  Created by IntelliJ IDEA.
  User: mj
  Date: 18/1/16
  Time: 2:38 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Abc Example...view</title>
</head>

<body>
<g:render template="demoTemplate" model="[name: name]"></g:render>

<g:uploadForm action="example/upload" method="post">

    <input placeholder="Username" class="form-control" type="text" name="username" required><br>
    <input type="file" name="myFile"/> <input type="submit"/>
%{--<input placeholder="Photo" class="form-control" type="file" name="photo"><br>--}%
</g:uploadForm>
</body>
</html>