package com.aspose.slides.internal.i0;

public class r4 extends f2 {
   private int n5;
   private j5 l6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final j5 l6() {
      return this.l6;
   }

   public final void n5(j5 var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, Type: {1}, CustomLineCapData: {2}",
         super.toString(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.c8.class, this.n5),
         this.l6
      );
   }

   protected final boolean n5(r4 var1) {
      return this.n5 == var1.n5 && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((r4)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
   }

   @Override
   public int u9() {
      return 8 + this.l6.u9();
   }

   public final com.aspose.slides.internal.x4g.u9 k5() {
      if (this.n5() == 1) {
         c4 var5 = (c4)this.l6();
         com.aspose.slides.internal.x4g.l6 var6 = new com.aspose.slides.internal.x4g.l6(var5.n5(), var5.l6(), var5.u3());
         var6.l6(var5.k5());
         var6.n5((int)var5.a6(), (int)var5.h0());
         var6.l6(var5.c8());
         var6.a6(var5.s7());
         return var6;
      }

      y2 var1 = (y2)this.l6();
      com.aspose.slides.internal.x4g.s7 var2 = null;
      com.aspose.slides.internal.x4g.s7 var3 = null;
      if ((var1.n5() & 1L) > 0L) {
         var2 = var1.n3().n5().n5().c8();
      }

      if ((var1.n5() & 2L) > 0L) {
         var3 = var1.n3().l6().l6().c8();
      }

      com.aspose.slides.internal.x4g.u9 var4 = new com.aspose.slides.internal.x4g.u9(var2, var3);
      var4.n5((int)var1.l6());
      var4.u3(var1.k5());
      var4.n5((int)var1.u3(), (int)var1.a6());
      var4.l6(var1.h0());
      var4.a6(var1.t2());
      return var4;
   }
}
