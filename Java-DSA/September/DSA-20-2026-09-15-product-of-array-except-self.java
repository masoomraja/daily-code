// Practice date: 2026-09-15
// Problem: Product of Array Except Self
// Topic: Prefix / Suffix
// Note: Standalone practice solution. Add test cases or a main method when practising.

class ProductExceptSelf {
    static int[] solve(int[] a) {
        int[] out=new int[a.length];int p=1;
        for(int i=0;i<a.length;i++){out[i]=p;p*=a[i];}
        int s=1;for(int i=a.length-1;i>=0;i--){out[i]*=s;s*=a[i];}
        return out;
    }
}
