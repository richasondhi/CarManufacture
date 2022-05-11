public class Engineer
{
    CarBuilderPlan carbuilder;
    public Engineer(CarBuilderPlan carbuilder)
    {
        this.carbuilder = carbuilder;
    }

    public void constructCar(){
        this.carbuilder.buildCarBody();
        this.carbuilder.buildEngine();
        this.carbuilder.buildInterior();
    }

    public Car getCar()
    {
        return this.carbuilder.getCar();
    }

    public void getCarDetails()
    {
        this.carbuilder.getCarDetails();
    }
}