package com.aspose.slides.internal.p5k;

import com.aspose.slides.internal.l7h.u6;
import com.aspose.slides.ms.System.d1;

public class e2 extends d2 {
   public e2(l6 var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.b8.u9 var1) {
      y1 var2 = new y1(this.h0());
      var2.n5();
      this.u9().n5(l6(var1));
      var2.n5(77);
   }

   private static String l6(com.aspose.slides.internal.b8.u9 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      String var4;
      try {
         u6 var2 = new u6(false);
         com.aspose.slides.internal.b8.n5 var3 = new com.aspose.slides.internal.b8.n5(var1, var2, false);
         var3.n5("rdf:RDF");
         var3.k5("xmlns:rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
         var3.l6("rdf:Description");
         var3.k5("rdf:about", d1.n5);
         var3.k5("xmlns:dc", "http://purl.org/dc/elements/1.1");
         var3.n5("dc:format", "application/x-shockwave-flash");
         var3.n5("dc:title", var0.l6());
         var3.n5("dc:description", var0.h0());
         var3.n5("dc:publisher", var0.n5());
         var3.n5("dc:creator", var0.a6());
         var3.n5("dc:date", var0.n3().m1());
         var3.k5();
         var3.l6();
         var4 = var2.l6(var1.getBuffer());
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      return var4;
   }
}
