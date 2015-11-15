package fields;

public class Demo {
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.printQuotes();
        System.out.println(storage.PRODUCER);

        System.out.println("");

        ModernStorage storage1 = new ModernStorage();
        storage1.printQuotes();
        System.out.println(storage1.PRODUCER);
    }
}
