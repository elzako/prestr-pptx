package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public abstract class l6 extends com.aspose.slides.internal.e5.t9 implements com.aspose.slides.internal.h2.d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private com.aspose.slides.internal.h2.f2 h0;
   private boolean c8 = false;

   public l6(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.h0 = var1.a6(131).y4();
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.c8) {
               this.l6(var1, "fo:marker", "(%block;)");
            }
         } else if (!this.l6(var2, var3)) {
            this.k5(var1, var2, var3);
         } else {
            this.c8 = true;
         }
      }
   }

   @Override
   public void c8() {
      if (!this.c8) {
         String var1 = "marker* (%block;)+";
         this.y4().n5(this, this.t9(), var1, true, this.m_());
      }
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   public final com.aspose.slides.internal.h2.f2 e5() {
      return this.h0;
   }
}
