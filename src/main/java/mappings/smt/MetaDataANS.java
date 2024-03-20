package mappings.smt;


import com.hp.hpl.jena.rdf.model.Property;

import static mappings.smt.MappingSetSSSOM.PREFIX_ANS_MODEL;


public class MetaDataANS {

    private static final String PREFIX_ADMS = "http://www.w3.org/ns/adms#" ;
    private static final String PREFIX_DCTERMS = "http://purl.org/dc/terms#";
    String version;
    String identifier;
    String url;
    String name;
    String status;
    String date;
    String description;

    Property versionProperty;
    Property identifierProperty;
    Property urlProperty;
    Property statusProperty;
    Property dateProperty;
    Property descriptionProperty;
    MappingEDOAL mappingEDOAL;

    public MetaDataANS(MappingEDOAL mappingEDOAL) {
        this.mappingEDOAL = mappingEDOAL;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Property getVersionProperty() {
        return versionProperty;
    }

    public void setVersionProperty(Property versionProperty) {
        this.versionProperty = versionProperty;
    }

    public Property getIdentifierProperty() {
        identifierProperty = mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("id").toString());
        return identifierProperty;
    }

    public void setIdentifierProperty() {
        this.identifierProperty = mappingEDOAL.getOntoModel().createProperty(PREFIX_ANS_MODEL + "id");
    }

    public Property getUrlProperty() {
        this.urlProperty= mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("url").toString());
        return urlProperty;
    }

    public void setUrlProperty() {
        this.urlProperty =  mappingEDOAL.getOntoModel().createProperty(PREFIX_ANS_MODEL + "url");
    }

    public Property getStatusProperty() {
        this.statusProperty = mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("status").toString());
        return statusProperty;
    }

    public void setStatusProperty() {
        this.statusProperty = mappingEDOAL.getOntoModel().createProperty(PREFIX_ADMS + "status");
    }

    public Property getDateProperty() {
        this.dateProperty = mappingEDOAL.getOntoModel().getProperty(mappingEDOAL.getMapping_properties().get("date").toString());
        return dateProperty;
    }

    public void setDateProperty() {
        this.dateProperty = mappingEDOAL.getOntoModel().createProperty(PREFIX_DCTERMS + "status");
    }

    public Property getDescriptionProperty() {
        return descriptionProperty;
    }

    public void setDescriptionProperty(Property descriptionProperty) {
        this.descriptionProperty = descriptionProperty;
    }
}
