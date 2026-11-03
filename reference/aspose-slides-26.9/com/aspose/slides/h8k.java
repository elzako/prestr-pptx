package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class h8k {
   public static ISlide[] n5(IPresentation var0, com.aspose.slides.internal.e7.l6 var1) {
      return n5(var0, var1, null);
   }

   public static ISlide[] n5(IPresentation var0, com.aspose.slides.internal.e7.l6 var1, PdfImportOptions var2) {
      List var3 = new List();
      Dictionary var4 = new Dictionary();
      int var5 = var1.k5();
      if (var5 > 0 && com.aspose.slides.internal.v6g.k5.l6(var1.n5().n5().get_Item(0), com.aspose.slides.internal.e7.u9.class)) {
         com.aspose.slides.internal.e7.u9 var6 = var1.n5().n5().get_Item(0);
         if (j4s.n5(var6.a6())) {
            var0.getSlideSize().setSize(var6.l6().a6(), var6.l6().u3(), 0);
         } else {
            var0.getSlideSize().setSize(var6.l6().u3(), var6.l6().a6(), 0);
         }
      }

      com.aspose.slides.internal.t8.h0 var63 = new com.aspose.slides.internal.t8.h0();

      for (int var7 = 0; var7 < var5; var7++) {
         com.aspose.slides.internal.t8.t2 var8 = var63.n5(var1.n5().n5().get_Item(var7));
         ISlide var9 = n5(var0);
         if (var2 != null && var2.getDetectTables()) {
            IGenericList var10 = a5d.n5(var8.k5(), var8.l6());
            if (var10.size() > 0) {
               j4s.n5(var9, var10);
               IGenericEnumerator var11 = var10.iterator();

               try {
                  while (var11.hasNext()) {
                     m2g var12 = (m2g)var11.next();
                     IGenericEnumerator var13 = var12.k5().iterator();

                     try {
                        while (var13.hasNext()) {
                           com.aspose.slides.internal.g4.x8 var14 = (com.aspose.slides.internal.g4.x8)var13.next();
                           var8.k5().removeItem(var14);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                           var13.dispose();
                        }
                     }

                     IGenericEnumerator var70 = var12.u3().iterator();

                     try {
                        while (var70.hasNext()) {
                           com.aspose.slides.internal.g4.x8 var15 = (com.aspose.slides.internal.g4.x8)var70.next();
                           var8.k5().removeItem(var15);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var70, IDisposable.class)) {
                           var70.dispose();
                        }
                     }

                     IGenericEnumerator var73 = var12.a6().getValues().iterator();

                     try {
                        while (var73.hasNext()) {
                           com.aspose.slides.internal.g4.s7 var16 = (com.aspose.slides.internal.g4.s7)var73.next();
                           var8.l6().removeItem(var16);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var73, IDisposable.class)) {
                           var73.dispose();
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                     var11.dispose();
                  }
               }
            }
         }

         int var64 = 0;
         int var65 = 0;

         for (int var66 = 0; var66 < var8.k5().size() + var8.n5().size(); var66++) {
            if (var65 < var8.n5().size() && var8.n5().get_Item(var65).u9() == var66) {
               y0j.n5(var9, var8.n5().get_Item(var65), var1.n5().n5().get_Item(var7).l6());
               var65++;
            } else if (var64 < var8.k5().size() && var8.k5().get_Item(var64).t9() == var66) {
               y0j.n5(var9, var8.k5().get_Item(var64), var1.n5().n5().get_Item(var7).l6());
               var64++;
            }
         }

         FontsManager var67 = com.aspose.slides.internal.v6g.k5.n5(var9.getPresentation().getFontsManager(), FontsManager.class);
         if (var67 != null) {
            List$Enumerator var68 = var8.u3().iterator();

            try {
               while (var68.hasNext()) {
                  com.aspose.slides.internal.u1.u3 var71 = (com.aspose.slides.internal.u1.u3)var68.next();
                  if (!var4.containsKey(var71.a6())) {
                     byte[] var74 = var71.m1();
                     if (var74 != null) {
                        c4y var75 = var67.n5(var74, true);
                        var4.addItem(var71.a6(), var75);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var68, IDisposable.class)) {
                  var68.dispose();
               }
            }
         }

         List$Enumerator var69 = var8.l6().iterator();

         try {
            while (var69.hasNext()) {
               com.aspose.slides.internal.g4.s7 var72 = (com.aspose.slides.internal.g4.s7)var69.next();
               j4s.n5(var9, var72, var1.n5().n5().get_Item(var7).l6(), var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var69, IDisposable.class)) {
               var69.dispose();
            }
         }

         var3.addItem(var9);
      }

      return (ISlide[])var3.toArray(new ISlide[0]);
   }

   private static ISlide n5(IPresentation var0) {
      ILayoutSlide var1 = var0.getLayoutSlides().getByType((byte)11);
      return var0.getSlides().addEmptySlide(var1);
   }
}
