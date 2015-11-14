package fields;

public class Storage {

    public static final String PRODUCER = "my producer";

    private String[] quotes;

    public Storage() {
        quotes = new String[]{
           "I've failed over and over and over again in my life and that is why I succeed",
           "Let us always meet each other with smile, for the smile is the beginning of love."
        };
    }

    public void printQuotes(){
        for (String quote : quotes){
            System.out.println(quote);
        }
    }

    public static String getProducer(){
        return PRODUCER;
    }
}
