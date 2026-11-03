package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class t2 extends c2 {
   public Exception n5(Object var1, v5 var2) {
      byte[] var3 = com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class);
      return this.n5(var3, var2);
   }

   public Exception n5(byte[] var1, v5 var2) {
      r5 var3 = var2.y4();
      int var4 = var1.length;
      int var5 = var3 != null ? var3.y4 : 0;
      if (var5 != 0) {
         if ((var5 & 1) != 0 && var3.n5 != var4) {
            return new XmlSchemaException("The actual length is not equal to the specified length.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var5 & 2) != 0 && var4 < var3.l6) {
            return new XmlSchemaException("The actual length is less than the MinLength value.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var5 & 4) != 0 && var3.k5 < var4) {
            return new XmlSchemaException("The actual length is greater than the MaxLength value.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var5 & 16) != 0 && !this.n5(var1, var3.a6, var2)) {
            return new XmlSchemaException("The Enumeration constraint failed.", com.aspose.slides.ms.System.d1.n5);
         }
      }

      return null;
   }

   @Override
   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      return this.n5(com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class), var2, var3);
   }

   private boolean n5(byte[] var1, ArrayList var2, v5 var3) {
      for (int var4 = 0; var4 < var2.size(); var4++) {
         if (var3.l6(var1, com.aspose.slides.internal.v6g.k5.k5(var2.get_Item(var4), byte[].class)) == 0) {
            return true;
         }
      }

      return false;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception l6(byte[] bridgeArg0, v5 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception l6(Object bridgeArg0, v5 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
