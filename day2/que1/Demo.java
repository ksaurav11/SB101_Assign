package dailyassignments.day2.que1;

public class Demo {
	
	public static void main(String[] args) {
		 MyGenerics<String> myGenerics = new MyGenerics<>();
			myGenerics.add("hello myworld");
			System.out.println(myGenerics.get());
			
			
			MyGenerics<Integer> myGenerics2  =  new MyGenerics<>();
			myGenerics2.add(100);
			System.out.println(myGenerics2.get());
			
			MyGenerics<Double> myGenerics3  =  new MyGenerics<>();
			myGenerics3.add(200.00);
			System.out.println(myGenerics3.get());
			
			MyGenerics<Boolean> myGenerics4  =  new MyGenerics<>();
			myGenerics4.add(true);
			System.out.println(myGenerics4.get());
	}
	}


	class MyGenerics<T>{
		T obj ;
		void add(T obj) {
			this.obj = obj;
		}
		T get () {
			 
			return obj ;
		}

}
