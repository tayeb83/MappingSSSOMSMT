package mappings.smt;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MappingSetSSSOM {
    List<MappingSSOM> mappings ;
    String mapping_set_id;
    String mapping_set_version ;
    String mapping_set_source ;
    String mapping_set_description ;
    String creator_id ;
    String creator_label ;
    String license ;
    String subject_type ;
    String subject_source ;
    Property subjectProperty;
    Property objectProperty;
    Property mappingsProperty;
    String subject_source_version ;
    String object_type ;
    String object_source ;
    String object_source_version ;
    String mapping_provider ;
    String mapping_tool ;
    Date mapping_date;
    String subject_match_field ;
    String object_match_field ;
    String subject_preprocessing ;
    String object_preprocessing ;
    String see_also ;
    String other ;
    String comment ;

    Model ontoModel;
    static String PREFIX_ANS_MODEL = "http://data.esante.gouv.fr/alignement/";
    static String PREFIX_ANS_MAPPING = "http://data.esante.gouv.fr/mapping#";
    static String PREFIX_SSSOM_API_MODEL = "http://w3id.org/sssom/";
    static String PREFIX_DC_TERMS = "http://purl.org/dc/terms/";
    static String PREFIX_SEMPAV_VOC = "https://w3id.org/semapv/vocab/";




    public MappingSetSSSOM(String mapping_set_id, String mapping_set_version, String mapping_set_source, String mapping_set_description, String creator_id, String creator_label, String license, String subject_type, String subject_source, String subject_source_version, String object_type, String object_source, String object_source_version, String mapping_provider, String mapping_tool, Date mapping_date, String subject_match_field, String object_match_field, String subject_preprocessing, String object_preprocessing, String see_also, String other, String comment) {
       // this.mappings = mappings;
        this.mapping_set_id = mapping_set_id;
        this.mapping_set_version = mapping_set_version;
        this.mapping_set_source = mapping_set_source;
        this.mapping_set_description = mapping_set_description;
        this.creator_id = creator_id;
        this.creator_label = creator_label;
        this.license = license;
        this.subject_type = subject_type;
        this.subject_source = subject_source;
        this.subject_source_version = subject_source_version;
        this.object_type = object_type;
        this.object_source = object_source;
        this.object_source_version = object_source_version;
        this.mapping_provider = mapping_provider;
        this.mapping_tool = mapping_tool;
        this.mapping_date = mapping_date;
        this.subject_match_field = subject_match_field;
        this.object_match_field = object_match_field;
        this.subject_preprocessing = subject_preprocessing;
        this.object_preprocessing = object_preprocessing;
        this.see_also = see_also;
        this.other = other;
        this.comment = comment;
    }

    public MappingSetSSSOM() {
    }

    public List<MappingSSOM> getMappings() {
        if(mappings == null){
            mappings = new ArrayList<MappingSSOM>();
        }
        return mappings;
    }

    public void setMappings(List<MappingSSOM> mappings) {
        this.mappings = mappings;
    }

    public String getMapping_set_id() {
        return mapping_set_id;
    }

    public void setMapping_set_id(String mapping_set_id) {
        this.mapping_set_id = mapping_set_id;
    }

    public String getMapping_set_version() {
        return mapping_set_version;
    }

    public void setMapping_set_version(String mapping_set_version) {
        this.mapping_set_version = mapping_set_version;
    }

    public String getMapping_set_source() {
        return mapping_set_source;
    }

    public void setMapping_set_source(String mapping_set_source) {
        this.mapping_set_source = mapping_set_source;
    }

    public String getMapping_set_description() {
        return mapping_set_description;
    }

    public void setMapping_set_description(String mapping_set_description) {
        this.mapping_set_description = mapping_set_description;
    }

    public String getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(String creator_id) {
        this.creator_id = creator_id;
    }

    public String getCreator_label() {
        return creator_label;
    }

    public void setCreator_label(String creator_label) {
        this.creator_label = creator_label;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getSubject_type() {
        return subject_type;
    }

    public void setSubject_type(String subject_type) {
        this.subject_type = subject_type;
    }

    public String getSubject_source() {
        return subject_source;
    }

    public void setSubject_source(String subject_source) {
        this.subject_source = subject_source;
    }

    public String getSubject_source_version() {
        return subject_source_version;
    }

    public void setSubject_source_version(String subject_source_version) {
        this.subject_source_version = subject_source_version;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public String getObject_source() {
        return object_source;
    }

    public void setObject_source(String object_source) {
        this.object_source = object_source;
    }

    public String getObject_source_version() {
        return object_source_version;
    }

    public void setObject_source_version(String object_source_version) {
        this.object_source_version = object_source_version;
    }

    public String getMapping_provider() {
        return mapping_provider;
    }

    public void setMapping_provider(String mapping_provider) {
        this.mapping_provider = mapping_provider;
    }

    public String getMapping_tool() {
        return mapping_tool;
    }

    public void setMapping_tool(String mapping_tool) {
        this.mapping_tool = mapping_tool;
    }

    public Date getMapping_date() {
        return mapping_date;
    }

    public void setMapping_date(Date mapping_date) {
        this.mapping_date = mapping_date;
    }

    public String getSubject_match_field() {
        return subject_match_field;
    }

    public void setSubject_match_field(String subject_match_field) {
        this.subject_match_field = subject_match_field;
    }

    public String getObject_match_field() {
        return object_match_field;
    }

    public void setObject_match_field(String object_match_field) {
        this.object_match_field = object_match_field;
    }

    public String getSubject_preprocessing() {
        return subject_preprocessing;
    }

    public void setSubject_preprocessing(String subject_preprocessing) {
        this.subject_preprocessing = subject_preprocessing;
    }

    public String getObject_preprocessing() {
        return object_preprocessing;
    }

    public void setObject_preprocessing(String object_preprocessing) {
        this.object_preprocessing = object_preprocessing;
    }

    public String getSee_also() {
        return see_also;
    }

    public void setSee_also(String see_also) {
        this.see_also = see_also;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Property getSubjectProperty() {
        return subjectProperty;
    }

    public void setSubjectProperty() {
        this.subjectProperty = this.ontoModel.createProperty( PREFIX_ANS_MODEL + "subject_source" );

    }

    public Property getObjectProperty() {
        return objectProperty;
    }

    public void setObjectProperty() {
        this.objectProperty = this.ontoModel.createProperty( PREFIX_ANS_MODEL + "object_source" );
    }

    public Property getMappingsProperty() {
        return mappingsProperty;
    }

    public void setMappingsProperty() {
        this.mappingsProperty = this.ontoModel.createProperty( PREFIX_ANS_MODEL + "mappings" );
    }

    private void initModel(){
        ontoModel = ModelFactory.createDefaultModel();
        ontoModel.setNsPrefix("align", "http://knowledgeweb.semanticweb.org/heterogeneity/alignment#");
        ontoModel.setNsPrefix("skos", "http://www.w3.org/2004/02/skos/core#");
        ontoModel.setNsPrefix("semapv", "https://w3id.org/semapv/vocab/");
        Property source_id_property = ontoModel.createProperty( PREFIX_ANS_MODEL + "subject_id" );
        Property object_id_property = ontoModel.createProperty( PREFIX_ANS_MODEL + "object_id" );
        //Property measure = ontoModel.createProperty( PREFIX_ANS_MODEL + "measure" );
        Property predicate_id_property = ontoModel.createProperty( PREFIX_ANS_MODEL + "predicate_id" );

        this.setSubjectProperty();
        this.setObjectProperty();
        this.setMappingsProperty();


        //Property onto1 = ontoModel.createProperty( PREFIX_MODEL + "onto1" );
        //Property onto2 = ontoModel.createProperty( PREFIX_MODEL + "onto2" );
        //Property map = ontoModel.createProperty( PREFIX_MODEL + "map" );
    }

    public static String getLastPartOfUrl(String url) {
        // On suppose que l'URL est bien formée et contient au moins un "/"
        String[] parts = url.split("/");
        String lastSegment = parts[parts.length - 1];
        int dashIndex = lastSegment.indexOf("-");
        if (dashIndex != -1) {
            // Retourne tout après le premier "-" trouvé dans le dernier segment
            return lastSegment.substring(dashIndex + 1);
        } else {
            // Si pas de "-", retourne le dernier segment tel quel
            return lastSegment;
        }
    }

    public void toRDFXML() throws IOException {

        String rdf_xml = "";
        initModel();
        //Resource mappingShape = ontoModel.createResource(PREFIX_ANS_MODEL +"MappingNode");
        //Resource mappingSetShape = ontoModel.createResource(PREFIX_ANS_MODEL +"MappingSetNode");
        //System.out.println(getLastPartOfUrl(subject_source)+getLastPartOfUrl("http://esante.gouv.fr/terminologie-cip-ucd"));
        //int occ_ont1 = subject_source.lastIndexOf("http://esante.gouv.fr/terminologie")+1;
        //int occ_ont2 = object_source.lastIndexOf("http://esante.gouv.fr/terminologie")+1;

        Resource alignement_resources =
                ontoModel.createResource(PREFIX_ANS_MODEL+
                                //+"OMS/"
                                //+subject_source.substring(occ_ont1,subject_source.length()).toLowerCase()
                                //+"_"+object_source.substring(occ_ont2,object_source.length()).toLowerCase()
                        "alignement_"
                                +getLastPartOfUrl(subject_source).toLowerCase()
                                +"_"+getLastPartOfUrl(object_source).toLowerCase()

                        )
                        .addProperty(RDF.type,OWL.Class)
                        .addProperty(ontoModel.getProperty(PREFIX_DC_TERMS + "license"),
                                "https://creativecommons.org/licenses/by-nc-nd/3.0/igo/legalcode")
                        .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "mapping_set_id"),"mapping_ncbi_sms")
                        .addProperty(OWL.versionInfo,"1.0")
                        .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "subject_source"),
                                ontoModel.getResource(subject_source))
                        .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "object_source"),
                                ontoModel.getResource(object_source))
                        .addProperty(RDF.type, ontoModel.getResource(PREFIX_SSSOM_API_MODEL +"MappingSet"));


        for (MappingSSOM mappingSSOM:getMappings()){
            String code1 ="";
            String code2="";
            if (mappingSSOM.getSubject_code().isEmpty()) {
                int occ_last_1 = mappingSSOM.subject_source.lastIndexOf("/");
                code1 =  mappingSSOM.subject_source.substring(occ_last_1+1);
            }
            else{
                code1 = mappingSSOM.getSubject_code();
            }

            if (mappingSSOM.getSubject_code().isEmpty()) {
                int occ_last_2= mappingSSOM.object_source.lastIndexOf("/");
                code2 =  mappingSSOM.object_source.substring(occ_last_2+1);
            }
            else{
                code2 = mappingSSOM.getObject_code();
            }
            System.out.println(code1+"--"+code2);
            /*Resource matching_resource = ontoModel.createResource(PREFIX_ANS_MODEL
                            +"OMS/"+subject_source.substring(occ_ont1,subject_source.length()).toLowerCase()+"_"
                            +code1.toLowerCase()+"_"
                            +object_source.substring(occ_ont2,object_source.length()).toLowerCase()
                            +"_"
                            +code2.toLowerCase())*/
            Resource matching_resource = ontoModel.createResource(PREFIX_ANS_MODEL+
                           // +"OMS/"

                           // +subject_source.substring(occ_ont1,subject_source.length()).toLowerCase()+"_"
                            //+object_source.substring(occ_ont2,object_source.length()).toLowerCase()+"/"
                            "alignement_"
                                    +getLastPartOfUrl(subject_source).toLowerCase()
                                    +"_"+getLastPartOfUrl(object_source).toLowerCase()+"/"
                            +code1.toLowerCase()+ "_to_"
                            +code2.toLowerCase().replaceAll("&","_and_"))
                    //   .addProperty(RDF.type, OWL.Class)
                    .addProperty(RDFS.label,"correspondance: "+code1+"_"+code2)
                    .addProperty(RDF.type, ontoModel.getResource(PREFIX_SSSOM_API_MODEL +"Mapping"))
                    .addProperty(RDFS.subClassOf,alignement_resources)
                    .addProperty(RDF.type,OWL.Class)
                    .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "subject_id"),
                            ontoModel.createResource(mappingSSOM.getSubject_id()))
                    .addProperty(ontoModel.getProperty(PREFIX_ANS_MAPPING + "subject_code"),code1)
                    .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "subject_label"),mappingSSOM.getSubject_label())
                    //.addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "subject_source"),subject_source)

                    .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "object_id"),
                            ontoModel.createResource(mappingSSOM.getObject_id()))
                    .addProperty(ontoModel.getProperty(PREFIX_ANS_MAPPING + "object_code"),code2)
                    .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "object_label"),mappingSSOM.getObject_label())
                    //.addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "object_source"),object_source)
                   // .addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "confidence"),"1")
                    .addProperty(ontoModel.getProperty(PREFIX_ANS_MAPPING + "method"),
                            mappingSSOM.getMapping_justification())
                    .addProperty(ontoModel.getProperty(PREFIX_ANS_MAPPING + "validationStatus"),mappingSSOM.getValidationStatus());

                    if(mappingSSOM.predicate_id.equals("skos:exactMatch")){
                        matching_resource.addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "predicate_id"),
                                SKOS.exactMatch);
                    }
                    else if (mappingSSOM.predicate_id.equals("skos:broadMatch")){
                        matching_resource.addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "predicate_id"),
                                SKOS.broadMatch);
                    }
                    else if (mappingSSOM.predicate_id.equals("skos:narrowMatch")){
                        matching_resource.addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "predicate_id"),
                                SKOS.narrowMatch);
                    }
                    else if (mappingSSOM.predicate_id.equals("skos:closeMatch")){
                        matching_resource.addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "predicate_id"),
                                SKOS.closeMatch);
                    };

        if(mappingSSOM.getSubject_label().isEmpty()) {
            matching_resource.getProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "subject_label")).remove();
        }

        if(mappingSSOM.getObject_label().isEmpty()) {
            matching_resource.getProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "object_label")).remove();
        }
            //alignement_resources.addProperty(ontoModel.getProperty(PREFIX_SSSOM_API_MODEL + "mappings"),matching_resource);
        }

        String fileName = "data/pathos/pathos_cim10_v01.ttl";
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
    }
}
