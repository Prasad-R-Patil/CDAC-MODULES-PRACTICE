import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoint;+
    private int strength;

    public Player(String name, int hitPoint, int strength, String weapon) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> data = new ArrayList<>();
        data.add(name);
        data.add(String.valueOf(hitPoint));
        data.add(String.valueOf(strength));
        data.add(weapon);
        return data;
    }

    @Override
    public void read(List<String> data) {
        if (data != null && data.size() == 4) {
            name = data.get(0);
            hitPoint = Integer.parseInt(data.get(1));
            strength = Integer.parseInt(data.get(2));
            weapon = data.get(3);
        }
    }

    @Override
    public String toString() {
        return "player(" + name + "," + hitPoint + "," + strength + "," + weapon + ")";
    }
}
