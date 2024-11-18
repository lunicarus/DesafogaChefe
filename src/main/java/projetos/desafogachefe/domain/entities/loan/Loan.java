package projetos.desafogachefe.domain.entities.loan;

import projetos.desafogachefe.domain.entities.Job;
import projetos.desafogachefe.domain.entities.colaborator.Colaborator;
import projetos.desafogachefe.domain.entities.company.Company;
import projetos.desafogachefe.domain.entities.LoanStatus;

import java.time.LocalDateTime;

import static projetos.desafogachefe.domain.entities.LoanStatus.PENDING;

public class Loan {
    private Colaborator employee;
    private Company loaningCompany;
    private Company loanerCompany;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double payRate;
    private LoanStatus status;
    private Job job;

    public Loan(Colaborator employee,
                Company loaningCompany,
                Company loanerCompany,
                LocalDateTime startTime,
                double payRate) {
        this.employee = employee;
        this.job = employee.getJob();
        this.loaningCompany = loaningCompany;
        this.loanerCompany = loanerCompany;
        this.startTime = startTime;
        this.payRate = payRate;
        LoanStatus LoanStatus = PENDING;
    }

    public void updateStatus(LoanStatus status) {
        this.status = status;
    }

    public Colaborator getEmployee() {
        return employee;
    }

    public Company getLoaningCompany() {
        return loaningCompany;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public double getPayRate() {
        return 0;
    }

    public Company getLoanerCompany() {
        return loanerCompany;
    }

    public Job getJob() {
        return job;
    }
}
