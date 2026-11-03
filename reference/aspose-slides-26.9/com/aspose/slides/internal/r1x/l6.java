package com.aspose.slides.internal.r1x;

public class l6 {
   private static final int n5 = com.aspose.slides.internal.o9b.c8.w4().h0();
   private static final int l6 = com.aspose.slides.internal.o9b.c8.m3().h0();

   public static int n5() {
      return n5;
   }

   public static int l6() {
      return l6;
   }

   public static com.aspose.slides.internal.o9b.c8[] n5(int[] var0) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.o9b.c8[] var1 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var0.length)
      );

      for (int var2 = 0; var2 < var1.length; var2++) {
         com.aspose.slides.internal.o9b.c8.n5(var0[var2]).n5(var1[var2]);
      }

      return var1;
   }

   public static int[] n5(com.aspose.slides.internal.o9b.c8[] var0) {
      if (var0 == null) {
         return null;
      }

      int[] var1 = new int[var0.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0[var2].h0();
      }

      return var1;
   }

   public static long n5(int var0) {
      int var1 = var0 >> 24 & 0xFF;
      int var2 = var0 >> 16 & 0xFF;
      int var3 = var0 >> 8 & 0xFF;
      int var4 = var0 & 0xFF;
      long var5 = var1 << 8 | var1;
      long var7 = var2 << 8 | var2;
      long var9 = var3 << 8 | var3;
      long var11 = var4 << 8 | var4;
      return var5 << 48 | var7 << 32 | var9 << 16 | var11;
   }
}
