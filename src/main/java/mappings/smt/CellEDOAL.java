package mappings.smt;

import com.hp.hpl.jena.rdf.model.Property;

public class CellEDOAL {

    private static final String PREFIX_MODEL = "http://knowledgeweb.semanticweb.org/heterogeneity/alignment#";
    String entity1;
    String entity2;
    String measure;
    String relation;
    Property entity1Prop;
    Property entity2Prop;
    Property measureProperty;
    Property relationProperty;
    MappingEDOAL mappingEDOAL;


    public CellEDOAL(String entity1, String entity2) {
        this.entity1 = entity1;
        this.entity2 = entity2;
    }

    public CellEDOAL(MappingEDOAL mappingEDOAL) {
        this.mappingEDOAL = mappingEDOAL;
    }

    public String getEntity1() {
        return entity1;
    }

    public void setEntity1(String entity1) {
        this.entity1 = entity1;
    }

    public String getEntity2() {
        return entity2;
    }

    public void setEntity2(String entity2) {
        this.entity2 = entity2;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }



    public Property getEntity1Prop() {
        entity1Prop = mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("entity1").toString());
        return entity1Prop;
    }

    public void setEntity1Prop(Property entity1Prop) {
        this.entity1Prop = mappingEDOAL.getOntoModel().createProperty(PREFIX_MODEL + "entity1");
    }

    public Property getEntity2Prop() {
        entity2Prop = mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("entity2").toString());
        return entity2Prop;
    }

    public void setEntity2Prop() {
        this.entity2Prop = mappingEDOAL.getOntoModel().createProperty(PREFIX_MODEL + "entity2");
    }

    public Property getMeasureProperty() {
        measureProperty = mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("measure").toString());
        return measureProperty;
    }

    public void setMeasureProperty() {
        this.measureProperty = mappingEDOAL.getOntoModel().createProperty(PREFIX_MODEL + "measure");
    }

    public Property getRelationProperty() {
        relationProperty = mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("relation").toString());
        return relationProperty;
    }

    public void setRelationProperty() {
        this.relationProperty = mappingEDOAL.getOntoModel().createProperty(PREFIX_MODEL + "relation");
    }
}
