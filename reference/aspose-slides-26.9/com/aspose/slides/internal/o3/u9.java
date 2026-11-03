package com.aspose.slides.internal.o3;

import com.aspose.slides.exceptions.InvalidOperationException;

public class u9 {
   private long n5;
   private int l6;
   private long k5;
   private long u3;
   private long a6;
   private long u9;
   private int h0;

   public u9(long var1, int var3, long var4, long var6, long var8, long var10, int var12) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var6;
      this.a6 = var8;
      this.u9 = var10;
      this.h0 = var12;
   }

   public u9() {
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.y6.u3 var2) {
      int var3 = (int)(this.n5 + this.l6 - var1.n5().getPosition());
      if (this.l6 > var1.n5().getPosition() - this.n5) {
         com.aspose.slides.internal.k1.t2 var4 = (com.aspose.slides.internal.k1.t2)var2;
         if ((this.u3 & 4294967295L) > 0L) {
            var1.n5().seek(this.n5 + (this.k5 & 4294967295L), 0);
            if (com.aspose.slides.internal.v6g.k5.l6(var4.n5(), com.aspose.slides.internal.k1.u3.class)) {
               com.aspose.slides.internal.k1.u3 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(), com.aspose.slides.internal.k1.u3.class);
               var1.n5(var5.n5() & 4294967295L);
               var1.n5(var5.u3() & 65535);
               var1.n5(var5.u9() & 65535);
               var1.n5(var5.l6() & 65535);
               var1.n5(var5.k5() & 65535);
            } else {
               com.aspose.slides.internal.k1.a6 var6 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(), com.aspose.slides.internal.k1.a6.class);
               if (var6 == null) {
                  throw new InvalidOperationException("Unexpected DeviceIndependentBitmap Header");
               }

               var1.n5(var6.n5() & 4294967295L);
               var1.l6(var6.u3());
               var1.l6(var6.u9());
               var1.n5(var6.l6() & 65535);
               var1.n5(var6.k5() & 65535);
               var1.n5(var6.h0() & 4294967295L);
               var1.n5(var6.c8() & 4294967295L);
               var1.l6(var6.t2());
               var1.l6(var6.s7());
               var1.n5(var6.x8() & 4294967295L);
               var1.n5(var6.n3() & 4294967295L);
            }

            int var7 = (int)((this.u3 & 4294967295L) - (var1.n5().getPosition() - (this.n5 + (this.k5 & 4294967295L)) & 4294967295L));
            if (var7 > 3) {
               var1.n5(var4.u3());
            }

            var1.n5().seek(this.n5 + (this.a6 & 4294967295L), 0);
            var1.n5(var4.u9());
         } else {
            var1.n5().seek(var3, 1);
         }
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.k1.t2 var2) {
      if ((var2.n5().n5() & 4294967295L) == 12L) {
         new l6().n5(var1, var2.n5());
      } else {
         new k5().n5(var1, var2.n5());
      }

      if (var2.u3() != null) {
         var1.n5(var2.u3());
      }

      var1.n5(var2.u9());
   }
}
