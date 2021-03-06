(defproject clojail "1.0.6"
  :description "A sandboxing library."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/flatland/clojail"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [bultitude "0.1.6"]
                 [serializable-fn "1.1.3"]
                 [org.flatland/useful "0.9.3"]]
  :aliases {"testall" ["with-profile" "dev,1.5:dev" "test"]}
  :profiles {:1.5 {:dependencies [[org.clojure/clojure "1.5.0-RC16"]]}}
  :jvm-opts ["-Djava.security.policy=example.policy"])