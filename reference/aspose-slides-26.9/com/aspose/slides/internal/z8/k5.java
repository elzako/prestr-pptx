package com.aspose.slides.internal.z8;

import com.aspose.slides.ms.System.d1;

public class k5 implements t4 {
   private com.aspose.slides.internal.h0.l6 n5;
   private com.aspose.slides.internal.h0.h0 l6;

   public k5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.j3.z8 var2) {
      this.l6 = var1;
      if (var2 != null) {
         this.n5 = new com.aspose.slides.internal.h0.j5(new com.aspose.slides.internal.y4.z1(var1), var2, var1);
      } else {
         this.n5 = new com.aspose.slides.internal.h0.m1(var1);
      }
   }

   public final com.aspose.slides.internal.h0.l6 n5() {
      return this.n5;
   }

   @Override
   public final void n5(String var1, y4 var2, boolean var3) {
      int var4 = this.l6.l6(d1.a6(var1));
      if (var4 != -1) {
         com.aspose.slides.internal.n3.m1 var5 = this.l6.u9(var4);
         if (!this.l6.c8(var4)) {
            com.aspose.slides.internal.k5.u9 var6 = var5.n5(var2, this.l6);
            if (var6.h0() != 2 && var2.k5() != null) {
               throw u9.u3(var1);
            }

            this.n5.n5(var4, var6, var3);
         } else {
            com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.n3.e2.class).n5(this.l6, this, var2, var3);
         }
      } else {
         this.l6.u3().n5(new u3(d1.n5("Invalid property name '{0}'.", new Object[]{var1})));
      }
   }
}
