
public class Decrypter {
	private int plaintext;
	
	public Integer decrypt(int a, int b, int c, int d){
		plaintext=(a*1000)+(b*100)+(c*10)+(d);
		return plaintext;
             }
}