
public class NameComparator implements Comparator<Persona>{
	@Override
	public int compare(Persona source, Persona target){
		return source.name.compareTo(target.name);
	}
}
