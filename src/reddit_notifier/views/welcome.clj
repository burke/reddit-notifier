(ns reddit-notifier.views.welcome
  (:require [reddit-notifier.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
           [:button#notify "Notify me"]
           [:p "Watching /r/ruby..."]))
