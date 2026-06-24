<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Validation Failed</h2>
<c:forEach var="error"
items="${errors}">
<p>${error.field}:${error.defaultMessage}</p>
</c:forEach>