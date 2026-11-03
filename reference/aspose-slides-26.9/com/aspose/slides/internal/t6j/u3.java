package com.aspose.slides.internal.t6j;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.j5;

public class u3 {
   public static String n5(j5 var0) {
      return var0.n5("yyyy-MM-ddTHH:mm:ssZ", com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String l6(j5 var0) {
      return var0.n5("yyyyMMddHHmmssZ", com.aspose.slides.internal.x7n.l6.k5());
   }

   public static double n5(String var0) {
      double var1 = l6(var0);
      return d2.k5(var1) ? 0.0 : var1;
   }

   public static double l6(String var0) {
      double var1 = 0.0;
      double[] var3 = new double[]{0.0};
      double var4 = d2.n5(var0, 167, com.aspose.slides.internal.x7n.l6.k5(), var3) ? var3[0] : Double.NaN;
      var1 = var3[0];
      return var4;
   }

   public static String n5(int var0) {
      return a3.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String l6(int var0) {
      return a3.n5(var0, "D10", com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String k5(int var0) {
      return a3.n5(var0, "X4", com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String u3(int var0) {
      return a3.n5(var0, "X8", com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String n5(double var0) {
      return d2.n5(var0, "0.#########", com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String n5(float var0) {
      return d2.n5(var0, "0.#########", com.aspose.slides.internal.x7n.l6.k5());
   }

   public static String l6(float var0) {
      return d2.n5(var0, "0.############", com.aspose.slides.internal.x7n.l6.k5());
   }
}
