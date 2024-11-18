package projetos.desafogachefe.domain.entities.loan;


import projetos.desafogachefe.domain.usecases.util.Verificator;
import projetos.desafogachefe.domain.usecases.util.Notification;
import java.time.LocalDateTime;

public class LoanValidator extends Verificator<Loan> {
    @Override
    public Notification validate(Loan loan) {
        Notification notification = new Notification();

        if (loan == null) {
            notification.addError("Loan cannot be null.");
            return notification;
        }
        if (loan.getEmployee() == null) {
            notification.addError("Loan must have an associated Employee.");
        }
        if (loan.getLoaningCompany() == null || loan.getLoanerCompany() == null) {
            notification.addError("Loan must specify both loaning and loaner companies.");
        }
        if (loan.getStartTime().isBefore(LocalDateTime.now().plusMinutes(30))) {
            notification.addError("Loan must be requested at least 30 minutes in advance.");
        }
        if (loan.getJob().getPayRate() < loan.getPayRate()) {
            notification.addError("Pay rate must match or exceed employee's current job rate.");
        }
        return notification;
    }


}