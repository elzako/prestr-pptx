package com.aspose.slides.internal.l5;

import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.ms.System.j8;

public final class y4 extends l6 {
   private i1 n5;

   public y4(com.aspose.slides.internal.o9b.c8 var1) {
      this.n5 = new i1(var1.o8());
   }

   private y4() {
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.n5.h0();
   }

   @Override
   public com.aspose.slides.internal.o9b.u3 n5() {
      return this.n5;
   }

   @Override
   public Object deepClone() {
      y4 var1 = new y4();
      var1.n5 = (i1)this.n5.deepClone();
      return var1;
   }

   @Override
   public void dispose() {
      this.n5.dispose();
   }

   private boolean n5(y4 var1) {
      return j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else {
         return j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, y4.class) && this.n5((y4)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }
}
