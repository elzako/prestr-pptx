package com.aspose.slides.internal.b9;

public abstract class f2 extends s9 {
   private int n5;

   protected f2(s9 var1) {
      super(var1);
   }

   public final int k5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   protected final boolean n5(f2 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((f2)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ this.n5 & 65535;
   }
}
