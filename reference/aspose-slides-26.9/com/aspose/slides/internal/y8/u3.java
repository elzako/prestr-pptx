package com.aspose.slides.internal.y8;

import com.aspose.slides.internal.c3.u9;
import com.aspose.slides.internal.j3.z1;
import com.aspose.slides.ms.System.d1;

public class u3 implements com.aspose.slides.internal.p6.u3 {
   private int n5;
   private com.aspose.slides.internal.f5.k5 l6;
   private u9 k5;
   private boolean u3;

   public u3(int var1, com.aspose.slides.internal.f5.k5 var2, String var3) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final z1 n5(com.aspose.slides.internal.p6.l6 var1) {
      this.u3 = true;

      try {
         this.k5 = new u9(this.l6);
         return this.k5.n5(var1);
      } finally {
         this.u3 = false;
      }
   }

   public final void n5(String... var1) {
      for (String var5 : var1) {
         this.k5.x8(var5);
      }
   }

   public final void l6(String... var1) {
      for (String var5 : var1) {
         this.k5.x8(d1.n5(new Object[]{var5, '\r'}));
      }
   }
}
