package com.aspose.slides.internal.b9;

public class e5 extends g7 {
   private long n5;
   private com.aspose.slides.internal.t5.x8 l6;

   public e5(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.t5.x8 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.t5.x8 var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}, IhFonts: {1}, Elw: {2}", super.toString(), this.n5(), this.l6());
   }

   protected final boolean n5(e5 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((e5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      return var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
   }
}
