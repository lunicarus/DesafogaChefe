package projetos.desafogachefe.domain.entities;

import java.util.List;

public class Job {
    private String title;
    private List<String> functions; // List of tasks the job involves
    private double bruteCostPerHour; // Pay rate per hour

    public Job(String title, List<String> functions, double bruteCostPerHour) {
        this.title = title;
        this.functions = functions;
        this.bruteCostPerHour = bruteCostPerHour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getFunctions() {
        return functions;
    }

    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }

    public double getPayRate() {
        return bruteCostPerHour;
    }

    public void setPayRate(double bruteCostPerHour) {
        this.bruteCostPerHour = bruteCostPerHour;
    }
}
