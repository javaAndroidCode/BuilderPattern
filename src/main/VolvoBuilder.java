package main;

public class VolvoBuilder extends BaseCarBuilder {


    public VolvoBuilder() {

        car = new Car("Volvo");
    }

    @Override
    public void buildBody() {

        car.setBody(Car.LIMOUSINE);
    }

    @Override
    public void buildColor() {

        car.setColor(Car.WHITE);
    }
}
