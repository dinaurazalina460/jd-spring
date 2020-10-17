package service;

import Implementation.Mentor;

public class MentorAccount {
    Mentor mentor;

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

    public void managerAccount() {
        this.mentor.createAccount();
    }
}
