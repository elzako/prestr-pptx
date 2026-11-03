package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class u6p {
   static boolean n5(int var0) {
      switch (var0) {
         case 27:
         case 30:
            return true;
         default:
            return false;
      }
   }

   static boolean n5(Chart var0) {
      int var1 = var0.getType();
      if (!ChartTypeCharacterizer.is3DChart(var1)) {
         return false;
      }

      IRotation3D var2 = var0.getRotation3D();
      if ((var2.getRotationY() & 65535) == 0 && var2.getRotationX() == 0) {
         return false;
      }

      switch (var1) {
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 25:
         case 33:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 62:
            return true;
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 34:
         case 35:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         default:
            return false;
      }
   }

   static boolean l6(int var0) {
      switch (var0) {
         case 33:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
            return true;
         case 34:
         case 35:
         default:
            return false;
      }
   }

   static boolean k5(int var0) {
      switch (var0) {
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
            return true;
         default:
            return false;
      }
   }

   static boolean u3(int var0) {
      switch (var0) {
         case 6:
         case 10:
         case 14:
         case 18:
            return true;
         default:
            return false;
      }
   }

   static boolean l6(Chart var0) {
      if (var0 == null) {
         throw new ArgumentNullException("chart is null");
      }

      switch (var0.getType()) {
         case 62:
            return true;
         default:
            return false;
      }
   }

   static boolean k5(Chart var0) {
      switch (var0.getType()) {
         case 6:
         case 10:
         case 14:
         case 18:
         case 25:
         case 50:
         case 62:
            return true;
         case 33:
            return var0.getAxes().getSeriesAxis() != null && var0.getAxes().getSeriesAxis().isVisible();
         default:
            return false;
      }
   }
}
