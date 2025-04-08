(ns repro.repro
  (:require
   [repro.macro :as macro]))

;; Calva and cljfmt fight for how this should be formatted
(macro/example-macro :first-arg second-arg
  (some long body))