package week1.Module_1.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document");
    }

    public void save() {
        System.out.println("Saving PDF Document");
    }

    public void close() {
        System.out.println("Closing PDF Document");
    }
}