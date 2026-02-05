public class CoffeMaker {
    static Coffee makeCoffee() {
        System.out.println("Preparing coffee");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(t,c);
        return coffee;
    }

}
