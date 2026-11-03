package com.aspose.slides.internal.i0;

public class y2 extends j5 {
   private long n5;
   private long l6;
   private float k5;
   private long u3;
   private long a6;
   private int u9;
   private float h0;
   private float c8;
   private s0 t2;
   private s0 s7;
   private y1 x8;

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

   public final float k5() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void k5(long var1) {
      this.u3 = var1;
   }

   public final long a6() {
      return this.a6;
   }

   public final void u3(long var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final float c8() {
      return this.h0;
   }

   public final void l6(float var1) {
      this.h0 = var1;
   }

   public final float t2() {
      return this.c8;
   }

   public final void k5(float var1) {
      this.c8 = var1;
   }

   public final s0 s7() {
      return this.t2;
   }

   public final void n5(s0 var1) {
      this.t2 = var1;
   }

   public final s0 x8() {
      return this.s7;
   }

   public final void l6(s0 var1) {
      this.s7 = var1;
   }

   public final y1 n3() {
      return this.x8;
   }

   public final void n5(y1 var1) {
      this.x8 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "[CustomLineCapDataFlags: {0}, BaseCap: {1}, BaseInset: {2}, StrokeStartCap: {3}, StrokeEndCap: {4}, StrokeJoin: {5}, StrokeMiterLimit: {6}, WidthScale: {7}, FillHotSpot: {8}, StrokeHotSpot: {9}, OptionalData: {10}]",
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.h0.class, this.n5),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.m1.class, this.l6),
         this.k5,
         this.u3,
         this.a6,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.k7.class, this.u9),
         this.h0,
         this.c8,
         this.t2,
         this.s7,
         this.x8
      );
   }

   protected final boolean n5(y2 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && com.aspose.slides.ms.System.n1.l6(this.k5, var1.k5)
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && com.aspose.slides.ms.System.n1.l6(this.h0, var1.h0)
         && com.aspose.slides.ms.System.n1.l6(this.c8, var1.c8)
         && com.aspose.slides.ms.System.j8.n5(this.t2, var1.t2)
         && com.aspose.slides.ms.System.j8.n5(this.s7, var1.s7)
         && com.aspose.slides.ms.System.j8.n5(this.x8, var1.x8);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((y2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.k5);
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ (int)this.a6;
      var1 = var1 * 397 ^ this.u9;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.h0);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.c8);
      var1 = var1 * 397 ^ (this.t2 != null ? this.t2.hashCode() : 0);
      var1 = var1 * 397 ^ (this.s7 != null ? this.s7.hashCode() : 0);
      return var1 * 397 ^ (this.x8 != null ? this.x8.hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 48;
      if (this.x8 != null) {
         var1 += this.x8.u9();
      }

      return var1;
   }
}
