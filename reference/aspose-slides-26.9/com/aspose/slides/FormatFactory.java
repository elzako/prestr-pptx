package com.aspose.slides;

public class FormatFactory implements IFormatFactory {
   private static final FormatFactory n5 = new FormatFactory();

   public static FormatFactory getInstance() {
      return n5;
   }

   @Override
   public final IPortionFormat createPortionFormat() {
      return new PortionFormat();
   }

   @Override
   public final IParagraphFormat createParagraphFormat() {
      return new ParagraphFormat();
   }

   @Override
   public final ITextFrameFormat createTextFrameFormat() {
      return new TextFrameFormat();
   }
}
