package SOLID_Principles.SingleResponsibilityPrinciple.com.java4rohit;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reminder {

    private int reminderId;
    private String note;
    private LocalDateTime time;

    private List<Reminder> reminderList   = new ArrayList<>();

    public Reminder() {
    }

    public Reminder(int reminderId, String note, LocalDateTime time) {
        this.note = note;
        this.reminderId = reminderId;
        this.time = time;
    }

    public void addReminder(Reminder reminder){

        boolean isValid = validateReminder(reminder);

        if (!isValid){
            throw new RuntimeException("reminder enter is not valid");
        }
        reminderList.add(reminder);
    }

    public void savReminder(String fileName) throws FileNotFoundException {

    }

    private boolean validateReminder(Reminder reminder) {

        if(reminder.getNote().isBlank()){
            return false;
        }
        if(reminder.getReminderId()<=0){
            return false;
        }
        return true;
    }

    public  void  removeReminder(int reminderId){

        boolean contains = reminderList.contains(reminderId);

        if (contains){
            reminderList.remove(reminderId);
        }
    }

    public  void  printReminders(){
        reminderList.forEach(reminder -> System.out.println(reminder));
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "Reminder{" +
                "note='" + note + '\'' +
                ", reminderId=" + reminderId +
                ", time=" + time +
                '}';
    }
}
