package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class p7n implements o6d {
   public final Portion n5;

   public p7n(Portion var1) {
      if (var1 == null) {
         throw new ArgumentNullException("portion");
      }

      this.n5 = var1;
   }

   @Override
   public final com.aspose.slides.internal.o9b.y1 n5(boolean var1) {
      TextFrame var2 = this.n5.n3().x8().k5();
      f1z var3 = var2.u3;
      r0g var4 = com.aspose.slides.internal.v6g.k5.n5(var2, r0g.class).getParent_Immediate();
      s4s var5 = new s4s();
      if (com.aspose.slides.internal.v6g.k5.l6(var4, Cell.class)) {
         Cell var6 = com.aspose.slides.internal.v6g.k5.n5(var4, Cell.class);
         var3.n5(new d2k((float)(var6.getWidth() - var6.getMarginLeft() - var6.getMarginRight()), 0.0F), null);
         var3.n5(this.n5, false).n5(var5);
      } else {
         s3z.l6(var3);
         var3.n5(this.n5, var1).n5(var5);
      }

      ITextFrameFormatEffectiveData var9 = var2.getTextFrameFormat().getEffective();
      float var7 = (float)var9.getMarginLeft();
      float var8 = (float)var9.getMarginTop();
      return new com.aspose.slides.internal.o9b.y1(var5.n5.n5 + var7, var5.n5.l6 + var8, var5.l6.n5, var5.l6.l6);
   }
}
