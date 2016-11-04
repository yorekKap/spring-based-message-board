/**
 * 
 */
var stompClient = null;


function connect() {
    var socket = new SockJS('/simple-restapp/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/notifications', function (notification) {
        	showGreeting(JSON.parse(notification.body).content);
        });
    });
}

function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendNotification() {
    stompClient.send("/app/notifyClients");
}

function showGreeting(message) {
	console.log(message);
	$("#notifier").show();
	$("#notifier").html(message);
}

window.onload = connect;

$(function () {
   
	 $("#notify").click(function() { sendNotification(); });
	 $("#notifier").click(function(){$("#notifier").hide()});
	
});