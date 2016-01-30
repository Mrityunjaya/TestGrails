<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">Inbox</h3>
    </div>
    ${tmplObjects}
    <div class="panel-body">
        <g:render template="/templates/shareTemplate" model="[values: tmplObjects]"></g:render>
    </div>
</div>