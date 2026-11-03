package com.aspose.slides.internal.k7;

import com.aspose.slides.internal.k5.l6$n5;

public class a6 extends n5 {
   private h0 n5;
   private h0 l6;
   private boolean k5;
   private boolean u3;

   public a6(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      if (this.l6()) {
         if (l6$n5.a5 == var1) {
            this.k5 = true;
         } else if (l6$n5.h2 == var1) {
            this.u3 = true;
         }
      } else if (var1.h0() == 2) {
         com.aspose.slides.internal.k5.h0 var2 = (com.aspose.slides.internal.k5.h0)var1;
         if (var2.n5() == 1) {
            this.n5 = new h0(var2.n5(0));
            this.l6 = new h0(l6$n5.y1);
         } else {
            this.n5 = new h0(var2.n5(0));
            this.l6 = new h0(var2.n5(1));
         }
      } else {
         h0 var3 = new h0(var1);
         this.n5 = var3;
         this.l6 = var3;
      }
   }

   public final h0 h0() {
      return this.n5;
   }

   public final h0 c8() {
      return this.l6;
   }
}
