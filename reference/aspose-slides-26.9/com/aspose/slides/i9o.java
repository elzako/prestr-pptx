package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class i9o {
   public static ISlide[] n5(Presentation var0, int var1, f7s var2, String var3, String var4, boolean var5) {
      List var6 = n5(var0, var3);
      if (var6.size() > 0) {
         return (ISlide[])var6.toArray(new ISlide[0]);
      }

      com.aspose.slides.internal.j4.n5 var7 = new com.aspose.slides.internal.j4.n5();
      var7.n5(var4);
      com.aspose.slides.internal.z5.l6 var8 = new com.aspose.slides.internal.z5.l6();
      var8.h0().n5("\r\ntd li\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 1em;\r\n}\r\ntd li p\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}");
      com.aspose.slides.internal.f5.k5 var9 = new com.aspose.slides.internal.f5.k5(new r9l(var2), var7, var8);
      com.aspose.slides.internal.w8.t9 var10 = com.aspose.slides.internal.v6g.k5.n5(var9.n5(var3), com.aspose.slides.internal.w8.t9.class);
      r2d var11 = new r2d(var0, var2, var4);
      if (var5 && var1 < var0.getSlides().size()) {
         var11.n5(var0.getSlides().get_Item(var1));
      } else {
         var11.n5(var0.getSlides().insertEmptySlide(var1, var11.l6()));
      }

      var10.n5(var11);
      return var11.n5().toArray(new Slide[0]);
   }

   private static List<ISlide> n5(Presentation var0, String var1) {
      List var2 = new List();
      String var3 = "<svg";
      String var4 = "/svg>";
      int var5 = com.aspose.slides.ms.System.d1.c8(var1, var3);
      if (var5 > -1) {
         int var6 = com.aspose.slides.ms.System.d1.n5(var1, var4, var5 + 4);
         if (var6 > -1) {
            h7g var7 = new h7g();
            var7.n5(true);

            do {
               String var8 = com.aspose.slides.ms.System.d1.l6(var1, var5, var6 - var5 + 5);
               ISlide var9 = var0.getSlides().addEmptySlide(var0.getLayoutSlides().get_Item(0));
               var7.n5(var9.getShapes().getParentGroup(), var8, com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.n5).y4());
               var2.addItem(var9);
               var5 = com.aspose.slides.ms.System.d1.n5(var1, var3, var6);
               var6 = com.aspose.slides.ms.System.d1.n5(var1, var4, var5 + 4);
            } while (var5 > -1 && var6 > var5);
         }
      }

      return var2;
   }
}
