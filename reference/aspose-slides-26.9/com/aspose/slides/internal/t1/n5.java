package com.aspose.slides.internal.t1;

public abstract class n5 extends com.aspose.slides.internal.e5.t9 {
   protected com.aspose.slides.internal.f2.u3 u9;
   protected int h0;
   private String t2;
   private int s7;
   private char x8;
   private int n3;
   private com.aspose.slides.internal.f2.u3 y4;
   private String e2;
   private String t9;
   private String z1;
   private c8 t4;
   protected int c8 = 0;

   public n5(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.a6(126).u9();
      this.h0 = var1.a6(109).a6();
      this.t2 = var1.a6(110).j_();
      this.s7 = var1.a6(142).a6();
      this.x8 = var1.a6(113).h_();
      this.n3 = com.aspose.slides.internal.v6g.k5.u3(var1.a6(114).h0(), int.class);
      this.y4 = var1.a6(197).u9();
      this.e2 = var1.a6(134).j_();
      this.t9 = var1.a6(81).j_();
      this.z1 = var1.a6(276).j_();
   }

   @Override
   public void u9() {
      this.t4 = new c8(this.t2, this.x8, this.n3, this.s7, this.z1, this.e2, this.t9);
   }

   public final void i1() {
      int var1 = 0;
      if (this.u9.a6() != 0) {
         this.c8 = this.e2().e5() + 1;
         var1 = this.u9.a6();
         if (var1 == 11) {
            if (this.c8 % 2 == 0) {
               this.c8++;
            }
         } else if (var1 == 10 && this.c8 % 2 == 1) {
            this.c8++;
         }
      } else {
         int var2 = this.u9.u3();
         this.c8 = var2 > 0 ? var2 : 1;
      }
   }

   public final int e5() {
      return this.c8;
   }

   public final String a6(int var1) {
      return this.t4.n5(var1);
   }

   @Override
   public k7 e2() {
      return (k7)this.s_();
   }

   public final int b3() {
      return this.h0;
   }

   public final com.aspose.slides.internal.f2.u3 o0() {
      return this.u9;
   }
}
