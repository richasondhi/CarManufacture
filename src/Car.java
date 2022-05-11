public class Car extends CarPlan
{
    private CarParts engine, carBody, interior;
    public void setEngine(CarParts.cartype car){
        this.engine = new Engine(car);
    };
    public void setCarBody(CarParts.cartype car){
        this.carBody = new CarBody(car);
    };
    public void setInterior(CarParts.cartype car){
        this.interior = new Interior(car);
    };
    public void getDetails()
    {
        System.out.println(this.engine.getName() + " " + this.carBody.getName()+ " " + this.interior.getName() );
        // System.out.println("Richa" );
    }
}