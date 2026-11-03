package com.aspose.slides.internal.i0;

public class x9 extends k5 {
   private long n5;
   private long l6;
   private n5 k5;
   private s0 u3;
   private long a6;
   private n5[] u9;
   private n3 h0;
   private y0 c8;

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

   public final n5 k5() {
      return this.k5;
   }

   public final void n5(n5 var1) {
      this.k5 = var1;
   }

   public final s0 u3() {
      return this.u3;
   }

   public final void n5(s0 var1) {
      this.u3 = var1;
   }

   public final long a6() {
      return this.a6;
   }

   public final void k5(long var1) {
      this.a6 = var1;
   }

   public final n5[] h0() {
      return this.a6 == 0L ? new n5[0] : this.u9;
   }

   public final void n5(n5[] var1) {
      this.u9 = var1;
   }

   public final n3 c8() {
      return this.h0;
   }

   public final void n5(n3 var1) {
      this.h0 = var1;
   }

   public final y0 t2() {
      return this.c8;
   }

   public final void n5(y0 var1) {
      this.c8 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (n5 var5 : this.h0()) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5.toString(), ", "}));
      }

      return com.aspose.slides.ms.System.d1.n5(
         "BrushDataFlags: {0}, WrapMode: {1}, CenterColor: {2}, CenterPointF: {3}, SurroundingColorCount: {4}, SurroundingColor: [{5}], BoundaryData: {6}, OptionalData: {7}",new Object[]{
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.l6.class, this.n5),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.a5.class, this.l6),
         this.k5,
         this.u3,
         this.a6,
         var1,
         this.h0,
         this.c8
      });
   }

   protected final boolean n5(x9 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5)
         && com.aspose.slides.ms.System.j8.n5(this.u3, var1.u3)
         && this.a6 == var1.a6
         && com.aspose.slides.internal.y6.c8.n5(this.u9, var1.u9)
         && com.aspose.slides.ms.System.j8.n5(this.h0, var1.h0)
         && com.aspose.slides.ms.System.j8.n5(this.c8, var1.c8);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((x9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
      var1 = var1 * 397 ^ (this.u3 != null ? this.u3.hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.a6;
      var1 = var1 * 397 ^ (this.u9 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u9)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.h0 != null ? this.h0.hashCode() : 0);
      return var1 * 397 ^ (this.c8 != null ? this.c8.hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = (int)(24L + ((this.a6 & 4294967295L) * 4L & 4294967295L));
      if (this.h0 != null) {
         var1 += this.h0.u9();
      }

      if (this.c8 != null) {
         var1 += this.c8.u9();
      }

      return var1;
   }
}
