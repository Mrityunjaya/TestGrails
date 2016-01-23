<%@ page import="com.src.Constants" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="Link Sharing"/></title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
    <link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
    <link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
    <asset:stylesheet src="application.css"/>
    <div>
        <div class="navbar navbar-inverse">
            <g:link controller="home"><h2 class="navbar-left">Hello Link Sharing App</h2></g:link>
            <div class="nav navbar-nav pull-right" id="search-form">
                <g:uploadForm class="form-inline" role="form" method="post" action="pageTraversal"
                              controller="home">
                    <div class="inner-addon left-addon list-inline" id="searchInput">
                        <div>
                            <i class="glyphicon glyphicon-search"></i>
                            <input type="text" class="form-control search-form " placeholder="Search">
                            <ul class="nav navbar-nav navbar-right"
                                style="display:${(session['user'] != null) ? 'block' : 'none'};">
                                %{--<g:link controller="home" action="logout">Logout(Temp)</g:link>--}%
                                <a href="" data-toggle="modal" data-target="#topicDiv"><span
                                        class="glyphicons glyphicon-cloud white hover"
                                        style="font-size: 20px"></span></a>
                                <a href="" data-toggle="modal" data-target="#invitDiv"><span
                                        class="glyphicons glyphicon-link white hover"
                                        style="font-size: 20px"></span></a>
                                <a href="" data-toggle="modal" data-target="#resourceDiv"><span
                                        class="glyphicons glyphicon-envelope white hover"
                                        style="font-size: 20px"></span></a>
                                <a href="" data-toggle="modal" data-target="#documentDiv"><span
                                        class="glyphicons glyphicon-file white hover"
                                        style="font-size: 20px"></span></a>
                                %{--<g:link controller="home" action="createTopic"><span--}%
                                %{--class="glyphicons glyphicon-cloud white hover"--}%
                                %{--style="font-size: 20px"></span></g:link>--}%
                                %{--<g:link controller="home" action="sendInvitation"><span--}%
                                %{--class="glyphicons  glyphicon-link white hover"--}%
                                %{--style="font-size: 20px"></span></g:link>--}%
                                %{--<g:link controller="home" action="createResource"><span--}%
                                %{--class="glyphicons glyphicon-envelope white hover"--}%
                                %{--style="font-size: 20px"></span></g:link>--}%
                                %{--<g:link controller="home" action="createDocument"><span--}%
                                %{--class="glyphicons glyphicon-file white hover"--}%
                                %{--style="font-size: 20px"></span></g:link>--}%
                                <g:select onchange="this.form.submit()" class="dropdown dropdown-toggle"
                                          name="userPage"
                                          from="${Constants.userPages}"
                                          value=""/>
                            </ul>

                            %{--<i class="inner-addon right-addon glyphicon glyphicon-remove-circle"></i>--}%
                            %{--</div>--}%

                        </div>
                    </div>
                </g:uploadForm>
            </div>
        </div>
    </div>

    %{--<asset:javascript src="application.js"/>--}%
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <g:layoutHead/>
</head>

<body class="container">

<div id="topicDiv" class="modal fade" role="dialog">
    <g:render template="/templates/newTopic"></g:render>
</div>

<div id="invitDiv" class="modal fade" role="dialog">
    <g:render template="/templates/newInvit"></g:render>
</div>

<div id="resourceDiv" class="modal fade" role="dialog">
    <g:render template="/templates/newLink"></g:render>
</div>

<div id="documentDiv" class="modal fade" role="dialog">
    <g:render template="/templates/newDocument"></g:render>
</div>



<g:layoutBody/>
<div class="footer" role="contentinfo"></div>

%{--<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>--}%
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>
<asset:javascript src="application.js"></asset:javascript>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
