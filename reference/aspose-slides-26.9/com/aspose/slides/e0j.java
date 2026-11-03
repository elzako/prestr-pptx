package com.aspose.slides;

class e0j {
   public static int n5(IAudio var0, g6o var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      boolean var4 = var1.c4().tryGetValue(((Audio)var0).k5(), var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      com.aspose.slides.internal.k0r.d0p var5 = n5(var1);
      var2 = n5((Audio)var0, var5);
      var1.c4().addItem(((Audio)var0).k5(), var2);
      return var2;
   }

   private static com.aspose.slides.internal.k0r.d0p n5(g6o var0) {
      com.aspose.slides.internal.k0r.t1 var1 = var0.l6().a6().h0();
      com.aspose.slides.internal.k0r.d0p var2 = var1.s7();
      if (var2 == null) {
         var2 = new com.aspose.slides.internal.k0r.d0p();
         var2.l6().n5(0);
         var1.n5(var2);
      }

      return var2;
   }

   private static int n5(Audio var0, com.aspose.slides.internal.k0r.d0p var1) {
      int var2 = n5(var1);
      com.aspose.slides.internal.k0r.x6s var3 = new com.aspose.slides.internal.k0r.x6s();
      var1.e2().addItem(var3);
      String var4 = var0.n5().n5();
      if (var4 == null) {
         var4 = com.aspose.slides.ms.System.d1.n5;
      }

      var3.l6().n5(var4);
      String var5 = com.aspose.slides.internal.z0k.z1.a6(var0.n5().n5());
      if (var5 == null) {
         var5 = com.aspose.slides.ms.System.d1.n5;
      }

      String var6 = var5;
      if (!com.aspose.slides.ms.System.d1.u3(var6, ".wav", (short)5) && !com.aspose.slides.ms.System.d1.u3(var6, ".aif", (short)5)) {
         var3.u3().n5("wave");
      } else {
         var3.u3().n5(var6);
      }

      var3.n5(var2);
      var3.u9().n5(var0.getBinaryData());
      return var2;
   }

   private static int n5(com.aspose.slides.internal.k0r.d0p var0) {
      int var1 = var0.l6().l6() + 1;
      var0.l6().n5(var1);
      return var1;
   }
}
