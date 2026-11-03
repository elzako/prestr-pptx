package com.aspose.slides.internal.y4x;

import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.s7k.t2;
import com.aspose.slides.internal.y5s.x8;

public class n5 {
   private static t2 n5 = new t2();
   private static t2 l6 = new t2();

   public static c8 n5(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, double var8, double var10) {
      int var12 = (int)(var0 * var8 + var4 * var10);
      double var13 = var0 * var8 / var12;
      double var15 = var4 * var10 / var12;
      int var17 = (int)(var13 * var1 + var15 * var5 + 0.5);
      int var18 = (int)(var13 * var2 + var15 * var6 + 0.5);
      int var19 = (int)(var13 * var3 + var15 * var7 + 0.5);
      return n5(var12, var17, var18, var19);
   }

   public static c8 n5(c8 var0, c8 var1, double var2, double var4) {
      int var6 = var0.s7() & 255;
      int var7 = var0.x8() & 255;
      int var8 = var0.n3() & 255;
      int var9 = var0.y4() & 255;
      int var10 = var1.s7() & 255;
      int var11 = var1.x8() & 255;
      int var12 = var1.n3() & 255;
      int var13 = var1.y4() & 255;
      return n5(var6, var7, var8, var9, var10, var11, var12, var13, var2, var4);
   }

   private static int n5(int var0) {
      return Math.min(255, Math.max(0, var0));
   }

   private static c8 n5(int var0, int var1, int var2, int var3) {
      return c8.n5(n5(var0), n5(var1), n5(var2), n5(var3));
   }

   static {
      n5.n5(x8.n5().n5());
      n5.n5(x8.l6().n5());
      l6.n5(x8.l6().n5());
      l6.n5(x8.n5().n5());
   }
}
