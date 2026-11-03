package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class n6h {
   private static final Dictionary[] n5 = new Dictionary[0];

   public final n6h$n5 n5(List<n6h$l6> var1, List<List<n6h$l6>> var2) {
      n6h$l6 var3 = (n6h$l6)var1.get_Item(var1.size() - 1);
      String var4 = null;
      String[] var5 = new String[]{var4};
      var3.l6.tryGetValue("style", var5);
      var4 = var5[0];
      return var4 != null ? new n6h$n5(new Dictionary[]{n5(var4)}) : new n6h$n5(n5);
   }

   static Dictionary<String, String> n5(String var0) {
      Dictionary var1 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());

      for (String var5 : com.aspose.slides.ms.System.d1.n5(var0, ';')) {
         String var6 = com.aspose.slides.ms.System.d1.l6(var5);
         if (!com.aspose.slides.ms.System.d1.n5(var6)) {
            int var7 = com.aspose.slides.ms.System.d1.u3(var6, ':');
            if (var7 > 0) {
               String var8 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var6, 0, var7));
               if (var8.length() > 0) {
                  var1.set_Item(var8, com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var6, var7 + 1)));
               }
            }
         }
      }

      return var1;
   }
}
