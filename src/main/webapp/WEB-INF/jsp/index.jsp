<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> Index page</title>
</head>
<body>
<h2>Spring MVC @ExceptionHandler Example</h2>

<c:if test="${not empty msg}">
    <h2>${msg}</h2>
</c:if>

</body>
</html>