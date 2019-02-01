import farmers.Farmer;
import farms.AnimalFarm;
import goods.Animal;
import goods.Plant;
import farms.AnimalFarm;

public class Farm_Task {
    public static void main(String[] args) {
        // farms.Farm farm = new farms.AnimalFarm();
        // farm.setName("farms.Farm");
        // final String farmName = farm.getName();


        //farmers.Farmer\\tipul obiectului   farmer \\ Denumirea variabilei  = new farmers.Farmer();
        Farmer F1 = new Farmer();
        //Using getter and setters
        System.out.println("First Fermer");
        F1.setAge(21);
        F1.setName("Mihail");
        F1.setFinance(999999);
        System.out.println(F1.toString() + "\n");


        // Question about plant farm and animal farm, why they implement the same abstract class
        AnimalFarm afarm = new AnimalFarm(400);
        afarm.setName("goods.Animal wonderland");
        afarm.setArea(30000);
        afarm.setGroundType("Black soil");
        afarm.setIsForest(true);
        afarm.setIsWater(true);


        System.out.println(afarm.toString()+ "\n");


        Plant peach = new Plant();
        peach.setColor("Green");
        peach.setIsCarnivor(true);
        peach.setIsEatable(true);
        peach.setBreed("Peech");
        peach.setType("Tree");
        System.out.println(peach.toString() + "\n");

        Animal domestic = new Animal();
        domestic.setAge(4);
        domestic.setColor("Brown");
        domestic.setIsFur(true);
        domestic.setIsMeat(true);
        domestic.setBreed("Horse");
        domestic.setType("Domestic");
        System.out.println(domestic.toString() + "\n");

    }
}
