package com.aspose.slides.internal.w2i;

public class s7 {
   private com.aspose.slides.internal.z0k.n5 n5;

   public s7(com.aspose.slides.internal.z0k.t4 var1) {
      var1.setPosition(0L);
      this.n5 = new com.aspose.slides.internal.z0k.n5(var1);
   }

   public final byte n5() {
      return this.n5.z1();
   }

   public final int l6() {
      return u9(this.n5.r4());
   }

   public final long k5() {
      return l6(this.n5.c4());
   }

   public final long u3() {
      return k5(this.n5.y2());
   }

   public final byte[] n5(int var1) {
      return this.n5.c8(var1);
   }

   public final float[] l6(int var1) {
      float[] var2 = new float[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = (this.n5() & 0xFF) / 255.0F;
      }

      return var2;
   }

   public final float[] k5(int var1) {
      float[] var2 = new float[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = (this.l6() & 65535) / 65535.0F;
      }

      return var2;
   }

   public final float[] u3(int var1) {
      float[] var2 = new float[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = (int)this.k5() / 65536.0F;
      }

      return var2;
   }

   public final long[] a6(int var1) {
      long[] var2 = new long[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = this.k5();
      }

      return var2;
   }

   private static int u9(int var0) {
      byte[] var1 = com.aspose.slides.ms.System.x8.n5(var0);
      return ((var1[0] & 0xFF) << 8 | var1[1] & 0xFF) & 65535;
   }

   private static long l6(long var0) {
      byte[] var2 = com.aspose.slides.ms.System.x8.n5(var0);
      com.aspose.slides.ms.System.u3.u3(com.aspose.slides.ms.System.u3.n5((Object)(var2)));
      return com.aspose.slides.ms.System.x8.l6(var2, 0);
   }

   private static long k5(long var0) {
      byte[] var2 = com.aspose.slides.ms.System.x8.k5(var0);
      com.aspose.slides.ms.System.u3.u3(com.aspose.slides.ms.System.u3.n5((Object)(var2)));
      return com.aspose.slides.ms.System.x8.k5(var2, 0);
   }

   public final long a6() {
      return this.n5.x8().getPosition();
   }

   public final void n5(long var1) {
      this.n5.x8().setPosition(var1);
   }
}
