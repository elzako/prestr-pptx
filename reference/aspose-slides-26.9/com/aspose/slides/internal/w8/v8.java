package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class v8 extends com.aspose.slides.internal.w5.k5 {
   public v8(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.t2("align", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("align", var1);
   }

   public final String z6() {
      return this.t2("char", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("char", var1);
   }

   public final String e9() {
      return this.t2("charoff", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("charoff", var1);
   }

   public final String o5() {
      return this.t2("valign", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("valign", var1);
   }

   public final s7 j8() {
      return new v3(this, this.h0("TR"));
   }

   public final com.aspose.slides.internal.h6.n5 n5(int var1) {
      s7 var2 = this.j8();
      if (var1 >= -1 && var1 <= var2.n5()) {
         com.aspose.slides.internal.h6.n5 var3 = com.aspose.slides.internal.v6g.k5.n5(this.y4().a6("TR"), com.aspose.slides.internal.h6.n5.class);
         return var1 != -1 && var1 != var2.n5()
            ? com.aspose.slides.internal.v6g.k5.n5(
               this.n5(var3, com.aspose.slides.internal.v6g.k5.n5(var2.n5(var1), com.aspose.slides.internal.f5.r4.class)),
               com.aspose.slides.internal.h6.n5.class
            )
            : com.aspose.slides.internal.v6g.k5.n5(this.k5(var3), com.aspose.slides.internal.h6.n5.class);
      } else {
         throw new com.aspose.slides.internal.j3.l6((byte)1);
      }
   }

   public final void l6(int var1) {
      s7 var2 = this.j8();
      if (var1 >= -1 && var1 < var2.n5()) {
         com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(
            var1 != -1 ? var2.n5(var1) : var2.n5(var2.n5() - 1), com.aspose.slides.internal.w5.k5.class
         );
         com.aspose.slides.internal.w5.k5 var4 = var3.p3();
         var4.l6(var3);
      } else {
         throw new com.aspose.slides.internal.j3.l6((byte)1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      if ("TBODY".equals(this.a6())) {
         var1.t4(this);
         this.l6(var1);
         var1.q0(this);
      } else if ("THEAD".equals(this.a6())) {
         var1.z3(this);
         this.l6(var1);
         var1.m1(this);
      } else if ("TFOOT".equals(this.a6())) {
         var1.k7(this);
         this.l6(var1);
         var1.m3(this);
      }
   }
}
