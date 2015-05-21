package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterDouble implements Counter {
	private int counter=0;
	private static CounterDouble cs= new CounterDouble();
	private CounterDouble(){}

	public static synchronized Counter getInstance(){
		return cs;
	}
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		counter=counter+2;
	}

	@Override
	public int getCounter() {
		// TODO Auto-generated method stub
		return counter;
	}
}