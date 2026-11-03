package com.aspose.slides.internal.c6;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ISlide;

public class y2 extends r4 {
   private final String n5;
   private final boolean l6;

   public y2(ISlide var1, String var2, String var3, boolean var4) {
      super(var1, var2);
      this.n5 = var3;
      this.l6 = var4;
   }

   @Override
   protected void n5(IAutoShape var1) {
      var1.getTextFrame().setText(this.n5);
      if (this.l6) {
         IParagraph var2 = a0.l6.invoke();
         var2.setText("(continued)");
         var2.getPortions().get_Item(0).getPortionFormat().setFontHeight(12.0F);
         var1.getTextFrame().getParagraphs().add(var2);
      }
   }
}
