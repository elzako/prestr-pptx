package com.aspose.slides.internal.t9z;

import com.aspose.slides.internal.o9b.m3;

public class h0 {
   private final m3 n5;
   private final float l6;
   private final float k5;

   public h0(m3 var1, float var2) {
      this.n5 = (m3)var1.deepClone();
      this.k5 = var2;
      this.l6 = this.n5.q0();
      if (this.n5.q0() < this.k5) {
         this.n5.k5(this.k5);
      }
   }

   public m3 n5() {
      return this.n5;
   }

   public float l6() {
      return this.l6;
   }

   public float k5() {
      return this.l6 > 0.0F ? this.l6 : 1.0F;
   }

   public float u3() {
      return this.k5;
   }
}
