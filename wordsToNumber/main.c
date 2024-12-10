#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	
	printf("Enter number (1-10):");int k; scanf("%d",&k);
	
	

	int i,j,z;
	for(i=1;i<=k;i++){
		
		for( j=i;j<=k-1;j++){
			printf("%c",'A'-1+j);
			
		}
		for( z=k;z>k-i;z--){
			printf("%d",z);
		}
		
		
		printf("\n");
		
	}
	
	
	
	
	
	
	
	
	return 0;
}
