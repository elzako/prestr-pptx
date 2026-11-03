package com.aspose.slides.internal.i0;

public final class d1 extends k5 {
   private n5 n5;

   public final n5 n5() {
      return this.n5;
   }

   public final void n5(n5 var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("SolidColor: {0}", new Object[]{this.n5});
   }

   private boolean n5(d1 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, d1.class) && this.n5((d1)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }

   @Override
   public int u9() {
      return this.n5.u9();
   }
}
