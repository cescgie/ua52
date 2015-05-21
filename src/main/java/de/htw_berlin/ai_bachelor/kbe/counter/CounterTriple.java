package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterTriple implements Counter{
	private int counter=0;
	private static CounterTriple cs= new CounterTriple();
	private CounterTriple(){}
	public static synchronized Counter getInstance(){
		return cs;
	}
	
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		counter=counter+3;
	}

	@Override
	public int getCounter() {
		// TODO Auto-generated method stub
		return counter;
	}
}