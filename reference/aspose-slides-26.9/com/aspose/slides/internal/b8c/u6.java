package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public class u6 extends v0 {
   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      if (var1 != null && var1.length() != 0) {
         String[] var5 = new String[]{var1};
         RuntimeException var6 = c8.n5(var5, this);
         var1 = var5[0];
         if (var6 != null) {
            return var6;
         }

         f2i var7 = new f2i();
         f2i[] var8 = new f2i[]{var7};
         var6 = f2i.n5(var1, 2, var8);
         var8[0].n5(var7);
         if (var6 != null) {
            return var6;
         }

         com.aspose.slides.ms.System.s4 var9 = new com.aspose.slides.ms.System.s4();
         com.aspose.slides.ms.System.s4[] var10 = new com.aspose.slides.ms.System.s4[]{var9};
         var6 = var7.n5(2, var10);
         var10[0].u3(var9);
         if (var6 != null) {
            return var6;
         }

         var6 = c8.n5(var9.n3(), this);
         if (var6 != null) {
            return var6;
         }

         var9.u3((com.aspose.slides.ms.System.s4)var4[0]);
         return null;
      } else {
         return new XmlSchemaException("The attribute value cannot be empty.", com.aspose.slides.ms.System.d1.n5);
      }
   }

   @Override
   public int n3() {
      return 54;
   }
}
