package Vehicle;

public class VehicleMain {
    private double fuelPercentage = 0.00;
    private VehicleModelsGarage model;
    private FuelType fuelType;



    //object
    public VehicleMain(VehicleModelsGarage model) {
      this.model = model;
    }

    private FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    private double getFuelPercentage() {
        return fuelPercentage;
    }

    private void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public VehicleModelsGarage getModel() {
        return model;
    }

    //Gas up
    public void fuelVeihicleUp(double fuelPercentageEntering){
               this.setFuelPercentage(this.getFuelPercentage() + fuelPercentageEntering);
    }



    //car moving on
    public void vehicleMovingOn(double km){

                    int countingKms = 0;

                    //cars setup fuel and kmss
              if(this.getModel().equals("Ford") || this.getFuelPercentage() > 0.00) {

                    countingKms += km;
                    this.setFuelPercentage(this.getFuelPercentage() - countingKms);

              }else if(this.getModel().equals("Ford") || this.getFuelPercentage() <= 0.00){
                  System.out.println("Fuel is empty! ");
              }

               if(this.getModel().equals("Chevrolet")|| this.getFuelPercentage() > 0.00) {

                countingKms += km;
                this.setFuelPercentage(this.getFuelPercentage() - countingKms);

               }else if(this.getModel().equals("Chevrolet") || this.getFuelPercentage() <= 0.00){
                System.out.println("Fuel is empty! ");
               }

                if(this.getModel().equals("Fiat") || this.getFuelPercentage() > 0.00) {

                    countingKms += km;
                    this.setFuelPercentage(this.getFuelPercentage() - countingKms);

                }else if(this.getModel().equals("Fiat") || this.getFuelPercentage() <= 0.00){
                    System.out.println("Fuel is empty! ");
                }

                if(this.getModel().equals("Subaru") || this.getFuelPercentage() > 0.00) {

                    countingKms += km;
                    this.setFuelPercentage(this.getFuelPercentage() - countingKms);

                }else if(this.getModel().equals("Subaru") || this.getFuelPercentage() <= 0.00){
                    System.out.println("Fuel is empty! ");
                }








    }
}
