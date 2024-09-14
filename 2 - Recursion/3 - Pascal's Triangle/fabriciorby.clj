(defn pascal
  ([n] (pascal n []))
  ([n acc]
   (cond
     (= 0 n) (mapv #(apply str (interpose " " %)) acc)
     (= 0 (count acc)) (recur (dec n) (conj acc [1]))
     :else (recur (dec n) (conj acc (into [] cat [[1] (mapv #(apply + %) (partition 2 1 (last acc))) [1]])))
     )))

(run! println (pascal (read-string (read-line))))