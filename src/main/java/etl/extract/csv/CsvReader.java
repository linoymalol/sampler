package etl.extract.csv;

import etl.extract.FileReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class CsvReader extends FileReader {
    public Object readFromFile(String path) throws IOException {
        return new CSVParser(new java.io.FileReader(path), CSVFormat.DEFAULT);
    }
}
