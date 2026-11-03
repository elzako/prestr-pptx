package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class s7 extends m1 {
   private int n5;
   private int l6;
   private float k5;
   private int u3;
   private com.aspose.slides.internal.i0.u3[] a6;

   public s7() {
      this.l6((short)16408);
   }

   public s7(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final byte u3() {
      return this.m3();
   }

   public final float c8() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   public final int t2() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1;
   }

   public final int s7() {
      return this.l6;
   }

   public final void u3(int var1) {
      this.l6 = var1;
   }

   public final int x8() {
      return this.u3;
   }

   public final void a6(int var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.i0.u3[] n3() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.i0.u3[] var1) {
      this.a6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("[");

      for (com.aspose.slides.internal.i0.u3 var5 : this.a6) {
         var1.n5(var5);
         var1.n5(", ");
      }

      var1.n5("]");
      return d1.n5("{0}, Offset: {1}, NumSegments: {2}, Tension: {3}, Count: {4}, PointData: {5}", super.toString(), this.n5, this.l6, this.k5, this.u3, var1);
   }

   protected final boolean n5(s7 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && n1.l6(this.k5, var1.k5) && this.u3 == var1.u3 && com.aspose.slides.internal.y6.c8.n5(this.a6, var1.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((s7)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ n1.n5(this.k5);
      var1 = var1 * 397 ^ this.u3;
      return var1 * 397 ^ (this.a6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.a6)).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 16;
      if (this.a6 != null) {
         for (com.aspose.slides.internal.i0.u3 var5 : this.n3()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }
}
