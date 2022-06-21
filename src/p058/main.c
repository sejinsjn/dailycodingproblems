#include <stdio.h>
#include "solution.h"

int main() {
    int a[] = {6, 7, 8, 1, 2, 3, 4, 5};
    int high = sizeof(a) / sizeof(*a);
    printf("%d", binarysearch(a, 0, high, 1));
}