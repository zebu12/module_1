public class KitchenHelper {


    public static double calculateIngredientQuantity(int servings, double originalQuantity) {

        double adjustedQuantity;
        adjustedQuantity = originalQuantity * servings;
        return adjustedQuantity;
    }

    public static void spiceUpDish(int spiceLevel) {

        switch (spiceLevel) {
            case 1:
                System.out.println("Add salt and pepper");
                break;
            case 2:
                System.out.println("Add salt, paprika and cumin");
                break;
            case 3:
                System.out.println("Add salt and pepper, chicken");
                break;
            case 4:
                System.out.println("Add salt and pepper, chicken, or pepper");
                break;
            case 5:
                System.out.println("Add some ghost pepper and some habanero");
                break;
            default:
                System.out.println("Invalid spice level");
        }
    }
    public static void greetGuest(String name, String timeOfDay){

        System.out.println("Hi " + name + ", Good " + timeOfDay + "!");

    }


    public static void main(String[] args) {


        double newQuantity;
        newQuantity = calculateIngredientQuantity(4, 2.5);
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);

        spiceUpDish(7);

    }


}
