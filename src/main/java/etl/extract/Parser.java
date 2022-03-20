package etl.extract;

import java.io.IOException;
import java.util.List;

public interface Parser {
    List parser(Object object) throws IOException;
}
