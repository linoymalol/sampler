package etl.extract;

import models.MadaReports;
import org.apache.commons.csv.CSVRecord;

public class MadaReportsParser {
    public MadaReports MadaReports(CSVRecord rec) {
        return new MadaReports(rec.get(0), rec.get(1), Integer.parseInt(rec.get(2)), rec.get(3), rec.get(4), rec.get(5),
                rec.get(6), Integer.parseInt(rec.get(7)), rec.get(8), rec.get(9), rec.get(10), rec.get(11));
    }
}
