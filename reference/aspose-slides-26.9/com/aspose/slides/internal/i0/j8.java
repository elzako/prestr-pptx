package com.aspose.slides.internal.i0;

import com.aspose.slides.exceptions.NotSupportedException;

public class j8 extends y8 {
   private a7 n5;
   private long l6;
   private long k5;
   private int u3;
   private float a6;
   private int u9;
   private int h0;
   private float c8;
   private d2 t2;
   private int s7;
   private m3 x8;
   private a0 n3;
   private w1 y4;

   public final a7 n5() {
      return this.n5;
   }

   public final void n5(a7 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final float a6() {
      return this.a6;
   }

   public final void n5(float var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void l6(int var1) {
      this.u9 = var1;
   }

   public final int c8() {
      return this.h0;
   }

   public final void k5(int var1) {
      this.h0 = var1;
   }

   public final float t2() {
      return this.c8;
   }

   public final void l6(float var1) {
      this.c8 = var1;
   }

   public final d2 s7() {
      return this.t2;
   }

   public final void n5(d2 var1) {
      this.t2 = var1;
   }

   public final int x8() {
      return this.s7;
   }

   public final void u3(int var1) {
      this.s7 = var1;
   }

   public final m3 n3() {
      return this.x8;
   }

   public final void n5(m3 var1) {
      this.x8 = var1;
   }

   public final a0 y4() {
      return this.n3;
   }

   public final void n5(a0 var1) {
      this.n3 = var1;
   }

   public final w1 e2() {
      return this.y4;
   }

   public final void n5(w1 var1) {
      this.y4 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "TransformMatrix: {0}, StartCap: {1}, EndCap: {2}, Join: {3}, MiterLimit: {4}, LineStyle: {5}, DashedLineCapType: {6}, DashOffset: {7}, DashedLineData: {8}, PenAlignment: {9}, CompoundLineData: {10}, CustomStartCapData: {11}, CustomEndCapData: {12}",
         this.n5,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.m1.class, this.l6),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.m1.class, this.k5),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.k7.class, this.u3),
         this.a6,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.m3.class, this.u9),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t2.class, this.h0),
         this.c8,
         this.t2,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.a0.class, this.s7),
         this.x8,
         this.n3,
         this.y4
      );
   }

   protected final boolean n5(j8 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5)
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && com.aspose.slides.ms.System.n1.l6(this.a6, var1.a6)
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && com.aspose.slides.ms.System.n1.l6(this.c8, var1.c8)
         && com.aspose.slides.ms.System.j8.n5(this.t2, var1.t2)
         && this.s7 == var1.s7
         && com.aspose.slides.ms.System.j8.n5(this.x8, var1.x8)
         && com.aspose.slides.ms.System.j8.n5(this.n3, var1.n3)
         && com.aspose.slides.ms.System.j8.n5(this.y4, var1.y4);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((j8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.a6);
      var1 = var1 * 397 ^ this.u9;
      var1 = var1 * 397 ^ this.h0;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.c8);
      var1 = var1 * 397 ^ (this.t2 != null ? this.t2.hashCode() : 0);
      var1 = var1 * 397 ^ this.s7;
      var1 = var1 * 397 ^ (this.x8 != null ? this.x8.hashCode() : 0);
      var1 = var1 * 397 ^ (this.n3 != null ? this.n3.hashCode() : 0);
      return var1 * 397 ^ (this.y4 != null ? this.y4.hashCode() : 0);
   }

   @Override
   public int u9() {
      throw new NotSupportedException("Use overloaded methos with EmfPlusPenDataFlags param");
   }

   public final int k5(long var1) {
      int var3 = 0;
      if ((var1 & 1L) > 0L && this.n5 != null) {
         var3 += 24;
      }

      if ((var1 & 2L) > 0L) {
         var3 += 4;
      }

      if ((var1 & 4L) > 0L) {
         var3 += 4;
      }

      if ((var1 & 8L) > 0L) {
         var3 += 4;
      }

      if ((var1 & 16L) > 0L) {
         var3 += 4;
      }

      if ((var1 & 32L) > 0L) {
         var3 += 4;
      }

      if ((var1 & 64L) > 0L) {
         var3 += 4;
      }

      if ((var1 & 128L) > 0L) {
         var3 += 4;
      }

      if ((var1 & 512L) > 0L) {
         var3 += 4;
      }

      if (this.s7() != null) {
         var3 += this.s7().u9();
      }

      if (this.n3() != null) {
         var3 += this.n3().u9();
      }

      if (this.y4() != null) {
         var3 += this.y4().u9();
      }

      if (this.e2() != null) {
         var3 += this.e2().u9();
      }

      return var3;
   }
}
