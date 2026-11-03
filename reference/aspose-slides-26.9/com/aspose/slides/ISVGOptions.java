package com.aspose.slides;

public interface ISVGOptions extends ISaveOptions {
   boolean getVectorizeText();

   void setVectorizeText(boolean var1);

   int getMetafileRasterizationDpi();

   void setMetafileRasterizationDpi(int var1);

   boolean getDisable3DText();

   void setDisable3DText(boolean var1);

   boolean getDisableGradientSplit();

   void setDisableGradientSplit(boolean var1);

   boolean getDisableLineEndCropping();

   void setDisableLineEndCropping(boolean var1);

   int getJpegQuality();

   void setJpegQuality(int var1);

   ISvgShapeFormattingController getShapeFormattingController();

   void setShapeFormattingController(ISvgShapeFormattingController var1);

   int getPicturesCompression();

   void setPicturesCompression(int var1);

   boolean getDeletePicturesCroppedAreas();

   void setDeletePicturesCroppedAreas(boolean var1);

   boolean getUseFrameSize();

   void setUseFrameSize(boolean var1);

   boolean getUseFrameRotation();

   void setUseFrameRotation(boolean var1);

   int getExternalFontsHandling();

   void setExternalFontsHandling(int var1);

   IInkOptions getInkOptions();

   boolean getDisableFontLigatures();

   void setDisableFontLigatures(boolean var1);
}
