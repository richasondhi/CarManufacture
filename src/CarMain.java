class CarMain
{
    public static void main(String[] args)
    {
        try{
            /* when building sedan  */
            CarBuilderPlan sedanbuilder1 = new SedanBuilder();
            Engineer E1 = new Engineer(sedanbuilder1);
            E1.constructCar();
            E1.getCarDetails();

            /* when building Hatchback  */
            CarBuilderPlan hatchbackBuilder1 = new HatchbackBuilder();
            Engineer E2 = new Engineer( hatchbackBuilder1);
            E2.constructCar();
            E2.getCarDetails();

            /* when building Pickup  */
            CarBuilderPlan pickupBuilder1 = new PickupBuilder();
            Engineer E3 = new Engineer(pickupBuilder1);
            E3.constructCar();
            E3.getCarDetails();
        }
        catch(Exception e){
            System.out.println("car details");
        }
    }
}