package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class e2r extends q2b {
   public e2r(IReflectionEffectiveData var1) {
      super(var1);
   }

   @Override
   public void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, IShapeFrame var5) {
      if (var2 == null) {
         throw new ArgumentNullException("path is null.");
      }

      if (var2.h0() != 0) {
         if (var3 != null && var3.u3() != 0 || var4 != null && var4.u9()) {
            com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
            com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(
               (float)com.aspose.slides.ms.System.q1.l6(var5.getRectangle().getX()),
               (float)com.aspose.slides.ms.System.q1.l6(var5.getRectangle().getY()),
               (float)com.aspose.slides.ms.System.q1.l6(var5.getRectangle().getWidth()),
               (float)com.aspose.slides.ms.System.q1.l6(var5.getRectangle().getHeight())
            );
            var6.l6(var7.y4());
            com.aspose.slides.internal.x4g.m1 var8 = this.n5(var6, var4);
            var6.l6(var8);
            com.aspose.slides.internal.x4g.s7 var9 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();

            try {
               com.aspose.slides.internal.x4g.m1 var10 = this.n5(var1);
               var9.l6(var10);
               var9.l6(var8);
               com.aspose.slides.internal.o9b.y1 var11 = var6.s7().y4();
               this.n5(var9, var11.y4(), var8, var4, var3, var1);
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         }
      }
   }
}
