(ns sample
  (:require []))

(def catetory-ex-01
 {::paths
  ["o1"  ["o1"]
   "o2"  ["o2"]
   "a1"  ["o1" "o2"]
   "a2"  ["o1" "o2"]
   "a3"  ["o2" "o1"]
   "p1"  ["o1" "o2" "o1"]]
  ::sims
  ["p1" ::= ["a2" "a3"]]
  ::labels
  {"l1" #{"o1" "p1"}}
  ::ontology
  {""}
  ::diagrams
  {"diagram name" {"foo" "p1"}}})

;; ontology https://arxiv.org/abs/1503.08326
;; The difference between an olog and a category is that an olog has
;; additional structure: each object is labeled with a noun phrase
;; and each arrow is labeled with a verb phrase,
;; so that reading source-arrow-target yields an English SVO sentence.

;; here we have objects as zero-length paths.
;; the identity is natural as a path from an object to nowhere.

;; sims are pairs of paths with a similarity relation
;; equality ::==
;; equivalence ::=
;; isomorphism ::~
;; adjoint ::< and ::>
;; fixed-point ::<! and ::>!
;; attractor ::<@ and ::>@

;; labels are names used to generalize interpretation

;; interprets are ways the category can be interpreted
;; a family is a collection of categories sharing a set of interprets
;; * visualize : a way of presenting the category
;; * validate
;; * serialize
;; * spawn : to construct a category of the same family,
;;           this is related to the idea of a feature tree in CAD systems.
;;           Members of a family have path from a cannonical family member
;;           after having undergone a family specific set of 'mutations'.

;; http://learnrms.com Resilient Modeling System
;; a CAD approach emphasizing categories as design.

;; diagrams are mappings from index categories into the current category.

;;

;; 1. If u is a morphism from  a to b (in short, u:a degreesb),
;; and v:b degreesc, then there is a morphism u degreesv
;; (commonly read "u composed with v") from a to c.
;;
;; 2. Composition of morphisms, where defined, is associative,
;; so if u:a degreesb, v:b degreesc, and w:c degreesd, then
;; (u degreesv) degreesw=u degrees(v degreesw).
;;
;; 3. For each object a, there is an identity morphism I_a,
;; such that for any u:a degreesb, I_a degreesu=u and  u degreesI_b=u.
;;
;; In most concrete categories over sets, an object is some
;; mathematical structure (e.g., a group, vector space, or
;; smooth manifold and a morphism is a map between two objects.
;; The identity map between any object and itself is then
;; the identity morphism, and the composition of morphisms
;; is just function composition.
;;
;; One usually requires the morphisms to preserve the
;; mathematical structure of the objects.
;; So if the objects are all groups, a good choice for
;; a morphism would be a group homomorphism.
;; Similarly, for vector spaces, one would choose linear maps,
;; and for differentiable manifolds, one would choose differentiable maps.
;;
;; In the category of topological spaces, morphisms are usually
;; continuous maps between topological spaces.
;; However, there are also other category structures
;; having topological spaces as objects, but they are not
;; nearly as important as the "standard" category of topological
;; spaces and continuous maps.
