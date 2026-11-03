package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class j6 extends c2 {
   public Exception n5(Object var1, v5 var2) {
      com.aspose.slides.ms.System.Xml.k6 var3 = (com.aspose.slides.ms.System.Xml.k6)var2.c8()
         .n5(var1, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.k6.class));
      return this.n5(var3, var2);
   }

   @Override
   public Exception n5(com.aspose.slides.ms.System.Xml.k6 var1, v5 var2) {
      r5 var3 = var2.y4();
      int var4 = var3 != null ? var3.y4 : 0;
      if (var4 != 0) {
         String var5 = var1.toString();
         int var6 = var5.length();
         if ((var4 & 1) != 0 && var3.n5 != var6) {
            return new XmlSchemaException("The actual length is not equal to the specified length.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var4 & 2) != 0 && var6 < var3.l6) {
            return new XmlSchemaException("The actual length is less than the MinLength value.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var4 & 4) != 0 && var3.k5 < var6) {
            return new XmlSchemaException("The actual length is greater than the MaxLength value.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var4 & 16) != 0 && !this.n5(var1, var3.a6)) {
            return new XmlSchemaException("The Enumeration constraint failed.", com.aspose.slides.ms.System.d1.n5);
         }
      }

      return null;
   }

   @Override
   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      return this.n5(
         (com.aspose.slides.ms.System.Xml.k6)var3.c8().n5(var1, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.k6.class)), var2
      );
   }

   private boolean n5(com.aspose.slides.ms.System.Xml.k6 var1, ArrayList var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         if (var1.equals((com.aspose.slides.ms.System.Xml.k6)var2.get_Item(var3))) {
            return true;
         }
      }

      return false;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception l6(Object bridgeArg0, v5 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
