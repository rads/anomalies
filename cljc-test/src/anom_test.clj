(ns anom-test
  (:require
    [clojure.spec.alpha :as s]
    [cognitect.anomalies :as anom]))

(defn -main [& args]
  (s/explain ::anom/anomaly {}))
