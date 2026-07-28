package week1.Module_1.FactoryMethodPatternExample;

public class TestFactory {
    public static void main(String[] args) {
        DocumentFactory factory1 = new WordDocumentFactory();
        Document doc1 = factory1.createDocument();
        doc1.open();
        doc1.save();
        doc1.close();

        DocumentFactory factory2 = new PdfDocumentFactory();
        Document doc2 = factory2.createDocument();
        doc2.open();
        doc2.save();
        doc2.close();

        DocumentFactory factory3 = new ExcelDocumentFactory();
        Document doc3 = factory3.createDocument();
        doc3.open();
        doc3.save();
        doc3.close();
    }
}
