<%--
  Created by IntelliJ IDEA.
  User: mj
  Date: 22/1/16
  Time: 2:43 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Topics - ${session['user']}</title>
</head>

<body>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">Trending Topics</h3>
    </div>

    <div class="panel-body">

        <g:each in="${topics}">
            <p name="topicName">${it.name}
            <g:link controller="home" method="post"
                    action="${(userData.topicsSubscribed != null && userData.topicsSubscribed.name.contains(it.name)) ? 'unsubscribe' : 'subscribe'}"
                    params="['topic': it.name]">
                <p>${(userData.topicsSubscribed != null && userData.topicsSubscribed.name.contains(it.name)) ? "unsubscribe" : "subscribe"}</p>
            </g:link>
            </p>
        </g:each>
    </div>
</div>
</body>
</html>