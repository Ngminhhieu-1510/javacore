import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<>();
        team.add("MU");
        team.add("Liver");
        team.add("Ars");
        team.removeFirst();
        System.out.println("top 3: " + team);
    }

}