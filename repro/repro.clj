(ns repro.repro
  (:require
   [repro.macro :as macro]))

(macro/example-macro :first-arg second-arg
                     (some long body))