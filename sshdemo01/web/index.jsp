<%--
  Created by IntelliJ IDEA.
  User: MAYDAY
  Date: 2019/3/27
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>user</title>
  </head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <body>
  <fieldset>
      <legend>User</legend>
      <form action="/addUser" method="post">
          <table>
              <tr>
                  <td>name：</td>
                  <td><input name="name"></td>
              </tr>
              <tr>
                  <td>age：(type is int)</td>
                  <td><input name="age"></td>
              </tr>
              <tr>
                  <td>sex:(man or woman)</td>
                  <td><input name="sex"></td>
              </tr>
              <tr>
                  <td>adress:</td>
                  <td><input name="adress"></td>
              </tr>
              <tr>
                  <td colspan="2" align="center">
                      <input type="submit" value="submit">
                  </td>
              </tr>
          </table>
      </form>
  </fieldset>
  </body>
</html>
