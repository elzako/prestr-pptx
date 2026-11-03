package com.aspose.slides.internal.b9;

public class j8 extends o5 {
   private com.aspose.slides.internal.t5.h0 n5 = new com.aspose.slides.internal.t5.h0();
   private byte[] l6;

   public j8(o5 var1) {
      super(var1);
   }

   public j8(j8 var1) {
      super(var1);
      this.n5(var1.n5);
      this.k5(var1.h0());
   }

   public final com.aspose.slides.internal.t5.h0 u9() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.t5.h0 var1) {
      this.n5 = var1;
   }

   public final byte[] h0() {
      return this.l6;
   }

   public final void k5(byte[] var1) {
      this.l6 = var1;
   }

   protected final boolean n5(j8 var1) {
      return super.n5(var1) && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((j8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
      return var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }
}
