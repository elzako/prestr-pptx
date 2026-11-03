package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class w8 extends c2 {
   public Exception n5(Object var1, v5 var2) {
      com.aspose.slides.ms.System.s4 var3 = com.aspose.slides.internal.v6g.k5.u3(
            var2.c8().n5(var1, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.s4.class)), com.aspose.slides.ms.System.s4.class
         )
         .n3();
      return this.n5(var3.n3(), var2);
   }

   @Override
   public Exception n5(com.aspose.slides.ms.System.s4 var1, v5 var2) {
      r5 var3 = var2.y4();
      int var4 = var3 != null ? var3.y4 : 0;
      if ((var4 & 64) != 0
         && com.aspose.slides.ms.System.s4.n5(var1.n3(), com.aspose.slides.internal.v6g.k5.u3(var3.h0, com.aspose.slides.ms.System.s4.class).n3()) > 0) {
         return new XmlSchemaException("The MaxInclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var4 & 128) != 0
         && com.aspose.slides.ms.System.s4.n5(var1.n3(), com.aspose.slides.internal.v6g.k5.u3(var3.c8, com.aspose.slides.ms.System.s4.class).n3()) >= 0) {
         return new XmlSchemaException("The MaxExclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var4 & 256) != 0
         && com.aspose.slides.ms.System.s4.n5(var1.n3(), com.aspose.slides.internal.v6g.k5.u3(var3.t2, com.aspose.slides.ms.System.s4.class).n3()) < 0) {
         return new XmlSchemaException("The MinInclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var4 & 512) != 0
         && com.aspose.slides.ms.System.s4.n5(var1.n3(), com.aspose.slides.internal.v6g.k5.u3(var3.s7, com.aspose.slides.ms.System.s4.class).n3()) <= 0) {
         return new XmlSchemaException("The MinExclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else {
         return (var4 & 16) != 0 && !this.n5(var1.n3(), var3.a6)
            ? new XmlSchemaException("The Enumeration constraint failed.", com.aspose.slides.ms.System.d1.n5)
            : null;
      }
   }

   @Override
   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class).n3(), var2);
   }

   private boolean n5(com.aspose.slides.ms.System.s4 var1, ArrayList var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         if (com.aspose.slides.ms.System.s4.n5(var1.n3(), com.aspose.slides.internal.v6g.k5.u3(var2.get_Item(var3), com.aspose.slides.ms.System.s4.class).n3())
            == 0) {
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
