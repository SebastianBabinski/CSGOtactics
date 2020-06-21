<%@    taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSGO tactics</title>
    <link rel="stylesheet" href="/styles.css">
    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>

<div class="wrapper">
    <div class="sidebar">
        <h2>CSGO Tactics</h2>
        <ul>
            <li><a href="train/ct"><i class="fas fa-home"></i>CT tactics</a></li>
            <li><a href="train/terro"><i class="far fa-map"></i>T tactics</a></li>
            <%--            <br/>--%>
            <%--            <br/>--%>
            <li><a href="javascript:history.back()"><i class="fas fa-backward"></i>Go back</a></li>
        </ul>
        <div class="social_media">
            <a href="facebook"><i class="fab fa-facebook-f"></i></a>
            <a href="twitter"><i class="fab fa-twitter"></i></a>
            <a href="instagram"><i class="fab fa-instagram"></i></a>
        </div>
    </div>
    <div class="main_content">
        <div class="header">Overpass tactics.</div>
        <div class="info">
            <%--@elvariable id="trainTactics" type="java.util.List<babinski.sebastian.model.Tactic"--%>
            <c:forEach items="${trainTactics}" var="tactic">
                Title: ${tactic.tacticName}<br/>
                Map: ${tactic.tacticMap}<br/>
                Side: ${tactic.tacticSide}<br/>
                Round: ${tactic.tacticRound}<br/>
                Description: ${tactic.tacticText}<br/>
                Video: ${tactic.tacticURL}<br/>
                <hr/>
            </c:forEach>
        </div>
    </div>
</div>

</body>
</html>