package com.aspose.slides.internal.l5;

import com.aspose.slides.ms.System.j8;

public final class h0 extends l6 {
   private com.aspose.slides.internal.x4g.n3 n5;

   private h0() {
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.n5.h0();
   }

   public final com.aspose.slides.internal.o9b.c8 k5() {
      return this.n5.c8();
   }

   public final int u3() {
      return this.n5.t2();
   }

   @Override
   public com.aspose.slides.internal.o9b.u3 n5() {
      return this.n5;
   }

   @Override
   public Object deepClone() {
      h0 var1 = new h0();
      var1.n5 = (com.aspose.slides.internal.x4g.n3)this.n5.deepClone();
      return var1;
   }

   @Override
   public void dispose() {
      this.n5.dispose();
   }

   private boolean n5(h0 var1) {
      return j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else {
         return j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, h0.class) && this.n5((h0)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }
}
