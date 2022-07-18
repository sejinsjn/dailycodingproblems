#include <stdio.h>
#include "solution.h"

int binarysearchpivot(int a[], int low, int high){
    if(high < low) 
        return -1;
    if(high == low) 
        return low;

    int mid = (low + high) / 2;
    if(mid < high && a[mid] > a[mid + 1])
        return mid;
    if(mid > low && a[mid] < a[mid - 1])
        return (mid - 1);
    if(a[low] >= a[mid]) 
        return binarysearchpivot(a, low, mid - 1);
    binarysearchpivot(a, mid + 1, high);
}

int binarysearchpivoted(int a[], int low, int high, int key){
    if(high < low) 
        return -1; 
    if(high == low) 
        return low;

    int mid = (low + high) / 2;
    if(a[mid] == key) 
        return mid;
    if(mid > low && a[mid - 1] == key)
        return (mid - 1);
    if(a[low] >= a[mid]) 
        return binarysearchpivoted(a, low, mid - 1, key);
    binarysearchpivoted(a, mid + 1, high, key);
}

int binarysearch(int a[], int low, int high, int key){
    int pivot = binarysearchpivot(a, low, high);

    if (pivot == -1)
        return binarysearch(a, 0, high, key);

    if(key == a[pivot])
        return pivot;
    if(a[0] <= key)
        return binarysearchpivoted(a, 0, pivot, key);
    else    
        return binarysearchpivoted(a, pivot, high, key);
}