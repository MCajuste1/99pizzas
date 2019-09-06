public class PizzaSong {
    public static void main(String[] args) {
        int pizzaNum = 99;
        String word = "slices";

        while (pizzaNum > 0) {



            System.out.println(pizzaNum + " " + word + " of pizza in the box");
            System.out.println(pizzaNum + " " + word + " of pizza.");
            System.out.println("Take one slice.");
            System.out.println("Cut it around.");
            pizzaNum = pizzaNum - 1;

            if (pizzaNum == 1) {
                word = "slice";  // singular, as in ONE bottle.
            }

            if (pizzaNum > 0) {
                System.out.println(pizzaNum + " " + word + " of pizza in the box");
            } else {
                System.out.println("No more pizza in the box");
            }  // end else
        } // end while loop
    }  // end main method
}  // end class