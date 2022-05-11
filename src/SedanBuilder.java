public class SedanBuilder extends CarBuilderPlan
{
    private CarParts.cartype cartype = CarParts.cartype.SEDAN;
    SedanBuilder()
    {
        this.car = new Car();
        System.out.println("sead built");
    };
    public void buildCarBody()
    {
        System.out.println("car details manufacture");
        this.car.setCarBody(this.cartype);
    };
    public void buildEngine(){
        this.car.setEngine(this.cartype);
    };
    public void buildInterior(){
        this.car.setInterior(this.cartype);
    };
}

class HatchbackBuilder extends CarBuilderPlan
{
    private CarParts.cartype cartype = CarParts.cartype.Hatchback;
    HatchbackBuilder()
    {
        this.car = new Car();
    }
    public void buildCarBody()
    {
        this.car.setCarBody(this.cartype);
    };
    public void buildEngine(){
        this.car.setEngine(this.cartype);
    };
    public void buildInterior(){
        this.car.setInterior(this.cartype);
    };
}


class PickupBuilder extends CarBuilderPlan
{
    private CarParts.cartype cartype = CarParts.cartype.Pickup;
    PickupBuilder()
    {
        this.car = new Car();
    }
    public void buildCarBody()
    {
        this.car.setCarBody(this.cartype);
    };
    public void buildEngine(){
        this.car.setEngine(this.cartype);
    };
    public void buildInterior(){
        this.car.setInterior(this.cartype);
    };
}