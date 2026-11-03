package com.aspose.slides.internal.q6f;

import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.internal.p2i.x8;
import java.util.HashMap;

public class k5 {
   private static HashMap<Integer, y4> n5 = new HashMap<>(3);

   public static y4 n5(Integer var0) {
      if (!n5.containsKey(var0)) {
         n5();
      }

      return n5.get(var0);
   }

   private static void n5() {
      com.aspose.slides.internal.v7u.l6 var0 = new com.aspose.slides.internal.v7u.l6();
      int var1 = 0;

      for (y4 var5 : var0.n5()) {
         com.aspose.slides.internal.q9r.k5 var6 = var0.l6().n5(var5.a6(), 0);
         if (var6 != null) {
            x8 var7 = new x8(var6.x8());
            if (var7.u3() == 9 && !n5.containsKey(2)) {
               n5.put(2, var5);
               var1++;
            }

            if (var7.l6() != 11 && var7.l6() != 12 && var7.l6() != 13) {
               if (var7.l6() != 1 && !n5.containsKey(0)) {
                  n5.put(0, var5);
                  var1++;
               }
            } else if (!n5.containsKey(1)) {
               n5.put(1, var5);
               var1++;
            }
         }

         if (var1 >= 3) {
            break;
         }
      }

      if (var1 < 3) {
         if (!n5.containsKey(2)) {
            n5.put(2, null);
         }

         if (!n5.containsKey(1)) {
            n5.put(1, null);
         }

         if (!n5.containsKey(0)) {
            n5.put(0, null);
         }
      }
   }
}
