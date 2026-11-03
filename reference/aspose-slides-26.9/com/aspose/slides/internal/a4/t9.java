package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class t9 extends m1 {
   private long n5;
   private com.aspose.slides.internal.i0.u3[] l6;

   public t9() {
      this.l6((short)16397);
   }

   public t9(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return this.m3();
   }

   public final boolean u3() {
      return this.u9(14);
   }

   public final boolean c8() {
      return this.u9(11);
   }

   public final boolean t2() {
      return this.u9(13);
   }

   public final long s7() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.u3[] x8() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i0.u3[] var1) {
      this.l6 = var1;
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
      return d1.n5("{0}, Count: {1}, PointData: {2}", super.toString(), this.n5, var1);
   }

   protected final boolean n5(t9 var1) {
      return this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((t9)obj);
      }
   }

   @Override
   public int hashCode() {
      return (int)this.n5 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 4;
      if (this.x8() != null) {
         for (com.aspose.slides.internal.i0.u3 var5 : this.x8()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }
}
