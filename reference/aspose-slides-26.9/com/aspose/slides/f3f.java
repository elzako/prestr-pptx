package com.aspose.slides;

final class f3f extends g8<PictureFillFormat, f3f> implements IPictureFillFormatEffectiveData {
   private m4a n5;
   private c1t l6;
   private c1t k5;
   private int u3;
   private e4c a6 = new e4c();
   private d2k u9 = new d2k();
   private int h0;
   private byte c8;
   private int t2;

   f3f(f6a var1) {
      this();
   }

   f3f(z1a var1) {
      this();
   }

   f3f() {
      this.n5 = new m4a();
      this.l6 = new c1t();
      this.k5 = new c1t();
      d2k.u3.n5(this.u9);
      this.h0 = 0;
      this.c8 = 0;
   }

   final void n5() {
      this.n5.n5();
      this.l6.a6();
      this.k5.a6();
      d2k.u3.n5(this.u9);
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
   }

   @Override
   public final int getDpi() {
      return this.t2;
   }

   @Override
   public final int getPictureFillMode() {
      return this.u3;
   }

   @Override
   public final IPictureEffectiveData getPicture() {
      return this.n5;
   }

   @Override
   public final float getCropLeft() {
      return this.l6().l6;
   }

   @Override
   public final float getCropTop() {
      return this.l6().k5;
   }

   @Override
   public final float getCropRight() {
      return this.l6().u3;
   }

   @Override
   public final float getCropBottom() {
      return this.l6().a6;
   }

   public final i2h l6() {
      s4s var1 = this.l6.u3().l6();
      return i2h.n5(new i2h(var1.n5.u3(), d2k.l6(d2k.u3, var1.n5()).u3()), 100.0F);
   }

   final c1t k5() {
      return this.l6;
   }

   final c1t u3() {
      return this.k5;
   }

   final e4c a6() {
      return this.a6;
   }

   final d2k u9() {
      return this.u9;
   }

   final int h0() {
      return this.h0;
   }

   final byte c8() {
      return this.c8;
   }

   final m4a t2() {
      return this.n5;
   }

   final com.aspose.slides.internal.o9b.y1 n5(int var1, int var2) {
      return this.l6.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1, var2));
   }

   final void n5(i7b var1) {
      f3f var2 = (f3f)var1;
      this.n5.n5((i7b)var2.n5);
      this.l6.n5(var2.l6.u3().l6());
      this.u3 = var2.getPictureFillMode();
      this.k5.n5(var2.k5.u3().l6());
      var2.a6().l6(this.a6);
      var2.u9().n5(this.u9);
      this.h0 = var2.h0();
      this.c8 = var2.c8();
      this.t2 = var2.getDpi();
   }

   void n5(i7b var1, PictureFillFormat var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(PictureFillFormat var1) {
      if (var1 != null) {
         this.n5.n5((Picture)var1.getPicture());
         this.l6.n5(var1.h0().l6().u3().l6());
         this.u3 = var1.getPictureFillMode();
         this.k5.n5(var1.h0().n5().l6());
         var1.h0().k5().l6(this.a6);
         var1.h0().u3().n5(this.u9);
         this.h0 = var1.h0().a6();
         this.c8 = var1.h0().u9();
         this.t2 = var1.getDpi();
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.n5.n5(var1, var2);
   }

   boolean n5(f3f var1) {
      if (var1 == null) {
         return false;
      } else if (!this.n5.n5(var1.n5)) {
         return false;
      } else if (!this.l6.l6(var1.l6)) {
         return false;
      } else if (!this.k5.l6(var1.k5)) {
         return false;
      } else if (this.u3 != var1.u3) {
         return false;
      } else if (e4c.u3(this.a6, var1.a6)) {
         return false;
      } else if (d2k.u3(this.u9, var1.u9)) {
         return false;
      } else if (this.h0 != var1.h0) {
         return false;
      } else {
         return this.c8 != var1.c8 ? false : this.t2 == var1.t2;
      }
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.f3f)recoveredArg);
   }
}
