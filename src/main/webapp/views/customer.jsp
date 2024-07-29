<%--
  Created by IntelliJ IDEA.
  User: ceotungbeo
  Date: 28/7/24
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
<table>
    <tr>
        <td colspan="4"><h1>
            Danh sách khách hàng
        </h1></td>
    </tr>
    <tr class="table-row">
        <td>Tên</td>
        <td>Ngày sinh</td>
        <td>Địa chỉ</td>
        <td>Ảnh</td>
    </tr>
    <c:forEach var="item" items="${customerList}">
        <tr class="table-row">
            <td><c:out value="${item.name}"/></td>
            <td><c:out value="${item.birthday}"/></td>
            <td><c:out value="${item.address}"/></td>
            <td><img src="<c:out value="${item.image}"/>" alt="avatar"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
