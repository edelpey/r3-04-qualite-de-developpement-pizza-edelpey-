package pizza;

public class CookedState implements PizzaState {
	@Override
    public boolean bake(Pizza pizza) {
        System.out.println("Cuisson de la pizza en cours...");
        pizza.setState(new BakedState());
        return true;
    }

    @Override
    public boolean deliver(Pizza pizza) {
        System.out.println("Erreur : Impossible de livrer une pizza pas encore cuite !");
        return false;
    }
}
