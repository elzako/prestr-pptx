package com.aspose.slides.internal.r8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n5 extends k5 {
   private IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> n5;
   private IGenericDictionary<KeyValuePair<String, String>, IGenericEnumerable<KeyValuePair<String, String>>> l6;
   private int k5;

   protected n5() {
   }

   public static n5 n5(IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> var0, int var1, String var2) {
      n5 var3 = (n5)n5(new n5(), var0.getKeys(), var2);
      var3.l6 = null;
      var3.n5 = new Dictionary<>(var0);
      var3.k5 = var1;
      return var3;
   }

   @Override
   public short n5(z8 var1) {
      short var2 = super.n5(var1);
      if (var2 != 1) {
         return var2;
      }

      IGenericEnumerable var3 = null;
      if (this.n5 != null && this.n5.containsKey(var1.h0())) {
         var3 = this.n5.get_Item(var1.h0());
      } else if (this.l6 != null) {
         KeyValuePair var4 = new KeyValuePair<>(var1.s7(), var1.t2());
         if (this.l6.containsKey(var4.Clone())) {
            var3 = this.l6.get_Item(var4.Clone());
         }
      }

      if (var3 == null) {
         return 1;
      }

      IGenericEnumerator var11 = var3.iterator();

      try {
         while (var11.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var11.next();
            if (var1.A_().n5((String)var5.getKey())) {
               if (!d1.n5((String)var5.getValue())) {
                  String var6 = var1.A_().l6((String)var5.getKey()).k5();
                  if (var6 != null && d1.n5(var6, (String)var5.getValue(), (short)5)) {
                     if (this.k5 == 0) {
                        return 1;
                     }
                  } else if (this.k5 == 1) {
                     return 3;
                  }
               } else if (this.k5 == 0) {
                  return 1;
               }
            } else if (this.k5 == 1) {
               return 3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      return (short)(this.k5 == 1 ? 1 : 3);
   }
}
