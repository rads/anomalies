(defproject rads/anom-test "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-beta2"]
                 [org.clojure/clojurescript "1.9.946"]
                 [rads/anomalies "0.1.0-SNAPSHOT"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "target/main.js"
                                   :optimizations :none
                                   :target :nodejs
                                   :main anom-test
                                   :pretty-print true}}]})
