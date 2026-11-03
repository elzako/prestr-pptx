package com.aspose.slides.internal.i0;

public class c4 extends j5 {
   private float n5;
   private float l6;
   private float k5;
   private boolean u3;
   private long a6;
   private long u9;
   private int h0;
   private float c8;
   private float t2;
   private s0 s7;
   private s0 x8;

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void k5(float var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final long a6() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   public final long h0() {
      return this.u9;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final int c8() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   public final float t2() {
      return this.c8;
   }

   public final void u3(float var1) {
      this.c8 = var1;
   }

   public final float s7() {
      return this.t2;
   }

   public final void a6(float var1) {
      this.t2 = var1;
   }

   public final s0 x8() {
      return this.s7;
   }

   public final void n5(s0 var1) {
      this.s7 = var1;
   }

   public final s0 n3() {
      return this.x8;
   }

   public final void l6(s0 var1) {
      this.x8 = var1;
   }

   protected final boolean n5(c4 var1) {
      return com.aspose.slides.ms.System.n1.l6(this.n5, var1.n5)
         && com.aspose.slides.ms.System.n1.l6(this.l6, var1.l6)
         && com.aspose.slides.ms.System.n1.l6(this.k5, var1.k5)
         && com.aspose.slides.ms.System.n3.l6(this.u3, var1.u3)
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && com.aspose.slides.ms.System.n1.l6(this.c8, var1.c8)
         && com.aspose.slides.ms.System.n1.l6(this.t2, var1.t2)
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
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((c4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.n1.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.k5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n3.n5(this.u3);
      var1 = var1 * 397 ^ (int)this.a6;
      var1 = var1 * 397 ^ (int)this.u9;
      var1 = var1 * 397 ^ this.h0;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.c8);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.t2);
      var1 = var1 * 397 ^ (this.s7 != null ? this.s7.hashCode() : 0);
      return var1 * 397 ^ (this.x8 != null ? this.x8.hashCode() : 0);
   }

   @Override
   public int u9() {
      return 52;
   }
}
