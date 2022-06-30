<%-- 
    Document   : veralmacen
    Created on : 14/06/2022, 09:13:56 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista Almacen</h1>
        <ul> 
            <C:forEach var="alm" items="${almacen}">
                <li>
                    ${alm.idMaquina} ${alm.nomMaquinas} ${alm.cantMaquinas} ${alm.estadoMaquina}
                </li>
            </C:forEach>
        </ul>
    </body>
</html>
