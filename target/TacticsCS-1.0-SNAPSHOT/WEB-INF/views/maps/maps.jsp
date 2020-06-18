<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@    taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
            <li><a href="maps/dust2"><i class="fas fa-long-arrow-alt-right"></i>dust2</a></li>
            <li><a href="maps/inferno"><i class="fas fa-long-arrow-alt-right"></i>inferno</a></li>
            <li><a href="maps/mirage"><i class="fas fa-long-arrow-alt-right"></i>mirage</a></li>
            <li><a href="maps/nuke"><i class="fas fa-long-arrow-alt-right"></i>nuke</a></li>
            <li><a href="maps/overpass"><i class="fas fa-long-arrow-alt-right"></i>overpass</a></li>
            <li><a href="maps/train"><i class="fas fa-long-arrow-alt-right"></i>train</a></li>
            <li><a href="maps/vertigo"><i class="fas fa-long-arrow-alt-right"></i>vertigo</a></li>
            <li><a href="javascript:history.back()"><i class="fas fa-backward"></i>Go back</a></li>
        </ul>
        <div class="social_media">
            <a href="facebook"><i class="fab fa-facebook-f"></i></a>
            <a href="twitter"><i class="fab fa-twitter"></i></a>
            <a href="instagram"><i class="fab fa-instagram"></i></a>
        </div>
    </div>
    <div class="main_content">
        <div class="header">All maps tactics.</div>
        <div class="info">
            <%--@elvariable id="tactics" type="java.util.List<babinski.sebastian.model.Tactic"--%>
            <c:forEach items="${tactics}" var="tactic">
                <table>
                    <tr>
                        <td>
                            <c:set var="map" value="${tactic.tacticMap}"/>
                            <c:if test="${map == 'dust2'}">
                                <img src="/images/128px.png">
                            </c:if>
                        </td>
                        <td>
                            <table>
                                <tr>
                                    <td>
                                        Title: ${tactic.tacticName}
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Map: ${tactic.tacticMap}
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Side: ${tactic.tacticSide}
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Round: ${tactic.tacticRound}
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <c:set var="video" value="${tactic.tacticURL}"/>
                                        <c:if test="${empty video}">
                                        </c:if>
                                        <c:if test="${not empty video}">
                                            Video: ${tactic.tacticURL}
                                        </c:if>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Description: ${tactic.tacticText}
                        </td>
                    </tr>
                </table>
                <hr/>
            </c:forEach>
        </div>
    </div>
</div>

</body>
</html>