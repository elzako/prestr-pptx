package com.aspose.slides;

class u5 {
   public static String n5(IAutoShape var0, d9r var1) {
      if (var0.getTextFrame() != null && !com.aspose.slides.ms.System.d1.n5(var0.getTextFrame().getText())) {
         byte var4 = var0.getPlaceholder() != null ? var0.getPlaceholder().getType() : 1;
         boolean var3 = !var1.k5.getRemoveEmptyLines();
         return l5d.n5(var0.getTextFrame(), var1.l6, var3, var4);
      } else if (var0.getFillFormat() != null && var0.getFillFormat().getFillType() == 4 && var1.k5.getExportType() != 1) {
         IPPImage var2 = u2p.n5(var0.getFillFormat().getPictureFillFormat());
         return var2 != null ? u2p.n5(var2, var1.n5, var1.l6, var0.getAlternativeText()) : null;
      } else {
         return null;
      }
   }
}
