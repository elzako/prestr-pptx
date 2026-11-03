package com.aspose.slides.internal.v2s;

import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.v6g.k5;

public class n5 {
   private Hashtable n5 = new Hashtable(CaseInsensitiveHashCodeProvider.getDefaultInvariant(), CaseInsensitiveComparer.getDefaultInvariant());

   public n5(Object var1) {
      if (var1 != null && k5.l6(var1, n5.class)) {
         n5 var2 = (n5)var1;

         for (Object recoveredElement$var4$544 : var2.n5.getKeys()) {
            String var4 = (String)recoveredElement$var4$544;
            this.n5.set_Item(var4, var2.n5.get_Item(var4));
         }
      }
   }

   public long n5(String var1) {
      Object var2 = this.n5.get_Item(var1);
      if (var2 == null) {
         var2 = this.n5.get_Item("*");
      }

      return var2 == null ? k5.a6(2, 9) : k5.u3(var2, long.class);
   }
}
