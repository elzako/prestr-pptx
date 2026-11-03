package com.aspose.slides.internal.q2;

import com.aspose.slides.internal.n5.a0;
import com.aspose.slides.internal.n5.e2;
import com.aspose.slides.internal.n5.m3;
import com.aspose.slides.internal.n5.u3;
import com.aspose.slides.internal.n5.x8;

class l6$n5 extends x8 {
   // $VF: synthetic field
   final l6 s7;

   public l6$n5(l6 var1, u3 var2) {
      this.s7 = var1;
      this.t2 = var2;
      this.c8 = 57;
      this.n5 = com.aspose.slides.internal.q2.l6.t2;
      this.l6 = com.aspose.slides.internal.q2.l6.s7;
      this.k5 = com.aspose.slides.internal.q2.l6.x8;
      this.u3 = com.aspose.slides.internal.q2.l6.n3;
      this.a6 = com.aspose.slides.internal.q2.l6.y4;
      this.u9 = com.aspose.slides.internal.q2.l6.e2;
      this.h0 = com.aspose.slides.internal.q2.l6.t9;
   }

   @Override
   public String n5() {
      return "1394:1: statement returns [Statement value] options {k=1; } : ({...}? block | {...}?func= functionDeclaration | statementTail );";
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
            byte var11 = -1;
            if (var3.n5(1) == 63) {
               var11 = 38;
            } else {
               var11 = 3;
            }

            var3.u3(var6);
            if (var11 >= 0) {
               return var11;
            }
            break;
         case 1:
            int var7 = var3.n5(1);
            int var8 = var3.l6();
            var3.a6();
            byte var9 = -1;
            if (var3.n5(1) == 17) {
               var9 = 39;
            } else {
               var9 = 3;
            }

            var3.u3(var8);
            if (var9 >= 0) {
               return var9;
            }
      }

      m3 var13 = new m3(this.n5(), 57, var4, var3);
      this.n5(var13);
      throw var13;
   }
}
