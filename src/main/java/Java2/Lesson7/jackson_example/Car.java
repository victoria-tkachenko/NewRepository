package Java2.Lesson7.jackson_example;

public class Car {

    private String colour;

    public Car() {
    }

    private String type;

    public Car(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
