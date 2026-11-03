package com.aspose.slides.internal.n3o;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.t6q.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.internal.z3b.s7;
import com.aspose.slides.ms.System.d1;

public final class n5 extends h0 {
   private static final u9 u3 = new u9("photoshop:urgency", "photoshop:colorMode");

   public n5() {
      super("photoshop", "http://ns.adobe.com/photoshop/1.0/");
   }

   @Override
   public void n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("key", "Photoshop property could not be null");
      }

      switch (u3.n5(d1.u9(var1))) {
         case 0:
            this.u3(var1, var2);
            return;
         case 1:
            throw new s7("Color mode should be recognized before");
         default:
            super.n5(var1, var2);
      }
   }
}
