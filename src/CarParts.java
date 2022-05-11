public class CarParts {
    public static enum cartype {
        SEDAN, Hatchback, Pickup;
    };
    public String getName(){return "Richa";};

}

class Engine extends CarParts {
    public String engineNo;

    public Engine(cartype car) {
        switch (car) {
            case SEDAN:
                this.engineNo = "SedanEngine";
                break;
            case Hatchback:
                this.engineNo ="HatchbackEngine";
                break;
            case Pickup:
                this.engineNo = "PickupEngine";
                break;
        }
    }
    public String getName(){
        return this.engineNo;
    }
}

class Interior extends CarParts {
    public String interior;

    public Interior(cartype car) {
        switch (car) {
            case SEDAN:
                this.interior = "SedanInterior";
                break;
            case Hatchback:
                this.interior ="HatchbackInterior";
                break;
            case Pickup:
                this.interior = "PickupInterior";
                break;
        }
    }
    public String getName(){
        return this.interior;
    }
}

class CarBody extends CarParts {
    public String carBody;

    public CarBody(cartype car) {
        switch (car) {
            case SEDAN:
                this.carBody = "SedanCarBody";
                break;
            case Hatchback:
                this.carBody ="SportsCarBody";
                break;
            case Pickup:
                this.carBody = "PickupCarBody";
                break;
        }
    }
    public String getName(){
        return this.carBody;
    }
}