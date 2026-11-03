package com.aspose.slides;

public class SaveOptionsFactory implements ISaveOptionsFactory {
   @Override
   public final IPptxOptions createPptxOptions() {
      return new PptxOptions();
   }
}
