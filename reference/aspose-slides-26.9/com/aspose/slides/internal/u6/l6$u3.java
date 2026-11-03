package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class l6$u3 extends l6$n5 {
   public l6$u3(l6 var1) {
      super(var1);
   }

   @Override
   public void n5(List<c8> var1, k7 var2) {
      super.n5(var1, var2);
      if (com.aspose.slides.internal.u6.l6.a6(this.k5) != null) {
         this.n5(com.aspose.slides.internal.u6.l6.a6(this.k5), var1);
      } else {
         List$Enumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               c8 var4 = (c8)var3.next();
               u3 var5 = var4.l6;
               var5.l6 = var5.n5;
               var5.k5 = var5.n5;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         this.n5(var1, true, false, true);
      }

      com.aspose.slides.internal.u6.l6.n5(this.k5, var1);
   }

   @Override
   public void n5() {
      super.n5();
      com.aspose.slides.internal.u6.l6.l6(this.k5, new List(com.aspose.slides.internal.u6.l6.n5(this.k5).v4()));
      List$Enumerator var1 = com.aspose.slides.internal.u6.l6.a6(this.k5).iterator();

      try {
         while (var1.hasNext()) {
            c8 var2 = (c8)var1.next();
            u3 var3 = var2.k5;
            var3.l6 = var3.n5;
            var3.k5 = var3.n5;
            com.aspose.slides.internal.u6.l6.l6(this.k5).addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      com.aspose.slides.internal.u6.l6.k5(this.k5, com.aspose.slides.internal.u6.l6.a6(this.k5));
   }

   @Override
   public void l6() {
      throw new InvalidOperationException();
   }
}
