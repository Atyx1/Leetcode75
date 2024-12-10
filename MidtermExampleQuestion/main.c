#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>
#include <windows.h>
 
int farkliSayi(int t);
     
int main(void){
	
	int k=334;
	printf("Sayi %d",k);
	int z=farkliSayi(k);
	printf(" say %d",z);
	return 0;
}

int farkliSayi(int t){
	
	int a=t%10;
	int b=(t/10)%10;
	int c=(t/100)%10;
	
	int syc=1;
	if(a==b){
		if(a==c){
		 	
		}
		else{
			syc++;
		}
		
	}
	else{
		if(b==c){
			
		}
		else{
			syc++;
		}
	}

	
	
		return syc;
	

	
}

