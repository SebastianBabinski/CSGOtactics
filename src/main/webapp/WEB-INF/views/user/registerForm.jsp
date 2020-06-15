<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        body {
            background-image: url('/images/ct.jpg');
        }
    </style>
    <meta charset="UTF-8">
    <title>CSGO tactics</title>
    <link rel="stylesheet" href="../styles.css">
    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>


<div class="wrapper">
    <div class="sidebar">
        <h2>CSGO Tactics</h2>
        <ul>
            <li><a href="#"><i class="fas fa-home"></i>Home</a></li>
            <li><a href="maps"><i class="far fa-map"></i>Maps</a></li>
            <li><a href="addtactic"><i class="fas fa-plus"></i>Add tactic</a></li>
            <li><a href="#"><i class="fas fa-user"></i>Profile</a></li>
            <li><a href="#"><i class="fas fa-sign-in-alt"></i>Log in</a></li>
            <li><a href="user/form"><i class="fas fa-registered"></i>Register</a></li>
        </ul>
        <div class="social_media">
            <a href="facebook"><i class="fab fa-facebook-f"></i></a>
            <a href="twitter"><i class="fab fa-twitter"></i></a>
            <a href="instagram"><i class="fab fa-instagram"></i></a>
        </div>
    </div>
    <div class="main_content">
        <div class="header">Welcome to CSGO tactics site.</div>
        <div class="tactic_form">
            <%--@elvariable id="user" type="babinski.sebastian.model.User"--%>
            <form:form modelAttribute="user" method="post">
                <table>
                    <tr>
<%--                        <td><form:label path="nickName">Nick name</form:label></td>--%>
                        <td><form:input path="nickName" placeholder="nickname"></form:input><br/></td>
                        <td><form:errors path="nickName">Please enter your nickname.</form:errors></td>
                    </tr>
                    <tr>
<%--                        <td><form:label path="email">Email</form:label></td>--%>
                        <td><form:input path="email" type="email" placeholder="email"></form:input></td>
                    </tr>
                    <tr>
<%--                        <td><form:label path="password">Password</form:label></td>--%>
                        <td><form:password path="password" placeholder="password"></form:password></td>
                        <td><form:errors path="password">Please enter password.</form:errors></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="submit">
                        </td>
                    </tr>
                </table>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>