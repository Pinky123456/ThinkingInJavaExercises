package innerClass;

interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private Object[] item;
	private int next = 0;
	public Sequence(int size){
		item = new Object[size];
	}
	public void add(Object x){
		if(next < item.length)
			item[next++] = x;
	}
	
	private class SequenceSelector implements Selector{
		private int i = 0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == item.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return item[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i<item.length)
				i++;
		}
		
		public Sequence getOutClass(){
			return Sequence.this;
		}
	}
	
	private class ReverseSequenceSelector implements Selector{
		private int i = item.length-1;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == -1;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return item[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i>=0)
				i--;
		}
	}
	
	public Selector selecor(){
		return new SequenceSelector();
	}
	
	public Selector reverseSelecor(){
		return new ReverseSequenceSelector();
	}
	
	public static void sequence_test(){
		Sequence sequence = new Sequence(12);
		for(int i=0; i<10; i++)
			sequence.add(Integer.toString(i));
		StringT t = new StringT();
		sequence.add(t);
		Selector selector = sequence.selecor();
		Selector rSelector = sequence.reverseSelecor();
		while(!selector.end()){
			System.out.print(selector.current()+" ");
			selector.next();
		}
		System.out.println();
		while(!rSelector.end()){
			System.out.print(rSelector.current()+" ");
			rSelector.next();
		}
		System.out.println();
	}
}

class StringT{
		String s = "my class ";
		@Override
		public String toString(){
			return s+getClass().getSimpleName();
		}
	}