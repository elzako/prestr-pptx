package com.aspose.slides.internal.i0;

public class x8 extends v4 {
   private float n5;
   private boolean l6;

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   protected final boolean n5(x8 var1) {
      return com.aspose.slides.ms.System.n1.l6(this.n5, var1.n5) && com.aspose.slides.ms.System.n3.l6(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((x8)obj);
      }
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.ms.System.n1.n5(this.n5) * 397 ^ com.aspose.slides.ms.System.n3.n5(this.l6);
   }

   @Override
   public int u9() {
      return 8;
   }
}
