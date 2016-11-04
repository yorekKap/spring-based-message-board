<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="resources/js/notifier.js" var = "myNotifier"></spring:url>
<spring:url value="resources/js/stomp.js" var = "stomp"></spring:url>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Notification system</title>

<style>

.notification{

	border:solid black;
	color: black;
	display: none;
	background-color: white;
	position: fixed;
	right: 100px;
	bottom: 100px;
	width: 100px;
	height: 100px;
	text-align: center;

}

</style>

</head>
<body>

<button id = "notify" class = "btn btn-default">Notify users</button>

	<p></p>

	<div class="container">
		<div class="row">
			<div class="notification" id = "notifier">a</div>
		</div>
	</div>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <script src="//cdn.jsdelivr.net/sockjs/1/sockjs.min.js"></script>
 <script src="${stomp}"></script>
 <script src="${myNotifier}"></script>
</body>
</html>