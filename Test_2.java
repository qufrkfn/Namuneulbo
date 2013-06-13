class Test_2{
public static void main(String args[]){
	
	//논리연산자
	int a=5;
	int b=8;
	System.out.println(a==b);
	System.out.println(a>b);
	System.out.println(!(a>b));
	System.out.println(b==2);
	System.out.println(!(a!=b));
	System.out.println(true==false);
	System.out.println(true==(1>0));
	System.out.println(!!!!!true);
	System.out.println();

	//증감연산자 1
	a=10;
	b=20;
	++a;//a++;
	System.out.println(a);
	--b;//b--;
	System.out.println(b);
	int c=10;
	int d=10;
	int e=++c;
	int f=d++;
	System.out.println(e);
	System.out.println(f);
	System.out.println();

	//증감연산자 2
	a=3;
	b=7;
	c=a++ + b--;
	d=++a + ++b;
	e=a++ + --c;
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println();

	//비트연산자
	System.out.println(17&9);
	System.out.println(17|9);
	System.out.println(17^9);
	System.out.println(~5);
	System.out.println(7<<2);
	System.out.println(7>>2);
	System.out.println();
} 
}