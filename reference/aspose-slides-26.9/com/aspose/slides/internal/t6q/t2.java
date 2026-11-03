package com.aspose.slides.internal.t6q;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;

public class t2 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "http://purl.org/dc/elements/1.1/",
      "http://ns.adobe.com/pdf/1.3/",
      "http://ns.adobe.com/photoshop/1.0/",
      "http://ns.adobe.com/xmp/1.0/DynamicMedia/",
      "http://ns.adobe.com/xap/1.0/mm/",
      "http://ns.adobe.com/xap/1.0/rights/",
      "http://ns.adobe.com/xap/1.0/"
   );

   public static h0 n5(String var0, String var1, boolean var2) {
      if (d1.n5(var0)) {
         throw new ArgumentNullException("prefix", "Prefix could not be null or empty");
      }

      if (d1.n5(var1)) {
         throw new ArgumentNullException("namespaceUri", "NamespaceUri could not be null or empty");
      }

      if (var2 && !r8.l6(var1, 1)) {
         throw new ArgumentException("NamespaceUri is not valid", "namespaceUri");
      }

      switch (n5.n5(var1)) {
         case 0:
            return new com.aspose.slides.internal.c9v.n5();
         case 1:
            return new com.aspose.slides.internal.r0w.l6();
         case 2:
            return new com.aspose.slides.internal.n3o.n5();
         case 3:
            return new com.aspose.slides.internal.c8q.n5();
         case 4:
            return new com.aspose.slides.internal.w1g.l6();
         case 5:
            return new com.aspose.slides.internal.c3g.n5();
         case 6:
            return new com.aspose.slides.internal.i5k.l6(var0, var1);
         default:
            return new h0(var0, var1);
      }
   }
}
