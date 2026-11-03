package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class a5 {
   public static void n5(Effect var0, String var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("effect");
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         if (var2.l6().containsKey(var1)) {
            var0.k5().n5(var2.l6().get_Item(var1));
         } else if (var2.k5().containsKey(var1)) {
            Paragraph var3 = var2.k5().get_Item(var1);
            IShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3.x8().k5().k5(), IShape.class);
            if (var4 == null) {
               return;
            }

            int var5 = var3.h0();
            if (var5 != -1) {
               var0.k5().n5(var4);
               TextAnimation var6 = new TextAnimation();
               var6.n5((Sequence)var0.getSequence());
               var6.k5 = true;
               ((TextAnimationCollection)var4.getSlide().getTimeline().getTextAnimationCollection()).n5(var6);
               var6.l6().n5(var0);
               var6.l6().n5(var4);
               var6.l6().n5().addItem(var0);
               var0.k5().n5(var6);
               var0.n5(var5, var5, var3.x8());
            }
         }
      }
   }
}
