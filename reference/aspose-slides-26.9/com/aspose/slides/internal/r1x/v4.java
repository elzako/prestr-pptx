package com.aspose.slides.internal.r1x;

import com.aspose.slides.ms.System.d1;

public class v4 {
   private static final v4 n5 = new v4(new int[]{8, 8, 8, 8}, 1, "Rgb32Bpp");
   private static final v4 l6 = new v4(new int[]{8, 8, 8, 8}, 4, "CMYK");
   private static final v4 k5 = new v4(new int[]{8, 8, 8}, 1, "Rgb24Bpp");
   private static final v4 u3 = new v4(new int[]{5, 5, 5, 1}, 1, "Rgb16Bpp555");
   private static final v4 a6 = new v4(new int[]{5, 6, 5}, 1, "Rgb16Bpp565");
   private static final v4 u9 = new v4(new int[]{8}, 1, "RgbIndexed8Bpp");
   private static final v4 h0 = new v4(new int[]{4}, 1, "RgbIndexed4Bpp");
   private static final v4 c8 = new v4(new int[]{2}, 1, "RgbIndexed2Bpp");
   private static final v4 t2 = new v4(new int[]{1}, 1, "RgbIndexed1Bpp");
   private static final v4 s7 = new v4(new int[]{8, 8, 8}, 3, "YCbCr");
   private static final v4 x8 = new v4(new int[]{8}, 0, "Grayscale");
   private static final v4 n3 = new v4(new int[]{8, 8, 8, 8}, 5, "YCCK");
   private static final v4 y4 = new v4(new int[]{8, 8, 8, 8}, 2, "RGBA32Bpp");
   private static final v4 e2 = new v4(new int[]{8, 8, 8}, 2, "RGB24Bpp");
   private static final v4 t9 = new v4(new int[]{8, 8}, 0, "GrayscaleAlpha16Bpp");
   private final int[] z1;
   private int t4;
   private String q0;
   private final int z3;
   private final String m1;

   public v4(int[] var1, int var2, String var3) {
      this.z1 = var1;
      this.z3 = var2;
      this.m1 = var3;
      this.t4 = 0;
      this.q0 = d1.n5(new String[]{var3, ", used channels: "});

      for (int var4 = 0; var4 < var1.length; var4++) {
         this.t4 = this.t4 + var1[var4];
         this.q0 = d1.l6(this.q0, var1[var4]);
         if (var4 < var1.length - 1) {
            this.q0 = d1.l6(this.q0, ',');
         }
      }
   }

   public static v4 n5() {
      return n5;
   }

   public static v4 l6() {
      return l6;
   }

   public static v4 k5() {
      return new v4(new int[]{8, 8, 8, 8, 8}, 4, "CMYK");
   }

   public static v4 u3() {
      return k5;
   }

   public static v4 a6() {
      return u3;
   }

   public static v4 u9() {
      return a6;
   }

   public static v4 h0() {
      return u9;
   }

   public static v4 c8() {
      return h0;
   }

   public static v4 t2() {
      return c8;
   }

   public static v4 s7() {
      return t2;
   }

   public static v4 x8() {
      return s7;
   }

   public static v4 n3() {
      return x8;
   }

   public static v4 y4() {
      return n3;
   }

   public static v4 e2() {
      return y4;
   }

   public static v4 t9() {
      return e2;
   }

   public static v4 z1() {
      return t9;
   }

   public final int t4() {
      return this.z3;
   }

   public final int q0() {
      return this.t4;
   }

   public final int z3() {
      return this.z1.length;
   }

   public final int[] m1() {
      int[] var1 = new int[this.z1.length];
      System.arraycopy(this.z1, 0, var1, 0, this.z1.length);
      return var1;
   }

   public final String k7() {
      return this.m1;
   }

   public static v4 n5(int var0) {
      return var0 == 8 ? x8 : new v4(new int[]{var0}, 0, "Grayscale");
   }

   public static v4 l6(int var0) {
      return var0 == 8 ? e2 : new v4(new int[]{var0, var0, var0}, 2, "RGB");
   }

   public static v4 k5(int var0) {
      return var0 == 8 ? s7 : new v4(new int[]{var0, var0, var0}, 3, "YCbCr");
   }

   public static v4 u3(int var0) {
      return var0 == 8 ? l6 : new v4(new int[]{var0, var0, var0, var0}, 4, "CMYK");
   }

   public static v4 a6(int var0) {
      return var0 == 8 ? n3 : new v4(new int[]{var0, var0, var0, var0}, 5, "YCCK");
   }

   public static boolean n5(v4 var0, v4 var1) {
      boolean var2 = false;
      if (!com.aspose.slides.ms.System.j8.l6(var0, null) && !com.aspose.slides.ms.System.j8.l6(var1, null)) {
         var2 = d1.a6(var0.q0, var1.q0);
      } else if (com.aspose.slides.ms.System.j8.l6(var0, null) && com.aspose.slides.ms.System.j8.l6(var1, null)) {
         var2 = true;
      }

      return var2;
   }

   @Override
   public boolean equals(Object obj) {
      boolean var2 = false;
      if (com.aspose.slides.internal.v6g.k5.l6(obj, v4.class)) {
         v4 var3 = (v4)obj;
         var2 = d1.a6(var3.q0, this.q0);
      }

      return var2;
   }

   @Override
   public int hashCode() {
      return this.q0.hashCode();
   }

   @Override
   public String toString() {
      return this.q0;
   }
}
