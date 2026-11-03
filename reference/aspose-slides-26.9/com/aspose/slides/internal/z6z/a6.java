package com.aspose.slides.internal.z6z;

public class a6 {
   public static double n5(double var0) {
      return com.aspose.slides.internal.n2d.t2.u9(var0 * 96.0);
   }

   public static String n5(int var0) {
      String var1;
      switch (var0) {
         case 0:
         case 3:
            var1 = "Miter";
            break;
         case 1:
            var1 = "Bevel";
            break;
         case 2:
            var1 = "Round";
            break;
         default:
            var1 = "Bevel";
      }

      return var1;
   }

   public static String l6(int var0) {
      String var1;
      switch (var0) {
         case 0:
         case 16:
         case 19:
         case 20:
         case 240:
         case 255:
            var1 = "Flat";
            break;
         case 1:
         case 17:
            var1 = "Square";
            break;
         case 2:
         case 18:
            var1 = "Round";
            break;
         case 3:
            var1 = "Triangle";
            break;
         default:
            var1 = "Square";
      }

      return var1;
   }

   public static String k5(int var0) {
      String var1;
      switch (var0) {
         case 0:
            var1 = "Flat";
            break;
         case 1:
         default:
            var1 = "Square";
            break;
         case 2:
            var1 = "Round";
            break;
         case 3:
            var1 = "Triangle";
      }

      return var1;
   }

   public static String u3(int var0) {
      String var1;
      switch (var0) {
         case 0:
            var1 = "Tile";
            break;
         case 1:
            var1 = "FlipX";
            break;
         case 2:
            var1 = "FlipY";
            break;
         case 3:
            var1 = "FlipXY";
            break;
         case 4:
            var1 = "None";
            break;
         default:
            var1 = "None";
      }

      return var1;
   }
}
