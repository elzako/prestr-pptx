package com.aspose.slides.internal.t1;

import com.aspose.slides.internal.o9b.y1;

public class t9 extends x8 {
   private com.aspose.slides.internal.h2.n3 h0;
   private com.aspose.slides.internal.f2.u3 c8;
   private com.aspose.slides.internal.f2.k5 t2;

   public t9(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.h0 = var1.h0();
      this.c8 = var1.a6(74).u9();
      this.t2 = var1.a6(75).c8();
      if (this.t1() > 1 && this.o0() == 126) {
         this.y4().l6(this, this.t9(), this.m_());
      }
   }

   public final int t1() {
      return this.c8.u3();
   }

   public final int a5() {
      return this.t2.u3();
   }

   @Override
   public y1 n5(com.aspose.slides.internal.f2.n5 var1) {
      com.aspose.slides.internal.f2.u9 var2 = this.a6(5);
      com.aspose.slides.internal.f2.u9 var3 = this.u9(5);
      int var4;
      int var5;
      switch (this.u6().l6()) {
         case 79:
         default:
            var4 = this.h0.k5.l6(var2);
            var5 = this.h0.u3.l6(var2);
            break;
         case 121:
            var4 = this.h0.u3.l6(var2);
            var5 = this.h0.k5.l6(var2);
            break;
         case 140:
         case 205:
            var4 = this.h0.n5.l6(var2);
            var5 = this.h0.l6.l6(var2);
      }

      int var6 = this.h0.a6.u3(var3).c8().l6(var3);
      int var7 = this.h0.u9.u3(var3).c8().l6(var3);
      return new y1(var4, var6, var1.n5 - var4 - var5, var1.l6 - var6 - var7);
   }

   @Override
   public String i1() {
      return "xsl-region-body";
   }

   @Override
   public String z1() {
      return "region-body";
   }

   @Override
   public int z3() {
      return 58;
   }
}
