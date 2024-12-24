package com.sample.java.practice;

import java.util.ArrayList;
import java.util.List;

public class IndexCamparision {
    public static void main(String args[]) {
      int[] a={1, 4, 8, 15, 17};
      int[] b={3, 4, 8, 5, 11,11};
      
      List<Integer> arrayList=new ArrayList<>();
      
     for(int i=0;i<a.length-1;i++){
         for(int j=0;j<b.length-1;j++)
          if(a[i]==b[j]){
              arrayList.add(a[i]);
          }
      }
      
      Object[] c=arrayList.toArray();
 
      for(Object k:c){
          System.out.print(k+" ");
      }
      
    }
}