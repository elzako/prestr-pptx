package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class q0 extends m1 {
   private long n5;
   private com.aspose.slides.internal.i0.a6[] l6;

   public q0() {
      this.l6((short)16395);
   }

   public q0(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final byte u3() {
      return this.m3();
   }

   public final long c8() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.a6[] t2() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i0.a6[] var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (com.aspose.slides.internal.i0.a6 var5 : this.t2()) {
         var1.n5(d1.n5(new String[]{var5.toString(), ", "}));
      }

      return d1.n5("{0}, Count: {1}, RectData: {2}",new Object[]{ super.toString(), this.n5, var1.toString()});
   }

   protected final boolean n5(q0 var1) {
      return this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((q0)obj);
      }
   }

   @Override
   public int hashCode() {
      return (int)this.n5 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 4;

      for (com.aspose.slides.internal.i0.a6 var5 : this.t2()) {
         var1 += var5.u9();
      }

      return var1;
   }
}
