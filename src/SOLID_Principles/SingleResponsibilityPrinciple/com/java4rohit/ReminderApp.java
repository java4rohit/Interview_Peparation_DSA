package SOLID_Principles.SingleResponsibilityPrinciple.com.java4rohit;

import java.time.LocalDateTime;

public class ReminderApp {
    public static void main(String[] args) {

        Reminder reminder =  new Reminder();


        Reminder go_to_market = new Reminder(1,"Go to market",LocalDateTime.of(2024,9,15,10,15));
        Reminder doWork = new Reminder(1,"I need to complete  java udemy course",LocalDateTime.of(2024,9,20,10,15));

        reminder.addReminder(go_to_market);
        reminder.addReminder(doWork);

        reminder.printReminders();



    }
}
