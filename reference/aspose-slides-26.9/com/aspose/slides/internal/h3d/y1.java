package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.ms.System.j8;

public final class y1 {
   s3 n5 = new s3();
   Hashtable l6 = new Hashtable(y1$n5.l6, y1$n5.l6);
   private z8$n5 u3;
   final com.aspose.slides.internal.v6g.n5<z8$n5> k5 = new a0(this);

   public y1(s3 var1) {
      var1.n5(this.n5);
   }

   public void n5(Object var1) {
      if (!this.l6.contains(var1)) {
         z8 var2 = z8.n5(j8.n5(var1));
         this.l6.set_Item(var1, y1$n5.n5);
         var2.n5(var1, this.n5.k5());
         if (var2.n5()) {
            this.k5.l6(new d5(this, var2, var1));
         }
      }
   }

   public void n5() {
      if (this.u3 != null) {
         this.u3.n5(this.n5.k5());
      }
   }

   // $VF: synthetic method
   static z8$n5 n5(y1 var0, z8$n5 var1) {
      return var0.u3 = var1;
   }
}
