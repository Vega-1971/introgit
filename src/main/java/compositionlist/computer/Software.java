package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class Software {

    private String name;
    private double numberOfVersion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfVersion() {
        return numberOfVersion;
    }

    public void setNumberOfVersion(double numberOfVersion) {
        this.numberOfVersion = numberOfVersion;
    }

    public Software(String name, double numberOfVersion) {
        this.name = name;
        this.numberOfVersion = numberOfVersion;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", numberOfVersion=" + numberOfVersion +
                '}';
    }
}
