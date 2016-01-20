<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">New User</h3>
    </div>

    <div class="panel-body">
        <g:uploadForm controller="register" method="post">
            <div class="input-group">
                <input placeholder="First name" class="form-control" type="text" name="firstName" required><br>
                <input placeholder="Last Name" class="form-control" type="text" name="lastName" required><br>
                <input placeholder="Email" class="form-control" type="text" name="email" required><br>
                <input placeholder="Username" class="form-control" type="text" name="username" required><br>
                <input placeholder="Password" class="form-control" type="password" name="password" required><br>
                <input placeholder="Confirm Password" class="form-control" type="password" name="confirmPassword"
                       required><br>

                <p style="display:${(diffConfirmPswd) ? 'block' : 'none'}; color:red">Different password</p>

                <input placeholder="Photo" class="form-control" type="file" name="photo"><br>
            </div>

            <p style="display:${(confirmPassword) ? 'block' : 'none'}; color:red">Confirm password not same</p>

            <button type="submit">Register</button>
        </g:uploadForm>
    </div>
</div>