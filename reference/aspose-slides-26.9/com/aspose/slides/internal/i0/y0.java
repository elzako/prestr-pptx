package com.aspose.slides.internal.i0;

public class y0 extends y8 {
   private a7 n5;
   private c8 l6;
   private s3 k5;

   public final a7 n5() {
      return this.n5;
   }

   public final void n5(a7 var1) {
      this.n5 = var1;
   }

   public final c8 l6() {
      return this.l6;
   }

   public final void n5(c8 var1) {
      this.l6 = var1;
   }

   public final s3 k5() {
      return this.k5;
   }

   public final void n5(s3 var1) {
      this.k5 = var1;
   }

   protected final boolean n5(y0 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5)
         && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6)
         && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((y0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 0;
      if (this.n5 != null) {
         var1 += this.n5.u9();
      }

      if (this.k5 != null) {
         var1 += this.k5.u9();
      }

      if (this.l6() != null) {
         var1 += this.l6.u9();
      }

      return var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("TransformMatrix: {0}, BlendPattern: {1}, FocusScaleData: {2}", this.n5, this.l6, this.k5);
   }
}
