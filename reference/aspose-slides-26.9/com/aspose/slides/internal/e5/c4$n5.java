package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;

public class c4$n5 implements com.aspose.slides.internal.b5j.u3 {
   private com.aspose.slides.internal.r4.c8 n5;
   private String l6;

   public c4$n5(com.aspose.slides.internal.r4.c8 var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   private static t1 n5(com.aspose.slides.internal.r4.t9 var0) {
      return new t1(var0.n5(), var0.l6());
   }

   private String n5(String var1) {
      try {
         r8 var2 = new r8(var1, 0);
         if (var2.z3()) {
            return var1;
         }
      } catch (RuntimeException var3) {
      }

      return com.aspose.slides.internal.z0k.z1.l6(this.l6, var1);
   }

   @Override
   public final t1 n5(Object var1, u6 var2) {
      com.aspose.slides.internal.r4.t9 var5;
      if (this.n5 == null) {
         com.aspose.slides.internal.y1.k5 var3 = new com.aspose.slides.internal.y1.k5();
         com.aspose.slides.internal.z0k.t4 var4 = var3.n5(var2.n5(), d1.n5, this.l6);
         var5 = new com.aspose.slides.internal.r4.t9(com.aspose.slides.internal.n2d.t4.l6(var4));
      } else {
         var5 = this.n5.n5(var1, new com.aspose.slides.internal.r4.e2(this.n5(var2.n5())));
      }

      return n5(var5);
   }
}
