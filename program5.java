/*
11111
22221
33321
44321
54321
*/
class program5{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=1;j--){
				if(i<j){
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
