// Practice date: 2026-11-05
// Problem: 3Sum
// Topic: Sorting / Two Pointers
// Note: Standalone practice solution. Add test cases or a main method when practising.

import java.util.*;
class ThreeSum {
    static List<List<Integer>> solve(int[]a){
        Arrays.sort(a);List<List<Integer>>out=new ArrayList<>();
        for(int i=0;i<a.length-2;i++){
            if(i>0&&a[i]==a[i-1])continue;int l=i+1,r=a.length-1;
            while(l<r){int s=a[i]+a[l]+a[r];
                if(s==0){out.add(Arrays.asList(a[i],a[l],a[r]));int x=a[l],y=a[r];while(l<r&&a[l]==x)l++;while(l<r&&a[r]==y)r--;}
                else if(s<0)l++;else r--;
            }
        }return out;
    }
}
