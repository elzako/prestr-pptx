package com.aspose.slides.internal.u6;

import com.aspose.slides.internal.h2.d5;
import com.aspose.slides.ms.System.d1;

public class z3 extends com.aspose.slides.internal.e5.t9 implements d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private boolean h0 = false;
   private static boolean c8 = false;

   public z3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
      if (!c8) {
         this.y4().u9(this, this.t9(), "fo:table-caption", this.m_());
         c8 = true;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
   }

   @Override
   public void c8() {
      if (this.u3 == null) {
         this.l6("marker* (%block;)");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.h0) {
               this.l6(var1, "fo:marker", "(%block;)");
            }
         } else if (!this.l6(var2, var3)) {
            this.k5(var1, var2, var3);
         } else {
            this.h0 = true;
         }
      }
   }

   @Override
   public String z1() {
      return "table-caption";
   }

   @Override
   public int z3() {
      return 74;
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }
}
