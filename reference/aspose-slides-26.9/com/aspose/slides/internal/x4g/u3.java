package com.aspose.slides.internal.x4g;

public final class u3 {
   private float[] l6;
   private float[] k5;
   boolean n5 = false;

   public u3() {
      this.l6 = new float[1];
      this.k5 = new float[1];
   }

   public u3(int var1) {
      this.l6 = new float[var1];
      this.k5 = new float[var1];
   }

   void n5() {
      this.n5 = true;
   }

   public float[] l6() {
      return this.k5;
   }

   public float[] k5() {
      return this.l6;
   }

   public void n5(float[] var1) {
      if (!this.n5) {
         this.k5 = var1;
      }
   }

   public void l6(float[] var1) {
      if (!this.n5) {
         this.l6 = var1;
      }
   }

   void k5(float[] var1) {
      this.k5 = var1;
   }

   void u3(float[] var1) {
      this.l6 = var1;
   }
}
