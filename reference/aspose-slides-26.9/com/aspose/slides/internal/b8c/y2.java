package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlSchemaException;

public class y2 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.k6.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.k6[].class);

   @Override
   public int t2() {
      return 10;
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null || var1.length() == 0) {
         throw new XmlSchemaException("The attribute value cannot be empty.", com.aspose.slides.ms.System.d1.n5);
      }

      if (var3 == null) {
         throw new ArgumentNullException("nsmgr");
      }

      String var4 = null;

      try {
         String[] var5 = new String[]{var4};
         com.aspose.slides.ms.System.Xml.k6 var6 = com.aspose.slides.ms.System.Xml.k6.n5(com.aspose.slides.ms.System.d1.l6(var1), var3, var5);
         var4 = var5[0];
         return var6;
      } catch (XmlSchemaException var7) {
         throw var7;
      } catch (RuntimeException var8) {
         throw new XmlSchemaException(com.aspose.slides.ms.System.Xml.v3.n5("The value '{0}' is invalid according to its data type.", var1), var8);
      }
   }

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return e2;
   }

   @Override
   public com.aspose.slides.ms.System.y8 t4() {
      return t9;
   }
}
