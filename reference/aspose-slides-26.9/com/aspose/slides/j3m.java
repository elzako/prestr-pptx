package com.aspose.slides;

final class j3m {
   private final ColorFormat n5;
   private final ColorFormat l6;
   private byte k5;
   private final r0g u3;
   private ISlideComponent a6;
   private long u9;

   j3m(r0g var1, ColorFormat var2, ColorFormat var3) {
      this.u3 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = -1;
   }

   public final byte n5() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
      this.h0();
   }

   public final IColorFormat l6() {
      return this.n5;
   }

   public final IColorFormat k5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      return PatternFormat.n5(false, this.k5, var1.o8(), var2.o8());
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.c8 var1) {
      IBaseSlide var2 = this.a6();
      r0s var3 = new r0s(var1.o8());
      return PatternFormat.n5(false, this.k5, this.l6.k5(var2, var3).o8(), this.n5.k5(var2, var3).o8());
   }

   final void n5(j3m var1) {
      this.k5 = var1.n5();
      this.n5.l6((ColorFormat)var1.l6());
      this.l6.l6((ColorFormat)var1.k5());
   }

   final void l6(j3m var1) {
      this.n5(var1);
      this.h0();
   }

   final void n5(IPatternFormatEffectiveData var1) {
      this.k5 = var1.getPatternStyle();
      this.n5.l6(((g3a)var1).l6().o8());
      this.l6.l6(((g3a)var1).k5().o8());
      this.h0();
   }

   final ISlideComponent u3() {
      if (this.a6 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.a6};
         d0u.n5(ISlideComponent.class, this.u3, var1);
         this.a6 = var1[0];
      }

      return this.a6;
   }

   final IBaseSlide a6() {
      ISlideComponent var1 = this.u3();
      return var1 != null ? var1.getSlide() : null;
   }

   public final long u9() {
      return ((this.u9 & 4294967295L) + (this.n5.getVersion() & 4294967295L) & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L;
   }

   private void h0() {
      this.u9++;
   }

   @Override
   public boolean equals(Object obj) {
      IPatternFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, IPatternFormat.class);
      if (var2 == null) {
         return super.equals(obj);
      } else if (!this.n5.equals(var2.getForeColor())) {
         return false;
      } else {
         return !this.l6.equals(var2.getBackColor()) ? false : this.k5 == var2.getPatternStyle();
      }
   }

   @Override
   public int hashCode() {
      return 23456;
   }
}
