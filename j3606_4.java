/*
입력값 5 b를 준다면
*bbbb
**bbb
***bb
****b
*****
*/
class j3606_4
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		char b=args[1].charAt(0);
		for(int i=1; i<=a; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			for(int j=1; j<=a-i; j++){
				System.out.print(b);
			}
			System.out.println("");
		}
	}
}