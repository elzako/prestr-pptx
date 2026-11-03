package com.aspose.slides.internal.l5;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class n5 extends k5 {
   public final boolean n5() {
      return ((com.aspose.slides.internal.x4g.l6)this.n5).l6();
   }

   public final float l6() {
      return ((com.aspose.slides.internal.x4g.l6)this.n5).n5();
   }

   public final float k5() {
      return ((com.aspose.slides.internal.x4g.l6)this.n5).k5();
   }

   public final float u3() {
      return ((com.aspose.slides.internal.x4g.l6)this.n5).u3();
   }

   @Override
   public String toString() {
      return d1.n5("Filled: {0}, Height: {1}, MiddleInset: {2}, Width: {3}", this.n5(), this.l6(), this.k5(), this.u3());
   }

   protected final boolean n5(n5 var1) {
      return this.n5.equals(var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((n5)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }
}
