package com.aspose.slides.internal.c8;

import com.aspose.slides.internal.m3.h6;
import com.aspose.slides.ms.System.o5;

public class a6 extends k5 {
   private o5<Integer> n5 = new o5<>();
   private String l6;

   public a6(String var1) {
      this.l6 = var1;
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(h6.class)).n5(var1, var3);
      var2 = var3[0];
      if (var4) {
         this.n5 = new o5<>(var2);
      }
   }

   @Override
   public String n5() {
      return this.l6;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.u3.l6 var1) {
      if (o5.n5(this.n5, null)) {
         return false;
      } else {
         return o5.n5(new o5<>(1), this.n5) ? true : o5.n5(new o5<>(var1.l6()), this.n5);
      }
   }
}
