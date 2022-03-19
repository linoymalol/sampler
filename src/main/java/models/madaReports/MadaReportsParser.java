package models.madaReports;

import models.madaReports.MadaReports;
import org.apache.commons.csv.CSVRecord;

import java.util.LinkedList;
import java.util.List;

public class MadaReportsParser {
    public List<MadaReports> MadaReports(List<CSVRecord> rec) {
        List<MadaReports>madaReports = new LinkedList<>();
        for (int i = 1; i < rec.size(); i++){
            madaReports.add(new MadaReports(rec.get(i).get(0), rec.get(i).get(1), Integer.parseInt(rec.get(i).get(2)), rec.get(i).get(3), rec.get(i).get(4), rec.get(i).get(5),
                    rec.get(i).get(6), Integer.parseInt(rec.get(i).get(7)), rec.get(i).get(8), rec.get(i).get(9), rec.get(i).get(10), rec.get(i).get(11)));
        }
        return madaReports;
    }

}
