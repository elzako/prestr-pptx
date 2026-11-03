package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.List;

public class w1 {
   private static final List<com.aspose.slides.internal.b8u.c8> n5 = new List<>();
   private static Object l6 = new Object();

   static com.aspose.slides.internal.b8u.c8 n5(com.aspose.slides.internal.z0k.t4 var0, d2 var1, boolean var2) {
      synchronized (l6) {
         synchronized (j4.n5(var0, new Object())) {
            j4 var6 = null;
            j4[] var7 = new j4[]{var6};
            boolean var8 = j4.n5((Object)(var0), var7);
            var6 = var7[0];
            if (var8 && com.aspose.slides.internal.v6g.k5.l6(var6.k5(), com.aspose.slides.internal.z0k.n3.class) && !var6.u3()) {
               var0.setPosition(0L);
            }

            v3 var9 = new v3(var0);

            try {
               for (int var10 = n5.size() - 1; var10 >= 0; var10--) {
                  com.aspose.slides.internal.b8u.c8 var11 = n5.get_Item(var10);
                  synchronized (var9.n5()) {
                     var9.n3();
                     if (var11.n5(var9, var1)) {
                        return var11;
                     }
                  }
               }
            } finally {
               synchronized (var9.n5()) {
                  if (!var9.e2() && var2) {
                     j4 var23 = null;
                     j4[] var24 = new j4[]{var23};
                     boolean var25 = j4.n5(var9, var24);
                     var23 = var24[0];
                     if (var25) {
                        i9.n5().n5(var23);
                     }
                  }
               }

               var9.n3();
               var9.dispose();
            }
         }

         return null;
      }
   }

   static com.aspose.slides.internal.b8u.h0 l6(com.aspose.slides.internal.z0k.t4 var0, d2 var1, boolean var2) {
      com.aspose.slides.internal.b8u.h0 var3 = null;
      com.aspose.slides.internal.b8u.c8 var4 = n5(var0, var1, var2);
      if (var4 != null) {
         var3 = var4.n5();
      }

      return var3;
   }

   static {
      n5.add(new com.aspose.slides.internal.l1f.l6());
   }
}
