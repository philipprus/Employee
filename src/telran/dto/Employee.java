package telran.dto;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String emailAddress;
    private String companyName;
    private String name;
    private String gender;
    private int salary;
    private String title;

    public Employee(int id, String emailAddress, String companyName, String name, String gender, int salary, String title) {
        super();
        this.id = id;
        this.emailAddress = emailAddress;
        this.companyName = companyName;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.title = title;
    }

    public Employee() { }

    public int getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                '}';
    }
}
