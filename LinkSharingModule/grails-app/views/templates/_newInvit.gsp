<div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Create Invitation</h4>
        </div>

        <div class="modal-body">
            <g:uploadForm controller="home" action="sendInvitation" method="post">
                <div class="input-group">
                    <label>Email: <input placeholder="Email" class="input-field " type="email"
                                         name="email"></label><br>
                    <label>Topic: <g:select class="dropdown dropdown-toggle"
                                            name="topic" from="${topics}"
                                            optionKey="id" optionValue="name"/></label>
                    %{--<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">--}%
                </div>
                <button type="submit" class="btn btn-default">Invite</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
            </g:uploadForm>
        </div>
    </div>
</div>