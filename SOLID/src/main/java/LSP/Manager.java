package LSP;

public class Manager extends Employee {

    public  Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Manager track project management ");
    }

    public void manageTeam() {
        System.out.println("Manager manage the project team");
    }

}
