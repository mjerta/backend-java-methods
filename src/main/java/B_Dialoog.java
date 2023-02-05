public class B_Dialoog {

    public static void main(String[] args) {
        // In deze dialoog praten Bert en Ernie met elkaar.
        // Maak methode bertSays die "Bert says: " + de string print en een methode ernieSays die de string " says Ernie" print.
        // De methode heeft als parameter de tekst die gesproken moet worden.
        // De volgende zin wordt steeds door de ander gesproken.
        // Vervang System.out.println() steeds door je eigen method.
        bertSays("Hey"); //Bert
        ernieSays("Hey"); //Ernie
        bertSays("Welcome to this wonderful conversation");
        ernieSays("Thnx, I'm looking forward to it");
        bertSays("How about this weather?");
        ernieSays("I really don't mind the cold....");
        bertSays("And did you see that random program on that random channel?");
        ernieSays("Well... I did watch a random program on a random channel...");
        bertSays("Thank you for a wonderful conversation!");
        ernieSays("Cya");
    }

    // nieuwe methods komen hier
    public static void bertSays(String text) {
        System.out.println("Bert says: " + text);
    }

    public static void ernieSays(String text) {
        System.out.println(text + " says Ernie");
    }
}
