package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class w2 extends com.aspose.slides.internal.w5.k5 {
   public w2(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final int j9() {
      o5 var1 = this.n5(o5.class);
      return var1 != null ? this.l6(var1.o5()) : -1;
   }

   public final int z6() {
      v8 var1 = this.n5(v8.class);
      return var1 != null ? this.l6(var1.j8()) : -1;
   }

   public final j9 e9() {
      return new j9(this);
   }

   public final String o5() {
      return this.t2("align", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("align", var1);
   }

   public final String j8() {
      return this.t2("bgcolor", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("bgcolor", var1);
   }

   public final String w2() {
      return this.t2("char", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("char", var1);
   }

   public final String s0() {
      return this.t2("charoff", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("charoff", var1);
   }

   public final String v8() {
      return this.t2("valign", d1.n5);
   }

   public final void r4(String var1) {
      this.n5("valign", var1);
   }

   public final com.aspose.slides.internal.h6.n5 n5(int var1) {
      j9 var2 = this.e9();
      if (var1 >= -1 && var1 <= var2.n5()) {
         com.aspose.slides.internal.h6.n5 var3 = com.aspose.slides.internal.v6g.k5.n5(this.y4().a6("TD"), com.aspose.slides.internal.h6.n5.class);
         return var1 != -1 && var1 != var2.n5()
            ? com.aspose.slides.internal.v6g.k5.n5(this.n5(var3, (com.aspose.slides.internal.f5.r4)var2.n5(var1)), com.aspose.slides.internal.h6.n5.class)
            : com.aspose.slides.internal.v6g.k5.n5(this.k5(var3), com.aspose.slides.internal.h6.n5.class);
      } else {
         throw new com.aspose.slides.internal.j3.l6((byte)1);
      }
   }

   public final void l6(int var1) {
      j9 var2 = this.e9();
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
      var1.x8(this);
      this.l6(var1);
      var1.n3(this);
   }
}
