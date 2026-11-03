package com.aspose.slides.internal.v2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.t4;

public class n3 extends x8 {
   private final n5 n5;
   private x8 l6;

   public n3(n5 var1) {
      super(new k5(), new com.aspose.slides.internal.z0k.e2());
      this.n5 = var1;
      if (var1.n5() > 0) {
         this.l6 = (x8)var1.l6(0);
      }
   }

   @Override
   public s7 n3(c8 var1) {
      return this.l6.n3(var1);
   }

   @Override
   public s7 u9(c8 var1) {
      return this.l6.u9(var1);
   }

   @Override
   public t4 u3() {
      List var1 = new List();
      j5 var2 = j5.k5("ISO-8859-1");
      byte[] var3 = var2.u3("\n");

      for (int var4 = 0; var4 < this.n5.n5(); var4++) {
         x8 var5 = (x8)this.n5.l6(var4);
         t4 var6 = var5.u3();
         var1.addItem(var6);
         com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2(var3);
         var1.addItem(var7);
      }

      return new com.aspose.slides.internal.e6.u3(var1);
   }

   @Override
   public s7 a6() {
      return this.l6.a6();
   }
}
