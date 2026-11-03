package com.aspose.slides.internal.j8o;

import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.b7s.t9;

public abstract class l6 {
   private static final int[] u3 = new int[]{0, -1, -3, -7, -15, -31, -63, -127, -255, -511, -1023, -2047, -4095, -8191, -16383, -32767};
   private static final int[] a6 = new int[]{0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384};
   protected final h2 n5;
   protected int[] l6;
   protected t9 k5;

   protected l6(t9 var1) {
      this.k5 = var1;
      this.n5 = var1.n3();
      this.l6 = new int[10];
   }

   public final t9 n5() {
      return this.k5;
   }

   public final boolean n5(com.aspose.slides.internal.b7s.u3 var1, int[] var2, l6$n5[] var3) {
      int var4 = 0;
      boolean var5 = false;
      if (var3[0].l6 < 8) {
         if (!this.n5(var3, 0)) {
            var2[0] = -1;
            return false;
         }

         if (var3[0].l6 < 8) {
            var4 = 1;
            var5 = true;
         }
      }

      if (!var5) {
         int var6 = var3[0].l6 - 8;
         int var7 = var3[0].n5 >> var6 & 0xFF;
         if ((var4 = var1.u9()[var7]) != 0) {
            var3[0].l6 -= var4;
            var2[0] = var1.h0()[var7];
            return true;
         }

         var4 = 9;
      }

      var2[0] = this.n5(var3, var1, var4);
      return var2[0] >= 0;
   }

   public abstract int n5(short[][] var1);

   public abstract void l6();

   protected static int n5(int var0, int var1) {
      return var0 < a6[var1] ? var0 + u3[var1] : var0;
   }

   protected static int n5(int var0, l6$n5[] var1) {
      var1[0].l6 -= var0;
      return var1[0].n5 >> var1[0].l6 & (1 << var0) - 1;
   }

   protected final boolean l6(int var1, l6$n5[] var2) {
      return var2[0].l6 >= var1 || this.n5(var2, var1);
   }

   private int n5(l6$n5[] var1, com.aspose.slides.internal.b7s.u3 var2, int var3) {
      int var4 = var3;
      if (!this.l6(var4, var1)) {
         return -1;
      }

      int var5;
      for (var5 = n5(var4, var1); var5 > var2.c8()[var4]; var4++) {
         var5 <<= 1;
         if (!this.l6(1, var1)) {
            return -1;
         }

         var5 |= n5(1, var1);
      }

      return var4 > 16 ? 0 : var2.a6()[var5 + var2.x8()[var4]] & 0xFF;
   }

   protected final boolean n5(l6$n5[] var1, int var2) {
      boolean var3 = false;
      if (this.n5.k5() == 0) {
         while (var1[0].l6 < 25) {
            int var4 = 0;
            int[] var5 = new int[]{0};
            this.n5.l6(var5);
            var4 = var5[0];
            if (var4 == 255) {
               do {
                  var5[0] = var4;
                  this.n5.l6(var5);
                  var4 = var5[0];
               } while (var4 == 255);

               if (var4 != 0) {
                  this.n5.n5(var4);
                  var3 = true;
                  break;
               }

               var4 = 255;
            }

            var1[0].n5 = var1[0].n5 << 8 | var4;
            var1[0].l6 += 8;
         }
      }

      if (var3 && var2 > var1[0].l6) {
         var1[0].n5 = var1[0].n5 << 25 - var1[0].l6;
         var1[0].l6 = 25;
      }

      return true;
   }
}
