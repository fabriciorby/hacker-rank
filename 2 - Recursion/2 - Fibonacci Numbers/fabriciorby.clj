(defn fib
  ([n] (fib n 0 1))
  ([n a b]
   (case n
     0 a
     1 a
     2 b
     (recur (dec n) b (+ a b)))))

(println (fib (read-string (read-line))))