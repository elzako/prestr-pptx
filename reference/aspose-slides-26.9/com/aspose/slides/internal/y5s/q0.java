package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.d1;

public class q0 {
   private final int[] n5;
   private final int l6;
   private String k5;
   private final int u3;

   private q0(int[] var1, int var2, int var3, String var4) {
      this.u3 = var3;
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = d1.n5(this.k5, d1.n5(new String[]{var4, ", used channels: "}));

      for (int var5 = 0; var5 < this.n5.length; var5++) {
         this.k5 = d1.n5(this.k5, com.aspose.slides.internal.v6g.k5.l6(this.n5[var5]));
         if (var5 < this.n5.length - 1) {
            this.k5 = d1.n5(this.k5, com.aspose.slides.internal.v6g.k5.n5(','));
         }
      }
   }

   public static q0 n5() {
      return new q0(new int[]{8, 8, 8, 8}, 32, 1, "Rgb32Bpp");
   }

   public static q0 l6() {
      return new q0(new int[]{8, 8, 8}, 24, 1, "Rgb24Bpp");
   }

   public static q0 k5() {
      return new q0(new int[]{8}, 8, 1, "RgbIndexed8Bpp");
   }

   public static q0 u3() {
      return new q0(new int[]{4}, 4, 1, "RgbIndexed4Bpp");
   }

   public static q0 a6() {
      return new q0(new int[]{2}, 2, 1, "RgbIndexed2Bpp");
   }

   public static q0 u9() {
      return new q0(new int[]{1}, 1, 1, "RgbIndexed1Bpp");
   }

   public int h0() {
      return this.l6;
   }

   public static q0 c8() {
      return new q0(new int[]{8}, 8, 0, "Grayscale");
   }

   public static q0 t2() {
      return new q0(new int[]{8, 8, 8, 8}, 32, 2, "RGBA32Bpp");
   }

   public static q0 s7() {
      return new q0(new int[]{8, 8, 8}, 24, 2, "RGB24Bpp");
   }

   public static q0 x8() {
      return new q0(new int[]{8, 8}, 16, 0, "GrayscaleAlpha16Bpp");
   }

   @Override
   public boolean equals(Object obj) {
      boolean var2 = false;
      if (com.aspose.slides.internal.v6g.k5.l6(obj, q0.class)) {
         q0 var3 = (q0)obj;
         var2 = d1.a6(var3.k5, this.k5);
      }

      return var2;
   }

   @Override
   public int hashCode() {
      return this.k5.hashCode();
   }

   @Override
   public String toString() {
      return this.k5;
   }
}
