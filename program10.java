/*
1      1
22	2
333	3
4444	4
55555	5
4444	6
333	7
22	8
1	9
*/
class program10{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n){
			for(int j=i;j>=1;j--){
				System.out.print(i);
				}
			}
			else
			{
			for(int j=i;j<=n*2-1;j++){
				System.out.print((n*2)-i);
				}	
			}
			System.out.println();
			}
        }
}