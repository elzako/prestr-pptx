package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class c8 extends m1 {
   private int n5;
   private com.aspose.slides.internal.i0.u3[] l6;

   public c8() {
      this.l6((short)16409);
   }

   public c8(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final boolean u3() {
      return this.u9(11);
   }

   public final byte c8() {
      return this.m3();
   }

   public final int t2() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.u3[] s7() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i0.u3[] var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("[");

      for (com.aspose.slides.internal.i0.u3 var5 : this.l6) {
         var1.n5(var5);
         var1.n5(", ");
      }

      var1.n5("]");
      return d1.n5("{0}, Count: {1}, PointData: {2}", super.toString(), this.n5, var1);
   }

   protected final boolean n5(c8 var1) {
      return this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((c8)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 4;
      if (this.l6 != null) {
         for (com.aspose.slides.internal.i0.u3 var5 : this.s7()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }
}
