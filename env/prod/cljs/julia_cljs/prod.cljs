(ns julia-cljs.prod
  (:require [julia-cljs.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
