package com.aspose.slides;

final class ForEach$5 implements ForEach$ForEachParagraphCallback {
   // $VF: synthetic field
   final ForEach$ForEachPortionCallback n5;

   ForEach$5(ForEach$ForEachPortionCallback var1) {
      this.n5 = var1;
   }

   @Override
   public void invoke(Paragraph para, BaseSlide slide, int index) {
      for (int var4 = 0; var4 < para.getPortions().getCount(); var4++) {
         Portion var5 = (Portion)para.getPortions().get_Item(var4);
         this.n5.invoke(var5, para, slide, var4);
      }
   }
}
