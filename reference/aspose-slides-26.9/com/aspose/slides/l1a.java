package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class l1a {
   public static void n5(MasterSlide var0, com.aspose.slides.internal.k4y.o5r var1, com.aspose.slides.internal.k4y.t1g var2, u9t var3, x0a var4) {
      int var5 = var3.s7();
      var0.setName(com.aspose.slides.ms.System.d1.n5("Master{0}", new Object[]{var5}));
      com.aspose.slides.internal.k4y.u9t var6 = (com.aspose.slides.internal.k4y.u9t)var1.n5("master-page").l6();
      var6.k5(var3.c8());
      var6.l6(com.aspose.slides.ms.System.d1.n5("{0}-Slide", new Object[]{var0.getName()}));
      com.aspose.slides.internal.k4y.y2i var7 = var3.u9();
      var6.u3(var7.n5());
      n5(var7);
      n5(var0, var7, var4.l6());
      c6d.n5(var0.getShapes(), new l1a$1(var6), var4);

      for (int var8 = 0; var8 < var0.getLayoutSlides().size(); var8++) {
         ILayoutSlide var9 = var0.getLayoutSlides().get_Item(var8);
         var3.l6().t2().throwIfInterruptionRequested();
         if (n5(var0, var9, var3)) {
            com.aspose.slides.internal.k4y.u9t var10 = (com.aspose.slides.internal.k4y.u9t)var1.n5("master-page").l6();
            var10.k5(var6.l6());
            int var11 = com.aspose.slides.ms.System.d1.c8(var9.getName(), "-");
            if (var11 > 0) {
               var9.setName(com.aspose.slides.ms.System.d1.k5(var9.getName(), var11 + 1));
            }

            var9.setName(
               com.aspose.slides.ms.System.d1.n5(
                  "Layout{0}-{1}-{2}",new Object[]{
                  var8 + 1,
                  com.aspose.slides.internal.k4y.r5.n5(var9.getLayoutType()),
                  com.aspose.slides.ms.System.d1.n5(var9.getName(), " ", "-")
               })
            );
            var10.l6(com.aspose.slides.ms.System.d1.n5("{0}-{1}",new Object[]{ var0.getName(), var9.getName()}));
            com.aspose.slides.internal.k4y.y2i var12 = var3.u9();
            var10.u3(var12.n5());
            n5(var12);
            n5(var9, var12, var4.l6());
            if (var9.getShowMasterShapes()) {
               IGenericEnumerator var13 = var0.getShapes().iterator();

               try {
                  while (var13.hasNext()) {
                     IShape var14 = (IShape)var13.next();
                     var4.l6().t2().throwIfInterruptionRequested();
                     if (var14.getPlaceholder() == null) {
                        k5a.n5(var14, new l1a$2(var10), var4);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                     var13.dispose();
                  }
               }
            }

            c6d.n5(var9.getShapes(), new l1a$3(var10), var4);
         }
      }
   }

   static void n5(com.aspose.slides.internal.k4y.y2i var0) {
      com.aspose.slides.internal.k4y.r9l var1 = (com.aspose.slides.internal.k4y.r9l)var0.n5("drawing-page-properties").l6();
      var1.a6((byte)0);
      var1.u9((byte)0);
      var1.u3((byte)0);
      var1.k5((byte)0);
   }

   static void n5(IBaseSlide var0, com.aspose.slides.internal.k4y.y2i var1, OdpSerializationContext var2) {
      IBackground var3 = var0.getBackground();
      if (com.aspose.slides.internal.v6g.k5.l6(var0, ILayoutSlide.class) && var3.getType() == -1 && ((ILayoutSlide)var0).getMasterSlide() != null) {
         var3 = ((ILayoutSlide)var0).getMasterSlide().getBackground();
      }

      com.aspose.slides.internal.k4y.r9l var4 = null;
      List$Enumerator var5 = var1.u3().iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var6 = (com.aspose.slides.internal.k4y.g7)var5.next();
            if ("drawing-page-properties".equals(var6.n5())) {
               var4 = (com.aspose.slides.internal.k4y.r9l)var6.k5();
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var4 == null) {
         var4 = (com.aspose.slides.internal.k4y.r9l)var1.n5("drawing-page-properties").l6();
      }

      var4.n5((byte)0);
      var4.l6((byte)0);
      j2k.n5(var3.getEffective().getFillFormat(), new i4v(var4), var2);
   }

   private static boolean n5(MasterSlide var0, ILayoutSlide var1, u9t var2) {
      IGenericEnumerator var3 = var2.l6().n5().getSlides().iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            Slide var5 = (Slide)var4;
            if (var5.r4() == var0 && var5.w1() == var1) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return false;
   }
}
