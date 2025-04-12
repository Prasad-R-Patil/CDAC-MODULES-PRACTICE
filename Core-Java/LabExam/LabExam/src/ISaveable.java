import java.util.List;

public interface ISaveable {
    void read(List<String> data);
    List<String> write();
}
