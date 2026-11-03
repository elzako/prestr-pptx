package com.aspose.slides.internal.u3r;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.z0k.w1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.j1;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;

class s7 implements l6 {
   @Override
   public final boolean n5(j1 var1, String var2, String[] var3) {
      if (var1 == null) {
         throw new ArgumentNullException("processingInstruction");
      }

      if (var1.getOwnerDocument() == null) {
         throw new ArgumentException("OwnerDocument is null");
      }

      if (d1.n5(var2)) {
         throw new ArgumentNullException("attributeName");
      }

      var3[0] = null;

      try {
         w1 var4 = new w1(d1.n5(new String[]{"<pi ", var1.k5(), "/>"}));
         c7 var5 = c7.n5(var4);
         l0 var6 = var1.getOwnerDocument().readNode(var5);
         m8 var7 = (m8)var6;
         if (var7 != null) {
            var3[0] = var7.n5(var2);
            return var7.u3(var2);
         } else {
            return false;
         }
      } catch (XmlException var8) {
         return false;
      }
   }
}
