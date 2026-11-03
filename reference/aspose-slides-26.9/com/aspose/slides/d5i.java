package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class d5i {
   static void n5(ITagCollection var0, com.aspose.slides.internal.k0r.d0 var1) {
      if (var1 != null) {
         for (com.aspose.slides.internal.k0r.h3 var5 : var1.c8()) {
            String var6 = "";
            String var7 = "";
            if (var5.l6() != null && var5.u3() != null) {
               var6 = var5.l6().l6();
               var7 = com.aspose.slides.ms.System.d1.n5(var5.u3().l6())
                  ? var5.u3().l6()
                  : com.aspose.slides.internal.r7c.c8.n5(var5.u3().l6(), "[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F]", "");
            }

            if (var6.length() > 0) {
               var0.add(com.aspose.slides.ms.System.d1.t2(var6), var7);
            }
         }
      }
   }

   static void l6(ITagCollection var0, com.aspose.slides.internal.k0r.d0 var1) {
      if (var0 != null) {
         IGenericEnumerator var2 = var0.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               com.aspose.slides.internal.k0r.h3 var4 = new com.aspose.slides.internal.k0r.h3();
               var1.e2().addItem(var4);
               com.aspose.slides.internal.k0r.z1 var5 = new com.aspose.slides.internal.k0r.z1((String)var3.getKey(), (short)0);
               var4.e2().addItem(var5);
               com.aspose.slides.internal.k0r.z1 var6 = new com.aspose.slides.internal.k0r.z1((String)var3.getValue(), (short)1);
               var4.e2().addItem(var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }
}
