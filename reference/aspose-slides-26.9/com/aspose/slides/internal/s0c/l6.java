package com.aspose.slides.internal.s0c;

import com.aspose.slides.internal.p6w.h0;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;

public class l6 {
   public static n5 n5(int var0, int var1, int var2, int[] var3) {
      if (var0 != 2 || var1 != 1 && var1 != -1 || var2 != 6 && var2 != -1 && var2 != 0) {
         if (var0 == 2 && var1 == 2 && var2 == 17) {
            var3[0] = 0;
            return new u3();
         } else {
            var3[0] = 10044;
            return null;
         }
      } else {
         var3[0] = 0;
         return new k5();
      }
   }

   static void n5(Selector var0) {
      Set var1 = var0.keys();
      Iterator var2 = var1.iterator();

      try {
         var0.close();
      } catch (Exception var8) {
      }

      while (var2.hasNext()) {
         SelectionKey var3 = (SelectionKey)var2.next();
         h0 var4 = (h0)var3.attachment();
         var3.cancel();

         try {
            if (var4.n5()) {
               var4.n5(true);
            }
         } catch (RuntimeException var7) {
         }
      }

      try {
         var0.close();
      } catch (Exception var6) {
      }
   }
}
