package SOLID_Principles.SRP.com.java4rohit.reminderApp.validation;

import SOLID_Principles.SRP.com.java4rohit.reminderApp.pojo.Reminder;

public class ReminderValidationChecker {

    public boolean validateReminder(Reminder reminder) {

        if (reminder.getNote().isBlank()) {
            return false;
        }
        if (reminder.getReminderId() <= 0) {
            return false;
        }
        return true;
    }
}
