<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">Login</h3>
    </div>

    <div class="panel-body">
        <form action="login" method="post">
            <div class="input-group">
                <input placeholder="username" class="form-control" type="text" name="name"><br>
                <input placeholder="password" class="form-control" type="password" name="pswd"><br>
                %{--<input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">--}%
            </div>
            %{--<input placeholder="username" class="input-field" type="text" name="name"><br>--}%
            %{--<input placeholder="password" class="input-field" type="password" name="pswd"><br>--}%

            <p style="display:${(password) ? 'block' : 'none'}; color:red">Wrong password</p>

            <p style="display:${(username) ? 'block' : 'none'}; color:red">Username Does not exist</p>

            <p><a href="#">Forgot password ?</a></p>
            <button type="submit">Login</button>
        </form>
    </div>
</div>