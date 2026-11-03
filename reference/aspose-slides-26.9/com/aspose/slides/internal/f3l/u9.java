package com.aspose.slides.internal.f3l;

import com.aspose.slides.internal.o9b.y4;
import java.util.HashMap;

public class u9 {
   private static HashMap<Integer, y4> n5 = new HashMap<>(3);
   private static String[] l6 = new String[]{
      "Helvetica",
      "Helv",
      "Arial",
      "MS Sans Serif",
      "Microsoft Sans Serif",
      "Pragmatica",
      "Swiss 721",
      "Nimbus Sans",
      "Nimbus Sans L",
      "CNN Sans",
      "FreeSans",
      "CG Triumvirate",
      "Liberation Sans",
      "Europa Grotesk",
      "Arial Narrow",
      "Arial Black"
   };
   private static String[] k5 = new String[]{"Times New Roman", "Times", "Georgia", "Nimbus Roman", "Times Roman"};
   private static String[] u3 = new String[]{
      "Courier New",
      "Courier",
      "Courier New Baltic",
      "Courier New CE",
      "Courier New Cyr",
      "Courier New Greek",
      "Courier New Tur",
      "Courier Final Draft",
      "Dark Courier",
      "Courier 10 Pitch BT",
      "Courier Prime",
      "Nimbus Mono L",
      "Nimbus Mono",
      "FreeMono",
      "Liberation Mono"
   };

   public static y4 n5(int var0) {
      if (!n5.containsKey(var0)) {
         y4 var1 = l6(var0);
         n5.put(var0, var1);
      }

      return n5.get(var0);
   }

   private static y4 l6(int var0) {
      switch (var0) {
         case 0:
            for (String var13 : k5) {
               y4 var15 = com.aspose.slides.internal.f3l.k5.k5(var13);
               if (var15 != null) {
                  return var15;
               }
            }
            break;
         case 1:
            for (String var12 : l6) {
               y4 var14 = com.aspose.slides.internal.f3l.k5.k5(var12);
               if (var14 != null) {
                  return var14;
               }
            }
            break;
         default:
            for (String var4 : u3) {
               y4 var5 = com.aspose.slides.internal.f3l.k5.k5(var4);
               if (var5 != null) {
                  return var5;
               }
            }
      }

      return null;
   }
}
