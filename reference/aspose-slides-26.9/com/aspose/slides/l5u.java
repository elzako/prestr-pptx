package com.aspose.slides;

class l5u {
   public static void n5(IGraphicalObject var0, com.aspose.slides.internal.k4y.n3 var1, i1x var2) {
      if (var1 != null) {
         n5(var0, var1);
         com.aspose.slides.internal.k4y.y4 var3 = var1.n5();
         z6a.n5(var0, var3.k5(), var2);
         z6a.n5(var0, var3.n5(), var2);
         com.aspose.slides.internal.k4y.k2p var4 = var3.l6();
         o3x.n5(var0.getGraphicalObjectLock(), var4.l6());
      }
   }

   private static void n5(IGraphicalObject var0, com.aspose.slides.internal.k4y.n3 var1) {
      x6p var2 = ((GraphicalObject)var0).t4();
      if (var1.l6() != null) {
         o4f var3 = ((GraphicalObject)var0).R_();
         e4c var4 = new e4c();
         e4c var5 = new e4c();
         x4t var6 = new x4t();
         e4c[] var7 = new e4c[]{var4};
         e4c[] var8 = new e4c[]{var5};
         x4t[] var9 = new x4t[]{var6};
         z5b.n5(var1.l6(), var7, var8, var9);
         var7[0].l6(var4);
         var8[0].l6(var5);
         var9[0].n5(var6);
         var3.n5(var4.u9());
         ((GraphicalObject)var0).k5(var5.u9());
         var3.n5(var6.n5());
      }

      com.aspose.slides.internal.k4y.k2p var10 = var1.n5().l6();
      var2.k5(var10.k5());
      var2.u3(var1.u3());
   }

   public static void n5(IGraphicalObject var0, com.aspose.slides.internal.k4y.n3 var1, g6c var2) {
      com.aspose.slides.internal.k4y.y4 var3 = var1.n5();
      z6a.n5(var0, var3.k5(), var2);
      z6a.n5(var0, var3.n5(), var2);
      com.aspose.slides.internal.k4y.k2p var4 = var3.l6();
      r9.n5((GraphicalObjectLock)var0.getGraphicalObjectLock(), new l5u$1(var4));
      l6(var0, var1, var2);
   }

   private static void l6(IGraphicalObject var0, com.aspose.slides.internal.k4y.n3 var1, g6c var2) {
      x6p var3 = ((GraphicalObject)var0).t4();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.s1k.class)) {
         var1.n5(var3.z1());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.g7i.class)) {
      }

      z5b.n5((GraphicalObject)var0, var1.l6(), var2.c8());
      com.aspose.slides.internal.k4y.k2p var4 = var1.n5().l6();
      var4.n5(var3.t9());
   }
}
