package com.aspose.slides.internal.b9;

public class t1 extends d5 {
   private com.aspose.slides.internal.k1.k7 n5;
   private long l6;
   private float k5;
   private float u3;
   private com.aspose.slides.internal.t5.m3 a6;

   public t1(s9 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.k1.k7 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.k1.k7 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   public final void l6(float var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.t5.m3 u9() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.t5.m3 var1) {
      this.a6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, Bounds: {1}, IGraphicsMode: {2}, ExScale: {3}, EyScale: {4}, WEmrText: {5}",
         super.toString(),
         this.n5(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.c5.u9.class, this.l6()),
         this.k5(),
         this.u3(),
         this.u9()
      );
   }

   protected final boolean n5(t1 var1) {
      return super.n5(var1)
         && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5)
         && this.l6 == var1.l6
         && com.aspose.slides.ms.System.n1.l6(this.k5, var1.k5)
         && com.aspose.slides.ms.System.n1.l6(this.u3, var1.u3)
         && com.aspose.slides.ms.System.j8.n5(this.a6, var1.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((t1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.k5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.u3);
      return var1 * 397 ^ (this.a6 != null ? this.a6.hashCode() : 0);
   }
}
