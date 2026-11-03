package com.aspose.slides.internal.i0;

public final class e2 extends n3 {
   private int n5;
   private s0[] l6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final s0[] l6() {
      return this.l6;
   }

   public final void n5(s0[] var1) {
      this.l6 = var1;
   }

   private boolean n5(e2 var1) {
      return this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, e2.class) && this.n5((e2)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }

   @Override
   public int u9() {
      return 4 + this.n5 * 8;
   }
}
