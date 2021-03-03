<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <%@ include file="header.jsp" %>
</head>
<body>


<div>Goto:<a href="add_user" class="btn btn-primary" >Add User</a></div>
<div><h3>User Listed Area</h3></div>

<c:if test="${!empty users }">
    <div>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>User Name</th>

                <th>Email</th>
                <th>Mobile Number</th>
                <th>Address</th>
                <th>DOB</th>
                <th>Gender</th>
                <th>Hobbies</th>
                <th>Nationality</th>
                <th>Comments</th>
                <th>Actions</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>

                    <td>${user.email}</td>
                    <td>${user.mobileNo}</td>
                    <td>${user.address}</td>
                    <td>${user.dob}</td>
                    <td>${user.gender}</td>
                    <td>${user.hobbies}</td>
                    <td>${user.nationality}</td>
                    <td>${user.comments}</td>
                    <sec:authorize access="hasRole('ROLE_ADMIN') and isAuthenticated()">
                    <td>
                        <a href="edit_user?id=${user.id}">Edit</a>
                        <a href="delete_user?id=${user.id}">Delete</a>
                    </td>
                    </sec:authorize>




                </tr>
            </c:forEach>


            </tbody>
        </table>
    </div>
</c:if>


</body>
</html>