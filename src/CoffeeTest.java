public class CoffeeTest {
    public static void main(String[] args) {
        CoffeMaker mk = new CoffeMaker();
        DrinkCoffee dk = new DrinkCoffee();

        for (int i = 0; i <= 5; i++) {
            System.out.println();
            Coffee coffee = mk.makeCoffee();
            System.out.println(i + 1);
            try {
                dk.drinkCoffee(coffee);
            } catch (TemperatureException ex) {
                System.out.println("Exceptie T: " + ex.getMessage() + " temperatura: " + ex.getT());
            } catch (ConcentrationException ex) {
                System.out.println("Exceptie C: " + ex.getMessage() + " concentratia: " + ex.getC());
            } finally {
                System.out.println("Aparatul de cafea s-a oprit.");
            }
        }


    }

}
