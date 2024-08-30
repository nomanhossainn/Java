package Fall2022;
public class ArgentinaFans extends FIFA {
    private int havingWorldCups;

    ArgentinaFans(int noOfGoals, String venue, int havingWorldCups) {
        super(noOfGoals, venue);
        this.havingWorldCups = havingWorldCups;
    }

    @Override
    public String toString() {
        return ("ArgentinaFans ->  FIFA -> NoOfGoals : " + super.getNoOfGoals() + ", Venue :" + super.getVenue() + "], HavingWorldCups: " + havingWorldCups);

    }

    void incrementWorldCups() {
        havingWorldCups++;
    }

}
