<!DOCTYPE html>
<html>
<head><title>Pagina simpla JSP</title></head>
<body>
<h1>Pagina simpla JSP</h1>
<%@ page import="java.util.*" %>
<h2>Timpul pe server este: <%= new Date() %></h2>
<p>
Aceasta este o pagina simpla JSP. Cand se creaza un proiect nou Dynamic Web in Eclipse,
se copie acest fisier in folderul WebContent, se starteaza serverul si se deployaza aplicatia , 
iar accesul la pagina se face prin http://localhost/<i>appName</i>/simplujsp.jsp.
</p>
</body></html>