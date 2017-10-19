(ns anom-test
  (:require
    [cljs.spec.alpha :as s]
    [cognitect.anomalies :as anom]))

(enable-console-print!)

(s/explain ::anom/anomaly {})

