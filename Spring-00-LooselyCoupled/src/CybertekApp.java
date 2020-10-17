import Implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        MentorAccount mentor = new MentorAccount(fullTimeMentor);
        mentor.managerAccount();
    }
}
