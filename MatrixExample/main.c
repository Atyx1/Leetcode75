#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define  diz 10




int main(int argc, char *argv[]) {

char enc[100];
char m1[8][9];
int i,j,k=0;
char metin[65]={"erciyes universitesi 123249 eciyes üniers ahmet tayyib yilmazsla"};
for( i=0;i<8;i++){
	for( j=0;j<8;j++){
		m1[i][j]=metin[k++];
	}
}
int z=0;
for( i=0;i<8;i++){
	for( j=0,k=48;j<8;j++){
	
		printf(" %c   ",m1[i][j]);
	
	}
	printf("\n");
}
char enco[65];
int k1=0;
int i1,j1;
for( i1=0;i1<4;i1++){
	for( j1=0;j1<4;j1++){
		enco[k1++]=m1[i1][j1];
		enco[k1++]=m1[i1][i1+4];
		enco[k1++]=m1[i1+4][i1];
		enco[k1++]=m1[i1+4][i1+4];
			}
}

printf(enco);
	
	
}









