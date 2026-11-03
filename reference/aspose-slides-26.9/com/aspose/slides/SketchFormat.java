package com.aspose.slides;

public final class SketchFormat extends PVIObject implements ISketchFormat {
   private g4m l6;
   final com.aspose.slides.internal.v6g.n5<g4m> n5 = new SketchFormat$1(this);
   private j2x k5 = new j2x();

   SketchFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   Object M_() {
      return new q6a(this.k5);
   }

   final q6a l6() {
      return (q6a)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().a6();
   }

   final long u3() {
      return this.z3() ? this.l6().l6() : 1219033472L;
   }

   final void n5(long var1) {
      this.n5(1219033472L, var1);
      if (this.z3()) {
         this.l6().n5(var1);
         this.c8();
      }
   }

   final j2x a6() {
      return this.z3() ? this.l6().k5() : q6a.n5;
   }

   final void n5(j2x var1) {
      this.n5(q6a.n5, var1);
      if (this.z3()) {
         this.l6().n5(var1);
      }
   }

   @Override
   public final int getSketchType() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setSketchType(int value) {
      this.n5(-1, value);
      if (this.z3() && this.l6().n5() != value) {
         this.l6().n5(value);
         this.c8();
      }
   }

   final boolean u9() {
      return this.z3() ? this.l6().u9() : true;
   }

   final void h0() {
      this.k7();
      this.l6().u3();
   }

   final void n5(ISketchFormat var1) {
      this.k7();
      this.l6().n5((SketchFormat)var1);
   }

   final void n5(ISketchFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
      this.c8();
   }

   final void c8() {
      if (this.l6 != null && !this.n5.n5()) {
         this.l6.n5();
      }
   }

   // $VF: synthetic method
   static g4m n5(SketchFormat var0, g4m var1) {
      return var0.l6 = var1;
   }
}
