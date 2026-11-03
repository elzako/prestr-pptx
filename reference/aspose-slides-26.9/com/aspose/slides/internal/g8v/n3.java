package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

public class n3 implements IEnumerable, f2 {
   static a5 n5 = new a5(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5);
   private Hashtable l6;

   public static f2 n5() {
      return n5;
   }

   @Override
   public a5 n5(com.aspose.slides.ms.System.r8 var1, String var2) {
      int var3 = -1;
      a5 var4 = null;
      if (var1 != null && var2 != null) {
         String var5 = var1.n5();
         var5 = com.aspose.slides.ms.System.d1.l6(var5, 0, com.aspose.slides.ms.System.d1.k5(var5, '/'));
         IDictionaryEnumerator var6 = this.l6.iterator();

         while (var6.hasNext()) {
            n3$n5 var7 = com.aspose.slides.internal.v6g.k5.n5(var6.getKey(), n3$n5.class);
            if (var7.n5() > var3 && com.aspose.slides.ms.System.d1.n5(var7.u3(), var2, true) == 0) {
               com.aspose.slides.ms.System.r8 var8 = var7.k5();
               if (com.aspose.slides.ms.System.d1.a6(var8.t9(), var1.t9())
                  && var8.y4() == var1.y4()
                  && com.aspose.slides.ms.System.d1.a6(var8.a6(), var1.a6())
                  && com.aspose.slides.ms.System.d1.l6(var5, var7.l6())) {
                  var3 = var7.n5();
                  var4 = (a5)var6.getValue();
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   @Override
   public IEnumerator iterator() {
      return this.l6.getValues().iterator();
   }
}
