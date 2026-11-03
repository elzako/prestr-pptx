package com.aspose.slides.internal.b9;

public class x5 {
   private com.aspose.slides.internal.t5.z8[] n5;
   private com.aspose.slides.internal.t5.a6[] l6;
   private com.aspose.slides.internal.t5.u9[] k5;
   private byte[] u3;

   public final com.aspose.slides.internal.t5.z8[] n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.t5.z8[] var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.t5.a6[] l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.t5.a6[] var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.t5.u9[] k5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.t5.u9[] var1) {
      this.k5 = var1;
   }

   public final byte[] u3() {
      return this.u3;
   }

   public final void n5(byte[] var1) {
      this.u3 = var1;
   }

   protected final boolean n5(x5 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.n5, var1.n5)
         && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6)
         && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5)
         && com.aspose.slides.internal.y6.c8.n5(this.u3, var1.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((x5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
      return var1 * 397 ^ (this.u3 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).hashCode() : 0);
   }
}
