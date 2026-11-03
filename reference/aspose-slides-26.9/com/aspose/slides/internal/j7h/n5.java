package com.aspose.slides.internal.j7h;

import com.aspose.slides.internal.d0e.a6;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.ms.System.d1;

public class n5 extends a6 {
   public String c8 = d1.n5;
   public boolean t2 = false;

   public n5() {
      super("rawText");
   }

   public n5(String var1) {
      this();
      this.c8 = var1;
   }

   public n5(String var1, boolean var2) {
      this();
      this.c8 = var1;
      this.t2 = var2;
   }

   @Override
   public t2 y1() {
      n5 var1 = (n5)super.y1();
      var1.c8 = this.c8;
      return var1;
   }
}
