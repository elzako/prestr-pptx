package com.aspose.slides.internal.u3r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;

abstract class h0 extends e2 {
   protected final String n5;
   protected final j5 l6 = j5.z3();
   protected boolean k5 = true;
   protected boolean u3 = true;

   protected h0(String var1, boolean var2) {
      this.u3 = var2;
      if (d1.n5(var1)) {
         throw new ArgumentNullException("xml", "Xml content not provided");
      }

      try {
         XmlDocument var3 = new XmlDocument();
         var3.loadXml(var1);
      } catch (XmlException var5) {
         if (var2) {
            String var4 = d1.n5("Invalid requested xml: {0}", new Object[]{var1});
            throw new com.aspose.slides.internal.z3b.s7(var4);
         }
      }

      this.n5 = var1;
   }

   public final com.aspose.slides.internal.t6q.s7 n5() {
      try {
         return this.l6();
      } catch (RuntimeException var2) {
         if (this.u3) {
            throw var2;
         } else {
            return null;
         }
      }
   }

   protected abstract com.aspose.slides.internal.t6q.s7 l6();
}
