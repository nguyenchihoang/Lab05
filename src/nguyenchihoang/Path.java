package nguyenchihoang;

public class Path {
	public int returnInput(int x, boolean condition1 , boolean condition2 , boolean condition3)
{
		if(condition1){
			x++;
		}
		if(condition2){
			x--;
		}
		if(condition3){
			x=x;
		}
		return x;

		}
}
