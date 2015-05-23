package net.masterthought.cucumber.generators;

import java.io.IOException;

import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.SummaryReport;

public class TrendsPage extends AbstractPage {

    private final SummaryReport summaryReport;

    public TrendsPage(ReportBuilder reportBuilder, SummaryReport summaryReport) {
        super(reportBuilder, "trendsPage.vm");
        this.summaryReport = summaryReport;
    }

    @Override
    public void generatePage() throws IOException {
        super.generatePage();

        contextMap.putAll(getGeneralParameters());

        generateReport("trends-overview.html");
    }

}
