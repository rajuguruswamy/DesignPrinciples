package ISP.WithoutISP;

public class BasicUser implements DocumentEditor {
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

    @Override
    public void printDocument() {
        throw new UnsupportedOperationException("Basic users cannot print documents");
    }
}
