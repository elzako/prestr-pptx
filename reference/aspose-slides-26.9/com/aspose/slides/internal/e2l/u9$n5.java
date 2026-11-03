package com.aspose.slides.internal.e2l;

import com.aspose.slides.internal.j3b.s7;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z8;

class u9$n5 implements s7 {
   private final u9 n5;

   public u9$n5(u9 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5() {
      return u9.n5(this.n5).n5();
   }

   @Override
   public z8 l6() {
      return u9.n5(this.n5).l6();
   }

   @Override
   public void n5(j5 var1, com.aspose.slides.internal.j3b.u9 var2) {
      if (u9.n5(this.n5) == null) {
         throw new com.aspose.slides.internal.g9t.n5("Cannot load pixels as no active GIF frame exists. Select an active frame first.");
      }

      u9.n5(this.n5).n5(var1.n3(), var2);
   }

   @Override
   public void n5(j5 var1, z8 var2, com.aspose.slides.internal.j3b.c8 var3) {
      u9.n5(this.n5).n5(var1.n3(), var2, var3);
   }
}
