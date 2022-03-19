import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import etl.EtlManager;
import etl.extract.Extract;
import etl.extract.csv.CsvExtract;
import etl.load.JsonLoad;
import etl.load.Load;
import etl.load.XmlLoad;
import models.madaReports.MadaReports;
import models.madaReports.MadaReportsParser;

import javax.xml.crypto.dsig.Transform;
import java.util.HashMap;
import java.util.Properties;
import java.io.IOException;
import java.util.List;

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
            etlManager.process("src\\main\\resources\\MadaReports.csv", "madda", "json");
            //etlManager.process("src\\main\\resources\\MadaReports.csv", "mada", "xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
