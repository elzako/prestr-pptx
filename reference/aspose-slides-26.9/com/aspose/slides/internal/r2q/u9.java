package com.aspose.slides.internal.r2q;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class u9 extends a6 implements com.aspose.slides.internal.b8u.k5 {
   private final com.aspose.slides.internal.h9s.n5 u3;
   private final int a6;
   private final com.aspose.slides.internal.v6s.u3 u9;
   private final long[] h0;
   private final long[] c8;
   private com.aspose.slides.internal.h9s.a6 t2;
   private int s7;
   private byte[] x8;
   private int n3;

   public u9(com.aspose.slides.internal.v6s.u3 var1, com.aspose.slides.internal.f2i.n5 var2, int var3, int var4) {
      this(var1, var2, var3, var2.x8(273), var2.x8(279), var4);
   }

   public u9(com.aspose.slides.internal.v6s.u3 var1, com.aspose.slides.internal.f2i.n5 var2, int var3, long[] var4, long[] var5, int var6) {
      this.u9 = var1;
      this.a6 = var2.r4();
      this.h0 = var4;
      this.c8 = var5;
      this.u3 = new com.aspose.slides.internal.h9s.n5(var3, this.h0.length, var6);
   }

   public final int u3() {
      return this.s7;
   }

   public final int a6() {
      return this.k5(this.u3.n5(this.s7));
   }

   public final int k5(int var1) {
      int var2 = 0;
      if (var1 > 0) {
         var2 = this.u3.l6(var1);
      }

      if (++var2 >= this.u3.n5()) {
         var2--;
      }

      return this.u3.n5(var2);
   }

   public final int u3(int var1) {
      if (var1 > 0) {
         this.s7 = this.u3.l6(var1);
      } else {
         this.s7 = 0;
      }

      this.h0();
      return this.u3.n5(this.s7);
   }

   public final int a6(int var1) {
      if (var1 >= 0 && var1 < this.h0.length) {
         this.s7 = var1;
         this.h0();
         return this.u3.n5(this.s7);
      } else {
         throw new com.aspose.slides.internal.h6t.u3(
            d1.n5("The strip/tile index=", a3.l6(var1), " not included in the range from 0 to ", a3.l6(this.h0.length - 1))
         );
      }
   }

   public final h0 n5(int var1, boolean var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      String var6 = null;
      boolean var7 = true;

      while (this.n5 < var1) {
         if (this.l6 >= this.n3) {
            com.aspose.slides.internal.r1x.u9 var8 = this.t2.n5().n5();
            var4 = var8.k5;
            var5 = var8.a6;
            if (var8.k5 != 0) {
               if (var8.k5 == 1 && this.n5 != 0) {
                  this.n5 = var1;
                  var3 = (int)this.k5;
                  var4 = 0;
               }

               var6 = var8.u3;
               var7 = false;
               break;
            }

            this.x8 = var8.n5;
            this.n3 = var8.l6;
            this.l6 = 0;
            if (this.a6 == 1) {
               com.aspose.slides.internal.u2w.n5.n5(this.x8, 0, this.n3);
            }
         }

         this.k5 = (this.k5 | (this.x8[this.l6++] & 255) << (this.n5 & 31)) & 4294967295L;
         this.n5 += 8;
      }

      if (var7) {
         var3 = (int)this.k5;
         if (var2) {
            var3 &= (1 << var1) - 1;
         }
      }

      h0 var9 = new h0();
      var9.l6 = var6;
      var9.k5 = var3;
      var9.n5 = var4;
      var9.u3 = var5;
      return var9;
   }

   @Override
   public final com.aspose.slides.internal.r1x.u9 u9() {
      com.aspose.slides.internal.r1x.u9 var1 = this.t2.n5().n5();
      if (var1.k5 == 0) {
         this.x8 = var1.n5;
         this.n3 = var1.l6;
         if (this.a6 == 2) {
            com.aspose.slides.internal.u2w.n5.n5(var1.n5, 0, var1.l6);
         }
      } else {
         this.x8 = null;
         this.n3 = 0;
      }

      return var1;
   }

   private void h0() {
      long var1 = this.h0[this.s7];
      long var3 = this.c8[this.s7];
      this.t2 = new com.aspose.slides.internal.h9s.a6(this.u9, var1 & 4294967295L, var3 & 4294967295L);
      this.k5();
      this.x8 = null;
      this.n3 = 0;
   }
}
