import java.io.Serializable;

public class EmployeeBean implements Serializable {
    private String name;

    public EmployeeBean() {
    }

    public EmployeeBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
