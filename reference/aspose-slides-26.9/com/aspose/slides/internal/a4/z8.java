package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class z8 extends y2 {
   private float n5;
   private int l6;
   private com.aspose.slides.internal.i0.u3[] k5;

   public z8() {
      this.l6((short)16406);
   }

   public z8(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final boolean u3() {
      return this.u9(13);
   }

   public final boolean c8() {
      return this.u9(11);
   }

   public final float t2() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final int s7() {
      return this.l6;
   }

   public final void k5(int var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.i0.u3[] x8() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.i0.u3[] var1) {
      this.k5 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("[");

      for (com.aspose.slides.internal.i0.u3 var5 : this.x8()) {
         var1.n5(var5);
         var1.n5(", ");
      }

      var1.n5("]");
      return d1.n5("{0}, Tension: {1}, Count: {2}, PointData: {3}", super.toString(), this.n5, this.l6, var1);
   }

   protected final boolean n5(z8 var1) {
      return super.n5(var1) && n1.l6(this.n5, var1.n5) && this.l6 == var1.l6 && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((z8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.y4();
      var1 = var1 * 397 ^ n1.n5(this.n5);
      var1 = var1 * 397 ^ this.l6;
      return var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 12;
      if (this.x8() != null) {
         for (com.aspose.slides.internal.i0.u3 var5 : this.x8()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }
}
