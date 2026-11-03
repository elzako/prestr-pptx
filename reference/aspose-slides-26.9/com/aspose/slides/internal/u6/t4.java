package com.aspose.slides.internal.u6;

import com.aspose.slides.internal.h2.d5;
import com.aspose.slides.ms.System.d1;

public class t4 extends com.aspose.slides.internal.e5.t9 implements d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private static boolean h0 = false;
   private boolean c8 = false;
   private boolean t2 = false;

   public t4(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
      if (!h0) {
         this.y4().u9(this, this.t9(), "fo:table-and-caption", this.m_());
         h0 = true;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
   }

   @Override
   public void c8() {
      if (!this.t2) {
         this.l6("marker* table-caption? table");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.c8) {
               this.l6(var1, "fo:marker", "fo:table-caption");
            } else if (this.t2) {
               this.l6(var1, "fo:marker", "fo:table");
            }
         } else if (d1.a6(var3, "table-caption")) {
            if (this.c8) {
               this.n5(var1, "fo:table-caption");
            } else if (this.t2) {
               this.l6(var1, "fo:table-caption", "fo:table");
            } else {
               this.c8 = true;
            }
         } else if (d1.a6(var3, "table")) {
            if (this.t2) {
               this.n5(var1, "fo:table");
            } else {
               this.t2 = true;
            }
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public String z1() {
      return "table-and-caption";
   }

   @Override
   public int z3() {
      return 72;
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }
}
