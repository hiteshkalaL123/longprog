/*
54321
54322
54333
54444
55555
*/
class longpatterns{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(j);
				}
				
			for(int j=i;j>1;j--){
				System.out.print(j);
				}
				System.out.println();
		}	
		
	}
}