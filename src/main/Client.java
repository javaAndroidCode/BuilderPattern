package main;

/**
 * Created with IntelliJ IDEA.
 * User: Пользователь
 * Date: 16.09.13
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    public static void main(String[] args) {

        VolvoBuilder volvoBuilder = new VolvoBuilder();
        Director director = new Director(volvoBuilder);
        director.buildNewCar();
        System.err.println(volvoBuilder.getCar().toString());
    }
}
