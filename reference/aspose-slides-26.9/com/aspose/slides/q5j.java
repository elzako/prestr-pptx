package com.aspose.slides;

class q5j {
   public static void n5(com.aspose.slides.internal.k4y.h7e var0, com.aspose.slides.internal.k0r.a6 var1, t2s var2) {
      com.aspose.slides.internal.k0r.z3 var3 = var1.c8();
      if (var3 != null) {
         com.aspose.slides.internal.k4y.u3l var4 = null;
         com.aspose.slides.internal.k4y.e3b var5 = null;
         com.aspose.slides.internal.k0r.k0y var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k0r.k0y.class);
         com.aspose.slides.internal.k4y.c7e var7;
         if (var6 != null && var6.a6() == 4) {
            var4 = new com.aspose.slides.internal.k4y.u3l();
            var7 = var4.l6();
            var4.n5(w7n.u3(var1.u3()));
         } else {
            var5 = new com.aspose.slides.internal.k4y.e3b();
            var7 = var5.l6();
         }

         w7n.n5(var7.a6(), new q5j$1(var7), new q5j$2(var7), var1, var2);
         n5(var7, var3, var1.u3(), var2);
         if (var5 != null && var5.l6().u9().n5() != null) {
            var0.n5(new com.aspose.slides.internal.k4y.g7("audio", var5));
         } else if (var4 != null && var4.l6().u9().n5() != null) {
            var0.n5(new com.aspose.slides.internal.k4y.g7("video", var4));
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.c7e var0, com.aspose.slides.internal.k0r.z3 var1, com.aspose.slides.internal.k0r.y2o var2, t2s var3) {
      var0.n5(w7n.k5(var2));
      var0.n5(w7n.l6(var2) * 100.0F);
      var0.l6(!w7n.n5(var2));
      var0.n5(w7n.a6(var2) & 4294967295L);
      if (var1 != null) {
         y1t.n5(var0.u9(), var1.l6(), var3);
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.c7e var0, com.aspose.slides.internal.k0r.y2o var1) {
      if ((var0.k5() & 4294967295L) > 1L) {
         com.aspose.slides.internal.k0r.s5r var2 = new com.aspose.slides.internal.k0r.s5r((int)var0.k5());
         var2.w1().n5((short)15);
         var1.e2().addItem(var2);
      }

      if (!var0.u3()) {
         com.aspose.slides.internal.k0r.j3z var4 = new com.aspose.slides.internal.k0r.j3z(true);
         var4.w1().n5((short)18);
         var1.e2().addItem(var4);
      }

      com.aspose.slides.internal.k0r.f4l var5 = new com.aspose.slides.internal.k0r.f4l(var0.l6() ? 0.0F : var0.n5() / 100.0F);
      var5.w1().n5((short)22);
      var1.e2().addItem(var5);
      if (var0.l6()) {
         com.aspose.slides.internal.k0r.j3z var3 = new com.aspose.slides.internal.k0r.j3z(true);
         var3.w1().n5((short)23);
         var1.e2().addItem(var3);
      }
   }
}
