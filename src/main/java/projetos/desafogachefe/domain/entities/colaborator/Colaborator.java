package projetos.desafogachefe.domain.entities.colaborator;

import projetos.desafogachefe.domain.entities.Job;
import projetos.desafogachefe.domain.entities.User;
import projetos.desafogachefe.domain.entities.WorkSchedule;

public class Colaborator extends User {
    private WorkSchedule workSchedule;
    private Job job;

    public Colaborator(String login, String password, WorkSchedule workSchedule, Job job) {
        super(login, password);
        this.workSchedule = workSchedule;
        this.job = job;
    }

    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(WorkSchedule workSchedule) {
        this.workSchedule = workSchedule;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}