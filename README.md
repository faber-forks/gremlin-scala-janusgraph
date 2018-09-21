# gremlin-scala-janusgraph
Example project that uses [gremlin-scala](https://github.com/mpollmeier/gremlin-scala) with [JanusGraph](http://janusgraph.org/)

The following is a basic guide for getting started with JanusGraph on your machine.

* Download latest JanusGraph packaged with Cassandra and ElasticSearch from [here](https://github.com/JanusGraph/janusgraph/releases/download/v0.3.0/janusgraph-0.3.0-hadoop2.zip)
* After download run the following commands
```
unzip janusgraph-0.3.0-hadoop2.zip
cd janusgraph-0.3.0-hadoop2
bin/janusgraph.sh start
```
* This will start Cassandra, ElasticSearch and Gremlin Server. 
Successful execution of this script will print the following on your console:

```
Forking Cassandra...
Running nodetool statusthrift... OK (returned exit status 0 and printed string "running").
Forking Elasticsearch...
Connecting to Elasticsearch (127.0.0.1:9200)....... OK (connected to 127.0.0.1:9200).
Forking Gremlin-Server...
Connecting to Gremlin-Server (127.0.0.1:8182)......... OK (connected to 127.0.0.1:8182).
Run gremlin.sh to connect.
 ```

* Run `bin/gremlin.sh` to start the gremlin console.

### Initialising the graph schema
Run the following inside the gremlin console (`gremlin> `)
```groovy
:load /<repo_root>/src/main/scala/com/kramers/janus/schema/schema.groovy

graph = JanusGraphFactory.open('conf/janusgraph-cassandra-es.properties')
defineGraphSchema(graph)
```

After defining the schema in JanusGraph run the [[Crud]] object to add user vertex to the graph.

