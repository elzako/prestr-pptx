package com.aspose.slides.internal.e2l;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.z0k.t4;

public class l6 {
   private static final List<c8> n5 = new List<>();

   public static c8 n5(t4 var0) {
      c8 var1 = null;
      a0 var2 = new a0(var0);

      try {
         for (int var3 = n5.size() - 1; var3 >= 0; var3--) {
            c8 var4 = n5.get_Item(var3);
            var2.a6();
            if (var4.n5(var2)) {
               var1 = var4;
               break;
            }
         }

         var2.a6();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var1;
   }

   static {
      n5.addItem(new com.aspose.slides.internal.y9r.u3());
      n5.addItem(new com.aspose.slides.internal.y9r.n5());
      n5.addItem(new com.aspose.slides.internal.y9r.k5());
      n5.addItem(new com.aspose.slides.internal.y9r.a6());
      n5.addItem(new com.aspose.slides.internal.y9r.u9());
   }
}
