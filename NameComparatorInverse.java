
public class NameComparatorInverse implements Comparator<Persona>{
	@Override
	public int compare(Persona source, Persona target){
		return target.name.compareTo(source.name);
	}
}
