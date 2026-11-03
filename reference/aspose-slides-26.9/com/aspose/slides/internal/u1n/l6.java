package com.aspose.slides.internal.u1n;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Locale;
import java.util.Map;

public final class l6 {
   private static Map<String, Font[]> n5 = null;

   public static Map<String, Font[]> n5() {
      return n5;
   }

   static {
      n5 = com.aspose.slides.internal.u1n.n5.n5(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(Locale.ROOT));
   }
}
