package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class e5e {
   public static void n5(t2s var0) {
      if (!var0.p8()) {
         com.aspose.slides.internal.k0r.k2 var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), com.aspose.slides.internal.k0r.k2.class);
         if (var1 != null) {
            com.aspose.slides.internal.k0r.v7u var2 = var1.t9();
            if (var2 != null) {
               MasterSlide var3 = com.aspose.slides.internal.v6g.k5.n5(var0.y4(), MasterSlide.class);
               if (var3 == null) {
                  var3 = com.aspose.slides.internal.v6g.k5.n5(var0.w1(), MasterSlide.class);
               }

               if (var3 != null) {
                  com.aspose.slides.internal.c8m.t6 var4;
                  try {
                     var4 = new com.aspose.slides.internal.c8m.t6(new com.aspose.slides.internal.z0k.e2(var2.u3()), new e5e$1(var0));
                  } catch (com.aspose.slides.internal.c8m.w3 var12) {
                     var4 = null;
                  }

                  if (var4 != null && var4.t9() != null) {
                     com.aspose.slides.internal.c8m.j8 var5 = var4.t9();
                     var0.a6().t9().n5(n5(var4, var0));
                     com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2(var5.a6());
                     com.aspose.slides.ms.System.Xml.p5 var7 = new com.aspose.slides.ms.System.Xml.p5(var6);
                     var7.n5((com.aspose.slides.ms.System.Xml.o8)null);

                     com.aspose.slides.internal.k4y.s8 var8;
                     try {
                        var8 = new com.aspose.slides.internal.k4y.s8(var7);
                     } catch (RuntimeException var11) {
                        var8 = null;
                     }

                     if (var8 != null) {
                        com.aspose.slides.internal.k4y.q0h var9 = var8.y4();
                        if (var9 != null) {
                           if (var9.u3() != null) {
                              TextStyle var10 = new TextStyle(var3);
                              var10.n5((TextStyle)var3.getTitleStyle());
                              ((TextStyle)var3.getTitleStyle()).h0();
                              p2m.n5(var3.getTitleStyle(), var9.u3(), var0.a6().t9());
                              ((TextStyle)var3.getTitleStyle()).l6(var10);
                           }

                           if (var9.a6() != null) {
                              TextStyle var13 = new TextStyle(var3);
                              var13.n5((TextStyle)var3.getBodyStyle());
                              ((TextStyle)var3.getBodyStyle()).h0();
                              p2m.n5(var3.getBodyStyle(), var9.a6(), var0.a6().t9());
                              ((TextStyle)var3.getBodyStyle()).k5(var13);
                           }

                           if (var9.u9() != null) {
                              TextStyle var14 = new TextStyle(var3);
                              var14.n5((TextStyle)var3.getOtherStyle());
                              ((TextStyle)var3.getOtherStyle()).h0();
                              p2m.n5(var3.getOtherStyle(), var9.u9(), var0.a6().t9());
                              ((TextStyle)var3.getOtherStyle()).k5(var14);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static void l6(t2s var0) {
      if (!var0.p8()) {
         com.aspose.slides.internal.k0r.u3 var1 = var0.s7();
         com.aspose.slides.internal.k0r.v2s var2 = var1.u9();
         if (var2 != null) {
            com.aspose.slides.internal.c8m.t6 var3;
            try {
               var3 = new com.aspose.slides.internal.c8m.t6(new com.aspose.slides.internal.z0k.e2(var2.u3()), new e5e$2(var0));
            } catch (com.aspose.slides.internal.c8m.w3 var15) {
               var3 = null;
            }

            if (var3 != null && var3.q0().size() >= 1) {
               com.aspose.slides.internal.c8m.j8 var4 = var3.z1();
               if (var4 != null) {
                  IGenericEnumerator var5 = var4.e2().iterator();

                  try {
                     while (var5.hasNext()) {
                        com.aspose.slides.internal.c8m.r7 var6 = (com.aspose.slides.internal.c8m.r7)var5.next();
                        n5(var6.l6(), var0);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                        var5.dispose();
                     }
                  }
               } else {
                  List$Enumerator var18 = var3.q0().iterator();

                  try {
                     while (var18.hasNext()) {
                        com.aspose.slides.internal.c8m.j8 var19 = (com.aspose.slides.internal.c8m.j8)var18.next();
                        n5(var19, var0);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                        var18.dispose();
                     }
                  }
               }
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.c8m.j8 var0, t2s var1) {
      boolean var2 = com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.d1.u9(var0.l6()), "themeoverride");
      t5w var3 = var1.a6().t9();
      v6p var4 = null;
      x8c var5 = null;
      IMasterThemeManager var6 = com.aspose.slides.internal.v6g.k5.n5(var1.d2().n5(), IMasterThemeManager.class);
      IOverrideThemeManager var7 = com.aspose.slides.internal.v6g.k5.n5(var1.d2().n5(), IOverrideThemeManager.class);
      if (var2) {
         var5 = new x8c(var0, var3);
         if (var6 != null) {
            throw new ArgumentException("Processing not implemented for filling of MasterTheme from ThemeOverride data!");
         }

         if (var7 != null) {
            n5(var5, var7, var1);
         }
      } else {
         var4 = new v6p(var0, var3);
         if (var6 != null) {
            n5(var4, var6, var1);
         } else if (var7 != null) {
            n5(var4, var7, var1);
         }
      }
   }

   private static void n5(v6p var0, IMasterThemeManager var1, t2s var2) {
      IMasterTheme var3 = var1.getOverrideTheme();
      boolean var4 = var1.isOverrideThemeEnabled();
      var1.setOverrideTheme(new MasterTheme((MasterThemeManager)var1));
      var0.n5(var1);
      if (n5((ColorScheme)var1.getOverrideTheme().getColorScheme())) {
         var1.setOverrideTheme(var3);
         var1.setOverrideThemeEnabled(var4);
      } else {
         m0l var5 = q5v.n5(var2);
         if (var5 != null && var5.n5()) {
            ((MasterThemeManager)var1).u3().n5(var5);
         }
      }
   }

   private static void n5(x8c var0, IOverrideThemeManager var1, t2s var2) {
      IOverrideTheme var3 = var1.getOverrideTheme();
      var1.setOverrideTheme(new OverrideTheme((BaseOverrideThemeManager)var1));
      var0.n5(var1);
      if (n5((ColorScheme)var1.getOverrideTheme().getColorScheme())) {
         var1.setOverrideTheme(var3);
      } else {
         m0l var4 = q5v.n5(var2);
         if (var4 != null && var4.n5()) {
            ((BaseOverrideThemeManager)var1).u3().n5(var4);
         }
      }
   }

   private static void n5(v6p var0, IOverrideThemeManager var1, t2s var2) {
      MasterThemeManager var3 = new MasterThemeManager(null);
      var0.n5(var3);
      if (!n5((ColorScheme)var3.getOverrideTheme().getColorScheme())) {
         m0l var4 = q5v.n5(var2);
         if (var4 != null && var4.n5()) {
            var3.u3().n5(var4);
         }

         if (var2.n3() != 2 || !n5(var2, var3)) {
            if (var1.getOverrideTheme().getColorScheme() != null) {
               ((ColorScheme)var1.getOverrideTheme().getColorScheme()).n5((ColorScheme)var3.getOverrideTheme().getColorScheme());
            } else {
               var1.getOverrideTheme().initColorSchemeFrom((ColorScheme)var3.getOverrideTheme().getColorScheme());
            }

            if (var3.u3().n5()) {
               ((BaseThemeManager)var1).u3().n5(var3.u3());
            }
         }
      }
   }

   private static boolean n5(t2s var0, MasterThemeManager var1) {
      LayoutSlide var2 = com.aspose.slides.internal.v6g.k5.n5(var0.y4(), LayoutSlide.class);
      if (var2 == null) {
         return false;
      }

      LayoutSlideThemeManager var3 = (LayoutSlideThemeManager)var2.getThemeManager();
      if (var3.getOverrideTheme().getColorScheme() != null) {
         return false;
      }

      MasterSlide var4 = com.aspose.slides.internal.v6g.k5.n5(var2.getMasterSlide(), MasterSlide.class);
      if (var4 == null) {
         return false;
      }

      MasterThemeManager var5 = (MasterThemeManager)var4.getThemeManager();
      IColorScheme var6 = var5.n5().getColorScheme();
      m0l var7 = var3.u3();
      if (!var7.n5()) {
         var7 = var5.k5();
      }

      IColorScheme var8 = var1.getOverrideTheme().getColorScheme();
      m0l var9 = var1.k5();

      for (int var10 = 0; var10 < 12; var10++) {
         IColorFormat var11 = var6.getByColorSchemeIndex(var7.n5(var10));
         IColorFormat var12 = var8.getByColorSchemeIndex(var9.n5(var10));
         if (com.aspose.slides.internal.o9b.c8.l6(((ColorFormat)var11).u3(), ((ColorFormat)var12).u3())) {
            return false;
         }
      }

      return true;
   }

   private static boolean n5(ColorScheme var0) {
      if (var0 == null) {
         return true;
      }

      for (int var1 = 0; var1 < 12; var1++) {
         ColorFormat var2 = var0.l6[var1];
         if (var2 == null) {
            return true;
         }

         if (var2 != null && var2.getColorType() == -1) {
            return true;
         }
      }

      return false;
   }

   private static com.aspose.slides.internal.c8m.a2 n5(com.aspose.slides.internal.c8m.t6 var0, t2s var1) {
      com.aspose.slides.internal.c8m.j8 var2 = var0.t9();
      String var3 = "Generated by Aspose.Slides for Java ";
      var1.a6().t9().n5(com.aspose.slides.internal.l7h.j5.z3().u3(var3));
      if (com.aspose.slides.ms.System.j5.s7().n3() % 2L == 0L) {
         var1.a6().n5(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
      }

      return var2.e2();
   }

   public static ILayoutSlide n5(com.aspose.slides.internal.k0r.e5a var0, t2s var1) {
      ILayoutSlide var2 = null;

      com.aspose.slides.internal.c8m.t6 var3;
      try {
         var3 = new com.aspose.slides.internal.c8m.t6(new com.aspose.slides.internal.z0k.e2(var0.u3()), new e5e$3(var1));
      } catch (com.aspose.slides.internal.c8m.w3 var24) {
         var3 = null;
      }

      if (var3 != null && var3.z3().size() >= 1) {
         t5w var4 = var1.a6().t9();
         n0r.n5(var4.t9(), var1.a6().n5(), var4);
         MasterSlide var5 = (MasterSlide)var1.y4();
         List$Enumerator var6 = var3.z3().iterator();

         try {
            while (var6.hasNext()) {
               com.aspose.slides.internal.c8m.j8 var7 = (com.aspose.slides.internal.c8m.j8)var6.next();
               var4.n5(var7.e2());
               p8c var8 = new p8c(var7, var4);

               try {
                  ILayoutSlide[] var9 = new ILayoutSlide[]{var2};
                  var8.n5(var5, var9);
                  var2 = var9[0];
               } catch (RuntimeException var26) {
                  String var10 = "{0}_Blank";
                  int var11 = 0;
                  IGenericEnumerator var12 = var5.getLayoutSlides().iterator();

                  try {
                     while (var12.hasNext()) {
                        ILayoutSlide var13 = (ILayoutSlide)var12.next();
                        if (var13.getLayoutType() == 11) {
                           var11++;
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                        var12.dispose();
                     }
                  }

                  var2 = var5.t4().n5.n5((byte)11);
                  var2.setName(com.aspose.slides.ms.System.d1.n5(var10, new Object[]{var11 > 1 ? var11 : 1}));
                  var1.a6().n5(com.aspose.slides.ms.System.d1.n5("RoundTrip Layout slide ", var7.l6(), " is corrupted: ", var26.getMessage()), 1);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public static void n5(y2q var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0.l6(), MasterSlide.class)) {
         MasterSlide var1 = (MasterSlide)var0.l6();
         if (var0.k5() == 2) {
            var1 = com.aspose.slides.internal.v6g.k5.n5(((LayoutSlide)var0.l6()).getMasterSlide(), MasterSlide.class);
         }

         if (var0.t4() || ((TextStyle)var1.getTitleStyle()).u9() || ((TextStyle)var1.getBodyStyle()).u9() || ((TextStyle)var1.getOtherStyle()).u9()) {
            g6o var2 = var0.n5();
            com.aspose.slides.internal.k0r.k2 var3 = (com.aspose.slides.internal.k0r.k2)var0.u3();
            com.aspose.slides.internal.c8m.t6 var4 = new com.aspose.slides.internal.c8m.t6();
            com.aspose.slides.internal.c8m.j8 var5 = var4.n5("/drs/slideMasters/slideMaster1.xml", null, new com.aspose.slides.internal.c8m.s2());
            var4.c8().l6(var5);
            com.aspose.slides.internal.c8m.a2 var6 = var2.t9().u6();
            g6c var7 = var2.t9();
            var7.n5(var4.c8());

            try {
               com.aspose.slides.internal.k4y.q0h var8 = new com.aspose.slides.internal.k4y.q0h();
               p2m.n5(var1.getTitleStyle(), new e5e$4(var8), var7);
               p2m.n5(var1.getBodyStyle(), new e5e$5(var8), var7);
               p2m.n5(var1.getOtherStyle(), new e5e$6(var8), var7);
               k6m var9 = new k6m(var5, var7);
               var9.n5(var8);
            } finally {
               var7.n5(var6);
            }

            com.aspose.slides.internal.k0r.v7u var13 = new com.aspose.slides.internal.k0r.v7u();
            var13.n5(var4.k7());
            var3.n5(var13);
         }
      }
   }

   public static void l6(y2q var0) {
      y1x var1 = var0.m1();
      if (var0.k5() == 2) {
         var1 = var0.n5(0).m1();
      }

      if (var1.l6() != null) {
         if (var1.u9() || var1.h0()) {
            g6o var2 = var0.n5();
            com.aspose.slides.internal.c8m.t6 var3 = new com.aspose.slides.internal.c8m.t6();
            com.aspose.slides.internal.c8m.j8 var4 = var3.n5("/theme/theme/themeManager.xml", null, new com.aspose.slides.internal.c8m.m4());
            var3.c8().l6(var4);
            if (var1.u9()) {
               com.aspose.slides.internal.c8m.j8 var5 = var3.n5("/theme/theme/theme{0}.xml", new e5e$7(var2), new com.aspose.slides.internal.c8m.j1());
               var4.e2().l6(var5);
               g8a var6 = new g8a(var4, var2.t9());
               var6.n5();
               v6p var7 = new v6p(var5, var2.t9());
               MasterThemeManager var8 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), MasterThemeManager.class);
               if (var8 == null) {
                  return;
               }

               IMasterTheme var9 = var8.n5();
               if (var0.k5() == 2) {
                  String var10 = var9.getName();
                  var9.setName(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var0.z8()), "_", var10}));
                  var7.n5(var9);
                  var9.setName(var10);
               } else {
                  var7.n5(var9);
               }
            } else {
               com.aspose.slides.internal.c8m.j8 var11 = var3.n5("/theme/theme/themeOverride{0}.xml", new e5e$8(var2), new com.aspose.slides.internal.c8m.b1());
               var4.e2().l6(var11);
               g8a var13 = new g8a(var4, var2.t9());
               x8c var14 = new x8c(var11, var2.t9());
               var14.n5((IOverrideTheme)var1.l6());
               var13.n5();
            }

            com.aspose.slides.internal.k0r.v2s var12 = new com.aspose.slides.internal.k0r.v2s();
            var12.n5(var3.k7());
            var0.u3().n5(var12);
            q5v.n5(var0);
         }
      }
   }

   public static void k5(y2q var0) {
      g6o var1 = var0.n5();
      LayoutSlide var2 = (LayoutSlide)var0.l6();
      com.aspose.slides.internal.k0r.k2 var3 = (com.aspose.slides.internal.k0r.k2)var0.u3();
      com.aspose.slides.internal.c8m.t6 var4 = new com.aspose.slides.internal.c8m.t6();
      com.aspose.slides.internal.c8m.j8 var5 = var4.n5("/drs/slideLayouts/slideLayout1.xml", null, new com.aspose.slides.internal.c8m.z9());
      var4.c8().l6(var5);
      p8c var6 = new p8c(var5, var1.t9(), var2);
      var6.n5(var2);
      IGenericEnumerator var7 = var5.e2().iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.c8m.r7 var8 = (com.aspose.slides.internal.c8m.r7)var7.next();

            for (com.aspose.slides.internal.c8m.j8 var12 : var1.t9().a6().t2()) {
               if (com.aspose.slides.ms.System.d1.a6(var12.l6(), var8.n5())) {
                  var4.l6(var12);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      com.aspose.slides.internal.k0r.e5a var16 = var0.j5();
      var16.n5(var4.k7());
      var16.k5((short)var0.z8());
      if (!var0.m3()) {
         var3.n5(var16);
      }
   }
}
