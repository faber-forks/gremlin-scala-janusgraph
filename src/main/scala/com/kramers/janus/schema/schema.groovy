import org.janusgraph.core.Cardinality
import org.janusgraph.core.Multiplicity

def defineGraphSchema(graph) {

    graph.tx().rollback()  //Never create new indexes while a transaction is active

    m = graph.openManagement()

    /**
     * -------------------------------------------------------------------------------------------------------------------
     * Common Property Keys
     * -------------------------------------------------------------------------------------------------------------------
     */
    user = m.makeVertexLabel('user').make()
    car = m.makeVertexLabel('car').make()

    name = m.makePropertyKey('name').dataType(String.class).cardinality(Cardinality.SINGLE).make()
    email = m.makePropertyKey('email').dataType(String.class).cardinality(Cardinality.SINGLE).make()
    age = m.makePropertyKey('age').dataType(Integer.class).cardinality(Cardinality.SINGLE).make() //Optional parameter

    company = m.makePropertyKey('company').dataType(String.class).cardinality(Cardinality.SINGLE).make()
    yearOfManufacture = m.makePropertyKey('yearOfManufacture').dataType(Integer.class).cardinality(Cardinality.SINGLE).make() //Optional parameter

    hasCar = m.makeEdgeLabel('hasCar').multiplicity(Multiplicity.ONE2MANY).make()

    m.commit()

}