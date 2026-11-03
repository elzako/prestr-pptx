package com.aspose.slides.internal.c8;

import com.aspose.slides.internal.k5.u9;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.t2.c4;
import com.aspose.slides.internal.t2.c8;
import com.aspose.slides.internal.t2.e2;
import com.aspose.slides.internal.t2.h0;
import com.aspose.slides.internal.t2.j5;
import com.aspose.slides.internal.t2.k7;
import com.aspose.slides.internal.t2.m1;
import com.aspose.slides.internal.t2.m3;
import com.aspose.slides.internal.t2.n3;
import com.aspose.slides.internal.t2.q0;
import com.aspose.slides.internal.t2.r4;
import com.aspose.slides.internal.t2.t4;
import com.aspose.slides.internal.t2.t9;
import com.aspose.slides.internal.t2.w1;
import com.aspose.slides.internal.t2.x8;
import com.aspose.slides.internal.t2.y4;
import com.aspose.slides.internal.t2.z1;
import com.aspose.slides.internal.t2.z3;
import com.aspose.slides.internal.t2.z8;
import com.aspose.slides.ms.System.d1;

public abstract class u3 extends k5 {
   private String n5;
   private u9 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "color",
      "color-index",
      "monochrome",
      "grid",
      "width",
      "min-width",
      "max-width",
      "height",
      "min-height",
      "max-height",
      "device-width",
      "min-device-width",
      "max-device-width",
      "device-height",
      "min-device-height",
      "max-device-height",
      "orientation",
      "aspect-ratio",
      "device-aspect-ratio",
      "min-color",
      "max-color",
      "resolution",
      "min-resolution",
      "max-resolution",
      "scan"
   );

   protected u3(String var1) {
      this.n5 = var1;
   }

   protected u3(String var1, u9 var2) {
      this(var1);
      this.l6 = var2;
   }

   public static u3 n5(String var0) {
      switch (k5.n5(d1.u9(var0))) {
         case 0:
            return new com.aspose.slides.internal.t2.l6(var0);
         case 1:
            return new com.aspose.slides.internal.t2.k5(var0);
         case 2:
            return new z8(var0);
         case 3:
            return new h0(var0);
         default:
            return null;
      }
   }

   public static u3 n5(String var0, u9 var1) {
      switch (k5.n5(d1.u9(var0))) {
         case 0:
            return new com.aspose.slides.internal.t2.l6(var0, var1);
         case 1:
            return new com.aspose.slides.internal.t2.k5(var0, var1);
         case 2:
            return new z8(var0, var1);
         case 3:
            return new h0(var0, var1);
         case 4:
            return new c4(var0, var1);
         case 5:
            return new m3(var0, var1);
         case 6:
            return new z1(var0, var1);
         case 7:
            return new c8(var0, var1);
         case 8:
            return new m1(var0, var1);
         case 9:
            return new e2(var0, var1);
         case 10:
            return new com.aspose.slides.internal.t2.u9(var0, var1);
         case 11:
            return new z3(var0, var1);
         case 12:
            return new y4(var0, var1);
         case 13:
            return new com.aspose.slides.internal.t2.a6(var0, var1);
         case 14:
            return new q0(var0, var1);
         case 15:
            return new n3(var0, var1);
         case 16:
            return new j5(var0, var1);
         case 17:
            return new com.aspose.slides.internal.t2.n5(var0, var1);
         case 18:
            return new com.aspose.slides.internal.t2.u3(var0, var1);
         case 19:
            return new t4(var0, var1);
         case 20:
            return new x8(var0, var1);
         case 21:
            return new w1(var0, var1);
         case 22:
            return new k7(var0, var1);
         case 23:
            return new t9(var0, var1);
         case 24:
            return new r4(var0, var1);
         default:
            return null;
      }
   }

   @Override
   public String n5() {
      a5 var1 = new a5();
      var1.n5("(");
      var1.n5(this.n5);
      if (this.l6 != null) {
         var1.n5(": {0}",new Object[]{ this.l6.u9()});
      }

      var1.n5(")");
      return var1.toString();
   }
}
