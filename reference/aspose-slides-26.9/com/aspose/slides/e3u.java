package com.aspose.slides;

final class e3u {
   private int n5;
   private int l6;
   private final Picture k5;
   private final l6g u3;
   private long a6;

   e3u(Picture var1, l6g var2) {
      this.k5 = var1;
      this.u3 = var2;
      this.n5 = 96;
      this.l6 = 0;
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = com.aspose.slides.internal.n8e.v4.n5(var1, -1, 1000000);
      this.c8();
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
      this.c8();
   }

   public final i2h k5() {
      s4s var1 = this.a6().l6().u3().l6();
      return i2h.n5(new i2h(var1.n5.u3(), d2k.l6(d2k.u3, var1.n5()).u3()), 100.0F);
   }

   public final void n5(i2h var1) {
      d2k var2 = d2k.n5(new d2k(var1.l6, var1.k5), 100).u3();
      d2k var3 = d2k.l6(d2k.l6(d2k.u3, var2), d2k.n5(new d2k(var1.u3, var1.a6), 100)).u3();
      s4s var4 = new s4s(var2.u3(), var3.u3());
      this.a6().l6().n5(var4.l6());
      this.c8();
   }

   public final i2h u3() {
      s4s var1 = this.a6().n5().l6();
      return i2h.n5(new i2h(var1.n5.u3(), d2k.l6(d2k.u3, var1.n5()).u3()), 100.0F);
   }

   public final void l6(i2h var1) {
      d2k var2 = d2k.n5(new d2k(var1.l6, var1.k5), 100).u3();
      d2k var3 = d2k.l6(d2k.l6(d2k.u3, d2k.n5(new d2k(var1.u3, var1.a6), 100)), var2).u3();
      this.a6().n5(new s4s(var2.u3(), var3.u3()));
      this.c8();
   }

   final l6g a6() {
      return this.u3;
   }

   final com.aspose.slides.internal.o9b.y1 n5(int var1, int var2) {
      return this.a6().l6().n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1, var2));
   }

   final void u9() {
      this.a6().h0();
      this.k5.k5();
      this.l6 = 0;
      this.n5 = 96;
      this.c8();
   }

   final void n5(PictureFillFormat var1) {
      this.a6().n5(var1.h0());
      this.k5.n5((Picture)var1.getPicture());
      this.l6 = var1.getPictureFillMode();
      this.n5 = var1.getDpi();
      this.c8();
   }

   final void n5(IPictureFillFormatEffectiveData var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, f3f.class)) {
         f3f var2 = (f3f)var1;
         this.u3.l6().n5(var2.k5().u3().l6());
         this.u3.n5(var2.u3().u3().l6());
         this.u3.n5(var2.c8());
         this.u3.n5(var2.h0());
         this.u3.n5(var2.a6().u9());
         this.u3.n5(var2.u9().u3());
      }

      this.k5.n5(var1.getPicture());
      this.l6 = var1.getPictureFillMode();
      this.n5 = var1.getDpi();
      this.c8();
   }

   public final long h0() {
      return ((this.a6 & 4294967295L) + (this.k5.getVersion() & 4294967295L) & 4294967295L) + (this.u3.c8() & 4294967295L) & 4294967295L;
   }

   private void c8() {
      this.a6++;
   }
}
