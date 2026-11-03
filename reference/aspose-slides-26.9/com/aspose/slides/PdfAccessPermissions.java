package com.aspose.slides;

public final class PdfAccessPermissions extends com.aspose.slides.ms.System.d5 {
   public static final int None = 0;
   public static final int PrintDocument = 4;
   public static final int ModifyContent = 8;
   public static final int CopyTextAndGraphics = 16;
   public static final int AddOrModifyFields = 32;
   public static final int FillExistingFields = 256;
   public static final int ExtractTextAndGraphics = 512;
   public static final int AssembleDocument = 1024;
   public static final int HighQualityPrint = 2048;

   private PdfAccessPermissions() {
   }

   static {
      com.aspose.slides.ms.System.d5.register(new PdfAccessPermissions$1(PdfAccessPermissions.class, Integer.class));
   }
}
