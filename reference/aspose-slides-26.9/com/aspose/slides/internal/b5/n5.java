package com.aspose.slides.internal.b5;

import com.aspose.slides.internal.f5.r4;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.internal.q3.c8;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class n5 extends c8 {
   private static final y8 n5 = k5.n5(com.aspose.slides.internal.s4.n5.class);
   private static final u9 l6 = new u9(
      "get_bubbles",
      "get_cancelable",
      "get_currentTarget",
      "get_eventPhase",
      "get_target",
      "get_timeStamp",
      "get_type",
      "initEvent",
      "preventDefault",
      "stopPropagation"
   );

   @Override
   public void l6() {
      this.k5("initEvent");
      this.k5("preventDefault");
      this.k5("stopPropagation");
      this.n5("bubbles", 1);
      this.n5("cancelable", 1);
      this.n5("currentTarget", 1);
      this.n5("eventPhase", 1);
      this.n5("target", 1);
      this.n5("timeStamp", 1);
      this.n5("type", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.s4.n5 var4 = (com.aspose.slides.internal.s4.n5)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.l6());
         case 1:
            return this.n5(var4.k5());
         case 2:
            r4 var9 = k5.n5(var4.a6(), r4.class);
            return var9 == null ? this.u9() : this.n5(var9, j8.n5(var9));
         case 3:
            return this.n5(var4.u3());
         case 4:
            r4 var8 = k5.n5(var4.a6(), r4.class);
            return var8 == null ? this.u9() : this.n5(var8, j8.n5(var8));
         case 5:
            return this.n5(k5.t2(var4.u9(), 12));
         case 6:
            return this.n5(var4.n5());
         case 7:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            String var5 = var3[0].toString();
            boolean var6 = var3[1].n5();
            boolean var7 = var3[2].n5();
            var4.n5(var5, var6, var7);
            return this.u9();
         case 8:
            if (var3.length != 0) {
               throw new j3("invalid arguments count.");
            }

            var4.h0();
            return this.u9();
         case 9:
            if (var3.length != 0) {
               throw new j3("invalid arguments count.");
            }

            var4.c8();
            return this.u9();
         default:
            throw new j3("unknown function");
      }
   }
}
