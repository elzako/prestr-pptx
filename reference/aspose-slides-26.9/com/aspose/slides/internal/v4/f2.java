package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class f2 extends com.aspose.slides.internal.e5.z1 {
   private boolean c8 = false;

   public f2(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void c8() {
      super.c8();
      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.c8) {
               this.l6(var1, "fo:marker", "(#PCDATA|%inline;|%block;)");
            }
         } else if (this.u3(var2, var3)) {
            try {
               com.aspose.slides.internal.e5.t2.n5(this.n5, var1, var2, var3);
            } catch (com.aspose.slides.internal.e5.d5 var5) {
               this.n5(var1, this.t9(), "http://www.w3.org/1999/XSL/Format", var3, "rule.wrapperInvalidChildForParent");
            }

            this.c8 = true;
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      super.n5(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e5.x8.class) && ((com.aspose.slides.internal.e5.x8)var1).w1()) {
         com.aspose.slides.internal.e5.t2 var2 = this.n5;

         while (var2.z3() == 81) {
            var2 = var2.s_();
         }

         if (!com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.e5.z1.class)) {
            this.n5(this.m_(), this.z1(), "http://www.w3.org/1999/XSL/Format", "#PCDATA", "rule.wrapperInvalidChildForParent");
         }
      }
   }

   @Override
   public String z1() {
      return "wrapper";
   }

   @Override
   public int z3() {
      return 81;
   }

   @Override
   public boolean n5(int var1) {
      return false;
   }
}
