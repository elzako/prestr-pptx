package com.aspose.slides.internal.i0;

public class p8 extends f2 {
   private float n5;
   private int l6;
   private int k5;
   private long u3;
   private long a6;
   private String u9;

   public final String n5() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   public final long l6() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   public final long k5() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final int u3() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final float h0() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   protected final boolean n5(p8 var1) {
      return com.aspose.slides.ms.System.n1.l6(this.n5, var1.n5)
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && com.aspose.slides.ms.System.d1.a6(this.u9, var1.u9);
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
      int var1 = com.aspose.slides.ms.System.n1.n5(this.n5);
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ (int)this.a6;
      return var1 * 397 ^ (this.u9 != null ? this.u9.hashCode() : 0);
   }

   @Override
   public int u9() {
      return (int)(24L + ((this.a6 & 4294967295L) * 2L & 4294967295L));
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, EmSize: {1}, SizeUnit: {2}, FontStyleFlags: {3}, Reserved: {4}, Length: {5}, FamilyName: {6}",
         super.toString(),
         this.n5,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t1.class, this.l6),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.x8.class, this.k5),
         this.u3,
         this.a6,
         this.u9
      );
   }

   public final com.aspose.slides.internal.o9b.n3 c8() {
      com.aspose.slides.internal.o9b.n3 var1 = null;

      try {
         var1 = com.aspose.slides.internal.b0.l6.n5(this.n5(), this.h0(), this.u3(), this.a6());
      } catch (Exception var3) {
         var1 = com.aspose.slides.internal.b0.l6.l6(com.aspose.slides.internal.o9b.v4.l6().l6().a6(), this.h0(), this.u3(), this.a6());
      }

      return var1;
   }
}
