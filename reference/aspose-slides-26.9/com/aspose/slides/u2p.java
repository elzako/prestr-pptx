package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class u2p {
   public static String n5(IPPImage var0, f4k var1, s8z var2) {
      return n5(var0, var1, var2, null);
   }

   public static String n5(IPPImage var0, f4k var1, s8z var2, String var3) {
      String var4 = var1.n5(var0);
      return n5(var1, var2, var4, var3);
   }

   public static String n5(IShape var0, f4k var1, s8z var2) {
      String var3 = var1.n5(var0);
      return n5(var1, var2, var3, var0.getAlternativeText());
   }

   public static String n5(f4k var0, s8z var1, String var2) {
      return n5(var0, var1, var2, null);
   }

   public static String n5(f4k var0, s8z var1, String var2, String var3) {
      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         throw new ArgumentException("Link cannot be null or empty.", "link");
      }

      var3 = com.aspose.slides.ms.System.d1.n5(var3) ? "Image" : var3;
      return var1.n5(var3, var2);
   }

   public static IPPImage n5(IPictureFillFormat var0) {
      return var0 != null && var0.getPicture() != null ? var0.getPicture().getImage() : null;
   }
}
