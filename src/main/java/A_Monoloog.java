public class A_Monoloog {

    public static void main(String[] args) {
        // Groepeer de statement in hun eigen method, en roep de method aan vanuit main. De code blijft functioneel hetzelfde doen.
        // Een conversatie bestaat uit een `greeting`, wat `smallTalk` en een `goodbye`
       greeting();
       smallTalk();
       goodbye();
    }

    // nieuwe methods komen hier
    public static void greeting() {
        System.out.println("Hey");
        System.out.println("Welcome to this wonderful conversation");
    }

    public static void smallTalk() {
        System.out.println("How about this weather?");
        System.out.println("And did you see that random program on that random channel?");
    }

    public static void goodbye() {
        System.out.println("Thank you for a wonderful conversation!");
        System.out.println("Cya");
    }
}
