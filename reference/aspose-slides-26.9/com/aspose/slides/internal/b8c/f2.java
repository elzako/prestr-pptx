package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class f2 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(char.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(char[].class);

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return e2;
   }

   @Override
   public com.aspose.slides.ms.System.y8 t4() {
      return t9;
   }

   @Override
   public int q0() {
      return 0;
   }

   @Override
   public int l6(Object var1, Object var2) {
      return com.aspose.slides.ms.System.t9.n5(com.aspose.slides.internal.v6g.k5.u3(var1, char.class), var2);
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      try {
         return com.aspose.slides.ms.System.Xml.f4.s7(var1);
      } catch (XmlSchemaException var5) {
         throw var5;
      } catch (RuntimeException var6) {
         throw new XmlSchemaException(com.aspose.slides.ms.System.Xml.v3.n5("The value '{0}' is invalid according to its data type.", var1), var6);
      }
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      char var5 = '\u0000';
      char[] var6 = new char[]{'\u0000'};
      Exception var7 = com.aspose.slides.ms.System.Xml.f4.n5(var1, var6);
      var5 = var6[0];
      if (var7 != null) {
         return var7;
      }

      var4[0] = var5;
      return null;
   }
}
