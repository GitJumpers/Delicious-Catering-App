package BusinessLogicLayer;

public class childFood extends food
{
    int hotDogMeals;
    int chickenburgerMeals;
    int beefBurgerMeals;
    int fishChipsMeals;
    int pizzaMeals;
    int pieMeals;

    public childFood(int HotDogMeals, int ChickenburgerMeals, int BeefBurgerMeals, int FishChipsMeals, int PizzaMeals, int PieMeals) 
    {
        this.hotDogMeals = HotDogMeals;
        this.chickenburgerMeals = ChickenburgerMeals;
        this.beefBurgerMeals = BeefBurgerMeals;
        this.fishChipsMeals = FishChipsMeals;
        this.pizzaMeals = PizzaMeals;
        this.pieMeals = PieMeals;
    }
}
