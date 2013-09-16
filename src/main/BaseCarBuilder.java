package main;

public abstract class BaseCarBuilder {

    protected Car car;

    public abstract void buildBody();

    public abstract void buildColor();

    public Car getCar() {
        return car;
    }
}
