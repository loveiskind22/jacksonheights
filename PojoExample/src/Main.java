
public class Main {
	
	public static void main(String[] args) {
		
		PojoDemo pj = new PojoDemo();
		pj.setId(1008);
		pj.setPhone(7184504150L);
	
		
		System.out.println(pj.getId()+pj.getName()+ pj.getPhone());
		
		System.out.println(pj.toString());
	}

}
