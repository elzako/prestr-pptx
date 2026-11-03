package com.aspose.slides.internal.k7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.IDisposable;

public class d2 extends n5 {
   private boolean n5;
   private IGenericList<String> l6;

   public d2(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      if (this.l6() && l6$n5.a0 == var1) {
         this.n5 = true;
      } else if (var1.h0() == 2) {
         this.l6 = new List<>();
         com.aspose.slides.internal.k5.h0 var2 = (com.aspose.slides.internal.k5.h0)var1;
         IGenericEnumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k5.u9 var4 = (com.aspose.slides.internal.k5.u9)var3.next();
               this.l6.addItem(((com.aspose.slides.internal.k5.u3)var4).l6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }
}
