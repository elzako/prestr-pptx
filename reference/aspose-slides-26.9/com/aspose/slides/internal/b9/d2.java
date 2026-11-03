package com.aspose.slides.internal.b9;

public class d2 extends f2 {
   private long n5;
   private byte[] l6;

   public d2(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final byte[] l6() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   protected final boolean n5(d2 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((d2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      return var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }
}
