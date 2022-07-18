#include <stdio.h>
#include "solution.h"

int main(){
    int a[] = {1,2,4,4,5,6,3};
    int n = sizeof(a) / sizeof (*a);
    printf("%d", checkArr(a, n));
}