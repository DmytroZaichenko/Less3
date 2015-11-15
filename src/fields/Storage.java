package fields;

public class Storage {

    public final String PRODUCER = "my producer";

    public String[] quotes;

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

    public String getProducer(){
        return PRODUCER;
    }
}
