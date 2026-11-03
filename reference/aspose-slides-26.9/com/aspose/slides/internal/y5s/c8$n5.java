package com.aspose.slides.internal.y5s;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

class c8$n5 {
   private final c8$n5$n5 n5 = new c8$n5$n5();

   public c8$n5() {
   }

   public void n5(int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5.n5(var1[var2], var2, 0);
      }
   }

   public int n5(int var1) {
      int var2 = var1 >> 16 & 0xFF;
      int var3 = var1 >> 8 & 0xFF;
      int var4 = var1 & 0xFF;
      Dictionary var5 = this.n5.n5(var1, 0);
      int var6 = 768;
      int var7 = -1;
      Dictionary$Enumerator var8 = var5.iterator();

      try {
         while (var8.hasNext()) {
            KeyValuePair var9 = (KeyValuePair)var8.next();
            int var10 = q1.n5(var2 - ((Integer)var9.getValue() >> 16 & 0xFF))
               + q1.n5(var3 - ((Integer)var9.getValue() >> 8 & 0xFF))
               + q1.n5(var4 - ((Integer)var9.getValue() & 0xFF));
            if (var10 < var6) {
               var6 = var10;
               var7 = (Integer)var9.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      return var7;
   }
}
