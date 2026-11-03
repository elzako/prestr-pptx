package com.aspose.slides.internal.c6;

import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class o0 {
   public static String n5(String var0) {
      for (com.aspose.slides.internal.x7n.l6 var4 : com.aspose.slides.internal.x7n.l6.n5(com.aspose.slides.internal.x7n.k5.n5)) {
         if (d1.u3(var4.u9(), var0, (short)3)) {
            return var4.s7();
         }

         if (d1.u3(var4.u9(), var0 + " ()", (short)3)) {
            return var4.s7();
         }
      }

      return d1.n5;
   }

   public static String n5(ITextFrame[] var0) {
      Dictionary var1 = new Dictionary();

      for (ITextFrame var5 : var0) {
         IGenericEnumerator var6 = var5.getParagraphs().iterator();

         try {
            while (var6.hasNext()) {
               IParagraph var7 = (IParagraph)var6.next();
               n5(var7, var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      return n5(var1);
   }

   public static boolean l6(String var0) {
      for (int var1 = 0; var1 < com.aspose.slides.internal.r7c.c8.n5(var0, "<.*?>", d1.n5).length(); var1++) {
         char var2 = com.aspose.slides.internal.r7c.c8.n5(var0, "<.*?>", d1.n5).charAt(var1);
         if (com.aspose.slides.ms.System.t9.u9(var2)) {
            return true;
         }
      }

      return false;
   }

   private static void n5(IParagraph var0, Dictionary<String, Integer> var1) {
      IGenericEnumerator var2 = var0.getPortions().iterator();

      try {
         while (var2.hasNext()) {
            IPortion var3 = (IPortion)var2.next();
            if (l6(var3.getText())) {
               String var4 = d1.n5(var3.getPortionFormat().getLanguageId()) ? "empty" : var3.getPortionFormat().getLanguageId();
               if (!var1.containsKey(var4)) {
                  var1.addItem(var4, 0);
               }

               var1.set_Item(var4, (Integer)var1.get_Item(var4) + 1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static String n5(Dictionary<String, Integer> var0) {
      String var1 = d1.n5;
      int var2 = 0;
      Dictionary$KeyCollection$Enumerator var3 = var0.getKeys().iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            if (!"empty".equals(var4) && (Integer)var0.get_Item(var4) > var2) {
               var1 = var4;
               var2 = (Integer)var0.get_Item(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }
}
