package pizza;

public class BakedState implements PizzaState {
	@Override
	public boolean bake(Pizza pizza) {
        System.out.println("Erreur : Impossible de recuire une pizza déjà cuite !");
        return false;
    }

   
    public boolean deliver(Pizza pizza) {
        System.out.println("Livraison de la pizza en cours...");
        pizza.setState(new DeliveredState());
        return true;
    }
}