/**
 * 
 */

var messagesApp = angular.module("messagesApp", []);

messagesApp.controller("MessagesController", ["$http", function($http){
	var self = this;
	
	var urlGet = "http://localhost:8080/simple-restapp/getMessages";
	var urlPost ="http://localhost:8080/simple-restapp/addMessage"
	
	self.title = "";
	self.text;
	
	self.hello = "hello";
	
	self.getMessages = function(){
		
	    $http({
	        method : "GET",
	        url : urlGet
	    }).then(function mySucces(response) {
	        self.messages = response.data;
	    }, function myError(response) {
	        self.messages = response.statusText;
	    });
		
		
	}
	
	self.addMessage = function(){
		
		if(self.text === "" | self.title === "")
			return;
	
		var data = {
				title : self.title,
				message : self.text
		}
	
		self.title = "";
		self.text = "";
		
		$http.post(urlPost, data);
		self.getMessages();
	}
	
}]);