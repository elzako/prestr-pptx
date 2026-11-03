package com.aspose.slides.internal.y4;

import com.aspose.slides.ms.System.j8;

public class l6 extends com.aspose.slides.internal.k5.u9 {
   private com.aspose.slides.internal.k5.u9 n5;

   @Override
   public String u9() {
      return this.n5.u9();
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)9);
   }

   @Override
   protected boolean n5(com.aspose.slides.internal.k5.u9 var1) {
      l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, l6.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : this.n5.equals(var2.n5);
      }
   }

   // BUILD-ONLY: mandatory constructorless normalization removes this entire member.
   private l6(short recoveryArg0) {
      super(recoveryArg0);
   }
}
