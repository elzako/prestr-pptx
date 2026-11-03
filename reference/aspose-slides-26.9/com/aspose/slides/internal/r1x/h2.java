package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.q1;

public class h2 {
   public static boolean n5(com.aspose.slides.internal.z0k.t4 var0) {
      boolean var1 = false;
      if (var0 != null) {
         com.aspose.slides.internal.w2i.t2 var2 = new com.aspose.slides.internal.w2i.t2();
         var2.n5(var0);
         var1 = var2.k5();
         var2.n5();
      }

      return var1;
   }

   public static com.aspose.slides.internal.z0k.t4 n5(com.aspose.slides.internal.z0k.t4 var0, boolean var1) {
      if (var0 == null) {
         if (var1) {
            return null;
         } else {
            throw new ArgumentNullException("stream");
         }
      } else {
         j4 var2 = null;
         com.aspose.slides.internal.z0k.e2 var3 = null;

         try {
            var2 = i9.n5().n5(var0);
            synchronized (var2.n5()) {
               long var5 = var2.getPosition();
               var2.setPosition(0L);
               long var7 = var2.getLength();
               var3 = new com.aspose.slides.internal.z0k.e2();
               byte[] var9 = new byte[(int)var7];

               while (var7 > 0L) {
                  int var10 = var2.read(var9, 0, (int)q1.k5(var9.length, var7));
                  var3.write(var9, 0, var10);
                  var7 -= var10;
               }

               var2.setPosition(var5);
            }
         } finally {
            i9.n5().n5(var2);
         }

         return var3;
      }
   }
}
