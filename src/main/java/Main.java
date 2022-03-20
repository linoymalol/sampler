import etl.EtlManager;
import etl.extract.Extract;
import etl.extract.csv.CsvExtract;
import etl.load.file.JsonLoad;
import etl.load.Load;
import etl.load.file.XmlLoad;

import javax.xml.crypto.dsig.Transform;
import java.util.HashMap;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        //Properties properties = new Properties();
        //madaReports = csvExtract.extract(properties.getProperty("MadaReportsCsvPath"));
        */
        HashMap<String, Extract> extractHashMap = new HashMap<>();
        HashMap<String, Transform> transformHashMap = new HashMap<>();
        HashMap<String, Load> loadHashMap = new HashMap<>();

        CsvExtract csvExtract= new CsvExtract();
        extractHashMap.put("csv", csvExtract);
        JsonLoad jsonLoad = new JsonLoad();
        loadHashMap.put("json",jsonLoad);
        XmlLoad xmlLoad = new XmlLoad();
        loadHashMap.put("xml", xmlLoad);
        EtlManager etlManager = new EtlManager(extractHashMap, transformHashMap, loadHashMap);
        try {
            etlManager.process("src\\main\\resources\\MadaReports.csv", "MadaReports", "madda", "json");
            etlManager.process("src\\main\\resources\\LabTests.csv", "LabTests", "lab", "xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
