package com.aspose.slides;

final class q6a {
   static final j2x n5 = new j2x();
   private long k5;
   private int u3 = -1;
   j2x l6;
   private long a6;

   q6a(j2x var1) {
      this.k5 = 1219033472L;
      this.l6 = var1;
   }

   public final int n5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
      this.h0();
   }

   final long l6() {
      return this.k5;
   }

   final void n5(long var1) {
      this.k5 = var1;
   }

   final j2x k5() {
      return this.l6;
   }

   final void n5(j2x var1) {
      this.l6 = var1;
   }

   final void u3() {
      this.u3 = -1;
      this.k5 = 1219033472L;
      this.l6 = n5;
      this.h0();
   }

   final void n5(SketchFormat var1) {
      this.l6(var1);
      this.h0();
   }

   final void l6(SketchFormat var1) {
      this.u3 = var1.getSketchType();
      this.k5 = var1.u3();
      this.l6 = var1.a6();
   }

   final void n5(ISketchFormatEffectiveData var1) {
      this.u3 = var1.getSketchType();
      this.k5 = ((z1z)var1).n5;
      this.h0();
   }

   final long a6() {
      return this.a6;
   }

   private void h0() {
      this.a6++;
   }

   final boolean u9() {
      return this.k5 == 1219033472L && this.u3 == -1;
   }

   @Override
   public boolean equals(Object obj) {
      SketchFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, SketchFormat.class);
      return var2 == null ? super.equals(obj) : this.k5 == var2.u3() && this.u3 == var2.getSketchType();
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = var1 * 31 + com.aspose.slides.ms.System.l4.n5(this.k5);
      var1 = var1 * 31 + com.aspose.slides.ms.System.s3.n5(this.u3);
      return var1 * 31 + (this.l6 != null ? this.l6.hashCode() : 0);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{"SketchFormat: ", com.aspose.slides.ms.System.s3.n5(LineSketchType.class, this.u3)});
   }
}
