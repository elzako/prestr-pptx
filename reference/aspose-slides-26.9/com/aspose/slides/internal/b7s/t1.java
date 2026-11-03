package com.aspose.slides.internal.b7s;

public class t1 extends x9 {
   private final byte n5;
   private final byte[] l6;

   public t1(byte var1, byte[] var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static t1 n5(int var0, int var1, int var2, int var3, byte[] var4, byte[] var5) {
      com.aspose.slides.internal.f8y.n5.n5(var0 >= 0 && var0 <= 65535, "The image width is out of range.");
      com.aspose.slides.internal.f8y.n5.n5(var1 >= 0 && var1 <= 65535, "The image height is out of range.");
      com.aspose.slides.internal.f8y.n5.n5(var2 > 0 && var2 <= 255, "The bitsPerSample is out of range.");
      com.aspose.slides.internal.f8y.n5.n5(var3 > 0 && var3 <= 254, "The component count is out of range.");
      com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();
      var6.writeByte((byte)var2);
      n5(var6, var1 & 65535);
      n5(var6, var0 & 65535);
      var6.writeByte((byte)var3);

      for (int var7 = 0; var7 < var3; var7++) {
         byte var8 = var4 == null ? 1 : var4[var7];
         byte var9 = var5 == null ? 1 : var5[var7];
         int var10 = var8 << 4 | var9;
         var6.writeByte((byte)(var7 + 1));
         var6.writeByte((byte)var10);
         var6.writeByte((byte)0);
      }

      return new t1((byte)-9, var6.toArray());
   }

   public static t1 n5(p8 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      var1.writeByte((byte)1);
      n5(var1, var0.n5() & 65535);
      n5(var1, var0.l6() & 65535);
      n5(var1, var0.k5() & 65535);
      n5(var1, var0.u3() & 65535);
      n5(var1, var0.a6() & 65535);
      return new t1((byte)-8, var1.toArray());
   }

   public static t1 n5(int var0, int var1, int var2, int var3) {
      com.aspose.slides.internal.f8y.n5.n5(var0 >= 0, "The component index must be a non-negative integer.");
      com.aspose.slides.internal.f8y.n5.n5(var1 > 0, "The component coutn must be a positive integer.");
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();
      var4.writeByte((byte)var1);

      for (int var5 = 0; var5 < var1; var5++) {
         var4.writeByte((byte)(var0 + var5));
         var4.writeByte((byte)0);
      }

      var4.writeByte((byte)var2);
      var4.writeByte((byte)var3);
      var4.writeByte((byte)0);
      return new t1((byte)-38, var4.toArray());
   }

   @Override
   public void n5(y0 var1) {
      var1.n5((byte)-1);
      var1.n5(this.n5);
      var1.n5(this.l6.length + 2 & 65535);
      var1.l6(this.l6, 0, this.l6.length);
   }

   private static void n5(com.aspose.slides.internal.z0k.t4 var0, int var1) {
      var0.writeByte((byte)((var1 & 65535) / 256));
      var0.writeByte((byte)((var1 & 65535) % 256));
   }
}
