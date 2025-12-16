<!DOCTYPE html>
<html>
<head>
    <title>Login - Stock Market Prediction</title>
    <style>
        body { font-family: Arial; margin: 0; padding: 20px; background: #f4f4f4; }
        .login-container { width: 300px; margin: 100px auto; background: white; padding: 20px; border-radius: 5px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }
        input[type=text], input[type=password] { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ddd; }
        input[type=submit] { background: #35424a; color: white; padding: 10px; border: none; cursor: pointer; width: 100%; }
        .error { color: red; }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form action="login" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <input type="submit" value="Login">
        </form>
        <p>Don't have an account? <a href="register.jsp">Register here</a></p>
    </div>
</body>
</html>
