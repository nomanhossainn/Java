package Fall2022;

public class Runner {
    public static void main(String[] args) {
        new FIFA();
        System.out.println("Argentina will win");
        new FIFA();
        System.out.println("Brazil will win");
        ArgentinaFans B = new ArgentinaFans(10, "Qatar", 2);
        BrazilFans R = new BrazilFans(7, "Qatar", 5);

        System.out.println(B.toString());
        System.out.println(R.toString());

        checkGoals(B, R);

        System.out.println(B.toString());
        System.out.println(R.toString());

    }

    public static Void checkGoals(ArgentinaFans B, BrazilFans R) {
        if (B.getNoOfGoals() > R.getNoOfGoals()) {
            B.incrementWorldCups();
        } else {
            R.incrementWorldCups();
        }
        return null;
    }


}
