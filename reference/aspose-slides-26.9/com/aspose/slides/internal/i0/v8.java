package com.aspose.slides.internal.i0;

public final class v8 extends u3 {
   private int n5;
   private int l6;

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.n5;
   }

   public final void l6(int var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("X: {0}, Y: {1}",new Object[]{ this.n5, this.l6});
   }

   private boolean n5(v8 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, v8.class) && this.n5((v8)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ this.l6;
   }

   @Override
   public int u9() {
      return 8;
   }
}
