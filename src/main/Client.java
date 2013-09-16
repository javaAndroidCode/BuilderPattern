package main;


public class Client {

    public static void main(String[] args) {

        VolvoBuilder volvoBuilder = new VolvoBuilder();
        Director director = new Director(volvoBuilder);
        director.buildNewCar();
        System.err.println(volvoBuilder.getCar().toString());
    }
}
