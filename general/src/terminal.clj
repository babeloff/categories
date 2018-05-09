(ns terminal
  (:require []))

(cat/def-uid 0f85f930-426a-11e8-842f-0ed5f89f718b)
(cat/def-path :single-terminal-object [])


(defn check
  "check that every object of the cat has a
  single unique morphism to the :single-terminal-object."
  [cat])
