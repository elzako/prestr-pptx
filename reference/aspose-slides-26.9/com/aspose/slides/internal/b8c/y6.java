package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class y6 extends c2 {
   public Exception n5(Object var1, v5 var2) {
      double var3 = var2.c8().a6(var1);
      return this.l6(var3, var2);
   }

   public Exception l6(double var1, v5 var3) {
      r5 var4 = var3.y4();
      int var5 = var4 != null ? var4.y4 : 0;
      e3m var6 = var3.c8();
      if ((var5 & 64) != 0 && var1 > var6.a6(var4.h0)) {
         return new XmlSchemaException("The MaxInclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var5 & 128) != 0 && var1 >= var6.a6(var4.c8)) {
         return new XmlSchemaException("The MaxExclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var5 & 256) != 0 && var1 < var6.a6(var4.t2)) {
         return new XmlSchemaException("The MinInclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var5 & 512) != 0 && var1 <= var6.a6(var4.s7)) {
         return new XmlSchemaException("The MinExclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else {
         return (var5 & 16) != 0 && !this.n5(var1, var4.a6, var6)
            ? new XmlSchemaException("The Enumeration constraint failed.", com.aspose.slides.ms.System.d1.n5)
            : null;
      }
   }

   public Exception l6(float var1, v5 var2) {
      return this.l6((double)var1, var2);
   }

   @Override
   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      return this.n5(var3.c8().a6(var1), var2, var3.c8());
   }

   private boolean n5(double var1, ArrayList var3, e3m var4) {
      for (int var5 = 0; var5 < var3.size(); var5++) {
         if (var1 == var4.a6(var3.get_Item(var5))) {
            return true;
         }
      }

      return false;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception n5(float bridgeArg0, v5 bridgeArg1) {
      return this.l6(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception n5(double bridgeArg0, v5 bridgeArg1) {
      return this.l6(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception l6(Object bridgeArg0, v5 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
