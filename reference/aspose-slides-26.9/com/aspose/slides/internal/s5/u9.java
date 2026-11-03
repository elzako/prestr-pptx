package com.aspose.slides.internal.s5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.j7.n3;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.x4g.y4;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class u9 {
   private static final byte[] n5;
   private static final Dictionary<String, byte[]> l6 = new Dictionary<>();
   private static final Object k5 = new Object();

   public static byte[] n5(com.aspose.slides.internal.w0.a6 var0) {
      String var1 = k5(var0);
      byte[] var2 = null;
      synchronized (k5) {
         byte[][] var4 = new byte[][]{(byte[])var2};
         l6.tryGetValue(var1, var4);
         var2 = var4[0];
      }

      if (var2 == null) {
         synchronized (k5) {
            byte[][] var11 = new byte[][]{(byte[])var2};
            boolean var5 = !l6.tryGetValue(var1, var11);
            var2 = var11[0];
            if (var5) {
               var2 = l6(var0);
               l6.set_Item(var1, (byte[])var2);
            }
         }
      }

      return (byte[])var2;
   }

   private static byte[] l6(com.aspose.slides.internal.w0.a6 var0) {
      byte[] var1 = new byte[8];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(n5)), var0.l6() * 8, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, 8);
      com.aspose.slides.internal.j7.n5 var2 = new com.aspose.slides.internal.j7.n5(8, 8);

      try {
         for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
               com.aspose.slides.internal.p1s.n5 var5 = (var1[var3] & 255 & 128 >> var4) > 0 ? var0.k5() : var0.u3();
               var2.n5(var4, 7 - var3, var5);
            }
         }

         e2 var9 = new e2();
         var2.n5(var9, 5);
         return t4.l6(var9);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private static String k5(com.aspose.slides.internal.w0.a6 var0) {
      return d1.n5("{0}{1:X}{2:X}",new Object[]{ s3.n5(y4.class, var0.l6()), var0.u3().h0(), var0.k5().h0()});
   }

   static {
      com.aspose.slides.internal.z0k.t4 var0 = n3.n5("/Aspose/Foundation/Resources/HatchMasks.dat");

      try {
         n5 = new byte[(int)var0.getLength()];
         var0.read(n5, 0, n5.length);
      } finally {
         if (var0 != null) {
            var0.dispose();
         }
      }
   }
}
