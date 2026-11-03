package com.aspose.slides;

import com.aspose.slides.internal.k4y.n9u;

class o6n {
   public static void n5(PictureFillFormat var0, com.aspose.slides.internal.k4y.m1 var1, t5w var2) {
      if (var0.getPicture().getImage() == null) {
         n9u var3 = n5(var1);
         if (var3 != null) {
            var0.getPicture().setImage(n5(var3.a6(), var2));
            if (var0.getPicture().getImage() != null) {
               n5(var0, var3);
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.m1 var0, IPPImage var1, n4i var2) {
      n9u var3 = (n9u)var0.u9("imagedata").l6();
      if (var1 != null) {
         com.aspose.slides.internal.c8m.r7 var4 = var2.h0().e2().l6(var2.n5().l6(var1));
         var3.n5(var4.a6());
      }
   }

   private static IPPImage n5(String var0, t5w var1) {
      com.aspose.slides.internal.c8m.a2 var2 = var1.k7();
      return var0 != null ? var1.n5(var2.n5(var0).l6()) : null;
   }

   public static IPPImage n5(IBaseSlide var0, com.aspose.slides.internal.k4y.m1 var1, t5w var2, boolean[] var3) {
      n9u var4 = n5(var1);
      IPPImage var5 = null;
      if (var4 != null) {
         var5 = n5(var4.a6(), var2);
      }

      var3[0] = false;
      if (var5 == null) {
         ShapeFrame var6 = n9s.n5(var1.l6());
         var5 = n5(var0, var1, var6.getWidth(), var6.getHeight(), var3);
      }

      return var5;
   }

   public static void n5(PictureFillFormat var0, com.aspose.slides.internal.k4y.m1 var1) {
      n9u var2 = (n9u)var1.n5("imagedata");
      n5(var0, var2);
   }

   private static IPPImage n5(IBaseSlide var0, com.aspose.slides.internal.k4y.m1 var1, float var2, float var3, boolean[] var4) {
      var4[0] = false;
      IPPImage var5 = null;
      com.aspose.slides.internal.x4g.s7[] var6 = a5x.n5(var1, var2, var3);
      if (var6.length > 0) {
         String var7 = var1.n3();
         ColorFormat var8 = new ColorFormat(null, com.aspose.slides.internal.o9b.c8.e2().o8());
         if (var7 != null && var7.length() > 0) {
            com.aspose.slides.internal.n8e.u5 var9 = new com.aspose.slides.internal.n8e.u5(var7);
            var9.n5(var8);
         }

         float var29 = new com.aspose.slides.internal.n8e.u5(var1.y4()).l6(1.0F);
         com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(var2, 13) + 2, com.aspose.slides.internal.v6g.k5.u3(var3, 13) + 2
         );
         com.aspose.slides.internal.o9b.z1 var11 = com.aspose.slides.internal.o9b.z1.n5(var10);

         try {
            com.aspose.slides.internal.o9b.i1 var12 = new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.e2().o8());

            try {
               var11.n5(var12, 0.0F, 0.0F, var2 + 2.0F, var3 + 2.0F);
            } finally {
               if (var12 != null) {
                  var12.dispose();
               }
            }

            var11.l6(new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F));
            com.aspose.slides.internal.o9b.m3 var13 = new com.aspose.slides.internal.o9b.m3(
               com.aspose.slides.internal.o9b.c8.n5(255, var8.u3().o8()).o8(), var29
            );

            try {
               for (int var14 = 0; var14 < var6.length; var14++) {
                  var11.n5(var13, var6[var14]);
               }
            } finally {
               if (var13 != null) {
                  var13.dispose();
               }
            }
         } finally {
            if (var11 != null) {
               var11.dispose();
            }
         }

         var5 = ((ImageCollection)var0.getPresentation().getImages()).n5(var10);
         var4[0] = true;
      }

      return var5;
   }

   private static n9u n5(com.aspose.slides.internal.k4y.m1 var0) {
      return (n9u)var0.n5("imagedata");
   }

   private static void n5(PictureFillFormat var0, n9u var1) {
      i2h var2 = var0.u3().k5();
      float var3 = 0.0F;
      if (!com.aspose.slides.ms.System.d1.n5(var1.n5())) {
         if (com.aspose.slides.ms.System.d1.k5(var1.n5(), "f")) {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.n5()).u3();
         } else {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.n5()).k5(0.0F);
         }

         var2.l6 = var3 * 100.0F;
         var3 = 0.0F;
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.l6())) {
         if (com.aspose.slides.ms.System.d1.k5(var1.n5(), "f")) {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.l6()).u3();
         } else {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.l6()).k5(0.0F);
         }

         var2.k5 = var3 * 100.0F;
         var3 = 0.0F;
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.k5())) {
         if (com.aspose.slides.ms.System.d1.k5(var1.n5(), "f")) {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.k5()).u3();
         } else {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.k5()).k5(0.0F);
         }

         var2.u3 = var3 * 100.0F;
         var3 = 0.0F;
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.u3())) {
         if (com.aspose.slides.ms.System.d1.k5(var1.n5(), "f")) {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.u3()).u3();
         } else {
            var3 = new com.aspose.slides.internal.n8e.u5(var1.u3()).k5(0.0F);
         }

         var2.a6 = var3 * 100.0F;
      }

      var0.n5(var2.k5());
   }
}
