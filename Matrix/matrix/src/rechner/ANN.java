package rechner;

import java.util.ArrayList;

public class ANN 
{
	private float input;
	private float output;
	private int[] hiddenlayer;
	private float[][] wm;
	private float[][] bv;
	private float[][] hlv;
	private Matrix i;
	
	public ANN(float ip,int[] hl, float op)
	{
		input=ip;hiddenlayer=hl;output=op;
		
		bv = new float[hiddenlayer.length][];
		
		for (int i=0;i<hiddenlayer.length;i++)
		{
			bv[i] = new float[hiddenlayer[i]];
			wm[i] = new float[hiddenlayer[i]];
			
			for (int j = 0; j<hiddenlayer[i]; j++) {
				bv[i][j] = (-1+(float)(Math.random()*((1-(-1))+1)));
				wm[i][j] = (-1+(float)(Math.random()*((1-(-1))+1)));
			}
		}
		
	}

	
	public void setInput(float [][] input)
	{
		i=new Matrix(input);
	}
	
	
	

	private Matrix calcAnn() throws InvalidCalcException  
	{
		
		Matrix w=new Matrix(wm);
		Matrix b=new Matrix(bv);
		
		Matrix neum = new Matrix(w.multiMatrix(i));
		neum=neum.addMatrix(b);
		
		neum=neum.sigmMatrix();
		
		return neum;
		
		
	}
	
	
	public static void main(String[] args) throws InvalidCalcException 
	{
		int[] a=new int[] {3};
		ANN ann=new ANN(1,a,1);
		float[][] input=new float[][] {{2},{3}};
		ann.setInput(input);
		ann.calcAnn();
	}
	

}
