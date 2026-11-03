package com.aspose.slides.internal.i0;

public class m1 extends v4 {
   private byte[] n5;
   private byte[] l6;
   private byte[] k5;
   private byte[] u3;

   public final byte[] n5() {
      return this.n5;
   }

   public final void n5(byte[] var1) {
      this.n5 = var1;
   }

   public final byte[] l6() {
      return this.l6;
   }

   public final void l6(byte[] var1) {
      this.l6 = var1;
   }

   public final byte[] k5() {
      return this.k5;
   }

   public final void k5(byte[] var1) {
      this.k5 = var1;
   }

   public final byte[] u3() {
      return this.u3;
   }

   public final void u3(byte[] var1) {
      this.u3 = var1;
   }

   protected final boolean n5(m1 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.n5(), var1.n5())
         && com.aspose.slides.internal.y6.c8.n5(this.l6(), var1.l6())
         && com.aspose.slides.internal.y6.c8.n5(this.k5(), var1.k5())
         && com.aspose.slides.internal.y6.c8.n5(this.u3(), var1.u3());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((m1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5())).hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6())).hashCode() : 0);
      var1 = var1 * 397 ^ (this.k5() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5())).hashCode() : 0);
      return var1 * 397 ^ (this.u3() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3())).hashCode() : 0);
   }

   @Override
   public int u9() {
      return 1024;
   }
}
