<%--
  Created by IntelliJ IDEA.
  User: 17614
  Date: 2022-07-04
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post">
    <table>
        <tr>
            <td>编号:</td>
            <td>
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>地址编号:</td>
            <td>
                <input type="text" name="address.code">
            </td>

        </tr>
        <tr>
            <td>地址信息:</td>
            <td>
                <input type="text" name="address.value">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>


</form>

</body>
</html>

