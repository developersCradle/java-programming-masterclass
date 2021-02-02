package tutorial_144_packages_part3;


import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
