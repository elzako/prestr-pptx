package com.aspose.slides;

public final class WarningType extends com.aspose.slides.ms.System.d5 {
   public static final int SourceFileCorruption = 0;
   public static final int DataLoss = 1;
   public static final int MajorFormattingLoss = 2;
   public static final int MinorFormattingLoss = 3;
   public static final int CompatibilityIssue = 4;
   public static final int UnexpectedContent = 99;

   private WarningType() {
   }

   static {
      com.aspose.slides.ms.System.d5.register(new WarningType$1(WarningType.class, Integer.class));
   }
}
