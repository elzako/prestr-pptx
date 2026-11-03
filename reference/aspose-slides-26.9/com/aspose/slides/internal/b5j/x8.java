package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class x8 {
   private final Dictionary<String, List<com.aspose.slides.internal.k2s.l6>> n5 = new Dictionary<>();
   private final Dictionary<String, com.aspose.slides.internal.d0e.t2> l6 = new Dictionary<>();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("font-face", "missing-glyph", "glyph", "hkern", "vkern");

   public final Dictionary<String, List<com.aspose.slides.internal.k2s.l6>> n5() {
      return this.n5;
   }

   public final Dictionary<String, com.aspose.slides.internal.d0e.t2> l6() {
      return this.l6;
   }

   public final com.aspose.slides.internal.d0e.t2 n5(String var1) {
      return this.n5(var1, true);
   }

   public final com.aspose.slides.internal.d0e.t2 n5(String var1, boolean var2) {
      String var3 = y4.k5(var1);
      if (this.l6().containsKey(var3)) {
         com.aspose.slides.internal.d0e.t2 var4 = this.l6().get_Item(var3);
         var4 = var4.y1();
         if (var2 && var4 != null && var4.m3()) {
            com.aspose.slides.internal.f5n.k5.n5(var4, true);
         }

         return var4;
      } else {
         return null;
      }
   }

   public final void n5(com.aspose.slides.internal.f7k.n5 var1) {
      com.aspose.slides.internal.k2s.l6 var2 = new com.aspose.slides.internal.k2s.l6();
      var2.n5(var1);
      IGenericEnumerator var3 = var1.j5().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            com.aspose.slides.internal.d0e.t2 var5 = (com.aspose.slides.internal.d0e.t2)var4.getValue();
            switch (k5.n5(var5.u9)) {
               case 0:
                  var2.n5((com.aspose.slides.internal.f7k.l6)var5);
                  break;
               case 1:
                  var2.n5((com.aspose.slides.internal.f7k.t2)var5);
                  break;
               case 2:
                  var2.n5.addItem((com.aspose.slides.internal.f7k.u9)var5);
                  break;
               case 3:
                  var2.l6.addItem((com.aspose.slides.internal.f7k.c8)var5);
                  break;
               case 4:
                  var2.k5.addItem((com.aspose.slides.internal.f7k.c8)var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      String var9 = var2.n5().a0();
      if (!this.n5.containsKey(var9)) {
         this.n5.addItem(var9, new List<>());
      }

      this.n5.get_Item(var9).addItem(var2);
   }
}
