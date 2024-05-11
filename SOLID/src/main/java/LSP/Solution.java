package LSP;

public class Solution {
    public static void main(String[] args) {

        Employee developer = new Developer("Raju",10000);
        Employee manager  = new Manager("Shaun",12000);
        Employee intern =   new Intern("Mark" ,3500);


        // the program correctly works regardless of employee type
        developer.work();
        manager.work();
        intern.work();


    }
}
