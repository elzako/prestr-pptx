package com.aspose.slides.internal.i0;

public final class a3 extends y8 {
   private long n5;
   private long l6;
   private n5[] k5;

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

   public final n5[] k5() {
      return this.k5;
   }

   public final void n5(n5[] var1) {
      this.k5 = var1;
   }

   private boolean n5(a3 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, a3.class) && this.n5((a3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      return var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
   }

   @Override
   public int u9() {
      return (int)(8L + ((this.l6() & 4294967295L) * 4L & 4294967295L));
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.k5();

      for (n5 var5 : this.k5()) {
         var1.l6(com.aspose.slides.ms.System.d1.n5(new String[]{var5.toString(), ", "}));
      }

      return com.aspose.slides.ms.System.d1.n5(
         "[PaletteStyleFlags: {0}, PaletteCount: {1}, PaletteEntries: [{2}]",new Object[]{
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.r4.class, this.n5),
         this.l6,
         var1
      });
   }
}
