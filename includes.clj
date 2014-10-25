(defn includes?
  ([coll] false)
  ([coll item]
   (loop [acoll coll]
     (if (= 0 (count acoll))
       false
       (if (= item (first acoll))
         true
         (recur (rest acoll)))
  ))))
