public class AlfredTest {
    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();
        System.out.println(alfredBot.basicGreeting());

        AlfredQuotes alfredBot2 = new AlfredQuotes();
        System.out.println(alfredBot2.guestGreeting("Beth Kane", "evening"));

        AlfredQuotes alfredBot3 = new AlfredQuotes();
        System.out.println(alfredBot3.dateAnnouncement());

        AlfredQuotes alfredBot4 = new AlfredQuotes();
        System.out.println(alfredBot4.respondBeforeAlexis("Alexis! Play some low-fi beats."));

        AlfredQuotes alfredBot5 = new AlfredQuotes();
        System.out.println(alfredBot5.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is."));

        AlfredQuotes alfredBot6 = new AlfredQuotes();
        System.out.println(alfredBot6.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing.."));

    }
}
