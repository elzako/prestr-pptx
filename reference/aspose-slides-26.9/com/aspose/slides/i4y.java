package com.aspose.slides;

class i4y {
   public static String n5(IAudioFrame var0, s8z var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(var0.getAlternativeTextTitle()) ? "Audio" : var0.getAlternativeTextTitle();
      String var3 = var0.getLinkPathLong();
      return var1.l6(var2, var3);
   }

   public static String n5(IVideoFrame var0, s8z var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(var0.getAlternativeTextTitle()) ? "Video" : var0.getAlternativeTextTitle();
      String var3 = var0.getLinkPathLong();
      return var1.l6(var2, var3);
   }
}
