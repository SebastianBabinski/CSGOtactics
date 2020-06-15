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
            <%--@elvariable id="tactic" type="babinski.sebastian.model.Tactic"--%>
            <form:form modelAttribute="tactic" method="post">
                <table>
                    <tr>
                        <td>
                            <form:input path="tacticName" placeholder="tactic name"/><br/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:select path="tacticMap">
                                <form:option value="dust2">dust2</form:option>
                                <form:option value="inferno">inferno</form:option>
                                <form:option value="mirage">mirage</form:option>
                                <form:option value="nuke">nuke</form:option>
                                <form:option value="overpass">overpass</form:option>
                                <form:option value="train">train</form:option>
                                <form:option value="vertigo">vertigo</form:option>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:select path="tacticSide">
                                <form:option value="terro">T</form:option>
                                <form:option value="ct">CT</form:option>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:select path="tacticRound">
                                <form:option value="pistol">pistol</form:option>
                                <form:option value="eco">eco</form:option>
                                <form:option value="force">force</form:option>
                                <form:option value="fullbuy">fullbuy</form:option>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                                <form:textarea path="tacticText" style="overflow:auto;resize:none" rows="3" cols="20"/>
                        </td>
                    </tr>
                            <tr>
                                <td>
                            <form:input path="tacticURL"/><br/>
                                </td>
                            </tr>
                    <tr>
                        <td>
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