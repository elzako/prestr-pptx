package com.aspose.slides.internal.u1s;

import com.aspose.slides.internal.e5a.i1;
import com.aspose.slides.internal.n2d.a6;
import com.aspose.slides.internal.n2d.k5;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.l6;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.u3;

public class n5 {
   private static int n5(int var0) {
      return var0 + 3 & -4;
   }

   private static int l6(int var0) {
      int var1 = 0;

      while (q1.a6(2.0, var1) < var0) {
         var1++;
      }

      return var1 - 1;
   }

   public final void n5(t4 var1, t4 var2) {
      k5 var3 = new k5(var1);
      l6 var4 = new l6(var2);
      n5$l6 var5 = new n5$l6(null);
      var5.n5(var3);
      n5$k5[] var6 = new n5$k5[var5.u3];

      for (int var7 = 0; var7 < var6.length; var7++) {
         n5$k5 var8 = new n5$k5(null);
         var8.n5(var3);
         var6[var7] = var8;
      }

      u3.n5(var6, new n5$n5(null));
      int var16 = 12 + (var5.u3 & 65535) * 16;

      for (n5$k5 var11 : var6) {
         var16 = n5(var16);
         var11.u9 = var16 & 4294967295L;
         var16 += (int)var11.u3;
      }

      var4.n5(a6.n5(var5.l6));
      int var19 = var5.u3;
      var4.n5(a6.l6(var19));
      int var20 = l6(var19 & 65535) & 65535;
      int var21 = (var20 & 65535) * 16 & 65535;
      var4.n5(a6.l6(var21));
      var4.n5(a6.l6(var20));
      var4.n5(a6.l6((var19 & 65535) * 16 - (var21 & 65535) & 65535));

      for (n5$k5 var14 : var6) {
         var4.n5(a6.n5(var14.n5));
         var4.n5(a6.n5(var14.a6));
         var4.n5(a6.n5(var14.u9));
         var4.n5(a6.n5(var14.u3));
      }

      for (n5$k5 var26 : var6) {
         int var15 = (int)((var26.u9 & 4294967295L) - var4.n5().getPosition());
         if (var15 > 0) {
            var4.n5(new byte[var15]);
         }

         var4.n5(n5(var3, var26));
      }

      var2.flush();
   }

   private static byte[] n5(k5 var0, n5$k5 var1) {
      var0.n5().seek(var1.l6 & 4294967295L, 0);
      byte[] var2 = var0.n5((int)var1.k5);
      if ((var1.u3 & 4294967295L) > (var1.k5 & 4294967295L)) {
         i1 var3 = new i1(new e2(var2), 1);
         byte[] var4 = new byte[(int)var1.u3];
         var3.read(var4, 0, var4.length);
         var2 = var4;
      }

      return var2;
   }
}
