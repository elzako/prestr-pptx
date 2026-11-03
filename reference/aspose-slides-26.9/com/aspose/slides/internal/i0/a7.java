package com.aspose.slides.internal.i0;

public final class a7 extends y8 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;

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

   public final float u3() {
      return this.u3;
   }

   public final void u3(float var1) {
      this.u3 = var1;
   }

   public final float a6() {
      return this.a6;
   }

   public final void a6(float var1) {
      this.a6 = var1;
   }

   public final float h0() {
      return this.u9;
   }

   public final void u9(float var1) {
      this.u9 = var1;
   }

   private boolean n5(a7 var1) {
      return com.aspose.slides.ms.System.n1.l6(this.n5, var1.n5)
         && com.aspose.slides.ms.System.n1.l6(this.l6, var1.l6)
         && com.aspose.slides.ms.System.n1.l6(this.k5, var1.k5)
         && com.aspose.slides.ms.System.n1.l6(this.u3, var1.u3)
         && com.aspose.slides.ms.System.n1.l6(this.a6, var1.a6)
         && com.aspose.slides.ms.System.n1.l6(this.u9, var1.u9);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, a7.class) && this.n5((a7)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.n1.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.k5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.u3);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.a6);
      return var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.u9);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         com.aspose.slides.ms.System.d1.n5(new String[]{"\r\n[{0}, {1}, {4}]", "\r\n[{2}, {3}, {5}]"}),new Object[]{ this.n5, this.l6, this.k5, this.u3, this.a6, this.u9
      });
   }

   @Override
   public int u9() {
      return 24;
   }

   public final com.aspose.slides.internal.x4g.m1 c8() {
      return new com.aspose.slides.internal.x4g.m1(this.n5, this.l6, this.k5, this.u3, this.a6, this.u9);
   }
}
