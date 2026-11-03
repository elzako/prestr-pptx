package com.aspose.slides.internal.m0l;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.y5s.m1;
import com.aspose.slides.internal.y5s.z3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.u3;

public class n5 {
   public static w1 n5(m1 var0) {
      return new w1(var0.n5(), var0.l6());
   }

   public static w1[] n5(u3 var0, boolean var1, boolean var2) {
      z3[] var3 = k5.n5(u3.n5(var0), z3[].class);
      if (var3 != null) {
         return n5(var3, 0, var0.a6(), var1, var2);
      } else {
         m1[] var4 = k5.n5(u3.n5(var0), m1[].class);
         if (var4 != null) {
            return n5(var4, 0, var0.a6(), var1, var2);
         } else {
            throw new ArgumentException(d1.n5("Support only {0} or {1} arrays.",new Object[]{ k5.n5(z3.class).s7(), k5.n5(m1.class).s7()}), "pointsArray");
         }
      }
   }

   public static w1[] n5(z3[] var0, int var1, int var2, boolean var3, boolean var4) {
      if (var1 < 0 || var1 > var0.length - 1) {
         throw new ArgumentOutOfRangeException("offset");
      }

      if (var1 + var2 > var0.length) {
         throw new ArgumentOutOfRangeException("count");
      }

      w1[] var5 = (w1[])u3.n5(u3.n5(k5.n5(w1.class), var2 + (var4 ? 1 : 0)));
      if (var3) {
         float var6 = 0.0F;
         float var7 = 0.0F;

         for (int var8 = 0; var8 < var2; var8++) {
            var5[var8] = new w1(var0[var8 + var1].l6() + var6, var0[var8 + var1].k5() + var7);
            var6 = var0[var8].l6();
            var7 = var0[var8].k5();
         }
      } else {
         for (int var9 = 0; var9 < var2; var9++) {
            var5[var9] = new w1(var0[var9 + var1].l6(), var0[var9 + var1].k5());
         }
      }

      if (var4) {
         var5[0].n5(var5[var5.length - 1]);
      }

      return var5;
   }

   public static w1[] n5(m1[] var0, int var1, int var2, boolean var3, boolean var4) {
      if (var1 < 0 || var1 > var0.length - 1) {
         throw new ArgumentOutOfRangeException("offset");
      }

      if (var1 + var2 > var0.length) {
         throw new ArgumentOutOfRangeException("count");
      }

      w1[] var5 = (w1[])u3.n5(u3.n5(k5.n5(w1.class), var2 + (var4 ? 1 : 0)));
      if (var3) {
         float var6 = 0.0F;
         float var7 = 0.0F;

         for (int var8 = 0; var8 < var2; var8++) {
            var5[var8] = new w1(var0[var8 + var1].n5() + var6, var0[var8 + var1].l6() + var7);
            var6 = var0[var8].n5();
            var7 = var0[var8].l6();
         }
      } else {
         for (int var9 = 0; var9 < var2; var9++) {
            var5[var9] = new w1(var0[var9 + var1].n5(), var0[var9 + var1].l6());
         }
      }

      if (var4) {
         var5[0].n5(var5[var5.length - 1]);
      }

      return var5;
   }
}
