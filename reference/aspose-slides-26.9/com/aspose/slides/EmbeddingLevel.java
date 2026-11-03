package com.aspose.slides;

public final class EmbeddingLevel extends com.aspose.slides.ms.System.d5 {
   public static final int Installable = 0;
   public static final int Restricted = 2;
   public static final int PreviewPrint = 4;
   public static final int Editable = 8;
   public static final int NoSubsetting = 256;
   public static final int BitmapOnly = 512;

   private EmbeddingLevel() {
   }

   static {
      com.aspose.slides.ms.System.d5.register(new EmbeddingLevel$1(EmbeddingLevel.class, Integer.class));
   }
}
