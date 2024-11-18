package projetos.desafogachefe.domain.entities;

import projetos.desafogachefe.domain.entities.colaborator.Colaborator;
import projetos.desafogachefe.domain.entities.company.Company;

public class FinancialReport {
    private Colaborator employee;
    private Company loaningCompany;
    private Company loanerCompany;
    private double totalHoursWorked;
    private double totalCost;
    private double extraPay;

    public FinancialReport(Colaborator employee,
                           Company loaningCompany, Company loanerCompany,
                           double totalHoursWorked, double totalCost, double extraPay) {
        this.employee = employee;
        this.loaningCompany = loaningCompany;
        this.loanerCompany = loanerCompany;
        this.totalHoursWorked = totalHoursWorked;
        this.totalCost = totalCost;
        this.extraPay = extraPay;
    }

}