package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class v0y {
   public static void n5(ILineFormat var0, IFillFormat var1, com.aspose.slides.internal.k4y.p3w var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("lineFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var2 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      w7s.n5(var0, var2, var3);
      t4e.n5(var1, var2, var3);
   }

   public static void n5(ILineFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("lineFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      w7s.n5(var0, var1, var2);
   }

   public static void n5(IFillFormat var0, com.aspose.slides.internal.k4y.r9l var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pagePropertiesContent");
      }

      t4e.n5(var0, var1, var2);
   }

   public static void n5(IFillFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("fillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      t4e.n5(var0, var1, var2);
   }

   public static void n5(IEffectFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("effectFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      a3s.n5(var0, var1, var2);
   }
}
