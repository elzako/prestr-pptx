package com.aspose.slides.internal.u7q;

import com.aspose.slides.exceptions.NotSupportedException;

class s7 extends l6 {
   @Override
   public void n5(com.aspose.slides.internal.w2i.s7 var1) {
      long var2 = var1.a6();
      this.h0 = (int)var1.k5();
      this.y4();
      this.c8 = var1.k5();
      this.l6 = var1.n5();
      this.k5 = var1.n5();
      var1.l6();
      long[] var4 = var1.a6(5);
      if ((var4[0] & 4294967295L) != 0L) {
         var1.n5(var2 + (var4[0] & 4294967295L));
         n5(this.k5(), var1);
      }

      if ((var4[1] & 4294967295L) != 0L) {
         var1.n5(var2 + (var4[1] & 4294967295L));
         this.n5(var1.u3(12));
      }

      if ((var4[2] & 4294967295L) != 0L) {
         var1.n5(var2 + (var4[2] & 4294967295L));
         n5(this.l6(), var1);
      }

      if ((var4[3] & 4294967295L) != 0L) {
         var1.n5(var2 + (var4[3] & 4294967295L));
         com.aspose.slides.internal.d9l.n5 var5 = this.n5((byte)0, (byte)0);
         var5.n5(var1);
      }

      if ((var4[4] & 4294967295L) != 0L) {
         var1.n5(var2 + (var4[4] & 4294967295L));
         n5(this.n5(), var1);
      }
   }

   @Override
   protected void y4() {
      if (this.h0 != 1833058592) {
         throw new com.aspose.slides.internal.d3l.h0();
      }
   }

   private static void n5(n5[] var0, com.aspose.slides.internal.w2i.s7 var1) {
      for (byte var2 = 0; (var2 & 255) < var0.length; var2++) {
         long var3 = var1.a6();
         int var5 = (int)var1.k5();
         var1.n5(var3);
         if (var5 != 1668641398 && var5 != 1885434465) {
            throw new NotSupportedException("Only CurveType and ParametricCurveType tags can be here");
         }

         var0[var2 & 0xFF] = (n5)com.aspose.slides.internal.u7q.k5.n5(var5);
         var0[var2 & 0xFF].n5(var1);
      }
   }
}
