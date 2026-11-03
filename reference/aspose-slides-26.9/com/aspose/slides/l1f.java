package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class l1f {
   public static List<z6n> n5(String var0) {
      List var1 = new List();
      n5(var0, var1, 1L, 1L, 0L, 0L);
      return var1;
   }

   private static void n5(String var0, List<z6n> var1, long var2, long var4, long var6, long var8) {
      for (com.aspose.slides.internal.r7c.u3 var10 = d3t.u9.l6(var0); var10.u3(); var10 = var10.u9()) {
         if (var10.a6().n5(2).u3() && var10.a6().n5(3).u3()) {
            com.aspose.slides.internal.r7c.u3 var11 = d3t.a6.l6(var10.a6().n5(3).k5());
            if (var11.u3() && var11.a6().n5(0).u3()) {
               long var12 = com.aspose.slides.ms.System.Xml.f4.t9(var11.a6().n5(2).k5());
               long var14 = com.aspose.slides.ms.System.Xml.f4.t9(var11.a6().n5(3).k5());
               long var16 = com.aspose.slides.ms.System.Xml.f4.t9(var11.a6().n5(4).k5());
               long var18 = com.aspose.slides.ms.System.Xml.f4.t9(var11.a6().n5(5).k5());
               if (var16 != 0L) {
                  var16 = var12 / var16;
               }

               if (var16 == 0L) {
                  var16 = 1L;
               }

               if (var18 != 0L) {
                  var18 = var14 / var18;
               }

               if (var18 == 0L) {
                  var18 = 1L;
               }

               n5(var10.a6().n5(3).k5(), var1, var16, var18, var12, var14);
            }
         } else if (var10.a6().n5(4).u3() && var10.a6().n5(5).u3()) {
            l6(var10.a6().n5(5).k5(), var1, var2, var4, var6, var8);
         } else if (var10.a6().n5(6).u3() && var10.a6().n5(7).u3()) {
            l6(var10.a6().n5(7).k5(), var1, var2, var4, var6, var8);
         }
      }
   }

   private static void l6(String var0, List<z6n> var1, long var2, long var4, long var6, long var8) {
      com.aspose.slides.internal.r7c.u3 var10 = d3t.h0.l6(var0);
      z6n var11 = new z6n(var10.n5());

      while (var10.u3()) {
         if (var10.a6().n5(2).u3()) {
            var11.n5(com.aspose.slides.ms.System.Xml.f4.t9(var10.a6().n5(3).k5()) * var2);
            if (var11.k5() < 0L && var6 > 0L) {
               long var12 = var6 + var11.k5();
               var11.n5(var12 < 0L ? var6 : var6 + var12);
            }

            var11.l6(com.aspose.slides.ms.System.Xml.f4.t9(var10.a6().n5(4).k5()) * var4);
            if (var11.u3() < 0L && var8 > 0L) {
               long var17 = var8 + var11.u3();
               var11.l6(var17 < 0L ? var8 : var8 + var17);
            }

            var11.k5(com.aspose.slides.ms.System.Xml.f4.t9(var10.a6().n5(5).k5()));
            var11.u3(com.aspose.slides.ms.System.Xml.f4.t9(var10.a6().n5(6).k5()));
         } else if (var10.a6().n5(7).u3()) {
            if (var10.a6().n5(8).u3()) {
               com.aspose.slides.internal.r7c.l6 var14 = var10.a6().n5(9);
               com.aspose.slides.internal.r7c.l6 var15 = var10.a6().n5(10);
               var11.n5(var14.u3() ? var14.k5() : null);
               var11.l6(var15.u3() ? var15.k5() : null);
            }

            if (var10.a6().n5(11).u3()) {
               com.aspose.slides.internal.r7c.l6 var18 = var10.a6().n5(12);
               com.aspose.slides.internal.r7c.l6 var20 = var10.a6().n5(14);
               var11.n5(var18.u3() ? var18.k5() : null);
               var11.l6(var20.u3() ? var20.k5() : null);
            }

            if (var10.a6().n5(13).u3()) {
               com.aspose.slides.internal.r7c.l6 var19 = var10.a6().n5(12);
               com.aspose.slides.internal.r7c.l6 var21 = var10.a6().n5(14);
               var11.n5(var19.u3() ? var19.k5() : null);
               var11.l6(var21.u3() ? var21.k5() : null);
            }
         } else if (var10.a6().n5(1).u3()) {
            var11.n3().addItem(new g4t(var10.n5(), var10.l6()));
            var11.n5(var10);
         }

         var10 = var10.u9();
      }

      if (var11.y4().size() > 0 && (var11.y4().size() > 1 || !com.aspose.slides.ms.System.d1.n5(var11.y4().get_Item(0)))) {
         try {
            var11.n5(var10.n5() - var11.e2());
         } catch (IllegalStateException var16) {
            var11.n5(-var11.e2());
         }

         var1.addItem(var11);
      }
   }
}
