package com.aspose.slides.internal.l2;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.z3;

public class k5 extends a6 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("xmlData", "binaryData");

   public k5() {
   }

   public k5(t4 var1) {
      this.l6(var1);
   }

   private void l6(t4 var1) {
      this.k5(var1);
      this.n5();
   }

   private void k5(t4 var1) {
      com.aspose.slides.internal.b8.l6 var2 = new com.aspose.slides.internal.b8.l6(var1);

      while (var2.n5("package")) {
         if (!"part".equals(var2.a6())) {
            var2.n5();
         } else {
            u9 var3 = n5(var2);
            this.l6().n5(var3);
         }
      }
   }

   private static u9 n5(com.aspose.slides.internal.b8.l6 var0) {
      String var1 = var0.n5("name", d1.n5);
      String var2 = var0.n5("contentType", d1.n5);
      var0.n5("compression", "store");
      u9 var3 = new u9(var1, var2);
      var0.n5("part");
      switch (n5.n5(var0.a6())) {
         case 0:
            j5 var6 = new j5(var3.u3());
            var0.n5("xmlData");
            var6.n5(var0.u3());
            var6.k5();
            break;
         case 1:
            String var4 = var0.k5();
            byte[] var5 = z3.s7(var4);
            var3.u3().write(var5, 0, var5.length);
      }

      var3.u3().setPosition(0L);
      return var3;
   }

   @Override
   public void n5(t4 var1) {
      com.aspose.slides.internal.b8.n5 var2 = new com.aspose.slides.internal.b8.n5(var1, true);
      var2.n5().l6(true);
      var2.n5().n5("mso-application", "progid=\"PowerPoint.Show\"");
      var2.l6("pkg:package");
      var2.k5("xmlns:pkg", "http://schemas.microsoft.com/office/2006/xmlPackage");
      IGenericEnumerator var3 = this.l6().iterator();

      try {
         for (; var3.hasNext(); var2.k5()) {
            u9 var4 = (u9)var3.next();
            var4.u3().setPosition(0L);
            var2.l6("pkg:part");
            var2.k5("pkg:name", var4.n5());
            var2.k5("pkg:contentType", var4.k5());
            if (!d1.k5(var4.k5(), "xml")) {
               var2.k5("pkg:compression", "store");
               var2.l6("pkg:binaryData");
               var2.n5(var4.u3());
               var2.k5();
            } else {
               m3 var5 = new m3(var4.u3());
               String var6 = var5.c8();
               com.aspose.slides.internal.r7c.c8 var7 = new com.aspose.slides.internal.r7c.c8("<\\?.*\\?>");
               var6 = var7.k5(var6, d1.n5);
               var2.l6("pkg:xmlData");
               var2.k5(var6);
               var2.k5();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.l6();
   }
}
