(->> (interleave (read-line) (read-line))
     (apply str)
     (println))