import java.util.Scanner;
public class Encryption{
 
 //��ȣȭ
 public String encryption(String args){
  int length = args.length();
  String strEncryption ="";
  for(int cnt=0; cnt<length; cnt++){
   //���ڿ��� ¦��, Ȧ�� ��ġ ����
   if(cnt%2==0){  
    strEncryption += (char)(args.charAt(cnt) - length + cnt);
   }else{
    strEncryption += (char)(args.charAt(cnt) + length + cnt);
   }
  }
  return strEncryption;
 }

//��ȣȭ
 public String decryption(String args){
  int length = args.length();
  String strDecryption ="";
  for(int cnt=0; cnt<length; cnt++){
   //���ڿ��� ¦��, Ȧ�� ��ġ ����
   if(cnt%2==0){ 
    strDecryption += (char) (args.charAt(cnt) + length - cnt);
   }else{
    strDecryption += (char) ((byte)args.charAt(cnt) - length - cnt);
   }
  }
  return strDecryption;
 }

//���
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.print("key���� �Է��ϼ���:");
	 String key=sc.nextLine();
	 
	 Encryption e = new Encryption();
	 System.out.println("��: "+key);
	 System.out.println("��ȣ: "+e.encryption(key));
	 System.out.println("��ȣ: "+e.decryption(e.encryption(key)));
 }
}