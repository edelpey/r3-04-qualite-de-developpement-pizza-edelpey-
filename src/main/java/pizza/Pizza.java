package pizza;

public class Pizza {

	private String name;

	PizzaState state = new CookedState();

	public boolean bake() {
		return this.state.bake(this);			
	}

	public boolean deliver() {
		return this.state.deliver(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PizzaState getState() {
		return state;
	}

	public void setState(PizzaState state) {
		this.state = state;
	}

}
