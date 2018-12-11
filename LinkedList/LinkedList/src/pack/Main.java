package pack;
public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		LinkedList<String> s=new LinkedList<>();
		
		s.add("Hallo");
		s.add("Dominik");
		s.addback("Gapp");
		s.delete(2);
		s.addback("pp");
		s.add("Ha");
		ll.add(4);
		ll.add(2);
		ll.add(3);
		ll.add(5);
		ll.addback(6);
		ll.delete(0);
		
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println(s.getBack(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		System.out.println(s.get(3));

	}

}
