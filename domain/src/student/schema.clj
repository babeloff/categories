(ns domain.student.schema)

;; some things can be inferred from the
;; model stucture.
;; * type : {entity, type, }

(def schema
  {::objects
   [{::id "tN" ::nick "N" ::name "NAME"}
    {::id "ec" ::nick "c" ::name "Course"}
    {::id "eu" ::nick "u" ::name "University"}
    {::id "ep" ::nick "p" ::name "Person"}
    {::id "jo" ::nick "o" ::name "Course Offering"}
    {::id "js" ::nick "s" ::name "Student Enrollment"}
    {::id "je" ::nick "e" ::name "Course Enrollment"}]
   ::arrows
   [{::id "acN" ::name "name" ::obid ["ec" "tN"]}
    {::id "auN" ::name "college" ::obid ["eu" "tN"]}
    {::id "apN" ::name "name" ::obid ["ep" "tN"]}

    {::id "aoc" ::name "course" ::obid ["jo" "ec"]}
    {::id "aou" ::name "school" ::obid ["jo" "eu"]}

    {::id "asu" ::name "enroll" ::obid ["js" "eu"]}
    {::id "asp" ::name "student" ::obid ["js" "ep"]}

    {::id "aeo" ::name "offer" ::obid ["je" "jo"]}
    {::id "aes" ::name "enroll" ::obid ["je" "js"]}]
   ::rules
   []})
