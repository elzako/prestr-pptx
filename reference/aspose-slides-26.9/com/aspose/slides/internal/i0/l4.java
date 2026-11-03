package com.aspose.slides.internal.i0;

public final class l4 extends y8 {
   private a7 n5;
   private o0 l6;

   public final a7 n5() {
      return this.n5;
   }

   public final void n5(a7 var1) {
      this.n5 = var1;
   }

   public final o0 l6() {
      return this.l6;
   }

   public final void n5(o0 var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("TransformMatrix: {0}, ImageObject: [{1}]", this.n5, this.l6);
   }

   private boolean n5(l4 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, l4.class) && this.n5((l4)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? this.n5.hashCode() : 0) * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 0;
      if (this.n5 != null) {
         var1 += this.n5.u9();
      }

      if (this.l6 != null) {
         var1 += this.l6.u9();
      }

      return var1;
   }
}
