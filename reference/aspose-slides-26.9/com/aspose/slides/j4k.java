package com.aspose.slides;

class j4k {
   public static void n5(IShape var0, com.aspose.slides.internal.k4y.b4f var1) {
      String var2 = null;
      String var3 = null;
      String var4 = null;
      String var5 = null;
      String[] var6 = new String[]{var2};
      String[] var7 = new String[]{var3};
      String[] var8 = new String[]{var4};
      String[] var9 = new String[]{var5};
      t2f.n5(var0, var6, var7, var8, var9);
      var2 = var6[0];
      var3 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      var1.t2(var4);
      var1.s7(var5);
      String var10 = n5(var0);
      if (!com.aspose.slides.ms.System.d1.n5(var10)) {
         var1.u3(var10);
      } else {
         var1.h0(var2);
         var1.c8(var3);
      }
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.e6x var1) {
      String var2 = null;
      String var3 = null;
      String var4 = null;
      String var5 = null;
      String[] var6 = new String[]{var2};
      String[] var7 = new String[]{var3};
      String[] var8 = new String[]{var4};
      String[] var9 = new String[]{var5};
      t2f.n5(var0, var6, var7, var8, var9);
      var2 = var6[0];
      var3 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      var1.u3(var4);
      var1.a6(var5);
      String var10 = n5(var0);
      if (!com.aspose.slides.ms.System.d1.n5(var10)) {
         var1.h0(var10);
      } else {
         var1.l6(var2);
         var1.k5(var3);
      }
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.d2z var1) {
      String var2 = null;
      String var3 = null;
      String var4 = null;
      String var5 = null;
      String[] var6 = new String[]{var2};
      String[] var7 = new String[]{var3};
      String[] var8 = new String[]{var4};
      String[] var9 = new String[]{var5};
      t2f.n5(var0, var6, var7, var8, var9);
      var2 = var6[0];
      var3 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      var1.u3(var4);
      var1.a6(var5);
      String var10 = n5(var0);
      if (!com.aspose.slides.ms.System.d1.n5(var10)) {
         var1.h0(var10);
      } else {
         var1.l6(var2);
         var1.k5(var3);
      }
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.g3c var1) {
      String var2 = null;
      String var3 = null;
      String var4 = null;
      String var5 = null;
      String[] var6 = new String[]{var2};
      String[] var7 = new String[]{var3};
      String[] var8 = new String[]{var4};
      String[] var9 = new String[]{var5};
      t2f.n5(var0, var6, var7, var8, var9);
      var2 = var6[0];
      var3 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      var1.u3(var4);
      var1.a6(var5);
      String var10 = n5(var0);
      if (!com.aspose.slides.ms.System.d1.n5(var10)) {
         var1.h0(var10);
      } else {
         var1.l6(var2);
         var1.k5(var3);
      }
   }

   private static String n5(IShape var0) {
      String var1 = com.aspose.slides.ms.System.d1.n5;
      if (var0.getRotation() != 0.0F && var0.getHeight() > 1.0F && var0.getWidth() > 1.0F) {
         float var2 = var0.getWidth() / 2.0F;
         float var3 = var0.getHeight() / 2.0F;
         var1 = com.aspose.slides.ms.System.d1.n5(var1, com.aspose.slides.ms.System.d1.n5(new String[]{"translate(", t2f.l6(-var2), " ", t2f.l6(-var3), ") "}));
         var1 = com.aspose.slides.ms.System.d1.n5(
            var1,
            com.aspose.slides.ms.System.d1.n5(new String[]{"rotate(", t2f.u3(com.aspose.slides.ms.System.q1.n5((double)(var0.getRotation() * -1.0F * Math.PI / 180.0), 5)), ") "})
         );
         var1 = com.aspose.slides.ms.System.d1.n5(
            var1, com.aspose.slides.ms.System.d1.n5(new String[]{"translate(", t2f.l6(var0.getFrame().getCenterX()), " ", t2f.l6(var0.getFrame().getCenterY()), ")"})
         );
      }

      return var1;
   }
}
