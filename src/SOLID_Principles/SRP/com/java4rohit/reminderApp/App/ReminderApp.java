package SOLID_Principles.SRP.com.java4rohit.reminderApp.App;

import SOLID_Principles.SRP.com.java4rohit.reminderApp.pojo.Reminder;
import SOLID_Principles.SRP.com.java4rohit.reminderApp.printer.ReminderPrinter;
import SOLID_Principles.SRP.com.java4rohit.reminderApp.utils.ReminderUtils;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class ReminderApp {
    public static void main(String[] args) throws FileNotFoundException {

        Reminder reminder =  new Reminder();


        Reminder go_to_market = new Reminder(1,"Go to market",LocalDateTime.of(2024,9,15,10,15));
        Reminder doWork = new Reminder(2,"I need to complete  java udemy course",LocalDateTime.of(2024,9,20,10,15));
        Reminder go_to_play = new Reminder(3,"Go to BasketBall Ground",LocalDateTime.of(2024,9,5,5,15));

        ReminderUtils reminderUtils = new ReminderUtils();

        reminderUtils.addReminder(go_to_market);
        reminderUtils.addReminder(doWork);
        reminderUtils.addReminder(go_to_play);

        ReminderPrinter reminderPrinter = new ReminderPrinter();
        reminderPrinter.printReminders(reminderUtils.getReminderList());
       // reminder.savReminder("file-name");



    }
}
