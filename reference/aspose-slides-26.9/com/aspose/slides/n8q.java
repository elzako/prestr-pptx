package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;

class n8q {
   public static void n5(t2s var0) {
      NotesSlide var1 = com.aspose.slides.internal.v6g.k5.n5(var0.y4(), NotesSlide.class);
      if (var1 == null) {
         throw new NullReferenceException("Can't create target DOM Slide!");
      }

      com.aspose.slides.internal.k0r.o4 var2 = (com.aspose.slides.internal.k0r.o4)var0.s7();
      n0.n5(var0);
      n5(var1.z3(), var2);
   }

   static void n5(v1e var0, com.aspose.slides.internal.k0r.o4 var1) {
      var0.n5(var1.u9());
      var0.n5(var1.h0());
      var0.n5(var1.s7());
   }

   static void n5(y2q var0) {
      com.aspose.slides.internal.k0r.o4 var1 = (com.aspose.slides.internal.k0r.o4)var0.u3();
      NotesSlide var2 = (NotesSlide)var0.l6();
      com.aspose.slides.internal.k0r.w1n var3 = var0.n3();
      com.aspose.slides.internal.k0r.m0 var4 = var0.x8();
      IOverrideThemeManager var5 = var2.getThemeManager();
      com.aspose.slides.internal.k0r.o8 var6 = null;
      y2q var7 = var0.n5(4);
      if (var7 != null) {
         var6 = com.aspose.slides.internal.v6g.k5.n5(var7.u3(), com.aspose.slides.internal.k0r.o8.class);
      }

      if (var6 != null) {
         var6.z8().l6(var3.u3());
      }

      if (var6 != null) {
         var4.n5(var6.j5());
         var4.k5(var2.getBackground().getType() == -1);
         var4.n5(true);
         var4.l6(!var5.isOverrideThemeEnabled());
      } else {
         var4.n5(0L);
         var4.k5(false);
         var4.n5(false);
         var4.l6(false);
      }

      n0.n5(var0);
   }
}
