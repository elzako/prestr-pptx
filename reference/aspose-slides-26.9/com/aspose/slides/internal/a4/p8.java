package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class p8 extends f2 {
   private int n5;
   private com.aspose.slides.internal.i0.f2 l6;
   private byte[] k5;

   public p8() {
      this.l6((short)16392);
   }

   public p8(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(15);
   }

   public final byte u3() {
      return (byte)((this.G_() & 32512) >> 8);
   }

   public final void n5(byte var1) {
      short var2 = -32513;
      this.n5((short)(this.G_() & -32513));
      this.n5((short)(this.G_() | (short)((var1 & 255) << 8)));
   }

   public final byte c8() {
      return this.m3();
   }

   public final void l6(byte var1) {
      this.u3(var1);
   }

   public final int t2() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.f2 s7() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i0.f2 var1) {
      this.l6 = var1;
   }

   public final byte[] x8() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   @Override
   public int u9() {
      return this.s7().u9();
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, IsContinuable: {1}, ObjectType: {2}, ObjectId: {3}, TotalObjectSize: {4}, ObjectData: \n[{5}]",
         super.toString(),
         this.k5(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.w1.class, this.u3()),
         this.c8(),
         this.t2(),
         this.s7()
      );
   }

   protected final boolean n5(p8 var1) {
      return this.t2() == var1.t2() && com.aspose.slides.ms.System.j8.n5(this.s7(), var1.s7());
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
      return this.t2() * 397 ^ (this.s7() != null ? this.s7().hashCode() : 0);
   }
}
