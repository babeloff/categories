(ns language.grammar
  (:require [clojure.spec.alpha :as s]))

(s/def ::id string?)

(s/def ::category
  (s/keys :req [::obs ::morphs ::paths
                ::functors ::diagrams
                ::labels]))

(s/def ::paths
  (s/coll-of
   (s/spec (s/cat :id ::id
                  :path (s/spec (s/+ ::id))
            :kind vector?))))
