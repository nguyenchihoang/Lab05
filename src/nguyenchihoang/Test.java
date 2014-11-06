package nguyenchihoang;

public class Test {
	public static void main(String [ ] args){
		
		//test 1
		System.out.println("Ket qua test 1 la : ");
		
		int x1 = 0;
		boolean a = true;
		boolean b = true;
		boolean c = true;
		Path test1 = new Path();
		int methodreturn1 = 	test1.returnInput(x1,a,b,c);
		
		//test 2
		System.out.println("Ket qua test 2 la : ");
		
		int x2 = 0;
		boolean a1 = false;
		boolean b1 = false;
		boolean c1 = false;
		Path test2 = new Path();
		int methodreturn2 = test2.returnInput(x2,a1,b1,c1);
		
		//test 3
		System.out.println("Ket qua test 3 la : ");
		int x3 = 0;
		boolean a2 = false;
		boolean b2 = false;
		boolean c2 = false;
		Path test3 = new Path();
		int methodreturn3 = 	test3.returnInput(x3,a2,b2,c2);
	}
}
