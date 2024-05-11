package LSP;

public class Intern extends  Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Intern Helps in developing application");
    }

    public void learn() {
        System.out.println("Intern learning application development process");
    }

}
