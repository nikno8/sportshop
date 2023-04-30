<!DOCTYPE html>
<html>
<head>
    <title>
        SportShop
    </title>
</head>
<body>
<h1>merchStore</h1><hr>
<h4>Авторизация</h4>
<form action="/login" method="post">
    Email: <input type="email" name="username"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Войти"/>
</form>
<a href="/registration">Зарегистрироваться</a>
</body>
</html>