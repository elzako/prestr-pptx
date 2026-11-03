package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;

class x2u {
   public static void n5(t2s var0) {
      MasterSlide var1 = (MasterSlide)var0.y4();
      if (var1 == null) {
         throw new NullReferenceException("Can't create target DOM MasterSlide!");
      }

      if (var0.a0()) {
         y3o.l6(var0);
      }

      n0.n5(var0);
   }

   static void l6(t2s var0) {
      MasterSlide var1 = com.aspose.slides.internal.v6g.k5.n5(var0.y4(), MasterSlide.class);
      if (var1 != null) {
         n5(var0.e2()[0], var1.h0);
         n5(var0.e2()[1], var1.c8);
         n5(var0.e2()[4], var1.n3);
      }
   }

   private static void n5(s3f var0, TextStyle var1) {
      if (var0 != null) {
         var0.n5(var1);
      }
   }

   static void n5(y2q var0) {
      MasterSlide var1 = (MasterSlide)var0.l6();
      com.aspose.slides.internal.k0r.k2 var2 = (com.aspose.slides.internal.k0r.k2)var0.u3();
      g6o var3 = var0.n5();
      var3.n5(var1);
      l6(var0);
      e5e.n5(var0);
      n0.n5(var0);
      k5(var0);
      com.aspose.slides.internal.k0r.z1 var4 = new com.aspose.slides.internal.k0r.z1("Office Theme", (short)2);
      var4.w1().n5((byte)0);
      var2.e2().addItem(var4);
      IMasterThemeManager var5 = var1.getThemeManager();
      var2.n5(var5.getOverrideTheme().getName());
      a5n.n5(var0);
      n5(var0, (TextStyle)var1.getTitleStyle());
      n5(var0, (TextStyle)var1.getBodyStyle());
      n5(var0, (TextStyle)var1.getOtherStyle());
      n5(var0, (TextStyle)var1.k7());
      n5(var0, (TextStyle)var1.m3());
      n5(var0, (TextStyle)var1.m1());
   }

   static void l6(y2q var0) {
      g6o var1 = var0.n5();
      MasterSlide var2 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), MasterSlide.class);
      if (var0.k5() == 2) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(((LayoutSlide)var0.l6()).getMasterSlide(), MasterSlide.class);
      }

      com.aspose.slides.internal.k0r.k2 var3 = (com.aspose.slides.internal.k0r.k2)var0.u3();
      v3z[] var4 = var0.e2();

      for (int var5 = 0; var5 < 9; var5++) {
         if (var5 != 3) {
            var4[var5] = new v3z(var5, var0);
            var3.n5(var4[var5].l6());
         }
      }

      com.aspose.slides.internal.k0r.o6t var11 = var4[0].l6();
      f8b.n5(var11, var2.getTitleStyle(), var1);
      com.aspose.slides.internal.k0r.o6t var6 = var4[1].l6();
      TextStyle var7 = (TextStyle)var2.getBodyStyle();
      if (com.aspose.slides.internal.v6g.k5.l6(var0.l6(), MasterSlide.class)) {
         TextStyle var8 = new TextStyle(var2);
         var8.n5((n1x)var7.getEffective());
         var7 = var8;
      }

      f8b.n5(var6, var7, var1);
      var4[1].n5();
      com.aspose.slides.internal.k0r.o6t var12 = var4[4].l6();
      f8b.n5(var12, var2.getOtherStyle(), var1);
      com.aspose.slides.internal.k0r.o6t var9 = var4[6].l6();
      f8b.n5(var9, var2.k7(), var1);
      com.aspose.slides.internal.k0r.o6t var10 = var4[5].l6();
      f8b.n5(var10, var2.m3(), var1);
   }

   static void n5(y2q var0, TextStyle var1) {
      if (var1 != null && var1.a6().l6()) {
         com.aspose.slides.internal.k0r.k2 var2 = (com.aspose.slides.internal.k0r.k2)var0.u3();
         boolean var3 = false;
         com.aspose.slides.internal.k0r.j8m var4 = new com.aspose.slides.internal.k0r.j8m();
         var4.w1().n5((short)var1.a6().n5().intValue());

         for (int var5 = 0; var5 < 5; var5++) {
            IParagraphFormat var6 = var1.getLevel(var5);
            if (var6 != null) {
               BulletFormat var7 = (BulletFormat)var6.getBullet();
               com.aspose.slides.internal.k0r.p7x var8 = new com.aspose.slides.internal.k0r.p7x();
               if (var7.getType() == 2) {
                  var8.n5().n5((byte)1);
                  var8.n5().n5(new com.aspose.slides.internal.k0r.g1p(var7.getNumberedBulletStyle(), var7.getNumberedBulletStartWith()));
                  var3 = true;
               }

               if (var7.getType() == 3) {
                  var8.n5().n5((byte)0);
                  var8.n5().n5(new com.aspose.slides.ms.System.o5<>((short)var0.n5().n5(var7.getPicture().getImage()).u3()));
                  var3 = true;
               }

               var4.k5().addItem(var8);
            }
         }

         if (var3) {
            com.aspose.slides.internal.k0r.m2 var9 = var2.a6().u9();
            var9.n5(var4);
         }
      }
   }

   static void k5(y2q var0) {
      com.aspose.slides.internal.k0r.h3d var1 = var0.s7();
      var1.n5(0L);
      var1.l6(0L);
      var1.k5(false);
      var1.n5(false);
      var1.l6(false);
      if (!var0.n5().n5(var1)) {
         var1.n5(16);
      }

      var1.n5(1);
      var1.c8()[0] = 1;
      var1.c8()[1] = 2;
      var1.c8()[2] = 7;
      var1.c8()[3] = 9;
      var1.c8()[4] = 8;
   }
}
