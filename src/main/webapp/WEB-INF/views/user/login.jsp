<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@    taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <li><a href="home"><i class="fas fa-home"></i>Home</a></li>
            <li><a href="maps"><i class="far fa-map"></i>Maps</a></li>
            <li><a href="addtactic"><i class="fas fa-plus"></i>Add tactic</a></li>
            <li><a href="#"><i class="fas fa-user"></i>Profile</a></li>
            <li><a href="#"><i class="fas fa-sign-in-alt"></i>Log in</a></li>
            <li><a href="register"><i class="fas fa-registered"></i>Register</a></li>
        </ul>
        <div class="social_media">
            <a href="facebook"><i class="fab fa-facebook-f"></i></a>
            <a href="twitter"><i class="fab fa-twitter"></i></a>
            <a href="instagram"><i class="fab fa-instagram"></i></a>
        </div>
    </div>
    <div class="main_content">
        <div class="header">Profile sign in.</div>
        <div class="register_form">
            <form>
                <table>
                    <tr>
                        <td><input placeholder="nickname"/></td>
                    <tr>
                    <tr>
                        <td><input type="password" placeholder="password"/></td>
                    </tr>
                    <td colspan="2">
                        <input class="button" type="submit" value="submit">
                    </td>
                    </tr>
                    <tr class="addnote"><td>Not registered yet? <a href="register" style="color: darkorange">Click here!</a></td></tr>
                </table>
            </form>
        </div>
    </div>
</div>

</body>
</html>