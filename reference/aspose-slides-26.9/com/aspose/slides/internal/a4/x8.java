package com.aspose.slides.internal.a4;

import com.aspose.slides.internal.i0.a7;
import com.aspose.slides.ms.System.d1;

public class x8 extends m1 {
   private int n5;
   private long l6;
   private int k5;
   private com.aspose.slides.internal.i0.s0[] u3;
   private short[] a6;
   private long u9;
   private a7 h0;
   private String c8;

   public x8(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return this.m3();
   }

   public final int u3() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1;
   }

   public final long c8() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final int t2() {
      return this.k5;
   }

   public final void u3(int var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.i0.s0[] s7() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.i0.s0[] var1) {
      this.u3 = var1;
   }

   public final short[] x8() {
      return this.a6;
   }

   public final void n5(short[] var1) {
      this.a6 = var1;
   }

   public final String n3() {
      return this.c8;
   }

   public final void n5(String var1) {
      this.c8 = var1;
   }

   public final boolean y4() {
      return this.u9(15);
   }

   public final long e2() {
      return this.u9;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final a7 t9() {
      return this.h0;
   }

   public final void n5(a7 var1) {
      this.h0 = var1;
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, ObjectId: {1}, BrushId: {2}, DriverStringOptionsFlags: {3}, GlyphCount: {4}, GlyphPos: {5}, Glyphs: {6}, GlyphsString: {7}, IsColor: {8}, MatrixPresent: {9}, TransformMatrix: {10}",
         super.toString(),
         this.k5(),
         this.u3(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.s7.class, this.c8()),
         this.t2(),
         this.s7(),
         this.x8(),
         this.n3(),
         this.y4(),
         this.e2(),
         this.t9()
      );
   }

   protected final boolean n5(x8 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && com.aspose.slides.internal.y6.c8.n5(this.u3, var1.u3)
         && com.aspose.slides.internal.y6.c8.n5(this.a6, var1.a6)
         && this.u9 == var1.u9
         && com.aspose.slides.ms.System.j8.n5(this.h0, var1.h0)
         && d1.a6(this.n3(), var1.n3());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((x8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ (this.u3 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.a6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.a6)).hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.u9;
      var1 = var1 * 397 ^ (this.h0 != null ? this.h0.hashCode() : 0);
      return var1 * 397 ^ (this.n3() != null ? this.n3().hashCode() : 0);
   }
}
