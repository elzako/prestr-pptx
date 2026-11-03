package com.aspose.slides;

final class s5v {
   private final com.aspose.slides.internal.o9b.c8 n5 = new com.aspose.slides.internal.o9b.c8();
   private final com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   private final com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private final String u3;
   private final boolean a6;
   private final boolean u9;
   private final boolean h0;
   private final boolean c8;
   private final boolean t2;
   private final boolean s7;
   private final boolean x8;
   private final boolean n3;
   private final boolean y4;
   private final float e2;
   private final float t9;
   private final TextParam z1;
   private final com.aspose.slides.internal.l7h.a5 t4;
   private com.aspose.slides.internal.o9b.y1 q0 = new com.aspose.slides.internal.o9b.y1();
   private com.aspose.slides.internal.o9b.w1 z3 = new com.aspose.slides.internal.o9b.w1();
   private String m1;
   private boolean k7;

   public s5v(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3, String var4, boolean var5) {
      this.t4 = new com.aspose.slides.internal.l7h.a5(var1);
      var2.a6(this.q0);
      this.m1 = var4;
      this.z1 = var3;
      this.n5(var2.y4(), var3).n5(this.z3);
      var3.u9().n5(this.n5);
      var3.c8().n5(this.l6);
      var3.l6.n5(this.k5);
      this.u3 = var3.z3();
      this.a6 = var3.t2();
      this.u9 = var3.s7();
      this.h0 = var3.x8();
      this.c8 = var3.n3();
      this.t2 = var3.b3();
      this.s7 = var3.o0();
      this.x8 = var3.z7();
      this.n3 = var3.y4();
      this.y4 = var3.a6() != null && var3.a6().u9() && var3.a6().l6() != -1;
      this.e2 = var3.f2();
      this.t9 = var3.q0();
      this.k7 = var5;
   }

   public final boolean n5(s5v var1) {
      boolean var2 = com.aspose.slides.internal.o9b.c8.n5(this.n5, var1.n5);
      boolean var3 = com.aspose.slides.internal.o9b.c8.n5(this.l6, var1.l6);
      boolean var4 = com.aspose.slides.internal.o9b.c8.n5(this.k5, var1.k5);
      boolean var5 = com.aspose.slides.ms.System.d1.a6(this.u3, var1.u3);
      boolean var6 = this.a6 == var1.a6;
      boolean var7 = this.u9 == var1.u9;
      boolean var8 = this.h0 == var1.h0;
      boolean var9 = this.c8 == var1.c8;
      boolean var10 = this.t2 == var1.t2;
      boolean var11 = this.s7 == var1.s7;
      boolean var12 = this.n3 == var1.n3;
      boolean var13 = this.e2 == var1.e2;
      boolean var14 = this.q0.n3() == var1.q0.n3();
      boolean var15 = this.t9 == var1.t9;
      return var2 && var3 && var4 && var5 && var6 && var7 && var8 && var9 && var10 && var11 && var12 && var13 && var14 && var15;
   }

   public final com.aspose.slides.internal.o9b.y1 n5() {
      return this.q0;
   }

   public final TextParam l6() {
      return this.z1;
   }

   public final com.aspose.slides.internal.o9b.w1 k5() {
      return this.z3;
   }

   public final com.aspose.slides.internal.o9b.c8 u3() {
      return this.n5;
   }

   public final com.aspose.slides.internal.o9b.c8 a6() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8 u9() {
      return this.k5;
   }

   public final String h0() {
      return this.u3;
   }

   public final boolean c8() {
      return this.a6;
   }

   public final boolean t2() {
      return this.h0;
   }

   public final boolean s7() {
      return this.c8;
   }

   public final boolean x8() {
      return this.t2;
   }

   public final boolean n3() {
      return this.s7;
   }

   public final boolean y4() {
      return this.n3;
   }

   public final boolean e2() {
      return this.y4;
   }

   public final float t9() {
      return this.e2;
   }

   public final boolean z1() {
      return this.u9;
   }

   public final String t4() {
      return this.m1;
   }

   public final boolean q0() {
      return this.k7;
   }

   public final String z3() {
      return this.t4.toString();
   }

   public final void n5(float var1) {
      this.z3.n5(this.z3.l6() + var1);
   }

   public final void n5(String var1, float var2) {
      this.t4.n5(var1);
      this.q0.l6(this.q0.s7() + var2);
   }

   private com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.y1 var1, TextParam var2) {
      com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(var1.u9().l6(), var1.u9().k5());
      var3.l6(var3.k5() - var2.k5() / 100.0F * var2.t4());
      return var3;
   }
}
