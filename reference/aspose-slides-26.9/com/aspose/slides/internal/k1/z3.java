package com.aspose.slides.internal.k1;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public class z3 extends com.aspose.slides.internal.y6.u3 {
   private short n5;
   private short l6;

   public final short n5() {
      return this.n5;
   }

   public final void n5(short var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void l6(short var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.o9b.w1 k5() {
      return new com.aspose.slides.internal.o9b.w1(this.n5, this.l6);
   }

   public final com.aspose.slides.internal.o9b.j5 u3() {
      return new com.aspose.slides.internal.o9b.j5(this.n5, this.l6);
   }

   @Override
   public String toString() {
      return d1.n5("[X: {0}, Y: {1}]",new Object[]{ this.n5, this.l6});
   }

   protected final boolean n5(z3 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((z3)obj);
      }
   }

   @Override
   public int hashCode() {
      return f0.n5(this.n5) * 397 ^ f0.n5(this.l6);
   }
}
