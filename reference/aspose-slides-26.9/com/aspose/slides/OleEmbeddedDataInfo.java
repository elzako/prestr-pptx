package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

public class OleEmbeddedDataInfo implements IOleEmbeddedDataInfo {
   private byte[] n5;
   private String l6;

   public OleEmbeddedDataInfo() {
   }

   @Override
   public final byte[] getEmbeddedFileData() {
      return this.n5;
   }

   final void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public final String getEmbeddedFileExtension() {
      return this.l6;
   }

   final void n5(String var1) {
      this.l6 = var1;
   }

   public OleEmbeddedDataInfo(byte[] embeddedFileData, String embeddedFileExtension) {
      if (embeddedFileData == null) {
         throw new ArgumentNullException("embeddedFileData");
      }

      this.n5(embeddedFileData);
      this.n5(embeddedFileExtension);
   }
}
