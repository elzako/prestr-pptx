package com.aspose.slides;

import java.util.Locale;

public class CurrentThreadSettings {
   public static final Locale getLocale() {
      return com.aspose.slides.internal.x7n.l6.n5(com.aspose.slides.internal.x7n.l6.u3());
   }

   public static final void setLocale(Locale locale) {
      if (locale == null) {
         throw new NullPointerException("Locale can't be null");
      }

      com.aspose.slides.ms.System.y2.n5(locale);
   }

   public static final void setLocale(String localeName) {
      if (localeName != null && (localeName == null || !"".equals(localeName))) {
         Locale var1 = new Locale(localeName);
         com.aspose.slides.ms.System.y2.n5(var1);
      } else {
         throw new NullPointerException("LocaleName can't be null or empty");
      }
   }
}
