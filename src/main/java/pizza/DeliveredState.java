package pizza;

public class DeliveredState implements PizzaState {
	@Override
    public boolean bake(Pizza pizza) {
        System.out.println("Erreur : Impossible de cuire une pizza déjà livrée !");
        return false;
    }

    @Override
    public boolean deliver(Pizza pizza) {
        System.out.println("Erreur : Impossible de livrer une pizza déjà livrée !");
        return false;
    }
}
