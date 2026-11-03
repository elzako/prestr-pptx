package com.aspose.slides.internal.l5;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.v4;

public class k5 implements IDisposable, v4 {
   protected com.aspose.slides.internal.x4g.u9 n5;
   private com.aspose.slides.internal.x4g.s7 l6;
   private com.aspose.slides.internal.x4g.s7 k5;

   protected k5() {
   }

   public final int a6() {
      return this.n5.u9();
   }

   public final float u9() {
      return this.n5.c8();
   }

   public final int h0() {
      return this.n5.h0();
   }

   public final float c8() {
      return this.n5.t2();
   }

   public final com.aspose.slides.internal.x4g.s7 t2() {
      return this.l6;
   }

   public final com.aspose.slides.internal.x4g.s7 s7() {
      return this.k5;
   }

   public final void n5(int[] var1, int[] var2) {
      this.n5.n5(var1, var2);
   }

   @Override
   public final Object deepClone() {
      k5 var1 = new k5();
      var1.n5 = (com.aspose.slides.internal.x4g.u9)this.n5.deepClone();
      var1.l6 = (com.aspose.slides.internal.x4g.s7)this.l6.deepClone();
      var1.k5 = (com.aspose.slides.internal.x4g.s7)this.k5.deepClone();
      return var1;
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
      this.l6.dispose();
      this.k5.dispose();
   }

   protected final boolean n5(k5 var1) {
      return j8.n5(this.n5, var1.n5) && j8.n5(this.l6, var1.l6) && j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((k5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }
}
