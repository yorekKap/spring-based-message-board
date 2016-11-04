<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="messagesApp">
<head>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="resources/js/myapp.js" var = "angularModule"></spring:url>
	
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>

<title>Message board</title>

<style type="text/css">
.message
{
	margin: 20px 0;
    padding: 20px;
    border-left: 3px solid #eee;
}

.default-message
{
    background-color: #f4f8fa;
    border-color: #5bc0de;
}
.default-message h4
{
    color: #5bc0de;
}
</style>


</head>
<body ng-controller="MessagesController as mc" data-ng-init = "mc.getMessages()">

	<div class="container">
		<h2>Messages board</h2>
		<form>
			<div class="form-group">
				<label>Title:</label> 
				<input class="form-control" ng-model="mc.title" id="title" placeholder="Enter title">
			</div>
			<div class="form-group">
				<textarea class="form-control" ng-model="mc.text" rows="5" id="message-text" placeholder="Enter text"></textarea>
			</div>
			<div class = "form-group">
 			<button type="button" class="btn btn-default" ng-click="mc.addMessage()">Leave message</button>
			</div>
		</form>
	</div>

	<div class = "container" ng-repeat="m in mc.messages">
	   <div class="message default-message">
                <h4>
                    {{m.title}}</h4>
                <p>
                    {{m.message}}</p>
            </div>
	</div>

<script src = "${angularModule}"></script>
</body>
</html>