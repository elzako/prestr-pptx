package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.Xml.l0;
import java.util.Comparator;

public class f0 implements Comparator {
   @Override
   public final int compare(Object a, Object b) {
      l0 var3 = com.aspose.slides.internal.v6g.k5.n5(a, l0.class);
      l0 var4 = com.aspose.slides.internal.v6g.k5.n5(b, l0.class);
      if (var3 != null && var4 != null) {
         boolean var5 = i9.k5(var3);
         boolean var6 = i9.k5(var4);
         if (var5 && var6) {
            return 0;
         } else if (var5) {
            return -1;
         } else {
            return var6 ? 1 : com.aspose.slides.ms.System.d1.h0(var3.getLocalName(), var4.getLocalName());
         }
      } else {
         throw new ArgumentException();
      }
   }
}
