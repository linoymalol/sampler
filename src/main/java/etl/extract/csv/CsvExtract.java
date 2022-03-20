package etl.extract.csv;

import etl.extract.Extract;
import models.labTests.LabTestsCsvParser;
import models.madaReports.MadaReports;
import models.madaReports.MadaReportsCsvParser;

import java.io.IOException;
import java.util.List;

public class CsvExtract implements Extract {
    CsvReader csvReader = new CsvReader();
    //CsvParser csvParser = new CsvParser();
    MadaReportsCsvParser madaReportsCsvParser = new MadaReportsCsvParser();
    LabTestsCsvParser labTestsCsvParser = new LabTestsCsvParser();

    public List extract(String path, String objectName) throws IOException {
        if (objectName == "MadaReports")
            return madaReportsCsvParser.parser(csvReader.readFromFile(path));
        if(objectName == "LabTests"){
            return labTestsCsvParser.parser(csvReader.readFromFile(path));
        }
        return null;
    }
}
