#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool eularcheck(int *);
bool asalcheck(int b);


int main(int argc, char *argv[]) {
  printf("enter number the machine (2-42) (desc:if your number is euler lucy number return 1  otherwise return 0) Number:");int k;scanf("%d",&k);
  int *kptr=&k;
  
  int cevap =eularcheck(kptr);
  
  printf("%d",cevap);
 
 
return 0;

}

bool asalcheck(int b){
    int say=0;
    int a;
     for(a=2;a<b;a++){
     	if(b%a==0){
     		say++;
		 }
	 } 
	 if(say==0){
	 	return true;
	 }
    return false;
 
 
 }
 
  bool eularcheck(int *ptr){
 	int z,say=0;
 	
	 for(z=0;z<=*ptr-2;z++){
	 	int sonuc=z*z+z+*ptr;
	 	if(asalcheck(sonuc)==false){
	 		say++;
		 }
	 }
	 if(say==0){
	 	return true;
	 }
	 return false;
 	
 }







