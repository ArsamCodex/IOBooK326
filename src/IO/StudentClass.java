package objectInputStream;

import java.io.Serializable;

public class StudentClass implements Serializable {

    private String name;
    private int id ;
    private float ave;
    private int unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAve() {
        return ave;
    }

    public void setAve(float ave) {
        this.ave = ave;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
}
