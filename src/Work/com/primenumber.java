package Work.com;

public class primenumber {
	
	    public static void main(String args[]) {
	      int sum=0;
	    	for(int i=2;i<=10;i++) {
	    		int count=0;
	    		for(int j=1;j<=i;j++) {
	    			if(i%j==0) {
	    				count++;
	    		}
	    	}
	    		if(count==2) {
	    			
	    			System.out.println(i);
	    			sum=sum+i;
	    		}
	    		
	    }
	    	System.out.println(sum);
	}
	}


