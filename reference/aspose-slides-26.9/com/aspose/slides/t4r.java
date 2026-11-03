package com.aspose.slides;

class t4r implements y6e {
   private final r3q n5 = new r3q();

   public static t4r n5(e2n var0) {
      return new t4r(r3q.n5(var0).t9());
   }

   private t4r(r3q var1) {
      var1.k5(this.n5);
   }

   @Override
   public final m4i n5() {
      return this.n5.n5();
   }

   @Override
   public final e2n l6() {
      return this.n5.n5;
   }

   private byte e2() {
      return this.l6().l6.x8().k5().getTextFrameFormat().getTextVerticalType();
   }

   @Override
   public final byte k5() {
      return this.n5.h0();
   }

   @Override
   public final char u3() {
      return this.n5.l6();
   }

   @Override
   public final r1f a6() {
      return this.n5.k5();
   }

   @Override
   public final void u9() {
      this.n5.u3();
   }

   @Override
   public final int h0() {
      return this.n5.u9();
   }

   @Override
   public final int c8() {
      return this.n5.a6();
   }

   @Override
   public final y6e t2() {
      return new t4r(this.n5.s7().t9());
   }

   @Override
   public final y6e s7() {
      return new t4r(this.n5.x8().t9());
   }

   @Override
   public final y6e x8() {
      return new t4r(this.n5.y4().t9());
   }

   @Override
   public final y6e n3() {
      return new t4r(this.n5.n3().t9());
   }

   @Override
   public final boolean n5(y6e var1) {
      return r3q.l6(this.n5, ((t4r)var1).n5);
   }

   @Override
   public final boolean l6(y6e var1) {
      return r3q.n5(this.n5, ((t4r)var1).n5);
   }

   @Override
   public final boolean y4() {
      return this.e2() == 4
         && this.n5().n5.getKumimoji()
         && (com.aspose.slides.internal.n2d.u9.w1(this.u3()) || com.aspose.slides.internal.n2d.u9.n5(this.h0()));
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("P: {0}, Ch: {1}",new Object[]{ this.n5.e2(), this.n5.a6()});
   }
}
