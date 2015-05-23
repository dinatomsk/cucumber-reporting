package net.masterthought.cucumber;


public class SummaryReport {

    private long creationDate;
    private long totalDuration;
    private int totalFeatures;

    private int totalSteps;
    private int totalStepsPassed;

    private int totalScenarios;
    private int totalScenariosPassed;

    public SummaryReport(ReportInformation ri) {
        totalFeatures = ri.getTotalFeatures();
        totalDuration = ri.getTotalDuration();

        totalSteps = ri.getTotalSteps();
        totalStepsPassed = ri.getTotalStepsPassed();

        totalScenarios = ri.getTotalScenarios();
        totalScenariosPassed = ri.getTotalScenariosPassed();

        creationDate = System.currentTimeMillis();
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(long totalDuration) {
        this.totalDuration = totalDuration;
    }

    public int getTotalFeatures() {
        return totalFeatures;
    }

    public void setTotalFeatures(int totalFeatures) {
        this.totalFeatures = totalFeatures;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

    public void setTotalSteps(int totalSteps) {
        this.totalSteps = totalSteps;
    }

    public int getTotalStepsPassed() {
        return totalStepsPassed;
    }

    public void setTotalStepsPassed(int totalStepsPassed) {
        this.totalStepsPassed = totalStepsPassed;
    }

    public int getTotalScenarios() {
        return totalScenarios;
    }

    public void setTotalScenarios(int totalScenarios) {
        this.totalScenarios = totalScenarios;
    }

    public int getTotalScenariosPassed() {
        return totalScenariosPassed;
    }

    public void setTotalScenariosPassed(int totalScenariosPassed) {
        this.totalScenariosPassed = totalScenariosPassed;
    }
}
