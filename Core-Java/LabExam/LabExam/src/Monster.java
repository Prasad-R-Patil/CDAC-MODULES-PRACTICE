import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoint;
    private int strength;

    public Monster(String name, int hitPoint, int strength) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> data = new ArrayList<>();
        data.add(name);
        data.add(String.valueOf(hitPoint));
        data.add(String.valueOf(strength));
        return data;
    }

    @Override
    public void read(List<String> data) {
        if (data != null && data.size() == 3) {
            name = data.get(0);
            hitPoint = Integer.parseInt(data.get(1));
            strength = Integer.parseInt(data.get(2));
        }
    }

    @Override
    public String toString() {
        return "monster(" + name + "," + hitPoint + "," + strength + ")";
    }
}
