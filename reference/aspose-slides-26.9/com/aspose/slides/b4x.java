package com.aspose.slides;

class b4x {
   private static final com.aspose.slides.ms.System.j5 n5 = new com.aspose.slides.ms.System.j5(1900, 1, 1);
   private static final com.aspose.slides.ms.System.j5 l6 = new com.aspose.slides.ms.System.j5(1904, 1, 2);

   public static com.aspose.slides.ms.System.o5<Double> n5(String var0) {
      double var1 = 0.0;
      double[] var3 = new double[]{0.0};
      boolean var4 = com.aspose.slides.ms.System.d2.n5(var0, 511, com.aspose.slides.internal.x7n.l6.k5(), var3);
      var1 = var3[0];
      return !var4 ? new com.aspose.slides.ms.System.o5<>() : new com.aspose.slides.ms.System.o5<>(var1);
   }

   public static com.aspose.slides.ms.System.o5<Integer> l6(String var0) {
      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = com.aspose.slides.ms.System.a3.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5(), var2);
      var1 = var2[0];
      return var3 && (var1 == 0 || var1 == 1) ? new com.aspose.slides.ms.System.o5<>(var1) : new com.aspose.slides.ms.System.o5<>();
   }

   public static com.aspose.slides.ms.System.o5<Double> n5(String var0, int var1) {
      com.aspose.slides.ms.System.s4 var2 = new com.aspose.slides.ms.System.s4();
      com.aspose.slides.ms.System.s4[] var3 = new com.aspose.slides.ms.System.s4[]{var2};
      boolean var4 = com.aspose.slides.ms.System.s4.n5(var0, var3);
      var3[0].u3(var2);
      if (var4) {
         return new com.aspose.slides.ms.System.o5<>(var2.u9());
      }

      com.aspose.slides.ms.System.j5 var5 = new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5[] var6 = new com.aspose.slides.ms.System.j5[]{var5};
      boolean var7 = !com.aspose.slides.ms.System.j5.n5(var0, com.aspose.slides.internal.x7n.l6.k5(), 128, var6);
      var6[0].u3(var5);
      if (var7) {
         var6[0] = var5;
         boolean var8 = !com.aspose.slides.ms.System.j5.n5(var0, com.aspose.slides.internal.x7n.l6.l6("ru-Ru"), 128, var6);
         var6[0].u3(var5);
         if (var8) {
            return new com.aspose.slides.ms.System.o5<>();
         }
      }

      return n5(var5.m3(), var1);
   }

   public static com.aspose.slides.ms.System.o5<Double> n5(int var0, int var1, int var2, int var3) {
      boolean var4 = var0 == 1900 && var1 == 2 && var2 == 29;
      if (var4) {
         var2--;
      }

      com.aspose.slides.ms.System.j5 var5 = new com.aspose.slides.ms.System.j5(var0, var1, var2);
      com.aspose.slides.ms.System.o5 var6 = n5(var5.m3(), var3).k5();
      if (var6.l6() && var4) {
         (var6.l6() ? new com.aspose.slides.ms.System.o5<>((Double)var6.n5(double.class) + 1.0) : new com.aspose.slides.ms.System.o5<>()).n5(var6);
      }

      return var6;
   }

   public static com.aspose.slides.ms.System.o5<Double> n5(com.aspose.slides.ms.System.j5 var0, int var1) {
      com.aspose.slides.ms.System.s4 var2 = new com.aspose.slides.ms.System.s4();
      if (var1 == 0) {
         if (com.aspose.slides.ms.System.j5.k5(var0, n5)) {
            return new com.aspose.slides.ms.System.o5<>();
         }

         com.aspose.slides.ms.System.j5.t2(var0, n5).u3(var2);
      } else {
         if (com.aspose.slides.ms.System.j5.k5(var0, l6)) {
            return new com.aspose.slides.ms.System.o5<>();
         }

         com.aspose.slides.ms.System.j5.t2(var0, l6).u3(var2);
      }

      double var3 = var2.u9() + 1.0;
      if (var1 == 0 && var3 >= 60.0) {
         var3++;
      }

      return new com.aspose.slides.ms.System.o5<>(var3);
   }

   public static com.aspose.slides.ms.System.j5 n5(double var0, int var2) {
      return var2 == 1 ? l6.n5(var0 - 1.0) : n5.n5(var0 - 1.0 - 1.0);
   }
}
