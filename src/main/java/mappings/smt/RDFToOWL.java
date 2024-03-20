package mappings.smt;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.FileDocumentSource;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import java.io.File;

public class RDFToOWL {

    public static void main(String[] args) throws Exception {
        // Replace with your input and output file paths
        String inputFilePath = "input_file.rdf";
        String outputFilePath = "output_file.owl";

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(new FileDocumentSource(new File(inputFilePath)));

        // Use OWLXMLDocumentFormat() for OWL/XML format or OWLFunctionalSyntaxDocumentFormat() for OWL Functional Syntax
       // OWLFunctionalSyntaxDocumentFormat format = new OWLFunctionalSyntaxDocumentFormat();

        //manager.saveOntology(ontology, format, new FileDocumentTarget(new File(outputFilePath)));
    }
}
