;; http://blog.shriphani.com/2015/06/29/a-beautiful-gift-with-clojure-and-latex/


(defn convert-chapter-parse
  ([a-map]
   (->> (convert-chapter-parse a-map [])
        flatten
        (apply str)))

  ([a-map parent-path]
   (let [current-node-path (conj parent-path
                                 (if (= (:tag a-map)
                                        :body)
                                   [(:tag a-map)]
                                   [(:tag a-map) (:attrs a-map)]))
         node-contents (:content a-map)]

     (map
      (fn [an-item]
        (if (map? an-item)
          (convert-chapter-parse an-item
                                current-node-path)
          (let [fixed-item (-> an-item
                               (StringEscapeUtils/unescapeHtml3)
                               (string/replace #"\&"
                                               (Matcher/quoteReplacement "\\&")))]
            (format-content fixed-item
                            current-node-path))))
      node-contents))))
