package main;

public class Director {

    private BaseCarBuilder baseCarBuilder;

    public Director(BaseCarBuilder baseCarBuilder) {

        this.baseCarBuilder = baseCarBuilder;
    }

    public void buildNewCar() {

        this.baseCarBuilder.buildBody();
        this.baseCarBuilder.buildColor();
    }
}
