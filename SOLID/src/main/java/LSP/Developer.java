package LSP;

public class Developer  extends Employee{

    public  Developer(String name, double salary){
        super(name, salary);
    }

    public void writeCode() {
        System.out.println("Developer-specific code writing behavior");
    }

    @Override
    public void work() {
        System.out.println("Software developer should build , test, release application");
    }
}
