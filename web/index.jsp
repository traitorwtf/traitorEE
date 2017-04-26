<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Аниме база::Вход</title>
        <link href="css/style_index.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <div class="main">

            <div class="content">
                <p class="title"><span class="text"><img src="../images/logo.jpg" width="77" height="77" hspace="10" vspace="10" align="middle"></span></p>
                <p class="title">Аниме база</p>
                <p class="text">Добро пожаловать в онлайн аниме базу, где вы сможете найти аниме на ваш вкус. Доступны функции поиска, просмотра, сортировки и многие другие.</p>
                <p class="text">Проект находится в разработке, поэтому дизайн и функционал будет постоянно дорабатываться.</p>
                <p class="text">По всем вопросам обращайтесь по адресу <a href="mailto:support@testanimebase.com">support@testanimebase.com</a></p>
                <p>&nbsp;</p>

            </div>

            <div class="login_div">
                <p class="title">Для входа введит свои данные:</p>
                <form class="login_form" name="username" action="pages/main.jsp" method="POST">
                    Имя: <input type="text" name="username" value="" size="20" />
                    <input type="submit" value="Войти" />
                </form>

            </div>

            <div class="footer">
                Разработчик: traitor, 2017 г
            </div>
        </div>


    </body>
</html>
