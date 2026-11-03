package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class l6$k5 extends l6$n5 {
   public l6$k5(l6 var1) {
      super(var1);
   }

   @Override
   public void n5(List<c8> var1, k7 var2) {
      super.n5(var1, var2);
      if (com.aspose.slides.internal.u6.l6.u9(this.k5) == null) {
         com.aspose.slides.internal.u6.l6.u3(this.k5, var1);
      } else {
         this.n5(com.aspose.slides.internal.u6.l6.h0(this.k5), var1);
      }

      com.aspose.slides.internal.u6.l6.a6(this.k5, var1);
   }

   @Override
   public void n5() {
      this.l6(com.aspose.slides.internal.u6.l6.h0(this.k5), true, true, true);
      com.aspose.slides.internal.u6.l6.u9(this.k5, new List(com.aspose.slides.internal.u6.l6.n5(this.k5).v4()));
      List$Enumerator var1 = com.aspose.slides.internal.u6.l6.u9(this.k5).iterator();

      try {
         while (var1.hasNext()) {
            c8 var2 = (c8)var1.next();
            u3 var3 = var2.l6;
            var3.l6 = var3.n5;
            var3.k5 = var3.n5;
            com.aspose.slides.internal.u6.l6.k5(this.k5).addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   @Override
   public void l6() {
      this.n5(com.aspose.slides.internal.u6.l6.a6(this.k5), com.aspose.slides.internal.u6.l6.u9(this.k5));
      List$Enumerator var1 = com.aspose.slides.internal.u6.l6.h0(this.k5).iterator();

      try {
         while (var1.hasNext()) {
            c8 var2 = (c8)var1.next();
            u3 var3 = var2.k5;
            var3.l6 = var3.n5;
            var3.k5 = var3.n5;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.k5(com.aspose.slides.internal.u6.l6.h0(this.k5), true, false, true);
   }
}
