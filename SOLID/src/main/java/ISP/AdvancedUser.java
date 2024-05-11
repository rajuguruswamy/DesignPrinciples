package ISP;

public class AdvancedUser implements  AdvancedDocumentEditor{
    @Override
    public void printDocument() {
        System.out.println("AdvancedUser Print  document");
    }
    @Override
    public void createDocument() {
        System.out.println("AdvancedUser Create document");
    }

    @Override
    public void editDocument() {
        System.out.println("AdvancedUser Edit Document");
    }

    @Override
    public void saveDocument() {
        System.out.println("AdvancedUser Save Document");
    }
}
