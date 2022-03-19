package etl.extract.csv;

import etl.extract.Extract;
import java.io.IOException;
import java.util.List;

public class CsvExtract implements Extract {
    CsvReader csvReader = new CsvReader();
    CsvParser csvParser = new CsvParser();

    public List extract(String path) throws IOException {
        return csvParser.parse(csvReader.readFromFile(path));
    }
}
