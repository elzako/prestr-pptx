package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class k9m implements v7 {
   private u0a n5;
   private Dictionary<Integer, Integer> l6;

   public k9m(u0a var1) {
      this.n5 = var1;
   }

   @Override
   public final int n5(r9 var1) {
      k2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
      if (var2 != null) {
         n3c var3 = this.n5.l6().c8().n5();
         if (var3 != null && ((var3.u3() & 65535) != 3 || (var3.a6() & 65535) != 0)) {
            if (this.l6 == null) {
               SortedList var13 = new SortedList();
               d4n var5 = com.aspose.slides.internal.v6g.k5.n5(var3, d4n.class);
               if (var5 != null) {
                  var5.n5(var13);
               } else {
                  var13.addItem(0L, 65535L);
               }

               this.l6 = new Dictionary<>();
               IGenericEnumerator var6 = var13.iterator();

               try {
                  while (var6.hasNext()) {
                     KeyValuePair var7 = (KeyValuePair)var6.next();

                     for (int var8 = ((Long)var7.getKey()).intValue(); var8 <= ((Long)var7.getValue()).intValue(); var8++) {
                        int var9 = var3.n5(var8);
                        if (var9 != 0 && !this.l6.containsKey(var9)) {
                           this.l6.set_Item(var9, var8);
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }

            if (var2.n5() >= 0 && var2.n5() < (this.n5.l6().a6().n5() & 65535)) {
               int var14 = 0;
               Integer[] var16 = new Integer[]{var14};
               int var17 = this.l6.tryGetValue(var2.n5(), var16) ? var16[0] : 0;
               var14 = var16[0];
               return var17;
            }
         } else if (this.n5.l6().x8() != null) {
            String var4 = this.n5.l6().x8().n5(var2.n5());
            if (!".notdef".equals(var4)) {
               return u9.n5.n5(var4);
            }
         }
      }

      return 0;
   }

   @Override
   public final void n5(int var1, int var2) {
      this.n5.l6().c8().l6(var2, var1 & 65535);
   }

   @Override
   public final r9 n5(int var1) {
      return this.l6(var1);
   }

   @Override
   public final r9 l6(int var1) {
      k2 var2 = null;
      n3c var3 = this.n5.l6().c8().n5();
      if (var3 != null) {
         int var4 = var3.n5(var1);
         if (var4 < this.n5.q0()) {
            if (var4 == 0 && var1 < 256) {
               var4 = var3.n5((char)(61440 + var1));
            }
         } else {
            var4 = 0;
         }

         var2 = new k2(var4);
      }

      return var2;
   }
}
