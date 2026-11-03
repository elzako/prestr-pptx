package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class g8 extends c2 {
   public Exception n5(Object var1, v5 var2) {
      r5 var3 = var2.y4();
      int var4 = var3 != null ? var3.y4 : 0;
      return (var4 & 16) != 0 && !this.n5(var1, var3.a6, var2)
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
