package com.aspose.slides.internal.g9;

public class n3 extends a6 {
   private u3 l6;
   public static final n3 n5 = new n3();

   public static String n5() {
      return "DeviceRGB";
   }

   public static String l6() {
      return "RGB";
   }

   @Override
   public String u3() {
      return n5();
   }

   @Override
   public int a6() {
      return 3;
   }

   @Override
   public float[] n5(float[] var1) {
      return var1;
   }

   @Override
   public u3 k5() {
      if (this.l6 == null) {
         this.l6 = new u3(new float[]{0.0F, 0.0F, 0.0F}, this);
      }

      return this.l6;
   }
}
