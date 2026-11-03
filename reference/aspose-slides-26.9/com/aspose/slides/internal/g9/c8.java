package com.aspose.slides.internal.g9;

public class c8 extends a6 {
   private u3 l6;
   public static final c8 n5 = new c8();

   public static String n5() {
      return "DeviceCMYK";
   }

   public static String l6() {
      return "CMYK";
   }

   @Override
   public u3 k5() {
      if (this.l6 == null) {
         this.l6 = new u3(new float[]{0.0F, 0.0F, 0.0F, 1.0F}, this);
      }

      return this.l6;
   }

   @Override
   public String u3() {
      return n5();
   }

   @Override
   public int a6() {
      return 4;
   }

   @Override
   public float[] n5(float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      float var5 = var1[3];
      float var6 = (1.0F - var2) * (1.0F - var5);
      float var7 = (1.0F - var3) * (1.0F - var5);
      float var8 = (1.0F - var4) * (1.0F - var5);
      return new float[]{var6, var7, var8};
   }
}
