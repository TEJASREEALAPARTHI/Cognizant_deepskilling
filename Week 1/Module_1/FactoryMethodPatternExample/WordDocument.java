package week1.Module_1.FactoryMethodPatternExample;

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document");
    }

    public void save() {
        System.out.println("Saving Word Document");
    }

    public void close() {
        System.out.println("Closing Word Document");
    }
}