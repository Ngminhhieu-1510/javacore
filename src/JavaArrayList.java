import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<>();
        team.add("MU");
        team.add("Liver");
        team.add("Ars");
        team.remove(0);
        System.out.println("top 3: " + team);
    }

}