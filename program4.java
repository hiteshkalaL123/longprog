/*
12345
12344
12333
12222
11111
*/
class program4{
	public static void main(String args[]){
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5;j++){
				if(i<j){          //5<1 
						  //5<2 //5<3 FFFFF
					System.out.print(i);
					}
					else
					{
					System.out.print(j);
					}
				}
				System.out.println();
			
			}
		
	}
}