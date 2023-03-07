import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private List<Family> families; // exactly 100 family members
    private final int id; // exactly 1, 2, 3

    public Airplane(List<Family> families, int id) {
        this.families = families;
        this.id = id;
    }

    public List<Family> getFamilies() {
        return families;
    }

    public int getId() {
        return id;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public boolean clearList() {
        List<Family> found = new ArrayList<>();
        for(Family family : this.families) {
            if(!family.isAreInAirplane()) {
                found.add(family);
            }
        }

        return this.families.removeAll(found);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "families=" + this.families +
                ", id=" + this.id +
                '}';
    }
}
