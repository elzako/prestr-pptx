package com.aspose.slides.internal.i0;

public class y1 extends y8 {
   private d5 n5;
   private t1 l6;

   public final d5 n5() {
      return this.n5;
   }

   public final void n5(d5 var1) {
      this.n5 = var1;
   }

   public final t1 l6() {
      return this.l6;
   }

   public final void n5(t1 var1) {
      this.l6 = var1;
   }

   protected final boolean n5(y1 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((y1)obj);
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
