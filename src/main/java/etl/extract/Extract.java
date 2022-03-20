package etl.extract;

import java.io.IOException;
import java.util.List;

public interface Extract {
    List extract(String path, String objectName) throws IOException;
}
