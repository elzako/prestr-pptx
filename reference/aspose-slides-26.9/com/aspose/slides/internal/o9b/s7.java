package com.aspose.slides.internal.o9b;

public final class s7 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "buttonface",
      "threedface",
      "buttonhighlight",
      "threedlightshadow",
      "buttonshadow",
      "captiontext",
      "threeddarkshadow",
      "threedhighlight",
      "background",
      "buttontext",
      "infobackground",
      "lightgrey"
   );

   static c8 n5(int var0) {
      c8 var1 = c8.n5(255, var0 & 0xFF, var0 >> 8 & 0xFF, var0 >> 16 & 0xFF).o8();
      c8 var2 = m1.n5(var1.o8()).o8();
      return var2.t2() ? var1 : var2;
   }

   public static c8 l6(int var0) {
      return n5(var0);
   }
}
