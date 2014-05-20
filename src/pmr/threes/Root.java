package pmr.threes;

public class Root implements Move {
	
	private State state;
	
	public Root(State state){
		this.state = state;
	}

	@Override
	public State[] findEndStatesForSearch() {
		return new State[]{state};
	}

	@Override
	public State[] findEndStatesForSim() {
		return new State[]{state};
	}
	
}