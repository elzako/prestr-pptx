package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class f0 extends t1 {
   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      try {
         d6 var4 = com.aspose.slides.internal.v6g.k5.n5(this.h0(), d6.class);
         com.aspose.slides.ms.System.c4 var5 = com.aspose.slides.ms.System.Xml.f4.x8(var1).l6();
         Exception var6 = var4.n5(var5.l6(), 18, 4, true, true);
         if (var6 != null) {
            throw var6;
         } else {
            return var5;
         }
      } catch (XmlSchemaException var7) {
         throw var7;
      } catch (RuntimeException var8) {
         throw new XmlSchemaException(com.aspose.slides.ms.System.Xml.v3.n5("The value '{0}' is invalid according to its data type.", var1), var8);
      }
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      com.aspose.slides.ms.System.c4 var5 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4[] var6 = new com.aspose.slides.ms.System.c4[]{var5};
      Exception var7 = com.aspose.slides.ms.System.Xml.f4.n5(var1, var6);
      var5 = var6[0];
      if (var7 != null) {
         return var7;
      }

      d6 var8 = com.aspose.slides.internal.v6g.k5.n5(this.h0(), d6.class);
      var7 = var8.n5(var5.l6(), 18, 4, true, true);
      if (var7 != null) {
         return var7;
      }

      var5.k7((com.aspose.slides.ms.System.c4)var4[0]);
      return null;
   }
}
