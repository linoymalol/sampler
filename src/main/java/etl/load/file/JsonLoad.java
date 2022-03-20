package etl.load;

import java.io.IOException;
import java.util.List;

public class JsonLoad extends FileLoader {
    public void load(String path, List listOfObjects) throws IOException {
        super.load(path + ".json", listOfObjects);
    }
}
