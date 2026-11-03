package com.aspose.slides.internal.t5g;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.j9e.s7;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.v6g.a6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;
import com.aspose.slides.ms.System.y2;
import com.aspose.slides.ms.System.z3;
import java.util.HashMap;
import java.util.Iterator;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.spi.ImageReaderWriterSpi;
import javax.imageio.spi.ImageWriterSpi;

abstract class n5$n5 {
   protected abstract Iterator n5(String var1);

   protected abstract ImageReaderWriterSpi n5(Iterator var1);

   private s7 n5(o0 var1, o0 var2, String var3) {
      s7 var4 = new s7();
      var1.k5(var4.l6());
      var2.k5(var4.u9());
      var4.u3(var3);
      Iterator var5 = null;

      try {
         var5 = this.n5(var3);
      } catch (RuntimeException var12) {
         return null;
      }

      if (var5.hasNext()) {
         ImageReaderWriterSpi var6 = this.n5(var5);
         var4.n5(var6.getDescription(y2.n5()));

         for (String var10 : var6.getFileSuffixes()) {
            if (var4.u3() != null) {
               var4.l6(var4.u3() + ";*." + var10);
            } else {
               var4.l6("*." + var10);
            }
         }

         var4.n5(65540);
         if (var6 instanceof ImageReaderSpi) {
            var4.n5(var4.a6() | 2);
         }

         if (var6 instanceof ImageWriterSpi) {
            var4.n5(var4.a6() | 1);
         }

         a6 var14 = new a6(null);
         a6 var15 = new a6(null);
         n5.n5(n5.u3(var1), var14, var15);
         var4.n5((byte[][])var14.n5);
         var4.l6((byte[][])var15.n5);
         var4.k5(d1.n5(";", var6.getFormatNames()));

         try {
            var4.l6((int)z3.h0(var6.getVersion()));
         } catch (RuntimeException var11) {
            var4.l6(1);
         }
      }

      return var4;
   }

   HashMap n5() {
      HashMap var1 = new HashMap(10);

      for (Object recoveredElement$var3$2049 : n5.x8()) {
         KeyValuePair var3 = (KeyValuePair)recoveredElement$var3$2049;
         o0 var4 = (o0)var3.getValue();
         x8 var5 = n5.u3(var4.k5());
         s7 var6 = this.n5(var4, var5.n5(), (String)var3.getKey());
         if (var6 != null && var6.u3() != null) {
            var1.put(var4.k5(), var6);
         }
      }

      return var1;
   }
}
