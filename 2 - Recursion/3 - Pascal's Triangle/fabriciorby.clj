(defn pascal-triangle
  ([n] (pascal-triangle n [1]))
  ([n acc]
   (when (> n 0)
     (println (apply str (interpose " " acc)))
     (recur (dec n) (mapv + (conj acc 0) (rseq (conj acc 0)))))))

(pascal-triangle (read-string (read-line)))