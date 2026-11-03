package com.aspose.slides;

final class ForEach$4 implements ForEach$ForEachShapeCallback {
   // $VF: synthetic field
   final ForEach$ForEachParagraphCallback n5;

   ForEach$4(ForEach$ForEachParagraphCallback var1) {
      this.n5 = var1;
   }

   @Override
   public void invoke(Shape shape, BaseSlide slide, int index) {
      AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(shape, AutoShape.class);
      if (var4 != null && var4.getTextFrame() != null) {
         for (int var5 = 0; var5 < var4.getTextFrame().getParagraphs().getCount(); var5++) {
            Paragraph var6 = (Paragraph)var4.getTextFrame().getParagraphs().get_Item(var5);
            this.n5.invoke(var6, slide, var5);
         }
      }
   }
}
