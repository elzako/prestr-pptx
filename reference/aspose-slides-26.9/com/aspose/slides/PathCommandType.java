package com.aspose.slides;

public final class PathCommandType extends com.aspose.slides.ms.System.d5 {
   public static final byte Close = 0;
   public static final byte MoveTo = 1;
   public static final byte LineTo = 2;
   public static final byte ArcTo = 3;
   public static final byte QuadBezierTo = 4;
   public static final byte CubicBezierTo = 5;

   private PathCommandType() {
   }

   static {
      com.aspose.slides.ms.System.d5.register(new PathCommandType$1(PathCommandType.class, Byte.class));
   }
}
