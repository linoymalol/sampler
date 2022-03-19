package etl.extract.csv;

import etl.extract.Parser;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class CsvParser implements Parser {
    public List<CSVRecord> parse(Object object) throws IOException {
        CSVParser parser = (CSVParser) object;
        List<CSVRecord> records = parser.getRecords();
        return records;
    }
}
