package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public class h2 extends a5 {
   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      double var4;
      try {
         var4 = com.aspose.slides.ms.System.Xml.f4.k7(var1);
      } catch (RuntimeException var7) {
         throw new XmlSchemaException(com.aspose.slides.ms.System.Xml.v3.n5("The value '{0}' is invalid according to its data type.", var1), var7);
      }

      if (!com.aspose.slides.ms.System.d2.l6(var4) && !com.aspose.slides.ms.System.d2.k5(var4)) {
         return var4;
      } else {
         throw new XmlSchemaException("The value '{0}' is invalid according to its data type.", var1);
      }
   }
}
