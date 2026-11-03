package com.aspose.slides.internal.g9;

public class k5 extends n5 {
   private com.aspose.slides.internal.v2.n5 n5;
   private com.aspose.slides.internal.v2.k5 l6;
   private u3 k5;

   @Override
   public com.aspose.slides.internal.v2.n5 n5() {
      return this.n5;
   }

   public static String l6() {
      return "CalRGB";
   }

   @Override
   public u3 k5() {
      if (this.k5 == null) {
         this.k5 = new u3(new float[]{0.0F}, this);
      }

      return this.k5;
   }

   public k5() {
      this.n5 = new com.aspose.slides.internal.v2.n5();
      this.l6 = new com.aspose.slides.internal.v2.k5();
      this.n5.n5(com.aspose.slides.internal.v2.c8.p3);
      this.n5.n5(this.l6);
   }

   public k5(com.aspose.slides.internal.v2.n5 var1) {
      this.n5 = var1;
      this.l6 = (com.aspose.slides.internal.v2.k5)var1.l6(1);
   }

   @Override
   public String u3() {
      return l6();
   }

   @Override
   public int a6() {
      return 3;
   }

   @Override
   public float[] n5(float[] var1) {
      return new float[]{var1[0], var1[0], var1[0]};
   }
}
