import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Lid> lijstVanLeden = new ArrayList<Lid>();

    public Team(Lid lid1, Lid lid2, Lid lid3, Lid lid4) {
        lijstVanLeden.add(lid1);
        lijstVanLeden.add(lid2);
        lijstVanLeden.add(lid3);
        lijstVanLeden.add(lid4);

    }

    public static void main(String[] args) {

    }

    public void drukLeden() {
        for (int i = 0; i < lijstVanLeden.size(); i++) {
            lijstVanLeden.get(i).print();
        }
    }

    public List<Lid> getLijstVanLeden() {
        return lijstVanLeden;
    }

}
