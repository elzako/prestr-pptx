package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.Xml.l0;
import java.util.Comparator;

public class l6 implements Comparator {
   @Override
   public final int compare(Object a, Object b) {
      l0 var3 = com.aspose.slides.internal.v6g.k5.n5(a, l0.class);
      l0 var4 = com.aspose.slides.internal.v6g.k5.n5(b, l0.class);
      if (var3 != null && var4 != null) {
         int var5 = com.aspose.slides.ms.System.d1.h0(var3.getNamespaceURI(), var4.getNamespaceURI());
         return var5 != 0 ? var5 : com.aspose.slides.ms.System.d1.h0(var3.getLocalName(), var4.getLocalName());
      } else {
         throw new ArgumentException();
      }
   }
}
