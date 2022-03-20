package models.labTests;

import etl.extract.Parser;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class LabTestsCsvParser implements Parser {
    public List parser(Object object) throws IOException {
        CSVParser parser = (CSVParser) object;
        List<CSVRecord> rec = parser.getRecords();
        List<LabTests> labTests = new LinkedList<>();
        for (int i = 1; i < rec.size(); i++) {
            labTests.add(new LabTests(rec.get(i).get(0), Integer.parseInt(rec.get(i).get(1)), rec.get(i).get(2), rec.get(i).get(3), rec.get(i).get(4), rec.get(i).get(5),
                    rec.get(i).get(6), rec.get(i).get(7), Integer.parseInt(rec.get(i).get(8)), rec.get(i).get(9), rec.get(i).get(10)));
        }
        return labTests;
    }
}
