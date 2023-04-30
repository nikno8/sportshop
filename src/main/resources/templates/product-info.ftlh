<!DOCTYPE html>
<html>
<head>
    <title>
        SportShop
    </title>
</head>
<body>
<h1>SportShop</h1><hr>
<h4>Подробная информация о товаре</h4>
<#list images as img>
    <img src="/images/${img.id}" height="60px"> <br> <br>
</#list>

<b>Название товара</b>${product.title}<br>
<b>Описание товара</b>${product.description}<br>
<b>Цена товара</b>${product.price}<br>
<b>Бренд товара</b>${product.brand}<br>
<hr>

</body>
</html>
