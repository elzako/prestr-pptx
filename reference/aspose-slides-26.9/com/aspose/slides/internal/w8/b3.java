package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class b3 extends com.aspose.slides.internal.w5.k5 {
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("1", "a", "A", "i", "I");

   public b3(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final boolean j9() {
      return this.t2("compact");
   }

   public final void n5(boolean var1) {
      this.k5("compact", var1);
   }

   public final int z6() {
      return this.n5("start", 1, Integer.class);
   }

   public final void n5(int var1) {
      this.n5("start", var1);
   }

   public final String e9() {
      return this.t2("type", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("type", var1);
   }

   public final String o5() {
      switch (k5.n5(this.u3("type"))) {
         case 0:
            return "decimal";
         case 1:
            return "lower-alpha";
         case 2:
            return "upper-alpha";
         case 3:
            return "lower-roman";
         case 4:
            return "upper-roman";
         default:
            return "decimal";
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      if (this.a3().k7().h0() != 0 && this.j8()) {
         var1.n5(this);
         this.l6(var1);
         var1.l6(this);
      } else {
         var1.h0(this);
         this.l6(var1);
         var1.c8(this);
      }
   }

   private boolean j8() {
      for (com.aspose.slides.internal.f5.r4 var1 = this.a0(); var1 != null; var1 = var1.s3()) {
         com.aspose.slides.internal.w5.k5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.w5.k5.class);
         if (var2 != null && var2.a3().k7().h0() == 2 && var2.a3().w1() == 2) {
            return true;
         }
      }

      return false;
   }
}
