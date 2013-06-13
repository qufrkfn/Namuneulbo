import java.util.Scanner;
public class Encryption{
 
 //암호화
 public String encryption(String args){
  int length = args.length();
  String strEncryption ="";
  for(int cnt=0; cnt<length; cnt++){
   //문자열의 짝수, 홀수 위치 구분
   if(cnt%2==0){  
    strEncryption += (char)(args.charAt(cnt) - length + cnt);
   }else{
    strEncryption += (char)(args.charAt(cnt) + length + cnt);
   }
  }
  return strEncryption;
 }

//복호화
 public String decryption(String args){
  int length = args.length();
  String strDecryption ="";
  for(int cnt=0; cnt<length; cnt++){
   //문자열의 짝수, 홀수 위치 구분
   if(cnt%2==0){ 
    strDecryption += (char) (args.charAt(cnt) + length - cnt);
   }else{
    strDecryption += (char) ((byte)args.charAt(cnt) - length - cnt);
   }
  }
  return strDecryption;
 }

//출력
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.print("key값을 입력하세요:");
	 String key=sc.nextLine();
	 
	 Encryption e = new Encryption();
	 System.out.println("평문: "+key);
	 System.out.println("암호: "+e.encryption(key));
	 System.out.println("복호: "+e.decryption(e.encryption(key)));
 }
}