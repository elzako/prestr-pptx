package com.aspose.slides.internal.c1;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.t4;

public class l6 extends n5 {
   private final int n5;
   private final com.aspose.slides.internal.k4d.u3 l6;

   public l6(int var1, com.aspose.slides.internal.k4d.u3 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public t4 n5(t4 var1) {
      int var2 = this.n5 == 6 ? 3 : 4;
      return new com.aspose.slides.internal.l3.l6(var1, var2, (float)this.l6.k5(), this.l6.n5());
   }

   @Override
   public void n5(com.aspose.slides.internal.z4.t4 var1) {
      var1.k5("/Filter", "/CCITTFaxDecode");
      var1.k5("/DecodeParms <<");
      var1.n5("/K", this.n5());
      var1.n5("/Columns", this.l6.n5());
      var1.n5("/Rows", this.l6.l6());
      var1.k5(">>");
   }

   private int n5() {
      switch (this.n5) {
         case 6:
            return 0;
         case 7:
            return -1;
         default:
            throw new InvalidOperationException("Unexpected compression.");
      }
   }
}
