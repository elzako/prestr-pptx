package com.aspose.slides.internal.b9;

public class r6 extends s2 {
   private long n5;

   public r6(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   protected final boolean n5(r6 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((r6)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (int)this.n5;
   }
}
