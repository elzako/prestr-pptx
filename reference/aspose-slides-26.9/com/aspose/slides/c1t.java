package com.aspose.slides;

class c1t {
   public static final s4s n5 = new s4s(d2k.k5.u3(), d2k.u3.u3());
   private s4s l6 = new s4s();
   private long k5;

   public c1t() {
      n5.n5(this.l6);
      this.h0();
   }

   public c1t(c1t var1) {
      var1.l6.n5(this.l6);
      this.h0();
   }

   public final void n5(c1t var1) {
      var1.l6.n5(this.l6);
   }

   public final void n5(float var1) {
      this.l6.n5.n5 = var1;
      this.h0();
   }

   public final void l6(float var1) {
      this.l6.n5.l6 = var1;
      this.h0();
   }

   public final float n5() {
      return this.k5().n5;
   }

   public final void k5(float var1) {
      this.l6.l6.n5 = var1 - this.l6.n5.n5;
      this.h0();
   }

   public final float l6() {
      return this.k5().l6;
   }

   public final void u3(float var1) {
      this.l6.l6.l6 = var1 - this.l6.n5.l6;
      this.h0();
   }

   public final d2k k5() {
      return d2k.n5(this.l6.n5, this.l6.l6);
   }

   public final void n5(s4s var1) {
      var1.n5(this.l6);
      this.h0();
   }

   public final s4s u3() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.o9b.y1 var1) {
      return new com.aspose.slides.internal.o9b.y1(
         var1.x8() + this.l6.n5.n5 * var1.s7(), var1.n3() + this.l6.n5.l6 * var1.k5(), this.l6.l6.n5 * var1.s7(), this.l6.l6.l6 * var1.k5()
      );
   }

   public static boolean l6(s4s var0) {
      return d2k.u3(var0.n5, d2k.k5) || d2k.u3(var0.l6, d2k.u3);
   }

   public final void a6() {
      this.n5(n5.l6());
   }

   @Override
   public boolean equals(Object obj) {
      c1t var2 = com.aspose.slides.internal.v6g.k5.n5(obj, c1t.class);
      return var2 == null ? false : this.l6(var2);
   }

   public final boolean l6(c1t var1) {
      return var1 == null ? false : s4s.n5(this.l6, var1.l6);
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   private void h0() {
      this.k5++;
   }

   public final long u9() {
      return this.k5;
   }
}
