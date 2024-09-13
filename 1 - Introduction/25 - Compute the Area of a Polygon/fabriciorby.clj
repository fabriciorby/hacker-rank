(defn quadrilateral-area [[[x1 y1] [x2 y2]]]
  (* (- (* x1 y2) (* x2 y1)) 0.5))

(def points (repeatedly (read-string (read-line))
                        #(map read-string (.split (read-line) " "))))

(println (->> (partition 2 1 points points)
              (map quadrilateral-area)
              (reduce +)))
