package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class n3 extends com.aspose.slides.internal.e5.t9 implements com.aspose.slides.internal.h2.d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private t9 h0 = null;
   private y4 c8;

   public n3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
   }

   @Override
   public void u9() {
      this.n_().n5(this);
   }

   @Override
   public void c8() {
      super.c8();
      if (this.h0 == null || this.c8 == null) {
         this.l6("(inline,footnote-body)");
      }

      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "inline")) {
            if (this.h0 != null) {
               this.n5(var1, "fo:inline");
            }
         } else if (d1.a6(var3, "footnote-body")) {
            if (this.h0 == null) {
               this.l6(var1, "fo:inline", "fo:footnote-body");
            } else if (this.c8 != null) {
               this.n5(var1, "fo:footnote-body");
            }
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      if (var1.z3() == 35) {
         this.h0 = (t9)var1;
      } else if (var1.z3() == 25) {
         this.c8 = (y4)var1;
      }
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   public final t9 e5() {
      return this.h0;
   }

   public final y4 b3() {
      return this.c8;
   }

   @Override
   public String z1() {
      return "footnote";
   }

   @Override
   public int z3() {
      return 24;
   }
}
