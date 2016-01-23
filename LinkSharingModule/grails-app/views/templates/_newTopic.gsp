<%@ page import="org.code.app.Visibility;" %>
<div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Create Topic</h4>
        </div>

        <div class="modal-body">
            <g:uploadForm controller="home" action="createTopic" method="post">
                <div class="input-group">
                    <input placeholder="Name" class="form-control" type="text" name="name"><br>

                    <p>Visibility: <g:select class="dropdown dropdown-toggle"
                                             name="visibility"
                                             from="${Visibility.values()}"
                                             value="id"/></p>
                    %{--<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">--}%
                </div>
                <button type="submit">Create</button>
            </g:uploadForm>
        </div>

        <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
    </div>
</div>