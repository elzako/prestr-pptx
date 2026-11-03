package com.aspose.slides.internal.q2;

import com.aspose.slides.internal.n5.a0;
import com.aspose.slides.internal.n5.e2;
import com.aspose.slides.internal.n5.m3;
import com.aspose.slides.internal.n5.u3;
import com.aspose.slides.internal.n5.x8;

class l6$k5 extends x8 {
   // $VF: synthetic field
   final l6 s7;

   public l6$k5(l6 var1, u3 var2) {
      this.s7 = var1;
      this.t2 = var2;
      this.c8 = 88;
      this.n5 = com.aspose.slides.internal.q2.l6.w1;
      this.l6 = com.aspose.slides.internal.q2.l6.r4;
      this.k5 = com.aspose.slides.internal.q2.l6.c4;
      this.u3 = com.aspose.slides.internal.q2.l6.y2;
      this.a6 = com.aspose.slides.internal.q2.l6.y1;
      this.u9 = com.aspose.slides.internal.q2.l6.a0;
      this.h0 = com.aspose.slides.internal.q2.l6.d2;
   }

   @Override
   public String n5() {
      return "1893:1: sourceElement returns [Statement value] options {k=1; } : ({...}?func= functionDeclaration | stat= statement );";
   }

   @Override
   public int l6(int var1, e2 var2) throws m3 {
      a0 var3 = (a0)var2;
      int var4 = var1;
      switch (var1) {
         case 0:
            int var5 = var3.n5(1);
            int var6 = var3.l6();
            var3.a6();
            byte var7 = -1;
            if (var3.n5(1) == 17) {
               var7 = 38;
            } else {
               var7 = 2;
            }

            var3.u3(var6);
            if (var7 >= 0) {
               return var7;
            }
         default:
            m3 var9 = new m3(this.n5(), 88, var4, var3);
            this.n5(var9);
            throw var9;
      }
   }
}
