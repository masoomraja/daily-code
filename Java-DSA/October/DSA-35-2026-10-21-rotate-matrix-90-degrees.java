// Practice date: 2026-10-21
// Problem: Rotate Matrix 90 Degrees
// Topic: Matrix
// Note: Standalone practice solution. Add test cases or a main method when practising.

class RotateMatrix {
    static void solve(int[][]a){
        int n=a.length;
        for(int i=0;i<n;i++)for(int j=i+1;j<n;j++){int t=a[i][j];a[i][j]=a[j][i];a[j][i]=t;}
        for(int[]row:a)for(int l=0,r=n-1;l<r;l++,r--){int t=row[l];row[l]=row[r];row[r]=t;}
    }
}
