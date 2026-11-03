package com.aspose.slides.internal.j8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class l6 {
   private int n5 = 0;
   private Dictionary<String, n5> l6 = new Dictionary<>();

   public final String n5(n5 var1) {
      this.n5++;
      String var2 = var1.k5();
      if (var2 == null) {
         throw new Exception("Action class is not compatible");
      } else {
         return d1.n5(new String[]{var2, a3.l6(this.n5)});
      }
   }

   public final n5 l6(n5 var1) {
      if (!var1.l6()) {
         var1.n5(this.n5(var1));
      }

      n5 var2 = this.k5(var1);
      if (var2 == var1) {
         this.l6.set_Item(var1.n5(), var1);
      }

      return var2;
   }

   private n5 k5(n5 var1) {
      Dictionary$ValueCollection$Enumerator var2 = this.l6.getValues().iterator();

      try {
         while (var2.hasNext()) {
            n5 var3 = (n5)var2.next();
            if (var3.n5(var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
