package etl.load;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class FileLoader implements Load {

    public void load(String path, List listOfObjects) throws IOException {
        LimitNumberOfRecords limitNumberOfRecords = new LimitNumberOfRecords();
        int numberOfFiles = limitNumberOfRecords.numberOfFiles(listOfObjects, 500);
        int counter = 0;
        int indexInList = 0;
        while (counter != numberOfFiles) {
            ObjectMapper mapper = new ObjectMapper();
            if (500 * (counter + 1) > listOfObjects.size()) {
                mapper.writeValue(new File(path), listOfObjects.subList(indexInList, listOfObjects.size()));
            } else {
                mapper.writeValue(new File(path), listOfObjects.subList(indexInList, 500 * (counter + 1)));
            }
            indexInList = 500 * (counter + 1);
            counter++;
            path = limitNumberOfRecords.newPath(path, counter);
        }
    }
}
