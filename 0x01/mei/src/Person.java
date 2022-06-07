

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName(){
        return this.name + " " + this.surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float calculateYearlySalary(){
        return this.salary*12;
    }

    public boolean isMEI(){
    if (calculateYearlySalary() > 130000) return false;

        LocalDate personBirthDate = LocalDate.ofInstant(this.birthDate.toInstant(), ZoneId.systemDefault());
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(personBirthDate,currentDate);

        if (period.getYears() < 18) return false;
        if (anotherCompanyOwner) return false;
        if (pensioner) return false;
        if (publicServer) return false;

        return true;
    }
}
