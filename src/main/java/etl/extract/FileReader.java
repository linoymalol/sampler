package etl.extract;

import java.io.IOException;

public interface FileReader extends Reader {
    Object readFromFile(String path) throws IOException;
}
