package com.aspose.slides;

class d5w {
   public static float n5(n3y var0, n3y var1, j6m var2) {
      return d0g.n5(var2.n5, var1.l6 + var2.k5, var0.n5 - var2.l6);
   }

   public static float n5(float var0, n3y var1, k6n var2) {
      return d0g.n5(var2.n5, var1.n5 - var2.l6, var2.k5 + var0);
   }

   public static n3y n5(n3y var0, n3y var1, float var2) {
      n3y var3 = new n3y();
      var3.n5 = com.aspose.slides.ms.System.q1.n5((float)(var0.n5), (float)(var1.n5 + var2));
      var3.l6 = com.aspose.slides.ms.System.q1.n5((float)(var0.l6), (float)(var1.l6 - var2));
      return var3;
   }

   public static n3y l6(n3y var0, n3y var1, float var2) {
      n3y var3 = new n3y();
      var3.n5 = com.aspose.slides.ms.System.q1.n5((float)(var0.n5), (float)(var1.n5 - var2));
      var3.l6 = com.aspose.slides.ms.System.q1.n5((float)(var0.l6), (float)(var1.l6 + var2));
      return var3;
   }

   public static n3y n5(n3y var0, n3y var1, n3y var2, float var3, float var4) {
      n3y var5 = new n3y();
      var5.n5 = d0g.n5(var0.n5, var1.n5 - var3, var2.n5 + var4);
      var5.l6 = d0g.n5(var0.l6, var1.l6 + var3, var2.l6 - var4);
      return var5;
   }
}
