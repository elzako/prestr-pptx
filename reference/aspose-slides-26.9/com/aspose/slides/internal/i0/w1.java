package com.aspose.slides.internal.i0;

public class w1 extends y8 {
   private r4 n5;
   private int l6;

   public final r4 n5() {
      return this.n5;
   }

   public final void n5(r4 var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("CustomEndCap: {0}, CustomEndCapSize: {1}", this.n5, this.l6);
   }

   protected final boolean n5(w1 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((w1)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? this.n5.hashCode() : 0) * 397 ^ this.l6;
   }

   @Override
   public int u9() {
      return this.n5 != null ? 4 + this.n5.u9() : 4;
   }
}
