package com.aspose.slides.internal.k4o;

import java.util.Iterator;

public class c8 implements u9 {
   private Iterator<com.aspose.slides.internal.m5l.l6> n5;

   public c8(h0 var1) {
      if (var1.k5() != null) {
         this.n5 = var1.n5.iterator();
      } else if (var1.u9() != null) {
         this.n5 = var1.u9().s7();
      } else {
         this.n5 = var1.n5.iterator();
      }
   }

   @Override
   public void n5(Exception var1) throws com.aspose.slides.internal.p7x.l6 {
      throw new com.aspose.slides.internal.p7x.l6(var1);
   }

   @Override
   public boolean hasNext() {
      return this.n5.hasNext();
   }

   public com.aspose.slides.internal.m5l.l6 n5() {
      return this.n5.next();
   }

   @Override
   public void remove() {
      this.n5.remove();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.m5l.l6 next() {
      return this.n5();
   }

}
