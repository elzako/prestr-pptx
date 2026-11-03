package com.aspose.slides;

final class o4t {
   private float[] n5 = null;
   private int l6 = -1;
   private int k5 = -1;
   private boolean u3 = false;
   private long a6;

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
      this.u3 = false;
      this.c8();
   }

   public final int l6() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
      this.u3 = false;
      this.c8();
   }

   public final void n5(float var1, float var2, float var3) {
      if (!com.aspose.slides.ms.System.n1.k5(var1 + var2 + var3)) {
         if (this.n5 == null) {
            this.n5 = new float[3];
         }

         this.n5[0] = var1;
         this.n5[1] = var2;
         this.n5[2] = var3;
      } else {
         this.n5 = null;
      }

      this.c8();
   }

   public final float[] k5() {
      return this.n5 != null ? (float[])this.n5.clone() : null;
   }

   final float[] u3() {
      return this.n5;
   }

   final void a6() {
      this.n5 = null;
      this.l6 = -1;
      this.k5 = -1;
      this.c8();
   }

   final void n5(ILightRig var1) {
      this.n5 = var1.getRotation();
      this.l6 = var1.getDirection();
      this.k5 = var1.getLightType();
      this.c8();
   }

   final void n5(ILightRigEffectiveData var1) {
      this.n5 = var1.getRotation();
      this.l6 = var1.getDirection();
      this.k5 = var1.getLightType();
      this.c8();
   }

   final boolean u9() {
      return this.u3;
   }

   final void n5(boolean var1) {
      this.u3 = var1;
   }

   final long h0() {
      return this.a6;
   }

   private void c8() {
      this.a6++;
   }

   @Override
   public boolean equals(Object obj) {
      LightRig var2 = com.aspose.slides.internal.v6g.k5.n5(obj, LightRig.class);
      if (var2 == null) {
         return false;
      }

      float[] var3 = var2.a6();
      if ((this.n5 != null || var3 == null) && (this.n5 == null || var3 != null)) {
         if (this.n5 != null && var3 != null) {
            if (this.n5.length != var3.length) {
               return false;
            }

            for (int var4 = 0; var4 < this.n5.length; var4++) {
               if (this.n5[var4] != var3[var4]) {
                  return false;
               }
            }
         }

         return this.l6 == var2.getDirection() && this.k5 == var2.getLightType();
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 23456;
   }
}
