package etl.load.file;

import etl.load.file.FileLoader;

import java.io.IOException;
import java.util.List;

public class XmlLoad extends FileLoader {
    public void load(String path, List listOfObjects) throws IOException {
        super.load(path + ".xml", listOfObjects);
    }
}
