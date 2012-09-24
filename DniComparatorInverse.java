
public class DniComparatorInverse implements Comparator<Persona>{
	@Override
	public int compare(Persona source, Persona target){
		return target.dni - source.dni;
	}
}