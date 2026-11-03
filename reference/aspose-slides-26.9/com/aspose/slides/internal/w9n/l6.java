package com.aspose.slides.internal.w9n;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l6s.a6;
import com.aspose.slides.internal.l6s.c8;
import com.aspose.slides.internal.l6s.e2;
import com.aspose.slides.internal.l6s.h0;
import com.aspose.slides.internal.l6s.n3;
import com.aspose.slides.internal.l6s.s7;
import com.aspose.slides.internal.l6s.t2;
import com.aspose.slides.internal.l6s.u3;
import com.aspose.slides.internal.l6s.y4;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.t9z.u9;

public class l6 {
   public static n5 n5(u9 var0, boolean var1, boolean var2) {
      if (var1) {
         return null;
      }

      m3 var3 = var0.l6().n5();
      int var4 = var2 ? var3.n3() : var3.y4();
      switch (var4) {
         case 0:
            return null;
         case 1:
            if (var3.t4().l6()) {
               return new t2();
            }

            return new n3(var3.q0() / 2.0F, var3.t4().t2());
         case 2:
            if (var3.t4().l6()) {
               return new h0();
            }

            return new s7(var3.q0() / 2.0F, var3.t4().t2());
         case 3:
            if (var3.t4().l6()) {
               return new e2();
            }

            return new y4(var3.q0() / 2.0F, var3.t4().t2());
         case 17:
            return new c8();
         case 18:
            return new com.aspose.slides.internal.l6s.u9(var3.q0());
         case 19:
            return new a6(var0.k5(), var0.l6());
         case 20:
            return new u3();
         case 255:
            try {
               com.aspose.slides.internal.x4g.u9 var5 = var2 ? var3.h0() : var3.u9();
               if (var5.x8()) {
                  return new com.aspose.slides.internal.a8e.u3(var0);
               }

               return new com.aspose.slides.internal.a8e.l6(var0.k5(), var0.l6());
            } catch (ArgumentException var6) {
               return null;
            }
         default:
            return null;
      }
   }
}
