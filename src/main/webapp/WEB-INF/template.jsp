<%-- 
    Document   : template
    Created on : 12 oct. 2026, 07:09:42
    Author     : Florian Manse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${param.title}</title>
        <c:forTokens items="${param.cssFiles}" delims="|" var="cssFile" >
            <link rel="stylesheet" href="<c:url value="/assets/css/${cssFile}.css"/>" />
        </c:forTokens>
    </head>
    <body>
        <c:import url="/WEB-INF/jspf/header.jspf"/>
        <main>
            <jsp:include page="/WEB-INF/${param.content}.jsp" />
        </main>
        <c:import url="/WEB-INF/jspf/footer.jspf"/>
    </body>
</html>