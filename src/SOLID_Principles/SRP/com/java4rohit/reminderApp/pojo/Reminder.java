package SOLID_Principles.SRP.com.java4rohit.reminderApp.pojo;

import java.time.LocalDateTime;
/*

1. Change in reminderId format
2. Change in DateTime format

There are two reason to change this class do you thing this will violate the SRP ?

Answer: NO
1. Change in Reminder Properties : its will not voilate the SRP . Don't overEngineer  thing broad


 */
public class Reminder {

    private int reminderId;
    private String note;
    private LocalDateTime time;

    public Reminder() {
    }

    public Reminder(int reminderId, String note, LocalDateTime time) {
        this.note = note;
        this.reminderId = reminderId;
        this.time = time;
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
        return "Reminder{" + "note='" + note + '\'' + ", reminderId=" + reminderId + ", time=" + time + '}';
    }
}
