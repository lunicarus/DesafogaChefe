package projetos.desafogachefe.domain.entities;

import projetos.desafogachefe.domain.entities.company.Company;

public class Employer extends User {
    private Company associatedCompany;

    public Employer(String login, String password, Company associatedCompany) {
        super(login, password);
        this.associatedCompany = associatedCompany;
    }

    public Company getAssociatedCompany() {
        return associatedCompany;
    }

    public void setAssociatedCompany(Company associatedCompany) {
        this.associatedCompany = associatedCompany;
    }
}