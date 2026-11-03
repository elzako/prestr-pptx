package com.aspose.slides;

class r2t implements x4j {
   private final com.aspose.slides.internal.o9b.l6 n5;
   private final com.aspose.slides.internal.o9b.l6 l6;
   private float k5;

   public r2t(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      this.k5 = var1;
      com.aspose.slides.internal.o9.n5.n5(this.n5, this.l6, new r2t$1(this));
      var2.l6(this.n5, 0, 0);
   }

   private int n5(int var1, int var2) {
      return n5(var1, var2, this.k5);
   }

   static int n5(int var0, int var1, float var2) {
      com.aspose.slides.internal.w0.n5 var3 = com.aspose.slides.internal.w0.n5.n5(var0).k5();
      com.aspose.slides.internal.w0.n5 var4 = com.aspose.slides.internal.w0.n5.n5(var1).k5();
      com.aspose.slides.internal.w0.n5 var5 = new com.aspose.slides.internal.w0.n5();
      float var6 = 1.0F - var2;
      var5.l6 = com.aspose.slides.internal.v6g.k5.n5((Object)((var3.l6 & 0xFF) * var6 + (var4.l6 & 0xFF) * var2), 13);
      var5.k5 = com.aspose.slides.internal.v6g.k5.n5((Object)((var3.k5 & 0xFF) * var6 + (var4.k5 & 0xFF) * var2), 13);
      var5.u3 = com.aspose.slides.internal.v6g.k5.n5((Object)((var3.u3 & 0xFF) * var6 + (var4.u3 & 0xFF) * var2), 13);
      var5.a6 = com.aspose.slides.internal.v6g.k5.n5((Object)((var3.a6 & 0xFF) * var6 + (var4.a6 & 0xFF) * var2), 13);
      return var5.l6();
   }

   // $VF: synthetic method
   static int n5(r2t var0, int var1, int var2) {
      return var0.n5(var1, var2);
   }
}
