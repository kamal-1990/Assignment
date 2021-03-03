<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>user Registration</title>
    <%@ include file="header.jsp"%>

</head>
<body>

<div>
    <h1>USER REGISTRATION FORM</h1>
    <form action="update_user" method="post">
        <div>

            ID:<input type="text" name="id" readonly="readonly"
                      value="${user.id}">
        </div>

        <div>

            User Name:<input type="text" name="username" value="${user.username}">
        </div>
        <div>
            Password:<input type="password" name="password" value="${user.password}">
        </div>
        <div>

            Email:<input type="text" name="email" value="${user.email}">
        </div>
        <div>

            Mobile Number:<input type="number" name="mobileNo" value="${user.mobileNo}">
        </div>
        <div>

            Address:<input type="text" name="address" value="${user.address}">
        </div>
        <div>
            <label>DOB</label> <input type="date" name="dob" value="${user.dob}">
        </div>
        <div>

            Gender:<input type="radio" name="gender" value="male" ${user.gender==male?'checked':''}>male
            <input type="radio" name="gender" value="female"  ${user.gender==female?'checked':''}>female
        </div>
        <div>

            Hobbies:<input type="checkbox" name="hobbies" value="Reading"
                           <c:if test="${fn:contains(user.hobbies,'Reading')}">checked</c:if>>Reading
            <input type="checkbox" name="hobbies" value="Drawing"
                   <c:if test="${fn:contains(user.hobbies,'Drawing')}">checked</c:if>>Drawing
            <input type="checkbox" name="hobbies" value="Singing"
                   <c:if test="${fn:contains(user.hobbies,'Singing')}">checked</c:if>>Singing
            <input type="checkbox" name="hobbies" value="Dancing"
                   <c:if test="${fn:contains(user.hobbies,'Dancing')}">checked</c:if>>Dancing
        </div>
        <div>

            Nationality:<select name="nationality">
            <option value="Nepalese"  ${user.nationality==Nepalese?'checked':''}>Nepalese</option>
            <option value="Indian" ${user.nationality==Indian?'checked':''}>Indian</option>
            <option value="American" ${user.nationality==American?'checked':''}>American</option>
            <option value="Chinese" ${user.nationality==Chinese?'checked':''}>>Chinese</option>
        </select>
        </div>
        <div>

            Comments:
            <textarea rows="5" cols="20" name="comments">${user.comments}</textarea>
        </div>
        <div>
            <input type="submit" name="Submit">
        </div>



    </form>
</div>

</body>
</html>