package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class l6$l6 extends l6$n5 {
   private boolean u3 = true;

   public l6$l6(l6 var1) {
      super(var1);
   }

   @Override
   public void n5(List<c8> var1, k7 var2) {
      super.n5(var1, var2);
      if (com.aspose.slides.internal.u6.l6.c8(this.k5)) {
         this.n5(var1, true, true, true);
      } else {
         this.n5(com.aspose.slides.internal.u6.l6.a6(this.k5), var1);
         this.n5(var1);
      }

      this.l6(var1);
      com.aspose.slides.internal.u6.l6.n5(this.k5, var1);
      if (this.u3) {
         this.u3 = false;
         List$Enumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               c8 var4 = (c8)var3.next();
               var4.l6.l6 = var4.l6.n5;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   @Override
   public void l6() {
      if (com.aspose.slides.internal.u6.l6.t2(this.k5) != null) {
         com.aspose.slides.internal.u6.l6.t2(this.k5).l6();
      } else {
         this.k5(com.aspose.slides.internal.u6.l6.a6(this.k5), true, false, false);
      }

      if (this.k5 != null && com.aspose.slides.internal.u6.l6.a6(this.k5) != null) {
         List$Enumerator var1 = com.aspose.slides.internal.u6.l6.a6(this.k5).iterator();

         try {
            while (var1.hasNext()) {
               c8 var2 = (c8)var1.next();
               var2.k5.l6 = var2.k5.n5;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }
}
