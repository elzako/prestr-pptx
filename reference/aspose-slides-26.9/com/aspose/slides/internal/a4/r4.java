package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class r4 extends y2 {
   private float n5;
   private float l6;
   private com.aspose.slides.internal.i0.a6 k5;

   public r4() {
      this.l6((short)16400);
   }

   public r4(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final float u3() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1 < 0.0F ? 360.0F + var1 : var1;
   }

   public final float c8() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.i0.a6 t2() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.i0.a6 var1) {
      this.k5 = var1;
   }

   protected final boolean n5(r4 var1) {
      return this.y4() == var1.y4() && n1.l6(this.n5, var1.n5) && n1.l6(this.l6, var1.l6) && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((r4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.y4();
      var1 = var1 * 397 ^ n1.n5(this.n5);
      var1 = var1 * 397 ^ n1.n5(this.l6);
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }

   @Override
   public String toString() {
      return d1.n5("{0}, StartAngle: {1}, SweepAngle: {2}, RectData: {3}", super.toString(), this.n5, this.l6, this.k5);
   }

   @Override
   public int u9() {
      return 12 + this.k5.u9();
   }
}
