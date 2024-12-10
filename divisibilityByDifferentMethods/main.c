#include <stdio.h>
#include <stdlib.h>


#include <stdio.h>

int main()
{

printf("Enter the number:");int enterNumber;scanf("%d",&enterNumber);
int k=enterNumber;
if(enterNumber%49==0){
    printf("Multiples of 49 are not entered(Rules).");
    
}
else{
    
int counter=0;
while(enterNumber>=10){
    counter++;
     int z=enterNumber%10;
     
     int newNumber=(enterNumber/10)+(z*5);
     
     
     printf("%d.Step:%d ---->%d + %d*5 = New number:%d ",counter,enterNumber,enterNumber/10,z,newNumber);printf("\n");
    enterNumber=newNumber;
    }
    
    if(enterNumber==7){ printf("%d number --> multiple of 7",k);}
    else{printf("%d number --> not multiple of 7",k);}

}




   return 0; 
}
