package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pack.LinkedList;

class doubleLinked {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() 
	{
		
		LinkedList<Integer> a=new LinkedList<>();
		LinkedList<String> b=new LinkedList<>();
		a.add(1);
		a.add(2);
		a.addback(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.delete(1);
		a.delete(0);
		b.add("hallo");
		assertEquals(5, (int)a.getBack(0));
		assertEquals(2, (int)a.get(0));
		assertEquals("hallo", (String)b.get(0));
		
	}

}
