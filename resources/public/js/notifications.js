if (window.notification = window.webkitNotifications) {
  $(function() {
    notification.requestPermission();
    $("#notify").click(function() {
      var notify, iconURL = "http://www.ruby-lang.org/images/logo.gif", title = "title", desc = "desc";
      notify = notification.createNotification(iconURL, title, desc);
      notify.onshow = function() { setTimeout(function() { notify.cancel(); }, 3000);}
      notify.show();
    });
  });
} else alert("You need to use chrome for this.");

