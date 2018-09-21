package com.kramers.janus

import org.janusgraph.core.JanusGraphFactory


object Connection {
  val graph = JanusGraphFactory.build
  // JanusGraph will throw an e if a graph query cannot be answered using an index.
  // https://docs.janusgraph.org/latest/indexes.html
  // @see Graph Index (Note Section)
    .set("query.force-index", true)
    // Disable automatic schema creation
    // https://docs.janusgraph.org/latest/schema.html
    // @see Automatic Schema Maker
    .set("schema.default", "none")
    // https://docs.janusgraph.org/latest/cassandra.html
    // @see Local Server Mode
    .set("storage.backend", "cassandra")
    .set("storage.hostname", "localhost")
    .open
}
