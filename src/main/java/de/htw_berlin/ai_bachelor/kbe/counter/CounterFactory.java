package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterFactory {
	private CounterFactory(){}
	public static Counter getCounterInstance(String typ){
		if(typ.equals("simple"))
			return CounterSimple.getCounterInstance();
		if(typ.equals("double"))
			return CounterDouble.getCounterInstance();
		if(typ.equals("triple"))
			return CounterTriple.getCounterInstance();
		return null;
	}
}
