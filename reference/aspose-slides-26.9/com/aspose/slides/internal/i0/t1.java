package com.aspose.slides.internal.i0;

public class t1 extends y8 {
   private int n5;
   private p3 l6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final p3 l6() {
      return this.l6;
   }

   public final void n5(p3 var1) {
      this.l6 = var1;
   }

   protected final boolean n5(t1 var1) {
      return this.n5() == var1.n5() && com.aspose.slides.ms.System.j8.n5(this.l6(), var1.l6());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((t1)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5() * 397 ^ (this.l6() != null ? this.l6().hashCode() : 0);
   }

   @Override
   public int u9() {
      return this.l6() != null ? 4 + this.l6().u9() : 4;
   }
}
