package com.aspose.slides.internal.i0;

public class f5 extends y8 {
   private y8 n5;
   private long l6;

   public final y8 n5() {
      return this.n5;
   }

   public final void n5(y8 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   protected final boolean n5(f5 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((f5)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? this.n5.hashCode() : 0) * 397 ^ (int)this.l6;
   }

   @Override
   public int u9() {
      int var1 = 4;
      if (this.n5 != null) {
         var1 += this.n5.u9();
      }

      return var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "[Type: {1}, RegionNodeData: {0}]", this.n5, com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.i1.class, this.l6)
      );
   }
}
