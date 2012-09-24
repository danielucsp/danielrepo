
public class Main {

	/**
	 * @param args
	 */
	static Persona[] people ={
		new Persona("Juan", 21, 456743),
		new Persona("Ana", 19, 584650),
		new Persona("Luis", 15, 149563)
	};
	
	public static <T> void sort(T[] elements, Comparator<T> comparator){
		for(int i = 0; i<elements.length; i++){
			for(int j = i; j < elements.length; j++){
				if(comparator.compare(elements[i], elements[j]) > 0){
					T temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Comparator<Persona> comparator = new DniComparator();
		sort(people, comparator);
		for(int i = 0; i<people.length; i++){
			System.out.println(people[i].name + "-" + people[i].edad + "-" + people[i].dni);
		}
	}

}
