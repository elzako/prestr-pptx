package com.aspose.slides.internal.z6z;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.q1;

public class l6 {
   public static void n5(z3 var0, u3 var1, com.aspose.slides.internal.w0.l6 var2) {
      switch (var2.n5()) {
         case 0:
            n5(var0, (com.aspose.slides.internal.w0.n3)var2);
            return;
         case 1:
            n5(var0, var1, (com.aspose.slides.internal.w0.a6)var2);
            return;
         case 2:
            n5(var0, var1, (com.aspose.slides.internal.w0.y4)var2);
            return;
         case 3:
            n5(var0, var1, (com.aspose.slides.internal.w0.h0)var2);
            return;
         case 4:
            n5(var0, var1, n5((com.aspose.slides.internal.w0.t2)var2));
            return;
         default:
            throw new NotSupportedException("Unsupported brush type.");
      }
   }

   public static void n5(z3 var0, u3 var1, byte[] var2, com.aspose.slides.internal.s5.c8 var3, y1 var4, int var5, com.aspose.slides.internal.w0.c8 var6) {
      s7 var7 = var1.n5(var2, var3);
      var0.l6("ImageBrush");
      var0.k5("ImageSource", var7.n5());
      com.aspose.slides.internal.k4d.u3 var8 = var7.l6();
      y1 var9 = new y1(0.0F, 0.0F, (float)a6.n5(var8.a6()), (float)a6.n5(var8.u9()));
      var0.n5("Viewbox", var9.y4());
      if (!com.aspose.slides.internal.s5.c8.n5(var3)) {
         var3.l6(var4.y4()).a6(var4);
      }

      y1 var10 = new y1(var4.x8(), var4.n3(), var4.s7() > 0.0F ? var4.s7() : (float)var8.a6(), var4.k5() > 0.0F ? var4.k5() : (float)var8.u9());
      var0.n5("Viewport", var10.y4());
      var0.k5("ViewboxUnits", "Absolute");
      var0.k5("ViewportUnits", "Absolute");
      if (var6 != null) {
         var0.n5("Transform", var6);
      }

      var0.k5("TileMode", a6.u3(var5));
      var0.k5();
   }

   private static void n5(z3 var0, com.aspose.slides.internal.w0.n3 var1) {
      var0.l6("SolidColorBrush");
      var0.n5("Color", var1.l6());
      var0.k5();
   }

   private static void n5(z3 var0, u3 var1, com.aspose.slides.internal.w0.h0 var2) {
      if (!d2.l6(var2.t2(), 0.0)) {
         com.aspose.slides.internal.w0.y4 var7 = n5(var2);
         n5(var0, var1, var7, var2.a6().y4());
      } else {
         var0.l6("LinearGradientBrush");
         var0.k5("MappingMode", "Absolute");
         if (!var2.s7().n5() && !var2.x8().n5()) {
            var0.n5("StartPoint", var2.s7().l6(), var2.s7().k5());
            var0.n5("EndPoint", var2.x8().l6(), var2.x8().k5());
         } else {
            var0.n5("StartPoint", var2.a6().x8(), var2.a6().n3());
            var0.n5("EndPoint", var2.a6().h0(), var2.a6().t2());
         }

         if (var2.y4() == 1) {
            var0.k5("SpreadMethod", "Reflect");
         } else {
            var0.k5("SpreadMethod", "Repeat");
         }

         if (var2.n3() != null) {
            var0.n5("Transform", var2.n3());
         }

         var0.l6("LinearGradientBrush.GradientStops");
         if (var2.l6() == null) {
            n5(var0, var2.u9(), 0.0F);
            n5(var0, var2.h0(), 1.0F);
         } else {
            for (com.aspose.slides.internal.w0.u9 var6 : var2.l6()) {
               n5(var0, var6.n5(), var6.l6());
            }
         }

         var0.k5();
         var0.k5();
      }
   }

   private static void n5(z3 var0, com.aspose.slides.internal.p1s.n5 var1, float var2) {
      var0.l6("GradientStop");
      var0.n5("Color", var1);
      var0.n5("Offset", var2);
      var0.k5();
   }

   private static void n5(z3 var0, u3 var1, com.aspose.slides.internal.w0.a6 var2) {
      byte[] var3 = com.aspose.slides.internal.s5.u9.n5(var2);
      n5(var0, var1, var3, null, y1.n5.y4(), 0, null);
   }

   private static void n5(z3 var0, u3 var1, com.aspose.slides.internal.w0.y4 var2) {
      n5(var0, var1, var2, y1.n5.y4());
   }

   private static void n5(z3 var0, u3 var1, com.aspose.slides.internal.w0.y4 var2, y1 var3) {
      com.aspose.slides.internal.j7.n5 var4 = new com.aspose.slides.internal.j7.n5(var2);

      try {
         byte[] var5 = x8.n5(var4);
         com.aspose.slides.internal.k4d.u3 var6 = com.aspose.slides.internal.k4d.a6.z3(var5);
         if (var3.u3()) {
            var3 = new y1(0.0F, 0.0F, var6.n5(), var6.l6());
         }

         n5(var0, var1, var5, null, var3.y4(), var2.y4(), var2.n3().k5());
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.w0.y4 n5(com.aspose.slides.internal.w0.t2 var0) {
      com.aspose.slides.internal.e1.h0 var1 = new com.aspose.slides.internal.e1.h0();
      y1 var2 = var1.n5((m3)var0.u9()).y4();
      com.aspose.slides.internal.j7.n5 var3 = new com.aspose.slides.internal.j7.n5(
         com.aspose.slides.internal.v6g.k5.u3(var2.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13)
      );

      try {
         com.aspose.slides.internal.x4g.m3 var4 = (com.aspose.slides.internal.x4g.m3)com.aspose.slides.internal.j7.k5.n5(var0);

         try {
            com.aspose.slides.internal.w0.c8 var5 = com.aspose.slides.internal.j7.c8.n5(var4.e2());
            var4.k5(new m1());
            com.aspose.slides.internal.j7.h0 var6 = new com.aspose.slides.internal.j7.h0(var3);

            try {
               var6.l6().n5(var4, 0, 0, var3.l6(), var3.k5());
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }
            }

            com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

            byte[] var7;
            try {
               var3.n5(var8, 5);
               var7 = var8.toArray();
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            com.aspose.slides.internal.w0.y4 var9 = new com.aspose.slides.internal.w0.y4(var7);
            var9.n5(var5);
            return var9;
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.w0.y4 n5(com.aspose.slides.internal.w0.h0 var0) {
      y1 var1 = var0.a6().y4();
      com.aspose.slides.internal.j7.n5 var2 = new com.aspose.slides.internal.j7.n5(
         com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1.s7()), 14), com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1.k5()), 14)
      );

      try {
         com.aspose.slides.internal.j7.h0 var3 = new com.aspose.slides.internal.j7.h0(var2);

         try {
            com.aspose.slides.internal.o9b.u3 var4 = com.aspose.slides.internal.j7.k5.n5(var0);

            try {
               com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

               try {
                  com.aspose.slides.internal.o9b.z1 var6 = var3.l6();
                  var6.l6(-var1.x8(), -var1.n3());
                  var6.l6(var4, var1.y4());
                  var2.n5(var5, 5);
                  byte[] var7 = var5.toArray();
                  com.aspose.slides.internal.w0.y4 var8 = new com.aspose.slides.internal.w0.y4(var7);
                  var8.n5(var0.n3());
                  return var8;
               } finally {
                  if (var5 != null) {
                     var5.dispose();
                  }
               }
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }
}
