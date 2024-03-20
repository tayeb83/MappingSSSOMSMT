package mappings.smt;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;

import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

public class SSSOM {

    MappingSetSSSOM mappingSetSSSOM;

    public SSSOM() {

    }

    public SSSOM(MappingSetSSSOM mappingSetSSSOM) {
        this.mappingSetSSSOM = mappingSetSSSOM;
    }


    public MappingSetSSSOM getMappingSetSSSOM() {
        return mappingSetSSSOM;
    }

    /**
     * convert to TTL file
     * @throws URISyntaxException
     */
    public void toTTL() throws URISyntaxException {
        String NS_sssom = "http://w3id.org/sssom/";
        URL resource = SSSOM.class.getClassLoader().getResource("sssom.owl.ttl");
        //System.out.println(resource.toURI().toString());
        OntModel sssomModel = ModelFactory.createOntologyModel();
        InputStream inStream = SSSOM.class.getClassLoader().getResourceAsStream("sssom.owl.ttl");
        if (inStream == null) {
            throw new IllegalArgumentException("Can't load " + resource.toURI().toString());
        }

        if (resource.toURI().toString().endsWith(".ttl")) {
            sssomModel.read(inStream, "http://w3id.org/sssom/", "TURTLE");
        } else {
            sssomModel.read(inStream, "http://w3id.org/sssom/");
        }

        //System.out.println(sssomModel.getOntClass(NS_sssom+"MappingSet"));
    }

    public void setMappingSetSSSOM(MappingSetSSSOM mappingSetSSSOM) {
        this.mappingSetSSSOM = mappingSetSSSOM;
    }
}
