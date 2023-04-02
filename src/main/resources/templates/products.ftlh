<!DOCTYPE html>
<html>
    <head>
        <title>
            SportShop
        </title>
    </head>
    <body>
        <h1>SportShop</h1><hr>
        <h4>Список товаров</h4>
        <form action="/" method="get">
            Поиск по назаванию товара: <input type="text" name="title"><br>
            <input type="submit" value="Поиск"/>
        </form>
        <#list products as product>
            <div>
                <p>
                    <b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a>
                </p>
            </div>
            <#else>
            <h3>Товаров нет</h3>
        </#list>
        <hr>
        <h3>Создать новый товар</h3>
        <form action="/product/create" method="post" enctype="multipart/form-data">
            Название объявления: <input type="text" name="title"/> <br> <br>
            Описание товара: <input type="text" name="description"/> <br> <br>
            Цена товара: <input type="number" name="price"/> <br> <br>
            Бренд товара: <input type="text" name="brand"/> <br> <br>
            Первая фотография: <input type="file" name="file1"/> <br> <br>
            Вторая фотография: <input type="file" name="file2"/> <br> <br>
            Третья фотография: <input type="file" name="file3"/> <br> <br>

            <input type="submit" value="Добавить товар"/>
        </form>
    </body>
</html>

