package SOLID_Principles.SRP.com.java4rohit.reminderApp.printer;

import SOLID_Principles.SRP.com.java4rohit.reminderApp.pojo.Reminder;

import java.util.List;

public class ReminderPrinter {
    public  void  printReminders(List<Reminder> reminderList){

        reminderList.forEach(reminder -> System.out.println(reminder));
    }

}
