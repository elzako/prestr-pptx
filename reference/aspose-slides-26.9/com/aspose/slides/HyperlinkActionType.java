package com.aspose.slides;

public final class HyperlinkActionType extends com.aspose.slides.ms.System.d5 {
   public static final int Unknown = -1;
   public static final int NoAction = 0;
   public static final int Hyperlink = 1;
   public static final int JumpFirstSlide = 2;
   public static final int JumpPreviousSlide = 3;
   public static final int JumpNextSlide = 4;
   public static final int JumpLastSlide = 5;
   public static final int JumpEndShow = 6;
   public static final int JumpLastViewedSlide = 7;
   public static final int JumpSpecificSlide = 8;
   public static final int StartCustomSlideShow = 9;
   public static final int OpenFile = 10;
   public static final int OpenPresentation = 11;
   public static final int StartStopMedia = 12;
   public static final int StartMacro = 13;
   public static final int StartProgram = 14;

   private HyperlinkActionType() {
   }

   static {
      com.aspose.slides.ms.System.d5.register(new HyperlinkActionType$1(HyperlinkActionType.class, Integer.class));
   }
}
