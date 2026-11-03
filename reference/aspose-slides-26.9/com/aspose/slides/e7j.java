package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class e7j {
   static void n5(t2s var0) {
      Slide var1 = (Slide)var0.y4();
      if (var1 == null) {
         throw new NullReferenceException("Can't create target DOM Slide!");
      }

      com.aspose.slides.internal.k0r.u6p var2 = (com.aspose.slides.internal.k0r.u6p)var0.s7();
      var1.setHidden(false);
      n0.n5(var0);
      n5(var1.z3(), var2);
      l6(var0);
      com.aspose.slides.internal.k0r.o8m var3 = var1.z3().k5();
      if (var3 != null) {
         var1.q0().n5(!var3.k5());
      }
   }

   static void n5(o5y var0, com.aspose.slides.internal.k0r.u6p var1) {
      var0.n5(var1.x8());
      var0.l6(var1.t2());
      var0.n5(var1.u3());
   }

   private static void l6(t2s var0) {
      if (var0.n3() == 4) {
         IGenericEnumerator var1 = var0.k7().iterator();

         try {
            while (var1.hasNext()) {
               v5s var2 = (v5s)var1.next();
               if (!var2.y4() && !var2.e2() && var2.c8() == 3) {
                  IAutoShape var3 = (IAutoShape)var2.a6().m1();
                  TextFrame var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getTextFrame(), TextFrame.class);
                  if (var4 != null && !var4.h0()) {
                     IFillFormatEffectiveData var5 = var3.getFillFormat().getEffective();
                     IBackgroundEffectiveData var6 = var0.y4().getBackground().getEffective();
                     IGenericEnumerator var7 = var3.getTextFrame().getParagraphs().iterator();

                     try {
                        while (var7.hasNext()) {
                           IParagraph var8 = (IParagraph)var7.next();
                           IGenericEnumerator var9 = var8.getPortions().iterator();

                           try {
                              while (var9.hasNext()) {
                                 IPortion var10 = (IPortion)var9.next();
                                 IPortionFormat var11 = var10.getPortionFormat();
                                 IPortionFormatEffectiveData var12 = var11.getEffective();
                                 IOuterShadowEffectiveData var13 = var12.getEffectFormat().getOuterShadowEffect();
                                 if (var13 != null) {
                                    com.aspose.slides.internal.o9b.c8 var14 = com.aspose.slides.internal.o9b.c8.m3().o8();
                                    if (var12.getFillFormat().getFillType() == 1) {
                                       ((f6a)var12.getFillFormat()).h0().n5(var14);
                                    }

                                    if (var6.getFillFormat().getFillType() == 1 || var6.getFillFormat().getFillType() == 2 || var5.getFillType() == 1) {
                                       com.aspose.slides.internal.o9b.c8 var15 = com.aspose.slides.internal.o9b.c8.m3().o8();
                                       com.aspose.slides.internal.o9b.c8 var16 = com.aspose.slides.internal.o9b.c8.n5(255, 127, 127, 127).o8();
                                       com.aspose.slides.internal.o9b.c8 var17 = com.aspose.slides.internal.o9b.c8.n5(255, 200, 200, 200).o8();
                                       com.aspose.slides.internal.o9b.c8 var18 = com.aspose.slides.internal.o9b.c8.w4().o8();
                                       com.aspose.slides.internal.o9b.c8 var19 = var17.o8();
                                       com.aspose.slides.internal.o9b.c8 var20 = new com.aspose.slides.internal.o9b.c8();
                                       if (var5.getFillType() == 1) {
                                          ((f6a)var5).h0().n5(var20);
                                       } else if (var6.getFillFormat().getFillType() == 1) {
                                          ((f6a)var6.getFillFormat()).h0().n5(var20);
                                       } else {
                                          var19.n5(var20);
                                       }

                                       float var21 = var20.c8();
                                       float var22 = var14.c8();
                                       float var23 = com.aspose.slides.internal.o9b.c8.n5(255, 240, 240, 240).c8();
                                       if (var21 >= var23) {
                                          var17.n5(var19);
                                       } else if (var21 > 0.0F && var21 < var23) {
                                          (var22 > 0.0F ? var15 : var18).n5(var19);
                                       } else if (var21 == 0.0F) {
                                          (var22 < var23 ? var18 : var16).n5(var19);
                                       }

                                       if (((k0p)var13).l6().h0() != var19.h0()) {
                                          OuterShadow var24;
                                          if (var11.getEffectFormat().getOuterShadowEffect() == null) {
                                             var11.getEffectFormat().enableOuterShadowEffect();
                                             var24 = (OuterShadow)var11.getEffectFormat().getOuterShadowEffect();
                                             var24.setDistance(var13.getDistance());
                                             var24.setBlurRadius(var13.getBlurRadius());
                                             var24.setDirection(var13.getDirection());
                                             var24.setRectangleAlign(var13.getRectangleAlign());
                                          } else {
                                             var24 = (OuterShadow)var11.getEffectFormat().getOuterShadowEffect();
                                          }

                                          ((ColorFormat)var24.getShadowColor()).n5(var19.o8());
                                          var11.getEffectFormat().setOuterShadowEffect(var24);
                                       }
                                    }
                                 }
                              }
                           } finally {
                              if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                                 var9.dispose();
                              }
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                           var7.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }

   public static void n5(y2q var0) {
      com.aspose.slides.internal.k0r.u6p var1 = (com.aspose.slides.internal.k0r.u6p)var0.u3();
      g6o var2 = var0.n5();
      Slide var3 = (Slide)var0.l6();
      com.aspose.slides.internal.k0r.w1n var4 = var0.n3();
      y2q var5 = var0.n5(0);
      var4.n5(var3.u3().l6());
      com.aspose.slides.internal.k0r.h3d var6 = var1.z8();
      var6.l6(0L);
      var6.k5(var3.getBackground().getType() == -1);
      var6.n5(var3.getShowMasterShapes());
      boolean var7 = var3.z3().a6() != null && !var3.z3().u9();
      var2.n5(var5.l6());
      if (var7) {
         var6.l6(var3.z3().u9());
      } else {
         var6.l6(!var3.getThemeManager().isOverrideThemeEnabled());
      }

      var2.n5(true);
      n0.n5(var0);
      var2.n5(false);
      l6(var0);
      if (var7) {
         com.aspose.slides.internal.k0r.k7 var8 = var1.u3();
         if (var8 != null) {
            var8.n5(var3.z3().a6());
         } else {
            var1.n5(var3.z3().a6());
         }
      }

      if (var0.r4()) {
         var0.k5(true);
      }

      if (var3.getLayoutSlide() != null) {
         if (var0.c4()) {
            var6.n5(16);

            for (int var9 = 0; var9 < 8; var9++) {
               var6.c8()[var9] = 0;
            }
         } else {
            var6.n5(s1f.u3(var3.getLayoutSlide().getLayoutType()));
         }
      }

      var2.n5(var6, false);
      if (var6.h0() == 16) {
         for (int var10 = 0; var10 < 8; var10++) {
            var6.c8()[var10] = 0;
         }
      }

      a5n.n5(var0);
   }

   private static void l6(y2q var0) {
      Slide var1 = (Slide)var0.l6();
      com.aspose.slides.internal.k0r.u6p var2 = (com.aspose.slides.internal.k0r.u6p)var0.u3();
      com.aspose.slides.internal.k0r.h3d var3 = var2.z8();
      if (!var0.r4()) {
         y2q var12 = var0.n5(3);
         if (var12 == null) {
            var12 = var0.n5(0);
         }

         var3.n5(var12.n3().u3());
      } else {
         y2q var4 = var0.n5(0);
         LayoutSlide var5 = (LayoutSlide)var1.getLayoutSlide();
         y2q var6 = null;
         List$Enumerator var7 = var4.z1().iterator();

         try {
            while (var7.hasNext()) {
               y2q var8 = (y2q)var7.next();
               if (var5 == var8.l6()) {
                  var6 = var8;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         if (var6 == null) {
            throw new ArgumentOutOfRangeException("Mismatch layout for slide!");
         }

         if (var4.u3() == var6.u3()) {
            com.aspose.slides.internal.k0r.t4r var13 = new com.aspose.slides.internal.k0r.t4r();
            var13.n5(var4.y4() & 4294967295L);
            var13.n5(var6.z8() & 65535);
            var2.n5(var13);
            var3.n5(var4.n3().u3());
         } else {
            com.aspose.slides.internal.k0r.u1s var14 = new com.aspose.slides.internal.k0r.u1s();
            var14.n5(var4.y4() & 4294967295L);
            var2.n5(var14);
            var3.n5(var6.n3().u3());
         }
      }
   }
}
