package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;

public class l6 extends z3 {
   private final m1 n5;

   public l6(k7[] var1) {
      this.n5 = new m1(var1);
   }

   @Override
   public k5 n5(String var1, int var2) {
      return this.n5.n5(var1, var2);
   }

   @Override
   public u3 n5(String var1) {
      return this.n5.n5(var1);
   }

   public void n5(k7 var1) {
      this.n5.n5(var1);
   }

   public static boolean n5(l6 var0, l6 var1) {
      boolean var2 = false;
      Dictionary var3 = var0.n5.n5();
      Dictionary var4 = var1.n5.n5();
      if (var3.size() != var4.size()) {
         return false;
      }

      Dictionary$KeyCollection$Enumerator var5 = var4.getKeys().iterator();

      try {
         while (var5.hasNext()) {
            String var6 = (String)var5.next();
            if (!var3.containsKey(var6)) {
               return false;
            }

            m3 var7 = (m3)var3.get_Item(var6);
            m3 var8 = (m3)var4.get_Item(var6);
            if (!var7.l6().equals(var8.l6()) || !var7.n5().equals(var8.n5())) {
               var2 = false;
               break;
            }

            var2 = true;
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var2;
   }
}
