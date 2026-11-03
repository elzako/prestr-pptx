package com.aspose.slides.internal.x2;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h7.m1;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.internal.v2.y4;
import com.aspose.slides.ms.System.d1;

public class l6 {
   private static final c8 n5 = c8.n5("CMapName");

   public static void n5(n5 var0, a6 var1) {
      n5(var0, var1, 0);
   }

   private static void n5(IGenericEnumerator<Object> var0, n5 var1, a6 var2, int var3) {
      List var4 = new List();

      while (var0.hasNext()) {
         Object var5 = var0.next();
         if (com.aspose.slides.internal.v6g.k5.l6(var5, s7.class)) {
            s7 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, s7.class);
            var4.addItem(var6);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var5, m1.class)) {
            m1 var7 = com.aspose.slides.internal.v6g.k5.n5(var5, m1.class);
            n5(var7, var4, var1, var2, var3);
            var4 = new List();
         } else {
            var4.addItem((s7)var5);
         }
      }
   }

   private static void n5(m1 var0, List<s7> var1, n5 var2, a6 var3, int var4) {
      String var5 = var0.n5;
      if (var4 == 0 && var1.size() == 2 && d1.a6(var5, "def")) {
         s7 var10 = (s7)var1.get_Item(0);
         if (c8.h3d.equals(var10)) {
            var2.k5(((s7)var1.get_Item(1)).toString());
         } else if (c8.c0.equals(var10)) {
            var2.l6(((s7)var1.get_Item(1)).toString());
         } else if (n5.equals(var10)) {
            var2.n5(((s7)var1.get_Item(1)).toString());
         } else if (c8.k2p.equals(var10)) {
            try {
               var2.n5(((t2)var1.get_Item(1)).k5());
            } catch (RuntimeException var8) {
            }
         }
      } else if ((d1.a6(var5, "endcidchar") || d1.a6(var5, "endbfchar")) && var1.size() >= 2) {
         int var9 = var1.size() - 1;

         for (int var11 = 0; var11 < var9; var11 += 2) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var11), y4.class)) {
               var2.n5((y4)var1.get_Item(var11), (s7)var1.get_Item(var11 + 1));
            }
         }
      } else if ((d1.a6(var5, "endcidrange") || d1.a6(var5, "endbfrange")) && var1.size() >= 3) {
         int var6 = var1.size() - 2;

         for (int var7 = 0; var7 < var6; var7 += 3) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var7), y4.class) && com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var7 + 1), y4.class)) {
               var2.n5((y4)var1.get_Item(var7), (y4)var1.get_Item(var7 + 1), (s7)var1.get_Item(var7 + 2));
            }
         }
      } else if (d1.a6(var5, "usecmap") && var1.size() == 1 && com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(0), c8.class)) {
         n5(var2, var3, var4 + 1);
      }
   }

   private static void n5(n5 var0, a6 var1, int var2) {
      if (var2 < 10) {
         IGenericEnumerator var3 = var1.n5();

         try {
            n5(var3, var0, var1, var2);
         } catch (RuntimeException var8) {
         } finally {
            var3.dispose();
         }
      }
   }
}
