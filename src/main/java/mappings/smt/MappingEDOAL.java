package mappings.smt;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MappingEDOAL {
    Properties mapping_properties;
    String onto1;
    String onto2;
    Property onto1Property;
    Property onto2Property;
    Property ontoMap;
    String uri1;
    String uri2;
    MetaDataANS metaDataANS;

    List<CellEDOAL> maptoCellEdoal;

    Model ontoModel;
    static String PREFIX_ANS_MODEL = "http://data.esante.gouv.fr/alignement#";
    static String PREFIX_ALIGN_API_MODEL = "http://knowledgeweb.semanticweb.org/heterogeneity/alignment#";


    public MappingEDOAL() {
    }

    public MappingEDOAL(Model ontoModel,Properties mapping_properties) {
        this.mapping_properties = mapping_properties;
        this.ontoModel = ontoModel;
    }

    public MappingEDOAL(String onto1, String onto2) {
        this.onto1 = onto1;
        this.onto2 = onto2;
    }


    public String getOnto1() {
        return onto1;
    }

    public void setOnto1(String onto1) {
        this.onto1 = onto1;
    }

    public String getOnto2() {
        return onto2;
    }

    public void setOnto2(String onto2) {
        this.onto2 = onto2;
    }

    public Property getOnto1Property() {
        this.onto1Property = this.ontoModel.getProperty(this.mapping_properties.get("onto1").toString());
        return onto1Property;
    }

    public void setOnto1Property() {
        this.onto1Property = this.ontoModel.createProperty( PREFIX_ANS_MODEL + "onto1" );
    }

    public Property getOnto2Property() {
        this.onto2Property = this.ontoModel.getProperty(this.mapping_properties.get("onto2").toString());
        return onto2Property;
    }

    public void setOnto2Property() {
        this.onto2Property = this.ontoModel.createProperty( PREFIX_ANS_MODEL + "onto2" );
    }

    public Property getOntoMap() {
        ontoMap = this.ontoModel.getProperty(this.mapping_properties.get("map").toString());
        return ontoMap;
    }

    public void setOntoMap() {
        this.ontoMap = this.ontoModel.createProperty( PREFIX_ANS_MODEL + "map" );
    }

    public List<CellEDOAL> getMaptoCellEdoal() {
        if (maptoCellEdoal == null) {
            maptoCellEdoal = new ArrayList<CellEDOAL>();
        }
        return maptoCellEdoal;
    }

    public Model getOntoModel() {
        return ontoModel;
    }

    public Properties getMapping_properties() {
        return mapping_properties;
    }

    private void initModel(){
        ontoModel = ModelFactory.createDefaultModel();
        ontoModel.setNsPrefix("align", "http://knowledgeweb.semanticweb.org/heterogeneity/alignment#");

        Property entity1 = ontoModel.createProperty( PREFIX_ANS_MODEL + "entity1" );
        Property entity2 = ontoModel.createProperty( PREFIX_ANS_MODEL + "entity2" );
        Property measure = ontoModel.createProperty( PREFIX_ANS_MODEL + "measure" );
        Property relation = ontoModel.createProperty( PREFIX_ANS_MODEL + "relation" );

        this.setOnto1Property();
        this.setOnto2Property();
        this.setOntoMap();


        //Property onto1 = ontoModel.createProperty( PREFIX_MODEL + "onto1" );
        //Property onto2 = ontoModel.createProperty( PREFIX_MODEL + "onto2" );
        //Property map = ontoModel.createProperty( PREFIX_MODEL + "map" );
    }

    public void toRDFXML() throws IOException {
        String rdf_xml = "";
        initModel();
        Resource cellShape = ontoModel.createResource(PREFIX_ANS_MODEL +"CellShape");
        Resource mappingShape = ontoModel.createResource(PREFIX_ANS_MODEL +"MappingShape");

        Resource allMatchings = ontoModel.createResource(PREFIX_ANS_MODEL +"Matchings")
                .addProperty(RDFS.label,"Matchings")
                .addProperty(RDF.type,OWL.Class);

       int occ_ont1 = onto1.lastIndexOf("/")+1;
       int occ_ont2 = onto2.lastIndexOf("/")+1;

        Resource alignement_resources =
                ontoModel.createResource(PREFIX_ANS_MODEL +"Alignement_"
                                +onto1.substring(occ_ont1,onto1.length())
                                +"_"+onto2.substring(occ_ont2,onto2.length()))
                       .addProperty(RDF.type,OWL.Class)
                        .addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "onto1"),onto1)
                        .addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "onto2"),onto2)
                        .addProperty(RDF.type, ontoModel.getResource(PREFIX_ALIGN_API_MODEL +"Alignement"));


        for (CellEDOAL cellEDOAL:getMaptoCellEdoal()){
            int occ_last_1 = cellEDOAL.entity1.lastIndexOf("/");
            String code1 =  cellEDOAL.entity1.substring(occ_last_1+1, cellEDOAL.entity1.length());

            int occ_last_2= cellEDOAL.entity2.lastIndexOf("/");
            String code2 =  cellEDOAL.entity2.substring(occ_last_2+1,cellEDOAL.entity2.length());


            Resource matching_resource = ontoModel.createResource(PREFIX_ANS_MODEL +"Matching_"+code1+"_"+code2)
                     //   .addProperty(RDF.type, OWL.Class)
                    .addProperty(RDFS.label,"matching_"+code1+"_"+code2)
                        .addProperty(RDF.type, ontoModel.getResource(PREFIX_ALIGN_API_MODEL +"Cell"))
                    .addProperty(RDFS.subClassOf,allMatchings)
                    .addProperty(RDF.type,OWL.Class)
                    .addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "entity1"),cellEDOAL.getEntity1())
                    .addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "entity2"),cellEDOAL.getEntity2())
                    .addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "method"),"automatique")
                    .addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "validity"),"validé")
                    .addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "relation"),cellEDOAL.getRelation());

            alignement_resources.addProperty(ontoModel.getProperty(PREFIX_ALIGN_API_MODEL + "map"),matching_resource);
            }

        String fileName = "align_n.ttl";
        FileWriter out = new FileWriter(fileName);
        try {
            ontoModel.write( out, "TURTLE" );
        }
        finally {
            try {
                out.close();
            }
            catch (IOException closeException) {
                // ignore
            }
        }

        ontoModel.write(System.out,"TURTLE");

        //return rdf_xml;
    }



    public void setMaptoCellEdoal(List<CellEDOAL> maptoCellEdoal) {
        this.maptoCellEdoal = maptoCellEdoal;
    }
}
