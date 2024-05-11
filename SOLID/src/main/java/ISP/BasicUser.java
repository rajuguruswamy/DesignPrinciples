package ISP;

public class BasicUser implements BasicDocumentEditor{
    @Override
    public void createDocument() {
        System.out.println("BasicUser Create document");
    }

    @Override
    public void editDocument() {
        System.out.println("BasicUser Edit Document");
    }

    @Override
    public void saveDocument() {
        System.out.println("BasicUser Save Document");
    }
}
