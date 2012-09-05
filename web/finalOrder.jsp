<%-- 
    Document   : finalOrder
    Created on : Sep 5, 2012, 3:30:43 PM
    Author     : JoeGollakner
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Final order</title>
    </head>
    <body>
        <h1>Here are the items within your selection!</h1><br />
        <p>
            <%
                List recs = (List) request.getAttribute("FinalOrder");
                Iterator it = recs.iterator();
                while (it.hasNext()) {
                    out.print("<br>try: " + it.next());
                }
            %>
        </p>
        <p><a href="select.html">Back
    </body>
</html>
