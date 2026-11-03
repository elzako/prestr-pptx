package com.aspose.slides.internal.c0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.internal.z4.z1;
import com.aspose.slides.ms.System.d1;

public class n5 extends z1 {
   private final s7 n5;
   private final k5 k5;

   public n5(com.aspose.slides.internal.z4.c8 var1, s7 var2) {
      super(var1);
      this.n5 = var2;
      this.k5 = new k5(var1, var2);
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this.e2());
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Font");
      var1.k5("/Subtype", this.n5());
      var1.k5("/BaseFont", d1.n5("/{0}", new Object[]{this.n5.u3()}));
      var1.k5("/CIDToGIDMap", "/Identity");
      var1.k5("/FontDescriptor", this.k5.t2());
      short var2 = 1000;
      var1.n5("/DW", 1000);
      var1.k5("/W", this.n5.l6(1000));
      var1.n5("/CIDSystemInfo ");
      var1.c8();
      var1.n5("/Ordering", "Identity", true);
      var1.n5("/Registry", "Adobe", true);
      var1.n5("/Supplement", 0);
      var1.t2();
      var1.t2();
      var1.l6();
      this.k5.n5(var1);
   }

   private String n5() {
      switch (this.n5.z3()) {
         case 0:
         case 1:
            return "/CIDFontType0";
         case 2:
            return "/CIDFontType2";
         default:
            throw new InvalidOperationException("Unexpected font type.");
      }
   }
}
