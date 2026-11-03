package com.aspose.slides.internal.c6;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ISlide;

public class h0 extends r4 {
   private final z8 n5;
   private final int[] l6;
   private final int k5;
   private final int u3;

   public h0(ISlide var1, z8 var2, int[] var3, int var4, int var5) {
      super(var1, "Content ");
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var5;
   }

   @Override
   protected void n5(IAutoShape var1) {
      var1.getTextFrame().getParagraphs().clear();
      var1.getTextFrame().getTextFrameFormat().setAutofitType((byte)1);
      int var2 = this.u3 > 15 ? 1 : 17 - this.u3;

      for (int var3 = this.k5; var3 < this.n5.l6().size() && var3 - this.k5 < this.u3; var3++) {
         IParagraph var4 = a0.l6.invoke();
         t4.n5(var4, this.n5.l6().get_Item(var3));
         var1.getTextFrame().getParagraphs().add(var4);
         if (this.l6[var3] == 0) {
            var4.getParagraphFormat().getBullet().setType((byte)0);
            var4.getParagraphFormat().setIndent(0.0F);
            var4.getParagraphFormat().setMarginLeft(0.0F);
         } else if (this.l6[var3] == 2) {
            var4.getParagraphFormat().getBullet().setType((byte)2);
            var4.getParagraphFormat().setIndent(55.0F);
            var4.getParagraphFormat().setMarginLeft(125.0F);
            var4.getParagraphFormat().getBullet().setNumberedBulletStyle((byte)3);
            var4.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
         } else if (this.l6[var3] == 1) {
            var4.getParagraphFormat().getBullet().setType((byte)1);
            var4.getParagraphFormat().setIndent(25.0F);
            var4.getParagraphFormat().setMarginLeft(25.0F);
            var4.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
         }

         var4.getParagraphFormat().setSpaceBefore(var2 * 3);
         var4.getParagraphFormat().setSpaceAfter(0.0F);
      }
   }
}
