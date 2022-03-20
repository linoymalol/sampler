package etl.load;

import java.io.IOException;
import java.util.List;

public interface Load {
    public void load(String source, List listOfObjects) throws IOException;
}
