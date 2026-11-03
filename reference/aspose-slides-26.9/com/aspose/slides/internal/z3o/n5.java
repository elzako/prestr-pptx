package com.aspose.slides.internal.z3o;

import com.aspose.slides.internal.o9b.w1;
import java.util.ArrayList;
import java.util.List;

public class n5 extends u9 {
   public List<u9> n5;

   public n5(com.aspose.slides.internal.x7u.k5 var1, w1 var2, w1 var3) {
      super(var1, var2, var3);
      List var4 = var1.l6();
      this.n5 = new ArrayList<>(var4.size());

      for (Object recoveredElement$var6$374 : var4) {
         com.aspose.slides.internal.x7u.u9 var6 = (com.aspose.slides.internal.x7u.u9)recoveredElement$var6$374;
         this.n5.add(new u9(var6, var2, var3));
      }
   }

   @Override
   public boolean n5() {
      return true;
   }

   @Override
   public List<u9> l6() {
      return this.n5;
   }
}
