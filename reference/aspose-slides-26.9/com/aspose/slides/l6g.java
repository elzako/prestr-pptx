package com.aspose.slides;

class l6g extends x3 {
   private v4d l6;
   final com.aspose.slides.internal.v6g.n5<v4d> n5 = new l6g$1(this);
   private static final s4s k5 = new s4s(d2k.k5.u3(), d2k.u3.u3());
   private final c1t u3 = new c1t();
   private s4s a6 = k5.l6();
   private e4c u9 = new e4c();
   private d2k h0 = d2k.u3.u3();
   private int c8 = 0;
   private byte t2 = 0;
   private long s7;
   private final IPictureFillFormat x8;

   public l6g(IPictureFillFormat var1) {
      this.x8 = var1;
   }

   public final s4s n5() {
      return this.a6;
   }

   public final void n5(s4s var1) {
      var1.n5(this.a6);
      this.t2();
   }

   public final c1t l6() {
      return this.u3;
   }

   public final e4c k5() {
      return this.u9;
   }

   public final void n5(e4c var1) {
      if (e4c.u3(this.u9, var1)) {
         var1.l6(this.u9);
         this.t2();
      }
   }

   public final d2k u3() {
      return this.h0;
   }

   public final void n5(d2k var1) {
      if (d2k.u3(this.h0, var1)) {
         var1.n5(this.h0);
         this.t2();
      }
   }

   public final int a6() {
      return this.c8;
   }

   public final void n5(int var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5((float)(this.c8), (float)(var1))) {
         this.c8 = var1;
         this.t2();
      }
   }

   public final byte u9() {
      return this.t2;
   }

   public final void n5(byte var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5((float)(this.t2), (float)(var1))) {
         this.t2 = var1;
         this.t2();
      }
   }

   final void h0() {
      if (s4s.l6(this.a6, k5)
         || !com.aspose.slides.internal.n8e.v4.n5(this.u3.u3().l6(), c1t.n5.l6())
         || !com.aspose.slides.internal.n8e.v4.n5(this.u9.n5, 0.0)
         || !com.aspose.slides.internal.n8e.v4.n5(this.u9.l6, 0.0)
         || !com.aspose.slides.internal.n8e.v4.n5(this.h0.n5, 1.0F)
         || !com.aspose.slides.internal.n8e.v4.n5(this.h0.l6, 1.0F)
         || !com.aspose.slides.internal.n8e.v4.n5(this.c8, 0.0F)
         || !com.aspose.slides.internal.n8e.v4.n5(this.t2, 0.0F)) {
         k5.n5(this.a6);
         this.u3.a6();
         this.u9 = new e4c();
         d2k.u3.n5(this.h0);
         this.c8 = 0;
         this.t2 = 0;
         this.t2();
      }
   }

   public final void n5(l6g var1) {
      if (s4s.l6(this.a6, var1.a6)
         || !com.aspose.slides.internal.n8e.v4.n5(this.u3, var1.u3)
         || !com.aspose.slides.internal.n8e.v4.n5(this.u9.n5, var1.u9.n5)
         || !com.aspose.slides.internal.n8e.v4.n5(this.u9.l6, var1.u9.l6)
         || !com.aspose.slides.internal.n8e.v4.n5(this.h0.n5, var1.h0.n5)
         || !com.aspose.slides.internal.n8e.v4.n5(this.h0.l6, var1.h0.l6)
         || !com.aspose.slides.internal.n8e.v4.n5((float)(this.c8), (float)(var1.c8))
         || !com.aspose.slides.internal.n8e.v4.n5((float)(this.t2), (float)(var1.t2))) {
         var1.a6.n5(this.a6);
         this.u3.n5(var1.u3.u3().l6());
         var1.u9.l6(this.u9);
         var1.h0.n5(this.h0);
         this.c8 = var1.c8;
         this.t2 = var1.t2;
         this.t2();
      }
   }

   private void t2() {
      this.s7++;
      if (com.aspose.slides.internal.v6g.k5.l6(this.x8, PVIObject.class)) {
         ((PVIObject)this.x8).k7();
      }

      v4d var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long c8() {
      return (this.s7 & 4294967295L) + (this.u3.u9() & 4294967295L) & 4294967295L;
   }

   // $VF: synthetic method
   static v4d n5(l6g var0, v4d var1) {
      return var0.l6 = var1;
   }
}
