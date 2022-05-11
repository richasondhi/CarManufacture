public class CarBuilderPlan {
    public Car car;
    public void buildCarBody(){};
    public void buildEngine(){};
    public void buildInterior(){};
    public Car getCar(){return this.car;};
    public void getCarDetails(){this.car.getDetails();};
}