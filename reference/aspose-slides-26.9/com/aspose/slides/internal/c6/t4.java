package com.aspose.slides.internal.c6;

import com.aspose.slides.IParagraph;
import com.aspose.slides.ms.System.d1;

public class t4 {
   public static void n5(IParagraph var0, String var1) {
      var0.setText(var1);
      String[] var2 = d1.n5(var1, new String[]{"**"}, 0);
      if (var2.length > 1) {
         int var3 = 0;
         byte var4 = -1;

         for (String var8 : var2) {
            if (var8.length() > 0) {
               if (var3 == var0.getPortions().getCount()) {
                  var0.getPortions().add(a0.n5.invoke());
               }

               var0.getPortions().get_Item(var3).setText(var8);
               var0.getPortions().get_Item(var3).getPortionFormat().setFontBold(var4);
               var3++;
            }

            var4 = (byte)(var4 == -1 ? 1 : -1);
         }
      }
   }
}
