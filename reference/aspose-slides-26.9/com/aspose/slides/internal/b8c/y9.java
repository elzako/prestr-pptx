package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class y9 extends c2 {
   public Exception n5(Object var1, v5 var2) {
      com.aspose.slides.ms.System.u3 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.ms.System.u3.class);
      r5 var4 = var2.y4();
      int var5 = var4 != null ? var4.y4 : 0;
      if ((var5 & 7) != 0) {
         int var6 = var3.a6();
         if ((var5 & 1) != 0 && var4.n5 != var6) {
            return new XmlSchemaException("The actual length is not equal to the specified length.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var5 & 2) != 0 && var6 < var4.l6) {
            return new XmlSchemaException("The actual length is less than the MinLength value.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var5 & 4) != 0 && var4.k5 < var6) {
            return new XmlSchemaException("The actual length is greater than the MaxLength value.", com.aspose.slides.ms.System.d1.n5);
         }
      }

      return (var5 & 16) != 0 && !this.n5(var1, var4.a6, var2)
         ? new XmlSchemaException("The Enumeration constraint failed.", com.aspose.slides.ms.System.d1.n5)
         : null;
   }

   @Override
   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      for (int var4 = 0; var4 < var2.size(); var4++) {
         if (var3.l6(var1, var2.get_Item(var4)) == 0) {
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
