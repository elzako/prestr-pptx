package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;

class r7x {
   static void n5(t2s var0) {
      com.aspose.slides.internal.k0r.k2 var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), com.aspose.slides.internal.k0r.k2.class);
      if (var1 != null) {
         MasterSlide var2 = com.aspose.slides.internal.v6g.k5.n5(var0.y4(), MasterSlide.class);
         if (var2 != null) {
            MasterThemeManager var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getThemeManager(), MasterThemeManager.class);
            ExtraColorSchemeCollection var4 = com.aspose.slides.internal.v6g.k5.n5(
               var3.getOverrideTheme().getExtraColorSchemes(), ExtraColorSchemeCollection.class
            );
            var4.n5();
            int var5 = -1;
            ExtraColorScheme var6 = null;
            int var7 = 0;

            for (com.aspose.slides.internal.k0r.k7 var11 : var1.s7()) {
               ExtraColorScheme var12 = new ExtraColorScheme(var4);
               var12.n5().n5(true);
               if (var5 < 0 && n5(var11.l6(), var0.d5())) {
                  var5 = var7;
                  var6 = var12;
               } else {
                  f9d.l6(var11.l6(), var12);
               }

               f9d.n5(var11.l6(), var12);
               ((ColorScheme)var12.getColorScheme()).n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.t2(), " ", com.aspose.slides.ms.System.a3.l6(++var7)}));
               var4.n5(var12);
            }

            if (var5 < 0) {
               var6 = new ExtraColorScheme(null, true);
               f9d.n5(var0.d5(), var6);
               var5 = var7 + 1;
               ((ColorScheme)var6.getColorScheme()).n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.t2(), " ", com.aspose.slides.ms.System.a3.l6(var5)}));
            }

            IMasterTheme var14 = var3.getOverrideTheme();
            var3.applyColorScheme(var6);
            var3.setOverrideThemeEnabled(true);
            var3.u3().n5(true);
            if (var3.getOverrideTheme().getFormatScheme() != null) {
               ((FormatScheme)var14.getFormatScheme()).k5();
            }

            var14.setName(var1.t2());
            var14.getFontScheme().setName(var1.t2());
         }
      }
   }

   static void l6(t2s var0) {
      y1x var1 = var0.d2();
      if (var0.d5() != null) {
         ExtraColorScheme var2 = new ExtraColorScheme(null, true);
         f9d.n5(var0.d5(), var2);
         var1.n5().applyColorScheme(var2);
         var1.n5(true);
         if (var1.a6() != null) {
            var1.a6().l6();
         }

         if (var1.u3() != null) {
            var1.u3().k5();
         }
      }
   }

   static void k5(t2s var0) {
      y1x var1 = var0.d2();
      var1.n5(false);
      if (var0.d5() != null) {
         if (var0.x8() != null) {
            boolean var2 = !var0.x8().k5() || var0.n3() == 2;
            if (var2) {
               ExtraColorScheme var3 = new ExtraColorScheme(null, true);
               f9d.n5(var0.d5(), var3);
               t2s var4 = var0.c8();
               if (var4 != null) {
                  if (n5(var0.d5(), var4.d5())) {
                     var2 = false;
                  } else {
                     com.aspose.slides.internal.k0r.k2 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.s7(), com.aspose.slides.internal.k0r.k2.class);
                     if (var5 != null) {
                        int var6 = 0;

                        for (com.aspose.slides.internal.k0r.k7 var10 : var5.s7()) {
                           var6++;
                           if (n5(var10.l6(), var0.d5())) {
                              ((ColorScheme)var3.getColorScheme())
                                 .n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5.t2(), " ", com.aspose.slides.ms.System.a3.l6(var6)}));
                              break;
                           }
                        }
                     }
                  }
               }

               if (var2) {
                  var1.n5().applyColorScheme(var3);
                  var1.n5(true);
               }
            }
         }
      }
   }

   private static boolean n5(List<Long> var0, List<Long> var1) {
      for (int var2 = 0; var2 < 8; var2++) {
         if (((Long)var0.get_Item(var2) & 4294967295L) != ((Long)var1.get_Item(var2) & 4294967295L)) {
            return false;
         }
      }

      return true;
   }

   static void n5(y2q var0) {
      com.aspose.slides.internal.k0r.k2 var1 = com.aspose.slides.internal.v6g.k5.n5(var0.u3(), com.aspose.slides.internal.k0r.k2.class);
      if (var1 != null) {
         MasterSlide var2 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), MasterSlide.class);
         if (var2 == null) {
            LayoutSlide var3 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), LayoutSlide.class);
            if (var3 == null) {
               return;
            }

            var2 = (MasterSlide)var3.getMasterSlide();
         }

         ExtraColorSchemeCollection var6 = (ExtraColorSchemeCollection)var2.getThemeManager().getOverrideTheme().getExtraColorSchemes();

         for (int var4 = 0; var4 < var6.size(); var4++) {
            ExtraColorScheme var5 = (ExtraColorScheme)var6.get_Item(var4);
            f9d.n5(var5, var1, true);
         }
      }
   }

   static void l6(y2q var0) {
      ExtraColorScheme var1 = new ExtraColorScheme(null);
      boolean var2 = true;
      boolean var3 = true;
      BaseSlide var4 = var0.l6();

      while (var3 || var2) {
         ColorScheme var5 = null;
         m0l var6 = null;
         if (var4 == null) {
            if (var2) {
               var5 = com.aspose.slides.internal.v6g.k5.n5(var0.n5().n5().getMasterTheme().getColorScheme(), ColorScheme.class);
               if (var5 == null) {
                  throw new NullReferenceException("Master color scheme not found!");
               }
            }

            if (var3) {
               var6 = MasterThemeManager.n5;
               var6.n5(true);
            }
         }

         MasterSlide var7 = com.aspose.slides.internal.v6g.k5.n5(var4, MasterSlide.class);
         if (var7 != null) {
            var5 = com.aspose.slides.internal.v6g.k5.n5(var7.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
            var6 = ((MasterThemeManager)var7.getThemeManager()).k5();
            var4 = null;
         }

         MasterNotesSlide var8 = com.aspose.slides.internal.v6g.k5.n5(var4, MasterNotesSlide.class);
         if (var8 != null) {
            if (var8.getThemeManager().isOverrideThemeEnabled()) {
               var5 = com.aspose.slides.internal.v6g.k5.n5(var8.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
            }

            var6 = ((MasterThemeManager)var8.getThemeManager()).k5();
            var4 = null;
         }

         MasterHandoutSlide var9 = com.aspose.slides.internal.v6g.k5.n5(var4, MasterHandoutSlide.class);
         if (var9 != null) {
            if (var9.getThemeManager().isOverrideThemeEnabled()) {
               var5 = com.aspose.slides.internal.v6g.k5.n5(var9.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
            }

            var6 = ((MasterThemeManager)var9.getThemeManager()).k5();
            var4 = null;
         }

         LayoutSlide var10 = com.aspose.slides.internal.v6g.k5.n5(var4, LayoutSlide.class);
         if (var10 != null) {
            var5 = com.aspose.slides.internal.v6g.k5.n5(var10.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
            var6 = ((BaseOverrideThemeManager)var10.getThemeManager()).u3();
            var4 = com.aspose.slides.internal.v6g.k5.n5(var10.getMasterSlide(), MasterSlide.class);
         }

         Slide var11 = com.aspose.slides.internal.v6g.k5.n5(var4, Slide.class);
         if (var11 != null) {
            var5 = com.aspose.slides.internal.v6g.k5.n5(var11.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
            var6 = ((BaseOverrideThemeManager)var11.getThemeManager()).u3();
            var4 = var11.w1();
         }

         NotesSlide var12 = com.aspose.slides.internal.v6g.k5.n5(var4, NotesSlide.class);
         if (var12 != null) {
            var5 = com.aspose.slides.internal.v6g.k5.n5(var12.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
            var6 = ((BaseOverrideThemeManager)var12.getThemeManager()).u3();
            var4 = var0.n5().z7().l6();
         }

         if (var2 && var5 != null) {
            var2 = false;
            ((ColorScheme)var1.getColorScheme()).n5(var5);
         }

         if (var3 && var6 != null && var6.n5()) {
            var3 = false;
            var1.n5().n5(var6);
         }
      }

      f9d.n5(var1, var0.u3(), false);
   }
}
