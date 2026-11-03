package com.aspose.slides.internal.r7c;

import java.util.ArrayList;
import java.util.Iterator;

public class u9 implements Iterable<u3> {
   private ArrayList<u3> n5 = new ArrayList<>();

   void n5(u3 var1) {
      this.n5.add(var1);
   }

   public int n5() {
      return this.n5.size();
   }

   public u3 n5(int var1) {
      return this.n5.get(var1);
   }

   @Override
   public Iterator<u3> iterator() {
      return this.n5.iterator();
   }
}
