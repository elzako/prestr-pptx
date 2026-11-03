package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public class p3 extends a3 {
   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      float var4;
      try {
         var4 = com.aspose.slides.ms.System.Xml.f4.m1(var1);
      } catch (RuntimeException var6) {
         throw new XmlSchemaException(com.aspose.slides.ms.System.Xml.v3.n5("The value '{0}' is invalid according to its data type.", var1), var6);
      }

      if (!com.aspose.slides.ms.System.n1.l6(var4) && !com.aspose.slides.ms.System.n1.k5(var4)) {
         return var4;
      } else {
         throw new XmlSchemaException("The value '{0}' is invalid according to its data type.", var1);
      }
   }
}
