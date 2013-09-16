package main;

public class Car {

    public final static String RED = "RED";
    public final static String BLACK = "BLACK";
    public final static String WHITE = "WHITE";
    public final static String SEDAN = "SEDAN";
    public final static String CABRIOLET = "CABRIOLET";
    public final static String LIMOUSINE = "LIMOUSINE";

    private String name;
    private String body;
    private String color;

    public Car(String name) {

        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {

        final String info =
                "car name = " + name
                        + " *** body = " + body
                        + " *** color = " + color;
        return info;
    }
}
