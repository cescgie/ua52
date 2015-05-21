package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterSimple implements Counter {
	private int counter=0;
	private static CounterSimple cs= new CounterSimple();
	private CounterSimple(){}
	public static synchronized Counter getInstance(){
		return cs;
	}
	
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		counter=counter+1;
	}

	@Override
	public int getCounter() {
		// TODO Auto-generated method stub
		return counter;
	}
}