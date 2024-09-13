(defn euclidian-distance [[[x1 y1] [x2 y2]]]
  (Math/sqrt (+ (Math/pow (- x1 x2) 2) (Math/pow (- y1 y2) 2))))

(def points (repeatedly (read-string (read-line))
                        #(map read-string (.split (read-line) " "))))

(println (->> (partition 2 1 points points)
              (map euclidian-distance)
              (reduce +)))
