package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;

class p1l {
   public static void n5(t2s var0) {
      MasterNotesSlide var1 = (MasterNotesSlide)var0.y4();
      if (var1 == null) {
         throw new NullReferenceException("Can't create target DOM MasterNotesSlide!");
      }

      com.aspose.slides.internal.k0r.o4 var2 = (com.aspose.slides.internal.k0r.o4)var0.s7();
      n0.n5(var0);
      n5(var1, var2);
   }

   static void n5(MasterNotesSlide var0, com.aspose.slides.internal.k0r.o4 var1) {
      v1e var2 = var0.q0();
      var2.n5(var1.u9());
      var2.n5(var1.h0());
      var2.n5(var1.s7());
   }

   static void n5(y2q var0) {
      if (var0 != null) {
         MasterNotesSlide var1 = (MasterNotesSlide)var0.l6();
         com.aspose.slides.internal.k0r.m0 var2 = var0.x8();
         IMasterThemeManager var3 = var1.getThemeManager();
         com.aspose.slides.internal.k0r.o8 var4 = null;
         y2q var5 = var0.n5(0);
         if (var5 != null) {
            var4 = com.aspose.slides.internal.v6g.k5.n5(var5.u3(), com.aspose.slides.internal.k0r.o8.class);
         }

         var2.l6(!var3.isOverrideThemeEnabled());
         var2.n5(false);
         if (var4 != null) {
            var2.n5(var4.j5());
            var2.k5(var1.getBackground().getType() == -1);
            v3z var6 = var5.e2()[2];
            IFontData var7 = var0.n5().n5(var3.getOverrideTheme().getFontScheme().getMajor().getLatinFont(), null);
            v6v var8 = var0.n5().n5().z1().n5();
            int var9 = var8.n5(0, var7);
            var6.l6().u3().get_Item(0).l6().l6(new com.aspose.slides.ms.System.o5<>(var8.k5(var9)));
         } else {
            var2.n5(0L);
            var2.k5(false);
         }

         n0.n5(var0);
      }
   }
}
