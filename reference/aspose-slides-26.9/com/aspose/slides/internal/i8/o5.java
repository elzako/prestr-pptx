package com.aspose.slides.internal.i8;

import com.aspose.slides.internal.i0.h6;
import com.aspose.slides.internal.i0.s4;

public class o5 extends e5 {
   private final s4 n5;

   public o5(s4 var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      h6 var2 = new h6();
      if (this.n5.e2() > 0) {
         var2.n5(com.aspose.slides.internal.o6.n5.k5(this.n5.e2(), var1));
      }

      if (this.n5.s7() > 0) {
         com.aspose.slides.internal.i0.t4[] var3 = new com.aspose.slides.internal.i0.t4[this.n5.s7()];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = (com.aspose.slides.internal.i0.t4)new x8().n5(var1);
         }

         var2.n5(var3);
      }

      return var2;
   }
}
