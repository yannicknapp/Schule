package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rechner.ANN;
import rechner.InvalidCalcException;
import rechner.Matrix;

public class TestMatrix 
{
	
	
	/*@Test
	public void testAI() throws InvalidCalcException
	{
		float[] hl=new float[]{4,2};
		ANN a=new ANN(3,hl,2);
		float[][] input=new float[][]{{1},{0},{1}};
		float[][] shouldbeC=a.calcAnn(input);
		
		asserTrue(shouldbeC.equalsM(c));
	}
	*/
	@Test
	public void matrMul() throws InvalidCalcException
	{
		float[][] a=new float[][]{{1,2},{3,4}};
		float[][] b=new float[][]{{1,1},{1,1}};
		
		float[][] c=new float[][]{{3,3},{7,7}};
		Matrix m=new Matrix(a);
		Matrix m2=new Matrix(b);
		Matrix shouldbeC= new Matrix(m.multiMatrix(m2));
		
		assertEquals(shouldbeC, c);
		
		
	}
	
	@Test
	public void sigmRechner() throws InvalidCalcException
	{
		float[][] a=new float[][]{{1,2},{3,4}};
		Matrix m=new Matrix(a);
		Matrix shouldbeC=m.sigmMatrix();
		float[][] c=new float[][]{{0.73f,0.88f},{0.95f,0.98f}};
		assertTrue(shouldbeC.equalsM(c));
	}
	
	@Test
	public void matrAdd() throws InvalidCalcException
	{
		float[][] a=new float[][]{{2,1},{1,1}};
		
		float[][] c=new float[][]{{3,2},{2,2}};
		Matrix m=new Matrix(a);
		Matrix m2=new Matrix(a);
		Matrix shouldbeC=m.addMatrix(m2);
		
		assertTrue(shouldbeC.equalsM(c));
		
		
	}
	
	

	@Test(expected=InvalidCalcException.class)
	public void invalidMatrix() throws InvalidCalcException 
	{
		float[][] a =new float[][]{{1,2},{3,4}};
		float[][] b =new float[][]{{1,2}};
		Matrix m=new Matrix(a);
		Matrix m2=new Matrix(b);
		
		m2.multiMatrix(m);
		
	}
	
	@Test
	public void skalarProdukt() throws InvalidCalcException
	{
		float[][] a =new float[][]{{1,2},{3,4}};
		float wert=2;
		Matrix m=new Matrix(a);
		Matrix shouldbeC=new Matrix(m.skalMul(wert));
		float[][] c=new float[][]{{2,4},{6,8}};
		
		assertTrue(shouldbeC.equalsM(c));
	}

}
