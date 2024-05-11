package ISP;

public class Solution {
    public static void main(String[] args) {

        System.out.println("Interface Segregation Principle (ISP)");

        BasicDocumentEditor basic  = new BasicUser();
        basic.createDocument();
        basic.editDocument();
        basic.saveDocument();

        AdvancedDocumentEditor advancedUser= new AdvancedUser();
        advancedUser.createDocument();
        advancedUser.editDocument();
        advancedUser.saveDocument();
        advancedUser.printDocument();

    }
}
