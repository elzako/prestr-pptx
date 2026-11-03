package com.aspose.slides;

class y6j {
   public static void n5(Ink var0, com.aspose.slides.internal.k4y.x1s var1, i1x var2) {
      if (var1 != null) {
         String var3 = var1.u3();
         com.aspose.slides.internal.c8m.r7 var4 = var2.n5().k7().n5(var3);
         com.aspose.slides.internal.c8m.j8 var5 = var4.l6();
         y9g var6 = new y9g(var5, var2.n5());
         var6.n5(var0);
         z6a.n5(var0, var1.a6().k5(), var2);
         z6a.n5(var0, var1.a6().n5(), var2);
         var0.setBlackWhiteMode(var1.k5());
         if (var1.u9() != null) {
            e4c var7 = new e4c();
            e4c var8 = new e4c();
            x4t var9 = new x4t();
            e4c[] var10 = new e4c[]{var7};
            e4c[] var11 = new e4c[]{var8};
            x4t[] var12 = new x4t[]{var9};
            z5b.n5(var1.u9(), var10, var11, var12);
            var10[0].l6(var7);
            var11[0].l6(var8);
            var12[0].n5(var9);
            o4f var13 = var0.s3();
            var13.n5(var7.u9());
            var0.k5(var8.u9());
            var13.n5(var9.n5());
         }

         var0.n5(var1.a6().l6());
      }
   }

   public static void n5(Ink var0, com.aspose.slides.internal.k4y.x1s var1, g6c var2) {
      new com.aspose.slides.internal.k4y.v8();
      String var4 = var2.c8() ? "drs" : "ppt";
      com.aspose.slides.internal.c8m.j8 var5 = var2.a6()
         .n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/", var4, "/ink/ink{0}.xml"}), new y6j$1(var2), new com.aspose.slides.internal.c8m.u8());
      y9g var6 = new y9g(var5, var2);
      var6.n5(var0, var1, var2);
      com.aspose.slides.internal.c8m.r7 var7 = var2.u6().l6(var5);
      var1.n5(var7.a6());
      var1.n5(var0.getBlackWhiteMode());
      com.aspose.slides.internal.k4y.v5b var8 = var1.n5();
      var8.n5(var0.u9());
      z6a.n5(var0, var8.k5(), var2);
      z6a.n5(var0, var8.n5(), var2);
      ShapeFrame var9 = var0.e5().e2();
      z5b.n5(var9, var1.l6());
   }
}
