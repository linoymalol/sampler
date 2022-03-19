package etl.load;

import java.io.IOException;
import java.util.List;

public interface Load {
    public void load(String path, List listOfObjects) throws IOException;
}
