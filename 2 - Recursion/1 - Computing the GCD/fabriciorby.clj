(defn gcd [x y]
  (cond
    (zero? (rem y x)) x
    (> x y) (recur (- x y) y)
    :else (recur (rem y x) x)))

(println (apply gcd (map read-string (re-seq #"\d+" (read-line)))))