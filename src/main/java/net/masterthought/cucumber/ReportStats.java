package net.masterthought.cucumber;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class ReportStats {

    private static final String JSON_SUMMARY_REPORT_FILE = "summar-report.json";
    private static final String JSON_ALL_REPORTS_FILE = "all-stats.json";

    private final SummaryReport summaryReport;
    private final File reportDirectory;

    public ReportStats(SummaryReport ri, File reportDirectory) {
        this.summaryReport = ri;
        this.reportDirectory = reportDirectory;
    }

    public void saveSummaryReport() throws IOException {
        Gson gson = new Gson();
        String jsonContent = gson.toJson(summaryReport);
        FileUtils.writeStringToFile(new File(reportDirectory, JSON_SUMMARY_REPORT_FILE), jsonContent);
    }
}
