package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.h2;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.Xml.k1;

public class d2$n5 extends h2 implements Cloneable {
   public d2$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(w1 var1, String var2, t9 var3) {
      d2 var4 = null;
      com.aspose.slides.internal.r7c.u3 var5 = com.aspose.slides.internal.r7c.c8.n5(var2, "(?s)^(url\\(('|\")?)?data:.*$");
      if (var5.u3()) {
         var4 = new d2(var2, false, null);
      } else {
         try {
            String var6 = com.aspose.slides.internal.f2.s7.l6(var2);
            d2 var7 = (d2)var1.n5(275, true, false);
            if (var7 == null) {
               if (this.n5 == 275) {
                  var4 = new d2(new r8(var6));
                  var4.n5(var2);
               } else {
                  var4 = new d2(var2, false, null);
               }
            } else {
               k1 var8 = new k1();
               var4 = new d2(var8.n5(d2.n5(var7), var6));
               var4.n5(var2);
            }
         } catch (RuntimeException var9) {
            throw new com.aspose.slides.internal.b3.z8("Invalid URI specified");
         }
      }

      return var4;
   }
}
