package mappings.smt;

import com.hp.hpl.jena.rdf.model.Property;

import java.util.Properties;

public class EDOAL {

    MappingEDOAL mappingEDOAL;
    Properties mapping_properties;
    Property onto1  ;
    Property onto2 ;
    Property entity1 ;
    Property entity2 ;
    Property map ;
    Property relation  ;
    Property measure ;

    public EDOAL() {}
/*
    public EDOAL(MappingEDOAL mappingEDOAL) {
        this.mappingEDOAL = mappingEDOAL;
    }

    public Property getOnto1() {
        return onto1;
    }

    public void setOnto1(Property onto1) {
        this.onto1 = onto1;
    }

    public Property getOnto2() {
        return onto2;
    }

    public void setOnto2(Property onto2) {
        this.onto2 = onto2;
    }

    public Property getEntity1() {
        return entity1;
    }

    public void setEntity1(Property entity1) {
        this.entity1 = entity1;
    }

    public Property getEntity2() {
        return entity2;
    }

    public void setEntity2(Property entity2) {
        this.entity2 = entity2;
    }

    public Property getMap() {
        return map;
    }

    public void setMap(Property map) {
        this.map = map;
    }

    public Property getRelation() {
        return relation;
    }

    public void setRelation(Property relation) {
        this.relation = relation;
    }

    public Property getMeasure() {
        return measure;
    }

    public void setMeasure(Property measure) {
        this.measure = measure;
    }

    private void setMetadata(Model model){

        Property xml  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#xml");
        Property level  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#level");
        Property onto1  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#onto1");
        Property onto2  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#onto2");
        Property uri1  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#uri1");
        Property uri2  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#uri2");

        this.mappingEDOAL.setXml(model.listObjectsOfProperty(xml).toList().toString());
        this.mappingEDOAL.setXml(model.listObjectsOfProperty(level).toList().toString());
        this.mappingEDOAL.setXml(model.listObjectsOfProperty(onto1).toList().toString());
        this.mappingEDOAL.setXml(model.listObjectsOfProperty(onto2).toList().toString());
        this.mappingEDOAL.setXml(model.listObjectsOfProperty(uri1).toList().toString());
        this.mappingEDOAL.setXml(model.listObjectsOfProperty(uri2).toList().toString());
    }
    private void setMappings(Model model){

        Resource Cell = model.getResource("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#Cell" );
        Property pEntity1  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#entity1");
        Property pEntity2  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#entity2");
        Property measure  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#measure");
        Property relation  = model.getProperty("http://knowledgeweb.semanticweb.org/heterogeneity/alignment#relation");

        for (final ResIterator res = model.listResourcesWithProperty( RDF.type, Cell); res.hasNext(); ) {
            final Resource r = res.next();
            //System.out.println(r.listProperties().toList());
            String entity1  = r.getPropertyResourceValue(pEntity1).toString();
            String entity2  = r.getPropertyResourceValue(pEntity2).toString();
            String relationMapping = r.getProperty(relation).getObject().toString();
            String measureMapping = r.getProperty(measure).getObject().toString();

            CellEDOAL cellEDOAL =
                    new CellEDOAL(entity1,entity2,relationMapping,measureMapping);

            this.mappingEDOAL.getMaptoCellEdoal().add(cellEDOAL);

        }

    }


    public void loadEdoalFromFilr(String inpuFile) throws URISyntaxException {
        mappingEDOAL = new MappingEDOAL();
        URL resource = EdoalParser.class.getClassLoader().getResource(inpuFile);
        Model model = RDFDataMgr.loadModel(String.valueOf(resource.toURI())) ;
        this.setMetadata(model);
    }

    public SSSOM toSSOM() throws URISyntaxException {
        SSSOM sssom = new SSSOM();
        MappingSetSSSOM mappingSetSSSOM = new MappingSetSSSOM();

        mappingSetSSSOM.setMapping_set_id(this.mappingEDOAL.getId());
        mappingSetSSSOM.setSubject_source(this.mappingEDOAL.getUri1());
        mappingSetSSSOM.setObject_source(this.mappingEDOAL.getUri2());

        for (CellEDOAL cellEDOAL:this.mappingEDOAL.getMaptoCellEdoal()){
            MappingSSOM mappingSSOM = new MappingSSOM();
            mappingSSOM.setSubject_id(cellEDOAL.getEntity1());
            mappingSSOM.setObject_id(cellEDOAL.getEntity2());
            mappingSSOM.setPredicate_id(cellEDOAL.getRelation());
            mappingSSOM.setConfidence(Float.valueOf(cellEDOAL.getMeasure()));
            sssom.getMappingSetSSSOM().getMappings().add(mappingSSOM);
        }
        sssom.toTTL();
        return sssom;
    }
    */
}
