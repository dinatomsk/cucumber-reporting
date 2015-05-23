import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class HelloCucumber {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        // list.add("78.json");
        list.add("cucumber-report1.json");
        // list.add("cucumber-report2.json");
        // list.add("cucumber-report3.json");
        // list.add("cucumber-parallet-XXL.json");

        File reportOutputDirectory = new File("target");
        String pluginUrlPath = "";
        String buildNumber = "12";
        String buildProject = "RIFE sc-rife-005 (regression) - run test";
        boolean skippedFails = true;
        boolean pendingFails = false;
        boolean undefinedFails = false;
        boolean missingFails = true;
        boolean flashCharts = true;
        boolean runWithJenkins = true;
        boolean artifactsEnabled = false;
        String artifactConfig = "";
        boolean highCharts = true;
        boolean parallel = false;

        ReportBuilder reportBuilder = new ReportBuilder(list, reportOutputDirectory, pluginUrlPath, buildNumber,
                buildProject, skippedFails, pendingFails, undefinedFails, missingFails, flashCharts, runWithJenkins,
                artifactsEnabled, artifactConfig, highCharts, parallel);
        reportBuilder.generateReports();
    }
}
