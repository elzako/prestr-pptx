package com.aspose.slides.internal.i0;

public final class p3 extends f2 {
   private long n5;
   private short l6;
   private u3[] k5;
   private u3[] u3;
   private byte[] a6;
   private short u9;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void n5(short var1) {
      this.l6 = var1;
   }

   public final u3[] k5() {
      return this.k5;
   }

   public final void n5(u3[] var1) {
      this.k5 = var1;
   }

   public final short u3() {
      return this.u9;
   }

   public final void l6(short var1) {
      this.u9 = var1;
   }

   public final u3[] a6() {
      return this.u3;
   }

   public final void l6(u3[] var1) {
      this.u3 = var1;
   }

   public final byte[] h0() {
      return this.a6;
   }

   public final void n5(byte[] var1) {
      this.a6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (this.k5() != null) {
         for (u3 var5 : this.k5()) {
            var1.n5("{0},",new Object[]{ var5});
         }
      }

      com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5();
      if (this.u3 != null) {
         for (u3 var6 : this.a6()) {
            var7.n5("{0},",new Object[]{ var6.toString()});
         }
      }

      return com.aspose.slides.ms.System.d1.n5(
         "{0}, PathPointCount: {1}, PathPointFlags: {2}, PathPoints: [{3}], PathPointTypes: [{4}], AlignmentPadding: {5}, Reserved: {6}",
         super.toString(),
         this.n5,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.c4.class, this.l6),
         var1,
         var7,
         this.a6,
         this.u9
      );
   }

   private boolean n5(p3 var1) {
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
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, p3.class) && this.n5((p3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.u3 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.a6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.a6)).hashCode() : 0);
      return var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.u9);
   }

   public final com.aspose.slides.internal.x4g.s7 c8() {
      byte[] var1 = new byte[this.a6().length];
      com.aspose.slides.internal.o9b.w1[] var2 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), this.k5().length)
      );

      for (int var3 = 0; var3 < this.a6().length; var3++) {
         var1[var3] = (byte)((j9)this.a6()[var3]).l6();
      }

      for (int var4 = 0; var4 < this.k5().length; var4++) {
         this.k5()[var4].n5().n5(var2[var4]);
      }

      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7(var2, var1);
      var5.n5(com.aspose.slides.internal.n7.k5.n5(this.l6(), 13) ? 1 : 0);
      return var5;
   }

   @Override
   public int u9() {
      int var1 = 12;
      if ((this.n5 & 4294967295L) > 0L && this.k5.length > 0) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.k5[0], w2.class)) {
            var1 += 4 * this.k5.length;
         } else {
            var1 += 8 * this.k5.length;
         }
      }

      if (this.u3 != null && this.u3.length > 0) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.u3[0], j9.class)) {
            var1 += this.u3.length;
         } else if (com.aspose.slides.internal.v6g.k5.l6(this.u3[0], z6.class)) {
            var1 += 2 * this.u3.length;
         }
      }

      if (var1 % 4 != 0) {
         this.a6 = new byte[4 - var1 % 4];
         if (this.a6 != null) {
            var1 += this.a6.length;
         }
      }

      return var1;
   }
}
