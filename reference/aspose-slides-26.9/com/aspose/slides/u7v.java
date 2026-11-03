package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

class u7v {
   public static void n5(AutoShape var0, com.aspose.slides.internal.k4y.c5w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("autoShape");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pathElementData");
      }

      n5(var0);
      String var3 = var1.n5();
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int[] var8 = new int[]{0};
      int[] var9 = new int[]{0};
      int[] var10 = new int[]{0};
      int[] var11 = new int[]{0};
      t2f.n5(var1.u9(), var8, var9, var10, var11);
      var4 = var8[0];
      var5 = var9[0];
      var6 = var10[0];
      var7 = var11[0];
      List var12 = new List();
      if (var3.length() > 0) {
         int var13 = var6 - var4;
         int var14 = var5 - var7;
         var12.addItem(
            new q7g(com.aspose.slides.ms.System.d1.l6(var3), com.aspose.slides.ms.System.q1.n5(var13 / 1), com.aspose.slides.ms.System.q1.n5(var14 / 1))
         );
      }

      var0.e2().n5((q7g[])var12.toArray(new q7g[0]));
   }

   public static void n5(AutoShape var0, com.aspose.slides.internal.k4y.s4p var1) {
      if (var0 == null) {
         throw new ArgumentNullException("autoShape");
      }

      if (var1 == null) {
         throw new ArgumentNullException("polygonElementData");
      }

      n5(var0);
      List var2 = new List();
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int[] var7 = new int[]{0};
      int[] var8 = new int[]{0};
      int[] var9 = new int[]{0};
      int[] var10 = new int[]{0};
      t2f.n5(var1.u9(), var7, var8, var9, var10);
      var3 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      var6 = var10[0];
      int var11 = var5 - var3;
      int var12 = var4 - var6;
      var2.addItem(
         new q7g(
            t2f.n5(var1.n5()), com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var11 / 1)), com.aspose.slides.ms.System.q1.n5(var12 / 1)
         )
      );
      var0.e2().n5((q7g[])var2.toArray(new q7g[0]));
   }

   private static void n5(AutoShape var0) {
      var0.e2().n5(0);
      var0.e2().n5(new y2[0]);
      var0.e2().n5((i4w[])null);
      var0.e2().n5(j2x.n5);
      var0.e2().n5(new r8e[0]);
      var0.e2().n5((q7g[])null);
      var0.e2().n5((y1[])null);
      var0.e2().l6((y1[])null);
   }
}
