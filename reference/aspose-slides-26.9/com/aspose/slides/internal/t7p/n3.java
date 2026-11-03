package com.aspose.slides.internal.t7p;

import com.aspose.slides.exceptions.NotSupportedException;

public class n3 {
   private final c8[] n5;

   public n3(int[] var1, com.aspose.slides.internal.b7s.t4 var2) {
      int var3 = var2.u3();
      int var4 = var2.h0();
      this.n5 = new c8[var1.length];

      for (int var5 = 0; var5 < var1.length; var5++) {
         com.aspose.slides.internal.b7s.n3 var6 = var2.l6()[var1[var5]];
         if ((var6.u3() & 255) == var3 && (var6.n3() & 255) == var4) {
            this.n5[var5] = new n5();
         } else if ((var6.u3() & 255) * 2 == var3 && (var6.n3() & 255) == var4) {
            this.n5[var5] = new u3();
         } else {
            if ((var6.u3() & 255) * 2 != var3 || (var6.n3() & 255) * 2 != var4) {
               throw new com.aspose.slides.internal.h6t.n5("Component configuration", new NotSupportedException("Jpeg component configuration not supported."));
            }

            this.n5[var5] = new z1();
         }
      }
   }

   public final c8 n5(int var1) {
      return this.n5[var1];
   }
}
