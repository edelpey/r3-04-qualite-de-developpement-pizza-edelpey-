package pizza;

public interface PizzaState {
	boolean bake(Pizza pizza);
	boolean deliver(Pizza pizza);
}
