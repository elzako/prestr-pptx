package com.aspose.slides.internal.u7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.j7.x8;
import com.aspose.slides.internal.n9.a6;
import com.aspose.slides.internal.n9.k5;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.r6.u3;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.internal.x4g.m1;

public class n5 {
   public static void n5(s9 var0, u9 var1) {
      if (u3.a6(var0, var1)) {
         switch ((int)var0.c4()) {
            case 26:
               a6(var0, var1);
               break;
            case 28:
               com.aspose.slides.internal.n9.u9.n5(var1);
               break;
            case 29:
               l6(var0, var1);
               break;
            case 30:
               u3(var0, var1);
               break;
            case 67:
               u9(var0, var1);
               break;
            case 75:
               k5(var0, var1);
               break;
            default:
               throw new ArgumentException();
         }
      }
   }

   private static void l6(s9 var0, u9 var1) {
      com.aspose.slides.internal.r5.l6.n5(var0, var1);
      n5(var1.v0(), var1);
   }

   private static void k5(s9 var0, u9 var1) {
      com.aspose.slides.internal.n9.l6.u9(var0, var1);
      n5(var1.v0(), var1);
   }

   private static void u3(s9 var0, u9 var1) {
      k5.u9(var0, var1);
      n5(var1.v0(), var1);
   }

   private static void a6(s9 var0, u9 var1) {
      com.aspose.slides.internal.n9.u3.u9(var0, var1);
      n5(var1.v0(), var1);
   }

   private static void u9(s9 var0, u9 var1) {
      a6.u9(var0, var1);
      if (var1.t9() != null) {
         n5(var1.v0(), var1);
      }
   }

   private static void n5(a0 var0, u9 var1) {
      t2 var2 = var1.n5();
      if (var2.a6() != null) {
         var2 = (t2)var2.y2();
      }

      m1 var3 = var1.x9();
      var3.h0();
      a0 var4 = var0.l6();
      var4.l6(var3);
      t2 var5 = new t2();
      var5.n5(x8.n5(var4));
      var2.n5(var5);
      var1.n5(var5);
   }
}
