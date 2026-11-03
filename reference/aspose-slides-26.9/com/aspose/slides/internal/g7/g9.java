package com.aspose.slides.internal.g7;

class g9 {
   public static boolean n5(byte[] var0, int var1) {
      if (com.aspose.slides.internal.v6g.k5.x8(var0[var1], 6) == '-') {
         return var1 + 1 <= var0.length - 1 ? n5(var0[var1 + 1]) : false;
      } else {
         return n5(var0[var1]);
      }
   }

   public static String n5(String var0) {
      return com.aspose.slides.ms.System.d1.n5(
         com.aspose.slides.ms.System.d1.n5(var0, ".", com.aspose.slides.internal.x7n.l6.k5().e2().q0()), ",", com.aspose.slides.internal.x7n.l6.k5().e2().q0()
      );
   }

   public static double l6(String var0) {
      double var1 = -Double.MAX_VALUE;
      double[] var3 = new double[]{-Double.MAX_VALUE};
      com.aspose.slides.ms.System.d2.n5(n5(var0.toString()), 167, com.aspose.slides.internal.x7n.l6.k5(), var3);
      return var3[0];
   }

   private static boolean n5(byte var0) {
      double var1 = 0.0;
      String var3 = com.aspose.slides.internal.l7h.j5.e2().l6(new byte[]{var0});
      double[] var4 = new double[]{0.0};
      boolean var5 = com.aspose.slides.ms.System.d2.n5(var3, var4);
      var1 = var4[0];
      return var5;
   }
}
