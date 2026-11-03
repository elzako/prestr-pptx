package com.aspose.slides.internal.z4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l6 {
   private List<l6$n5> n5 = new List<>();

   public final void n5(String var1, int var2) {
      this.n5(new l6$n5(var1, var2));
   }

   public final boolean n5(String var1) {
      return this.k5(var1) != null;
   }

   private void n5(l6$n5 var1) {
      this.n5.addItem(var1);
   }

   private void k5(String var1, int var2) {
      l6$n5 var3 = this.k5(var1);
      if (var3 == null) {
         this.n5(var1, var2);
      } else {
         var3.n5(var2);
      }
   }

   private l6$n5 k5(String var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            l6$n5 var3 = (l6$n5)var2.next();
            if (var3.n5(var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final int l6(String var1) {
      return this.k5(var1).l6();
   }

   public final void l6(String var1, int var2) {
      this.k5(var1, var2);
   }
}
