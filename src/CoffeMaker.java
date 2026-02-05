public class CoffeMaker {
    static Coffee makeCoffee() {
        System.out.println("Preparing coffee");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(t,c);
        return coffee;
    }

    public static void main(String[] args) {
      Coffee myC = makeCoffee();
        System.out.println(myC);

        Coffee coffee =  makeCoffee();
        System.out.println(coffee);
    }
}
