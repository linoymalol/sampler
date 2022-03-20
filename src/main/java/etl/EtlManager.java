package etl;

import com.google.common.io.Files;
import etl.extract.Extract;
import models.labTests.load.Load;

import javax.xml.crypto.dsig.Transform;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class EtlManager {
    private HashMap<String, Extract> extractHashMap;
    private HashMap<String, Transform> transformHashMap;
    private HashMap<String, Load> loadHashMap;


    public EtlManager(HashMap<String, Extract> extractHashMap, HashMap<String, Transform> transformHashMap,
                      HashMap<String, Load> loadHashMap){
        this.extractHashMap = extractHashMap;
        this.transformHashMap = transformHashMap;
        this.loadHashMap = loadHashMap;
    }

    public List extractTheFile(String fromFile, String objectName) throws IOException {
        return extractHashMap.get(getExtensionByGuava(fromFile)).extract(fromFile, objectName);
    }

    public void loadToFile(String toDirectoryName, List listOfObjects, String typeOfFile) throws IOException {
        createDirectoryIfNotExists("C:\\" + toDirectoryName);
        loadHashMap.get(typeOfFile).load("C:\\" + toDirectoryName + "\\" + toDirectoryName + "1", listOfObjects);
    }

    public void  process(String fromFile, String objectName, String toDirectoryName, String typeOfFile) throws IOException {
        loadToFile(toDirectoryName, extractTheFile(fromFile, objectName), typeOfFile);
    }

    public String getExtensionByGuava(String filename) {
        return Files.getFileExtension(filename);
    }

    public void createDirectoryIfNotExists(String path){
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdir();
        }
    }
}
