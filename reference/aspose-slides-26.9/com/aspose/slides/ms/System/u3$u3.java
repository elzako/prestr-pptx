package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;

final class u3$u3 {
   private final int n5;
   private final Class<?> l6;
   private final int[] k5;
   private final boolean u3;
   private final long a6;

   private u3$u3(Object var1, int var2, boolean var3) {
      int var4 = 0;
      Class var5 = null;
      Class var6 = var1.getClass().getComponentType();

      while (var6 != null) {
         var5 = var6;
         var4++;
         var6 = var5.getComponentType();
         if (var3 && var4 == var2) {
            break;
         }
      }

      if (var4 == 0) {
         throw new ArgumentException("Array required");
      }

      if (var2 > var4) {
         throw new ArgumentException("Required arrays dimension doesn't match to actual", "rank");
      }

      this.n5 = var2;
      this.l6 = var5;
      this.k5 = new int[this.n5];

      for (int var7 = 0; var7 < var2; var7++) {
         this.k5[var7] = -1;
      }

      this.u3 = var3;
      Object var14 = var1;
      int var8 = 0;
      int var9 = 1;
      com.aspose.slides.internal.w4w.n5 var10 = com.aspose.slides.internal.w4w.n5.n5();
      com.aspose.slides.internal.w4w.n5 var11 = com.aspose.slides.internal.w4w.n5.n5(this.l6);

      while (true) {
         if (var14 == null && !var3) {
            throw new ArgumentException("Jagged array not expected", "array");
         }

         boolean var12 = var8 < var2 - 1;
         int var13 = var12 ? var10.n5(var14) : var11.n5(var14);
         var9 *= var13;
         if (var9 == 0) {
            break;
         }

         this.k5[var8] = var13 - 1;
         if (!var12) {
            break;
         }

         var14 = com.aspose.slides.ms.System.u3.n5(var10, var14, 0);
         var8++;
      }

      this.a6 = var9;
   }

   // $VF: synthetic method
   static Class n5(u3$u3 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   u3$u3(Object var1, int var2, boolean var3, a6 var4) {
      this(var1, var2, var3);
   }

   // $VF: synthetic method
   static int l6(u3$u3 var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static long k5(u3$u3 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static int[] u3(u3$u3 var0) {
      return var0.k5;
   }
}
