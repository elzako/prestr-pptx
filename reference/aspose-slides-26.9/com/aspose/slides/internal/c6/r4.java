package com.aspose.slides.internal.c6;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public abstract class r4 {
   private final ISlide n5;
   private final String l6;

   public r4(ISlide var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5() {
      IAutoShape var1 = null;
      IGenericEnumerator var2 = this.n5.getShapes().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            IAutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, IAutoShape.class);
            if (var4 != null && var4.getName() != null && d1.l6(var4.getName(), this.l6)) {
               var1 = var4;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (var1 != null) {
         this.n5(var1);
      }
   }

   protected abstract void n5(IAutoShape var1);
}
