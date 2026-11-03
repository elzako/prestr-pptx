package com.aspose.slides.internal.s5;

import com.aspose.slides.internal.n2d.m1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;

public class l6 {
   private boolean n5;

   public final byte[] n5(com.aspose.slides.internal.o9b.l6 var1) {
      n5 var2 = k5(var1);
      int var3 = var2.l6() / 8 + (var2.l6() % 8 > 0 ? 1 : 0);
      return this.n5(var2, var3);
   }

   public final com.aspose.slides.internal.o9b.l6 l6(com.aspose.slides.internal.o9b.l6 var1) {
      this.n5 = true;
      n5 var2 = k5(var1);
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(var1.e2(), var1.h0(), 196865);
      var3.n5(m1.n5(var1), m1.l6(var1));
      com.aspose.slides.internal.j9e.n5 var4 = var3.n5(new y2(0, 0, var3.e2(), var3.h0()), 2, 196865);
      byte[] var5 = this.n5(var2, var4.a6());
      com.aspose.slides.internal.e3m.n5.n5(var5, 0, var4.u3(), var5.length);
      var3.n5(var4);
      return var3;
   }

   private byte[] n5(n5 var1, int var2) {
      int var3 = var2 * var1.k5();
      byte[] var4 = new byte[var3];
      com.aspose.slides.internal.b8.u3 var5 = new com.aspose.slides.internal.b8.u3(var4);

      for (int var6 = 0; var6 < var1.k5(); var6++) {
         int var7 = var6 * var1.u3();
         var5.n5(var6 * var2);
         this.n5(var1, var5, var7);
      }

      var5.k5();
      return var4;
   }

   private void n5(n5 var1, com.aspose.slides.internal.b8.u3 var2, int var3) {
      for (int var4 = 0; var4 < var1.l6(); var4++) {
         int var5 = (var1.n5()[var3 + 1] & 255) + (var1.n5()[var3 + 2] & 255) + (var1.n5()[var3 + 3] & 255);
         boolean var6 = this.n5 ? var5 > 500 : var5 < 500;
         if (var6) {
            var2.n5();
         }

         var2.l6();
         var3 += 4;
      }
   }

   private static n5 k5(com.aspose.slides.internal.o9b.l6 var0) {
      com.aspose.slides.internal.o9b.l6 var1 = null;

      try {
         if (var0.s7() != 2498570) {
            var1 = new com.aspose.slides.internal.o9b.l6(var0.e2(), var0.h0(), 2498570);
            var1.n5(m1.n5(var0), m1.l6(var0));
            z1 var2 = com.aspose.slides.internal.k4d.a6.n5(var1);

            try {
               var2.l6(var0, 0, 0);
            } finally {
               if (var2 != null) {
                  var2.dispose();
               }
            }
         } else {
            var1 = var0;
         }

         com.aspose.slides.internal.j9e.n5 var12 = var1.n5(new y2(0, 0, var1.e2(), var1.h0()), 1, 2498570);
         n5 var3 = new n5(var12);
         var1.n5(var12);
         return var3;
      } finally {
         if (var1 != var0 && var1 != null) {
            var1.dispose();
         }
      }
   }
}
