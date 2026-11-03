package com.aspose.slides;

import java.net.URI;
import java.net.URISyntaxException;

class w8d {
   static String n5(String var0) {
      com.aspose.slides.ms.System.r8 var1 = null;
      com.aspose.slides.ms.System.r8[] var2 = new com.aspose.slides.ms.System.r8[]{var1};
      boolean var3 = k5(var0) && com.aspose.slides.ms.System.r8.n5(var0, 2, var2);
      var1 = var2[0];
      if (var3) {
         var0 = com.aspose.slides.internal.z0k.z1.k5(var0);
      }

      var2[0] = var1;
      boolean var4 = com.aspose.slides.ms.System.r8.n5(var0, 1, var2);
      var1 = var2[0];
      if (var4) {
         if (com.aspose.slides.ms.System.d1.n5(var1.t9())) {
            try {
               return com.aspose.slides.ms.System.r8.n5(
                     new URI(
                        com.aspose.slides.ms.System.r8.l6,
                        com.aspose.slides.ms.System.r8.l6(var1).getSchemeSpecificPart(),
                        com.aspose.slides.ms.System.r8.l6(var1).getFragment()
                     )
                  )
                  .l6();
            } catch (URISyntaxException var6) {
               com.aspose.slides.internal.n8e.v4.n5(var6);
               return var1.l6();
            }
         }

         if (com.aspose.slides.ms.System.d1.a6("file", var1.t9())) {
            if (!com.aspose.slides.ms.System.d1.l6(var0, "file")) {
               return com.aspose.slides.ms.System.d1.n5(new String[]{"file:///", com.aspose.slides.ms.System.d1.n5(var0, "%20", " ")});
            }

            return com.aspose.slides.ms.System.d1.n5(var0, "%20", " ");
         }
      }

      return var0;
   }

   static <T> T n5(Class<T> var0, r0g var1) {
      if (var1 == null) {
         return (T)com.aspose.slides.internal.v6g.k5.k5(var0);
      } else {
         return (T)(com.aspose.slides.internal.v6g.k5.l6(var1, var0) ? var1 : n5(var0, var1.getParent_Immediate()));
      }
   }

   static boolean l6(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return false;
      } else {
         return var0.contains("@") ? false : var0.matches("^[0-9#%,.$\\-/:\"]+$");
      }
   }

   private static boolean k5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return false;
      }

      int var1 = 0;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (com.aspose.slides.ms.System.t9.l6(var3, ':')) {
            if (++var1 > 1) {
               return false;
            }
         }
      }

      return true;
   }

   static void n5(
      com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.y1 var2, float[] var3, boolean[] var4
   ) {
      float var5 = var2.n3();
      float var6 = var2.n3() + var2.k5();
      float var7 = var2.x8();
      float var8 = var2.x8() + var2.s7();
      float var9 = com.aspose.slides.ms.System.q1.n5(var1.k5() - var5);
      float var10 = com.aspose.slides.ms.System.q1.n5(var1.k5() - var6);
      float var11 = com.aspose.slides.ms.System.q1.n5(var1.l6() - var7);
      float var12 = com.aspose.slides.ms.System.q1.n5(var1.l6() - var8);
      float var13 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.l6(var9, var10), com.aspose.slides.ms.System.q1.l6(var11, var12));
      int var14 = var13 == var9 ? 1 : (var13 == var10 ? 2 : (var13 == var11 ? 3 : 4));
      switch (var14) {
         case 1:
            var3[0] = com.aspose.slides.ms.System.q1.n5(var0.k5() - var5);
            var4[0] = var0.l6() >= var7 && var0.l6() <= var8;
            break;
         case 2:
            var3[0] = com.aspose.slides.ms.System.q1.n5(var0.k5() - var6);
            var4[0] = var0.l6() >= var7 && var0.l6() <= var8;
            break;
         case 3:
            var3[0] = com.aspose.slides.ms.System.q1.n5(var0.l6() - var7);
            var4[0] = var0.k5() >= var5 && var0.k5() <= var6;
            break;
         case 4:
         default:
            var3[0] = com.aspose.slides.ms.System.q1.n5(var0.l6() - var8);
            var4[0] = var0.k5() >= var5 && var0.k5() <= var6;
      }
   }

   static boolean n5(t9z var0) {
      return var0.m1().getBevelTop().getBevelType() != -1 || var0.m1().getBevelBottom().getBevelType() != -1;
   }
}
