package Demo28;

public class IpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="172.16.254.1";
		input=input.replace('.',' ');
		String[]data=input.split(" ");
		int num=0;
		boolean isValid=true;
		if(data.length!=4) isValid=false;
		else {
			for(int i=0;i<data.length;i++) {
				num=Integer.parseInt(data[i]);
				if( (num<0) || (num>255)) {
					isValid=false;
					break;
					
				}
			}
		}
		if(isValid==true) {
			System.out.println("valid IPv4 Address");
		}
		else {
			System.out.println("invalid IPv4 Address");
		}
			

	}

}