import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good evening, %s, Lovely to see you %s", name , dayPeriod);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Current date today is: " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        int appears = conversation.indexOf("Alexis");
        String answer;
        if (appears == 1) {
            answer = "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if (appears !=1){
            answer = "At your service. As you wish, naturally.";
        }else{
            answer = "Right. And with that I shall retire";
        }
        return answer;
    }
}

