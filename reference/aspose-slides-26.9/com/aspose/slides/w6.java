package com.aspose.slides;

final class w6 {
   private float n5;
   private float l6;
   private int k5;
   private float[] u3 = null;
   private final h8 a6;
   private long u9;

   w6(h8 var1) {
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.k5 = -1;
      this.u3 = null;
      this.a6 = var1;
   }

   public final int n5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
      this.a6().l6(true);
      this.t2();
   }

   public final float l6() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
      this.t2();
   }

   public final float k5() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
      this.t2();
   }

   public final void n5(float var1, float var2, float var3) {
      if (!com.aspose.slides.ms.System.n1.k5(var1 + var2 + var3)) {
         if (this.u3 == null) {
            this.u3 = new float[3];
         }

         this.u3[0] = var1;
         this.u3[1] = var2;
         this.u3[2] = var3;
      } else {
         this.u3 = null;
      }

      this.t2();
   }

   public final float[] u3() {
      return this.u3 != null ? (float[])this.u3.clone() : null;
   }

   final h8 a6() {
      return this.a6;
   }

   final float[] u9() {
      return this.u3;
   }

   final void h0() {
      this.u3 = null;
      this.n5(-1);
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.t2();
   }

   final void n5(Camera var1) {
      this.u3 = var1.getRotation();
      this.n5(var1.getCameraType());
      this.n5 = var1.getFieldOfViewAngle();
      this.l6 = var1.getZoom();
      this.t2();
   }

   final void n5(ICameraEffectiveData var1) {
      this.u3 = var1.getRotation();
      this.n5(var1.getCameraType());
      this.n5 = var1.getFieldOfViewAngle();
      this.l6 = var1.getZoom();
      this.t2();
   }

   final long c8() {
      return this.u9;
   }

   private void t2() {
      this.u9++;
   }

   @Override
   public boolean equals(Object obj) {
      Camera var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Camera.class);
      if (var2 == null) {
         return super.equals(obj);
      }

      float[] var3 = var2.a6();
      if ((this.u3 != null || var3 == null) && (this.u3 == null || var3 != null)) {
         if (this.u3 != null && var3 != null) {
            if (this.u3.length != var3.length) {
               return false;
            }

            for (int var4 = 0; var4 < this.u3.length; var4++) {
               if (this.u3[var4] != var3[var4]) {
                  return false;
               }
            }
         }

         return this.n5 == var2.getFieldOfViewAngle() && this.l6 == var2.getZoom() && this.k5 == var2.getCameraType();
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 23456;
   }
}
