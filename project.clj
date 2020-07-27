(defproject clojail "1.0.6"
  :description "A sandboxing library."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/flatland/clojail"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.namespace "1.0.0"]
                 [serializable-fn "1.1.3"]
                 [org.flatland/useful "0.9.3"]]
  :aliases {"testall" ["with-profile" "dev,1.5:dev" "test"]}
  :profiles {:test {:dependencies
                    [[javax.xml.bind/jaxb-api "2.2.11"]
                     [com.sun.xml.bind/jaxb-core "2.2.11"]
                     [com.sun.xml.bind/jaxb-impl "2.2.11"]
                     [javax.activation/activation "1.1.1"]]}}
  :jvm-opts ["-Djava.security.policy=example.policy"])
