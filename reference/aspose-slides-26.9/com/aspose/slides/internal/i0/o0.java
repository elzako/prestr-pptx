package com.aspose.slides.internal.i0;

public final class o0 extends f2 {
   private l6 n5;
   private long l6;

   public final l6 n5() {
      return this.n5;
   }

   public final void n5(l6 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, ImageData: {1}, Type: {2}", super.toString(), this.n5, com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t9.class, this.l6)
      );
   }

   private boolean n5(o0 var1) {
      return super.n5(var1) && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, o0.class) && this.n5((o0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
      return var1 * 397 ^ (int)this.l6;
   }

   @Override
   public int u9() {
      return 8 + this.n5.u9();
   }
}
