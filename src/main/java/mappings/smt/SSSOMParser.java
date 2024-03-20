package mappings.smt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class SSSOMParser {

    public static void mappingparseCSVtoEDOAL(String onto1, String onto2, String fileCSV) throws IOException {
        List<String[]> listOfMapping = readData(fileCSV);
        MappingEDOAL mappingEDOAL = new MappingEDOAL();
        mappingEDOAL.setOnto1(onto1);
        mappingEDOAL.setOnto2(onto2);
        for (String[] correspondance : listOfMapping) {
            CellEDOAL cellEDOAL = new CellEDOAL(correspondance[0], correspondance[1]);
            cellEDOAL.setRelation("=");
            mappingEDOAL.getMaptoCellEdoal().add(cellEDOAL);
        }

        mappingEDOAL.toRDFXML();
    }

    public static void mappingparseCSVtoSSSOM(String onto1, String onto2, String fileCSV) throws IOException {
        List<String[]> listOfMapping = readData(fileCSV);
        MappingSetSSSOM mappingSetSSSOM = new MappingSetSSSOM();
        mappingSetSSSOM.setMapping_set_id("1");
        mappingSetSSSOM.setSubject_source(onto1);
        mappingSetSSSOM.setObject_source(onto2);

        for (String[] correspondance:listOfMapping) {
            //System.out.println(correspondance[0]);
            if (!correspondance[1].isEmpty() && !correspondance[4].isEmpty() && !correspondance[4].contains("/")) {
                //Arrays.stream(correspondance).forEach(s->System.out.println(s));
                MappingSSOM mappingSSOM = new MappingSSOM();
                mappingSSOM.setSubject_id(correspondance[0]); //subject_id
                mappingSSOM.setSubject_code(correspondance[1]); //subject_code
                mappingSSOM.setSubject_label(correspondance[2]); //subject_label
                mappingSSOM.setObject_label(correspondance[5]); //object_label
                mappingSSOM.setObject_id(correspondance[3]); //object_id
                mappingSSOM.setObject_code(correspondance[4]);
                //System.out.println(correspondance[6]);
                if (correspondance[6].equals("exactMatch")) {
                    mappingSSOM.setPredicate_id("skos:exactMatch");
                } else if (correspondance[6].equals("broaderMatch")) {
                    mappingSSOM.setPredicate_id("skos:broadMatch");
                } else if (correspondance[6].equals("narrowerMatch")) {
                    mappingSSOM.setPredicate_id("skos:narrowMatch");
                } else if (correspondance[6].equals("closeMatch")) {
                    mappingSSOM.setPredicate_id("skos:closeMatch");
                }
                if (!correspondance[7].isEmpty()) {
                    mappingSSOM.setMapping_justification(correspondance[7]);
                }
                if (!correspondance[8].isEmpty()) {
                    mappingSSOM.setValidationStatus(correspondance[8]);
                }
                mappingSetSSSOM.getMappings().add(mappingSSOM);
            }
        }

        mappingSetSSSOM.toRDFXML();
    }

    private static List<String[]> readData(String fileCsv) throws IOException {
        List<String[]> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileCsv))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<String> values = new ArrayList<>();
                StringBuilder value = new StringBuilder();
                boolean inQuotes = false;
                for (char ch : line.toCharArray()) {
                    if (ch == '"') {
                        inQuotes = !inQuotes;
                    } else if (ch == ';' && !inQuotes) {
                        values.add(value.toString());
                        value = new StringBuilder();
                    } else {
                        value.append(ch);
                    }
                }
                values.add(value.toString());
                content.add(values.toArray(new String[0]));
            }
        }
        return content;
    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        mappingparseCSVtoSSSOM("http://esante.gouv.fr/terminologie-pathos",
                "http://esante.gouv.fr/terminologie-cim-10", "data/pathos/pathos_cim10.csv");
    }

}
