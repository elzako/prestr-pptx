package com.aspose.slides.internal.z4;

public class c8 {
   private boolean n5;
   private int l6;
   private final s7 k5;
   private final com.aspose.slides.internal.f1s.u9 u3;
   private final k7 a6;
   private f2 u9;

   public c8(s7 var1, k7 var2) {
      this.k5 = var1;
      this.u3 = new com.aspose.slides.internal.f1s.u9(this);
      this.a6 = var2;
      this.u9 = new f2();
   }

   public final int n5() {
      return ++this.l6;
   }

   public final k7 l6() {
      return this.a6;
   }

   public final y1 k5() {
      return this.k5.c8();
   }

   public final m1 u3() {
      return this.k5.t2();
   }

   public final w1 a6() {
      return this.k5.n3();
   }

   public final a6 u9() {
      return this.k5.s7();
   }

   public final m3 h0() {
      return this.k5.x8();
   }

   public final com.aspose.slides.internal.b8.u9 c8() {
      return this.k5.k5();
   }

   public final com.aspose.slides.internal.f6.n5 t2() {
      return this.k5.u9();
   }

   public final com.aspose.slides.internal.d0.l6 s7() {
      return this.k5.u3();
   }

   public final com.aspose.slides.internal.f1s.u9 x8() {
      return this.u3;
   }

   public final boolean n3() {
      return this.a6.e2();
   }

   public final boolean y4() {
      return this.a6.l6();
   }

   public final boolean e2() {
      return this.a6.y4();
   }

   public final s7 t9() {
      return this.k5;
   }

   public final com.aspose.slides.internal.e6r.t2 z1() {
      return this.k5.y4();
   }

   public final f2 t4() {
      return this.u9;
   }

   public final boolean n5(byte[] var1, com.aspose.slides.internal.o9b.l6[] var2) {
      var2[0] = null;
      if (this.l6().j5() == null) {
         return false;
      }

      com.aspose.slides.internal.k9.h0 var3 = com.aspose.slides.internal.k9.h0.n5(var1);
      com.aspose.slides.internal.k9.u9 var4 = null;
      com.aspose.slides.internal.k9.u9[] var5 = new com.aspose.slides.internal.k9.u9[]{var4};
      boolean var6 = !this.l6().j5().n5(var3, var5);
      var4 = var5[0];
      if (var6) {
         return false;
      }

      if (!var4.l6()) {
         return false;
      }

      com.aspose.slides.internal.o9b.t4 var7 = var4.k5();
      var2[0] = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.o9b.l6.class);
      return var2[0] != null;
   }

   public final boolean q0() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }
}
