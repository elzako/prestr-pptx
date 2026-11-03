package com.aspose.slides.internal.m6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.h0;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.x8;

public class l6 extends k5 {
   private List<s7> n5;
   private List<Long> l6;
   private x8 k5;

   public l6(x8 var1, com.aspose.slides.internal.v2.u3 var2) {
      super(var1.u3());
      this.k5 = var1;
      this.n5(var2);
   }

   public final void k5() {
      try {
         c8 var1 = c8.n5("N");
         int var2 = this.k5.t2(var1);
         this.l6 = new List<>(var2);
         this.n5 = new List<>(var2);

         for (int var3 = 0; var3 < var2; var3++) {
            long var4 = this.n5().t2();
            long var6 = this.n5().x8();
            this.l6.addItem(var4);
         }

         com.aspose.slides.internal.v2.u9 var14 = null;
         s7 var8 = null;

         for (int var9 = 0; (var8 = this.h0()) != null; var9++) {
            var14 = new com.aspose.slides.internal.v2.u9(var8);
            var14.l6(h0.n5());
            if (var9 >= this.l6.size()) {
               break;
            }

            h0 var10 = h0.n5(this.l6.get_Item(var9));
            var14.n5(var10);
            this.n5.addItem(var14);
            if (!this.n5().l6() && this.n5().h0() == 'e') {
               this.n5().u3();
            }
         }
      } finally {
         this.n5().dispose();
      }
   }

   public final List<s7> u3() {
      return this.n5;
   }
}
