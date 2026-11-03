package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class f5 extends com.aspose.slides.internal.w5.k5 {
   public f5(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final boolean j9() {
      return this.t2("compact");
   }

   public final void n5(boolean var1) {
      this.k5("compact", var1);
   }

   public final String z6() {
      return this.t2("type", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("type", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      if (this.a3().a3() != 2 || this.a3().y2().c8().l6() != -9999.0F) {
         if (this.a3().k7().h0() != 0 && this.e9()) {
            var1.n5(this);
            this.l6(var1);
            var1.l6(this);
         } else {
            var1.h0(this);
            this.l6(var1);
            var1.c8(this);
         }
      }
   }

   private boolean e9() {
      for (com.aspose.slides.internal.f5.r4 var1 = this.a0(); var1 != null; var1 = var1.s3()) {
         com.aspose.slides.internal.w5.k5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.w5.k5.class);
         if (var2 != null && var2.a3().k7().h0() == 2 && var2.a3().w1() == 2) {
            return true;
         }
      }

      return false;
   }
}
