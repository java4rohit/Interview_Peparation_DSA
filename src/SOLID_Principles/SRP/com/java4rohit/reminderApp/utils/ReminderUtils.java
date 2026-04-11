package SOLID_Principles.SRP.com.java4rohit.reminderApp.utils;

import SOLID_Principles.SRP.com.java4rohit.reminderApp.pojo.Reminder;
import SOLID_Principles.SRP.com.java4rohit.reminderApp.validation.ReminderValidationChecker;

import java.util.ArrayList;
import java.util.List;

public class ReminderUtils {

    private List<Reminder> reminderList = new ArrayList<>();

    ReminderValidationChecker validationChecker = new ReminderValidationChecker();

    public void addReminder(Reminder reminder) {

        boolean isValid = validationChecker.validateReminder(reminder);

        if (!isValid) {
            throw new RuntimeException("reminder enter is not valid");
        }
        getReminderList().add(reminder);
    }

    public void removeReminder(int reminderId) {

        getReminderList().remove(--reminderId);
    }

    public List<Reminder> getReminderList() {
        return reminderList;
    }

    public void setReminderList(List<Reminder> reminderList) {
        this.reminderList = reminderList;
    }
}
