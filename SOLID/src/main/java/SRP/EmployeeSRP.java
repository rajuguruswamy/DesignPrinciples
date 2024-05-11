package SRP;

public class EmployeeSRP {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    private String name;
    private Integer salary;

    public EmployeeSRP(String name) {
        this.name = name;
    }




    public void save(){
        System.out.println("Save Employee");
    }
}
