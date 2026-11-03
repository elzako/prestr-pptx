package com.aspose.slides.internal.i0;

public class t4 extends y8 {
   private int n5;
   private int l6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   protected final boolean n5(t4 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((t4)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ this.l6;
   }

   @Override
   public int u9() {
      return 8;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("First: {0}, Length: {1}",new Object[]{ this.n5, this.l6});
   }

   public final com.aspose.slides.internal.o9b.u9 k5() {
      return new com.aspose.slides.internal.o9b.u9(this.n5(), this.l6());
   }
}
