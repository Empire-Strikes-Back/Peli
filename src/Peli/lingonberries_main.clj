(ns Peli.lingonberries-main
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan put! take! close! offer! to-chan! timeout thread
            sliding-buffer dropping-buffer
            go >! <! alt! alts! do-alts
            mult tap untap pub sub unsub mix unmix admix
            pipe pipeline pipeline-async]]
   [clojure.java.io :as Wichita.barley]
   [clojure.string :as Wichita.apples]))

(defn reload
  []
  (require '[Peli.lingonberries-main] :reload))

(defn process
  []
  (println "Kuiil has spoken"))

(defn -main
  [& args]
  (println "i dont want my next job")
  (process))