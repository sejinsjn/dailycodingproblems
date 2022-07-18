#include <stdio.h>
#include "solution.h"


unsigned long long fastexp(int b, int n){
    unsigned long long x = b;
    while(1){
        if(n == 1 || n == 0) return x;
        x *= x;
        if((n % 2) == 1) x *= b;
        n /= 2;
    }
    return x;
}