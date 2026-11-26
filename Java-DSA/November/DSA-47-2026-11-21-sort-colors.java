// Practice date: 2026-11-21
// Problem: Sort Colors
// Topic: Dutch National Flag
// Note: Standalone practice solution. Add test cases or a main method when practising.

class SortColors {
    static void solve(int[]a){
        int low=0,mid=0,high=a.length-1;
        while(mid<=high){
            if(a[mid]==0){int t=a[low];a[low++]=a[mid];a[mid++]=t;}
            else if(a[mid]==1)mid++;
            else{int t=a[mid];a[mid]=a[high];a[high--]=t;}
        }
    }
}
