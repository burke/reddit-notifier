(ns reddit-notifier.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "reddit-notifier"]
               (include-js "//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js")
               (include-js "/js/notifications.js")
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))
