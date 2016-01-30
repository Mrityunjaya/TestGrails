<%@ page import="org.code.app.Visibility" %>
<div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Create Link</h4>
        </div>

        <div class="modal-body">
            <g:uploadForm controller="home" action="createLink" method="post">
                <div class="input-group">
                    <label>Link: <input placeholder="Name" class="input-field " type="url"
                                        name="url"></label><br>
                    <label>Description: <textarea class="input-field " type="text"
                                                  name="description"></textarea></label><br>

                    <label>Topic: <g:select class="dropdown dropdown-toggle"
                                            name="topic" optionKey="id" optionValue="name"
                                            from="${(topics)}"/>
                    </label>
                    %{--<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">--}%
                </div>
                <button type="submit" class="btn btn-default">Create</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
            </g:uploadForm>
        </div>
    </div>
</div>