package etl.extract;

import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public interface Reader {
    Object read(String path) throws IOException;
}
