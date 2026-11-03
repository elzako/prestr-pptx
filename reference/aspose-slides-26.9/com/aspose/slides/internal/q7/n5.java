package com.aspose.slides.internal.q7;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class n5 {
   public static final long n5 = com.aspose.slides.internal.v6g.k5.h0(4096, 9);

   public static byte[] n5(t4 var0) {
      return n5(var0, n5);
   }

   public static byte[] n5(t4 var0, long var1) {
      e2 var3 = l6(var0, var1);
      return var3.toArray();
   }

   public static e2 l6(t4 var0) {
      return l6(var0, n5);
   }

   public static e2 l6(t4 var0, long var1) {
      e2[] var3 = new e2[]{new e2(0)};
      n5(var0, new n5$1(var3), var1);
      return var3[0];
   }

   public static boolean n5(t4 var0, n5$n5 var1, long var2) {
      boolean var4 = false;
      byte[] var5 = new byte[(int)var2];

      int var6;
      do {
         var6 = var0.read(var5, 0, var5.length);
         if (!var1.n5(var5, var6)) {
            var4 = true;
            break;
         }
      } while (var6 != 0);

      return !var4;
   }

   public static void n5(t4 var0, t4 var1) {
      n5(var0, var1, n5);
   }

   public static void n5(t4 var0, t4 var1, long var2) {
      byte[] var4 = new byte[(int)var2];

      while (true) {
         int var5 = var0.read(var4, 0, var4.length);
         if (var5 == 0) {
            return;
         }

         var1.write(var4, 0, var5);
      }
   }
}
