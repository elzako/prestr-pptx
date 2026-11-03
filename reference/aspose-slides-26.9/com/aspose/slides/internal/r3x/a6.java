package com.aspose.slides.internal.r3x;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class a6 {
   public com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, m1 var2, a6$x8 var3) {
      float var4 = (float)var2.t2().getScaleX();
      float var5 = (float)var2.t2().getScaleY();
      if (var4 < 0.0F && var4 > -0.01) {
         var4 = Math.min(var4, -0.01F);
      } else if (var4 > 0.0F && var4 < 0.01) {
         var4 = Math.max(var4, 0.01F);
      }

      if (var5 < 0.0F && var5 > -0.01) {
         var5 = Math.min(var5, -0.01F);
      } else if (var5 > 0.0F && var5 < 0.01) {
         var5 = Math.max(var5, 0.01F);
      }

      var4 = Math.abs(var4);
      var5 = Math.abs(var5);
      if (var4 >= 1.0F && var5 >= 1.0F) {
         return var1;
      } else if (var4 != 0.0F && var5 != 0.0F) {
         float var6 = 1.0F / var4;
         float var7 = 1.0F / var5;
         return this.n5(var3).n5(var1, var2, var6, var7);
      } else {
         return var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   a6$c8 n5(a6$x8 var1) {
      switch (u9.n5[var1.ordinal()]) {
         case 1:
            return new a6$k5();
         case 2:
            return new a6$h0();
         case 3:
            return new a6$s7();
         case 4:
            return new a6$t2();
         case 5:
            return new a6$n3();
         case 6:
            return new a6$a6();
         case 7:
            return new a6$u9();
         case 8:
            return new a6$u3();
         case 9:
            return new a6$l6();
         default:
            throw new IllegalArgumentException("Not processed smootherAlgo [" + var1 + "]");
      }
   }

   private static int l6(float var0, float var1) {
      return Math.max(l6(var0), l6(var1));
   }

   private static int l6(float var0) {
      int var1 = (int)Math.ceil(var0 * 2.0F);
      if (var1 % 2 == 0) {
         var1++;
      }

      return var1;
   }

   private static double l6(int var0) {
      int var1 = (var0 + 1) / 2;
      return var1 / 3.0;
   }

   private static void l6(com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.l6 var1) {
      y2 var2 = new y2(0, 0, var0.e2(), var0.h0());
      com.aspose.slides.internal.j9e.n5 var3 = var0.n5(var2, 3, var1.s7());
      int var4 = q1.n5(var3.a6()) * var0.h0();
      byte[] var5 = new byte[var4];
      System.arraycopy((byte[])var3.u3().k5().n5(), 0, var5, 0, var4);
      var0.n5(var3);
      com.aspose.slides.internal.j9e.n5 var6 = var1.n5(var2, 3, var1.s7());
      System.arraycopy(var5, 0, (byte[])var6.u3().k5().n5(), 0, var4);
      var1.n5(var6);
   }

   // $VF: synthetic method
   static void n5(com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.l6 var1) {
      l6(var0, var1);
   }

   // $VF: synthetic method
   static int n5(float var0, float var1) {
      return l6(var0, var1);
   }

   // $VF: synthetic method
   static double n5(int var0) {
      return l6(var0);
   }

   // $VF: synthetic method
   static int n5(float var0) {
      return l6(var0);
   }
}
