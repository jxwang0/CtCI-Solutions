//Given an image represented by an NxN matrix, where each 
//SevenPixel in the image is 4 bytes, write a method to rotate 
//the image by 90 degrees. Can you do this in place?

//assumming counterclockwise rotation
import java.util.*;

public class SevenPixel{

	private byte r;
	private byte g;
	private byte b;
	private byte v;
	SevenPixel (byte r, byte g, byte b, byte v)
	{
		this.r = r;
		this.g = g;
		this.b = b;
		this.v = v;
	}
	
	public String toString()
	{
		return String.format("{%d, %d, %d, %d}", r, g, b, v);
	}

	public static SevenPixel[][] rotateCCW(SevenPixel[][] mat)
	{
		SevenPixel [][] newMat = new SevenPixel [4][4];

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				newMat[3-j][i] = mat[i][j];
			}
		}
		return newMat;
	}

	public static void main (String [] args)
	{
		SevenPixel [][] mat = new SevenPixel [4][4];
		for (byte i = 0; i < 4; i++)
		{
			for (byte j = 0; j < 4; j++)
			{
				mat[i][j] = new SevenPixel(j, j, j, j);
			}
		}
		System.out.println(Arrays.deepToString(mat));
		System.out.println(Arrays.deepToString(rotateCCW(mat)));
	}
}
