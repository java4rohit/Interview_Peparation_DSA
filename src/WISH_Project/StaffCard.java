package WISH_Project;

/**
 * The StaffCard class represents a staff card with a luxury rating of 10, 0 bitcoins,
 * and additional information such as employee number, job description, and journey score.
 * The journey score increases whenever a shuttle journey is made, but no points are added for shuttle travel.
 * The toString() method is overridden to include the employee details.
 */
public class StaffCard extends Card {
    private int employeeNumber;
    private String jobDescription;
    private int journeyScore;

    // Constructor
    public StaffCard(String cardId, String name, int employeeNumber, String jobDescription) {
        super(cardId, name, 10, 0);  // Staff card has the highest luxury rating of 10 and 0 bitcoins
        this.employeeNumber = employeeNumber;
        this.jobDescription = jobDescription;
        this.journeyScore = 0;  // Initial journey score is 0
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public int getJourneyScore() {
        return journeyScore;
    }

    @Override
    public void updateAfterShuttle() {
        // Staff card doesn't deduct bitcoins, but journey score increases
        journeyScore++;
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee Number: " + employeeNumber + ", Job Description: " + jobDescription + ", Journey Score: " + journeyScore;
    }
}
