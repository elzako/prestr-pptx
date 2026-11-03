package com.aspose.slides.internal.u1n;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.ms.System.p6;
import com.aspose.slides.ms.System.p8;
import java.awt.Font;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public final class n5 {
   private static final HashMap<String, String> n5 = new HashMap<>();
   private static final String l6 = new Font("", 0, 1).getFamily(Locale.ROOT);

   public static y4[] n5(Map<String, Font[]> var0, com.aspose.slides.internal.v7u.n5 var1) {
      List var2 = new List();
      String[] var3 = (String[])var0.keySet().toArray(new String[0]);

      for (int var4 = 0; var4 < var0.size(); var4++) {
         try {
            y4 var5 = new y4(var3[var4], var1);
            var2.add(var5);
         } catch (RuntimeException var6) {
            com.aspose.slides.internal.f8y.n5.l6("Unable to crate FontFamily for :" + var3[var4] + p8.n5 + var6.getMessage());
         }
      }

      return (y4[])var2.toArray(new y4[0]);
   }

   public static Map<String, Font[]> n5(String[] var0) {
      TreeMap var1 = n5();

      for (String var5 : var0) {
         var1.put(var5, n5(var5));
      }

      return var1;
   }

   public static TreeMap<String, Font[]> n5() {
      return new TreeMap<>(p6.n5());
   }

   static Font[] n5(String var0) {
      Font[] var1 = new Font[4];

      for (int var2 = 0; var2 <= 3; var2++) {
         var1[var2] = new Font(var0, var2, 1);
      }

      Font var4 = null;

      for (int var3 = 0; var3 <= 3; var3++) {
         if (var0.equals(var1[var3].getFamily(Locale.ROOT))) {
            var4 = var1[var3];
            break;
         }
      }

      if (var4 == null) {
         return var1;
      }

      for (int var5 = 0; var5 <= 3; var5++) {
         if (!var0.equals(var1[var5].getFamily(Locale.ROOT))) {
            var1[var5] = var4.deriveFont(var5);
         }
      }

      return var1;
   }

   public static String l6(String var0) {
      synchronized (n5) {
         String var2 = n5.get(var0);
         if (var2 == null) {
            var2 = new Font(var0, 0, 1).getFamily(Locale.ROOT);
         }

         if (!var2.equals(var0) && !var2.equals(l6)) {
            n5.put(var0, var2);
            return var2;
         } else {
            return var0;
         }
      }
   }
}
