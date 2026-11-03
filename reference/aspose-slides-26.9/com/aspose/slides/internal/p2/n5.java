package com.aspose.slides.internal.p2;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.ms.System.IDisposable;

public class n5 extends l6 {
   private com.aspose.slides.internal.v2.k5 k5;

   public n5(com.aspose.slides.internal.v2.k5 var1) {
      this.k5 = var1;
      l6 var2 = u9.k5;
      c8 var3 = (c8)this.k5.u9(c8.c4);
      if (var3 != null) {
         var2 = com.aspose.slides.internal.p2.k5.n5.n5(var3);
      }

      Dictionary$Enumerator var4 = var2.l6.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            if (!this.l6.containsKey((String)var5.getKey())) {
               this.l6.addItem((String)var5.getKey(), (Integer)var5.getValue());
            } else {
               this.l6.set_Item((String)var5.getKey(), (Integer)var5.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      Dictionary$Enumerator var17 = var2.n5.iterator();

      try {
         while (var17.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var17.next();
            if (!this.n5.containsKey((Integer)var6.getKey())) {
               this.n5.addItem((Integer)var6.getKey(), (String)var6.getValue());
            } else {
               this.n5.set_Item((Integer)var6.getKey(), (String)var6.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
            var17.dispose();
         }
      }

      com.aspose.slides.internal.v2.n5 var18 = (com.aspose.slides.internal.v2.n5)this.k5.u9(c8.i4);
      int var7 = -1;

      for (int var8 = 0; var18 != null && var8 < var18.n5(); var8++) {
         s7 var9 = var18.l6(var8);
         if (com.aspose.slides.internal.v6g.k5.l6(var9, t2.class)) {
            var7 = ((t2)var9).k5();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var9, c8.class)) {
            c8 var10 = (c8)var9;
            this.l6(var7++, var10.n5());
         }
      }
   }

   @Override
   public s7 t2() {
      return this.k5;
   }
}
