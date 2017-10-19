# cljc-test

## Installation

Before running these tests you must install `rads/anomalies` locally from the main project directory:

```
cd ../
lein install
cd cljc-test
```

## CLJ

Commands:

```
lein run -m anom-test
```

Expected output:

```
val: {} fails spec: :cognitect.anomalies/anomaly predicate: (contains? % :cognitect.anomalies/category)
```

## CLJS

Commands:

```
lein cljsbuild once
node target/main.js
```

Expected output:

```
val: {} fails spec: :cognitect.anomalies/anomaly predicate: (contains? % :cognitect.anomalies/category)
:cljs.spec.alpha/spec  :cognitect.anomalies/anomaly
:cljs.spec.alpha/value  {}
```
