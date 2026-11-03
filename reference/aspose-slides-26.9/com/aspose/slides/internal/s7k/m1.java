package com.aspose.slides.internal.s7k;

public class m1 {
   private com.aspose.slides.internal.z0k.n5 n5;

   public m1(com.aspose.slides.internal.z0k.t4 var1) {
      var1.setPosition(0L);
      this.n5 = new com.aspose.slides.internal.z0k.n5(var1);
   }

   public byte n5() {
      return this.n5.z1();
   }

   public int l6() {
      return u9(this.n5.r4());
   }

   public long k5() {
      return l6(this.n5.c4());
   }

   public long u3() {
      return k5(this.n5.y2());
   }

   public byte[] n5(int var1) {
      return this.n5.c8(var1);
   }

   public float[] l6(int var1) {
      float[] var2 = new float[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = com.aspose.slides.internal.v6g.k5.c8(this.n5(), 6) / 255.0F;
      }

      return var2;
   }

   public float[] k5(int var1) {
      float[] var2 = new float[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = com.aspose.slides.internal.v6g.k5.c8(this.l6(), 8) / 65535.0F;
      }

      return var2;
   }

   public float[] u3(int var1) {
      float[] var2 = new float[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = com.aspose.slides.internal.v6g.k5.u3(this.k5(), 10) / 65536.0F;
      }

      return var2;
   }

   public long[] a6(int var1) {
      long[] var2 = new long[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = this.k5();
      }

      return var2;
   }

   private static int u9(int var0) {
      byte[] var1 = com.aspose.slides.ms.System.x8.n5(var0);
      return com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var1[1], 6), 9);
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

   public long a6() {
      return this.n5.x8().getPosition();
   }

   public void n5(long var1) {
      this.n5.x8().setPosition(var1);
   }
}
