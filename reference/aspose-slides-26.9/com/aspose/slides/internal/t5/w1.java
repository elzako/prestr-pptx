package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;

public class w1 extends q0 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void k5(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   public final void u3(float var1) {
      this.u3 = var1;
   }

   public final float u9() {
      return this.a6;
   }

   public final void a6(float var1) {
      this.a6 = var1;
   }

   public final float h0() {
      return this.u9;
   }

   public final void u9(float var1) {
      this.u9 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("[M11: {0}, M12: {1}, M21: {2}, M22: {3}, Dx: {4}, Dy: {5}]", this.n5, this.l6, this.k5, this.u3, this.a6, this.u9);
   }

   protected final boolean n5(w1 var1) {
      return n1.l6(this.n5, var1.n5)
         && n1.l6(this.l6, var1.l6)
         && n1.l6(this.k5, var1.k5)
         && n1.l6(this.u3, var1.u3)
         && n1.l6(this.a6, var1.a6)
         && n1.l6(this.u9, var1.u9);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((w1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = n1.n5(this.n5);
      var1 = var1 * 397 ^ n1.n5(this.l6);
      var1 = var1 * 397 ^ n1.n5(this.k5);
      var1 = var1 * 397 ^ n1.n5(this.u3);
      var1 = var1 * 397 ^ n1.n5(this.a6);
      return var1 * 397 ^ n1.n5(this.u9);
   }

   public final com.aspose.slides.internal.x4g.m1 c8() {
      return new com.aspose.slides.internal.x4g.m1(this.n5, this.l6, this.k5, this.u3, this.a6, this.u9);
   }
}
