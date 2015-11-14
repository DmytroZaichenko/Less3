package fields;

public class Demo {
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.printQuotes();
        System.out.println(storage.getProducer());

        System.out.println("");

        storage = new ModernStorage();
        storage.printQuotes();
        System.out.println(storage.getProducer());
    }
}
