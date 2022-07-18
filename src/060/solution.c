#include <stdio.h>
#include "solution.h"

int checkArr(int a[], int n){
    int sum = 0, j = 0, i = 0;
    while (i < n){
        sum += a[i];
        i++;  
    }  
    printf("%d", n);
    if((sum % 2) != 0) return 0;
    sum /= 2;
    
    int part[n + 1][sum / 2 + 1];

	// initialize top row as false
	for (i = 0; i <= sum/2; i++)
        part[0][i] = 0;

	// initialize leftmost column as true
	for (i = 0; i <= n; i++)
	    part[i][0] = 1;

	// Fill the partition table in botton up manner
	for (i = 1; i <= n; i++)
		for (j = 1; j <= sum/2; j++)
		{
			part[i][j] = part[i-1][j];
			if (j >= a[i - 1])
				part[i][j] = part[i][j] || part[i - 1][j - a[i -1]];

		}

	return part[n][sum/2];
}