package com.aspose.slides.internal.z6y;

import com.aspose.slides.internal.a9t.a6;
import com.aspose.slides.internal.a9t.h0;
import com.aspose.slides.internal.a9t.k5;
import com.aspose.slides.internal.a9t.u9;
import com.aspose.slides.internal.g8v.a5;
import com.aspose.slides.internal.g8v.b5;
import com.aspose.slides.internal.g8v.f2;
import com.aspose.slides.internal.g8v.w1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.z3;

class l6 {
   private k5 n5;

   public l6() {
   }

   public com.aspose.slides.internal.g8v.l6 n5(String var1, b5 var2, f2 var3) {
      w1 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, w1.class);
      if (var4 == null) {
         return null;
      }

      a5 var5 = var3.n5(var4.e2(), "NTLM");
      if (var5 == null) {
         return null;
      }

      String var6 = var5.l6();
      String var7 = var5.n5();
      String var8 = var5.k5();
      if (var6 != null && !"".equals(var6)) {
         if (d1.n5(var7)) {
            int var9 = d1.u3(var6, '\\');
            if (var9 == -1) {
               var9 = d1.u3(var6, '/');
            }

            if (var9 >= 0) {
               var7 = d1.l6(var6, 0, var9);
               var6 = d1.k5(var6, var9 + 1);
            }
         }

         boolean var12 = false;
         if (this.n5 == null) {
            a6 var10 = new a6();
            var10.n5(var7);
            var10.l6("");
            var10.n5(var10.n5() | 524288);
            this.n5 = var10;
         } else if (this.n5.l6() == 1) {
            if (var1 == null) {
               this.n5 = null;
               return null;
            }

            u9 var13 = new u9(z3.s7(var1));
            if (var8 == null) {
               var8 = "";
            }

            h0 var11 = new h0(var13);
            var11.k5(var6);
            var11.l6(var8);
            var11.n5(var7);
            this.n5 = var11;
            var12 = true;
         } else if (var1 != null && !d1.a6(var1, d1.n5)) {
            var12 = true;
         } else {
            a6 var14 = new a6();
            var14.n5(var7);
            var14.l6("");
            this.n5 = var14;
         }

         String var15 = "NTLM " + z3.n5(this.n5.k5());
         return new com.aspose.slides.internal.g8v.l6(var15, var12);
      } else {
         return null;
      }
   }
}
