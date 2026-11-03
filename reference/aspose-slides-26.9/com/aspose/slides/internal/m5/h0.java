package com.aspose.slides.internal.m5;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.ms.System.d1;

public abstract class h0 implements e2 {
   private com.aspose.slides.internal.v2.k5 n5;
   private com.aspose.slides.internal.j0.l6 l6;

   public final com.aspose.slides.internal.v2.k5 u3() {
      return this.n5;
   }

   private void l6(com.aspose.slides.internal.v2.k5 var1) {
      this.n5 = var1;
   }

   public abstract int n5();

   public h0() {
      this.l6(new com.aspose.slides.internal.v2.k5());
   }

   public h0(com.aspose.slides.internal.v2.k5 var1) {
      this.l6(var1);
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.u3();
   }

   public static h0 n5(com.aspose.slides.internal.v2.k5 var0) {
      h0 var1 = null;
      int var2 = var0.n5(com.aspose.slides.internal.v2.c8.x6s, 0);
      switch (var2) {
         case 1:
            var1 = new a6(var0);
            break;
         case 2:
            var1 = new n5(var0);
            break;
         case 3:
            var1 = new t2(var0);
            break;
         case 4:
            var1 = new u3(var0);
            break;
         case 5:
            var1 = new u9(var0);
            break;
         case 6:
            var1 = new k5(var0);
            break;
         case 7:
            var1 = new x8(var0);
            break;
         default:
            String var3 = d1.n5("Unknown shading type {0}", new Object[]{var2});
            throw new IOException(var3);
      }

      return var1;
   }

   public final com.aspose.slides.internal.j0.l6 a6() {
      if (this.l6 == null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.t2();
         com.aspose.slides.internal.v2.s7 var2 = var1.u9(com.aspose.slides.internal.v2.c8.m0);
         if (var2 != null) {
            this.l6 = com.aspose.slides.internal.j0.l6.n5(var2);
         }
      }

      return this.l6;
   }
}
