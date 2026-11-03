package com.aspose.slides.internal.e6q;

import java.util.Iterator;
import java.util.LinkedList;

public class c8 implements h0 {
   private LinkedList<u9> n5 = new LinkedList<>();

   @Override
   public void n5(u9 var1) {
      this.n5.addFirst(var1);
   }

   @Override
   public void l6(u9 var1) {
      this.n5.addLast(var1);
   }

   @Override
   public h0 n5() {
      c8 var1 = new c8();

      for (u9 var3 : this.n5) {
         var1.n5.add(new u9(var3));
      }

      return var1;
   }

   @Override
   public Iterator<u9> l6() {
      return this.n5.listIterator();
   }

   @Override
   public Iterator<u9> k5() {
      return this.n5.descendingIterator();
   }

   @Override
   public int u3() {
      return this.n5.size();
   }
}
