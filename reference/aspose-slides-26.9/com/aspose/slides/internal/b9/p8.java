package com.aspose.slides.internal.b9;

public class p8 extends k7 {
   private long n5;
   private long l6;
   private byte[] k5;
   private int[] u3;
   private com.aspose.slides.internal.t5.t9[] a6;
   private long u9;

   public p8(s9 var1) {
      super(var1);
   }

   public p8(com.aspose.slides.internal.d9.n5 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final int[] k5() {
      return this.u3;
   }

   public final void n5(int[] var1) {
      if (this.u3 != var1) {
         this.a6 = null;
      }

      this.u3 = var1;
   }

   public final long u3() {
      return this.u9;
   }

   public final void k5(long var1) {
      this.u9 = var1;
   }

   protected final boolean n5(p8 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && this.l6 == var1.l6
         && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5)
         && com.aspose.slides.internal.y6.c8.n5(this.u3, var1.u3)
         && com.aspose.slides.internal.y6.c8.n5(this.a6, var1.a6)
         && this.u9 == var1.u9;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((p8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.u3 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.a6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.a6)).hashCode() : 0);
      return var1 * 397 ^ (int)this.u9;
   }
}
