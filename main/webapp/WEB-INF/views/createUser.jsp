<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>user Registration</title>
    <%@ include file="header.jsp"%>

</head>
<body>

<div class="container">
    <div class="panel">
        <div class="panel-default">
            <div class="rows">
                <div class="col-md-2"></div>
                <div class="col-md-8 jumbotron">

                    <form action="save_user" method="post" class="form-horizontal">
                        <fieldset>
                            <legend>USER REGISTRATION FORM </legend>
                            <div class="form-group">

                                User Name:<input type="text" name="username" class="form-control">
                            </div>
                            <div class="form-group">
                                Password:<input type="password" name="password" class="form-control">
                            </div>
                            <div class="form-group">

                                Email:<input type="text" name="email" class="form-control">
                            </div>
                            <div class="form-group">

                                Mobile Number:<input type="number" name="mobileNo" class="form-control">
                            </div>
                            <div class="form-group">

                                Address:<input type="text" name="address" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>DOB</label> <input type="date" name="dob" class="form-control">
                            </div>
                            <div class="form-group">

                                Gender:<input type="radio" name="gender" value="male">male
                                <input type="radio" name="gender" value="female">female
                            </div>
                            <div class="form-group">

                                Hobbies:
                                <input type="checkbox" name="hobbies" value="Reading" class="form-control">Reading
                                <input type="checkbox" name="hobbies" value="Drawing" class="form-control">Drawing
                                <input type="checkbox" name="hobbies" value="Singing" class="form-control">Singing
                                <input type="checkbox" name="hobbies" value="Dancing" class="form-control">Dancing
                            </div>
                            <div class="form-group">

                                Nationality:<select name="nationality">
                                <option value="Nepalese">Nepalese</option>
                                <option value="Indian">Indian</option>
                                <option value="American">American</option>
                                <option value="Chinese">Chinese</option>
                            </select>
                            </div>
                            <div class="form-group">

                                Comments:
                                <textarea rows="5" cols="20" name="comments" class="form-control"></textarea>
                            </div>
                            <div class="form-group">
                                <input type="submit" name="Submit" class="btn btn-success">
                            </div>


                        </fieldset>
                    </form>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>
    </div>
</div>

</body>
</html>