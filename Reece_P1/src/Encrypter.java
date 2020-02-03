
public  class Encrypter {
	private Integer ciphertext ;
	
	
	
    public Integer encrypt( int a,int b,int c,int d) {
    	
    	a= (a+7) %10;
    	b= (b+7) %10;
    	c= (c+7) %10;
    	d= (d+7) %10;
    	
    	if(a!=0 && b !=0 && c !=0 && d != 0) {
    	ciphertext=(c*1000)+(d*100)+(a*10)+(b);
    	}else if(a==0) {
    		ciphertext=(c*1000)+(d*100)+((++a)*(10)-10)+(b);
    	}else if(b==0) {
    		ciphertext=(c*1000)+(d*100)+(a*10)+(b);
    	}else if(c==0) {
    		
    		ciphertext=(c*1000)+(d*100)+(a*10)+(b);
    		
    	}else if(d==0) {
    		ciphertext= (c*1000)+((++d)*(100)-100)+(a*10)+(b);
    	}else if(a==0 && b==0 && c==0 && d==0) {
    		ciphertext=0;
    		
    				
    	}
		return ciphertext;
	}


	

	
}