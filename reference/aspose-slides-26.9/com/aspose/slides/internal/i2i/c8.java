package com.aspose.slides.internal.i2i;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;

public class c8 extends a6 {
   private byte[] u3;

   public c8() {
      this.n5 = "2.5.29.35";
   }

   public c8(a6 var1) {
      super(var1);
   }

   @Override
   protected void n5() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.k5.u3());
      if (com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 6) != 48) {
         throw new ArgumentException("Invalid AuthorityKeyIdentifier extension");
      }

      for (int var2 = 0; var2 < var1.n5(); var2++) {
         com.aspose.slides.internal.x8w.l6 var3 = var1.n5(var2);
         switch (var3.l6()) {
            case -128:
               this.u3 = var3.u3();
               break;
         }
      }
   }

   public byte[] u9() {
      return this.u3 == null ? null : (byte[])this.u3.clone();
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      if (this.u3 != null) {
         int var2 = 0;
         var1.n5("KeyID=");

         for (; var2 < this.u3.length; var2++) {
            var1.n5(com.aspose.slides.ms.System.e2.n5(this.u3[var2], "X2", com.aspose.slides.internal.x7n.l6.k5()));
            if (var2 % 2 == 1) {
               var1.n5(" ");
            }
         }
      }

      return var1.toString();
   }
}
