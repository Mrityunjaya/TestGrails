<%@ page import="com.src.Constants" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title pull-left">
            Top Posts
        </h3>

        <g:select class="pull-right" name="timeSlots" from="${Constants.timeSlots}"
                   valueMessagePrefix="timeSlots"/>
        <div class="clearfix"></div>
    </div>
    ${tmplObjects}
    <div class="panel-body">
        <g:render template="/templates/postTemplate" model="[values: tmplObjects]"></g:render>
    </div>
</div>