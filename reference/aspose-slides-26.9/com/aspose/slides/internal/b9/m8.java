package com.aspose.slides.internal.b9;

public class m8 extends s2 {
   private long n5;
   private com.aspose.slides.internal.t5.j5[] l6;
   private byte[] k5;

   public m8(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.t5.j5[] l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.t5.j5[] var1) {
      this.l6 = var1;
   }

   public final byte[] k5() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   protected final boolean n5(m8 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6)
         && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((m8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
   }
}
