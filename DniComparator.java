
public class DniComparator implements Comparator<Persona>{
	@Override
	public int compare(Persona source, Persona target){
		return source.dni - target.dni;
	}
}