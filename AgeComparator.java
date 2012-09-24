
public class AgeComparator implements Comparator<Persona>{
	@Override
	public int compare(Persona source, Persona target){
		return source.dni - target.dni;
	}
}