(defn o-permute [string] (->> (partition 2 2 string)
                              (mapcat reverse)
                              (apply str)
                              (println)))

(->> (repeatedly (read-string (read-line)) #(o-permute (read-line)))
     (doall))