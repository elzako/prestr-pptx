package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class n9s {
   public static void n5(IShape var0, String var1) {
      var0.setRawFrame(n5(var1));
   }

   public static void n5(IControl var0, String var1) {
      var0.setFrame(n5(var1));
   }

   public static ShapeFrame n5(String var0) {
      Dictionary var1 = l6(var0);
      float var2 = n5(var1, "left");
      float var3 = n5(var1, "top");
      float var4 = n5(var1, "width");
      float var5 = n5(var1, "height");
      float var6 = l6(var1, "rotation");
      byte var7 = -1;
      byte var8 = -1;
      String var9 = null;
      String[] var10 = new String[]{var9};
      boolean var11 = var1.tryGetValue("flip", var10);
      var9 = var10[0];
      if (var11) {
         com.aspose.slides.internal.n8e.u5 var12 = new com.aspose.slides.internal.n8e.u5(var9);

         String var13;
         while (!"".equals(var13 = var12.l6())) {
            if ("x".equals(var13)) {
               var7 = 1;
            } else if ("y".equals(var13)) {
               var8 = 1;
            }
         }
      }

      return new ShapeFrame(var2, var3, var4, var5, var7, var8, var6);
   }

   public static void n5(com.aspose.slides.internal.k4y.m1 var0, IShapeFrame var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5("position:absolute");
      if (!com.aspose.slides.ms.System.n1.k5(var1.getX())) {
         var2.n5(";left:{0}pt",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var1.getX())});
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getY())) {
         var2.n5(";top:{0}pt",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var1.getY())});
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getWidth())) {
         var2.n5(";width:{0}pt",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var1.getWidth())});
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getHeight())) {
         var2.n5(";height:{0}pt",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var1.getHeight())});
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getRotation()) && var1.getRotation() != 0.0F) {
         var2.n5(";rotation:{0}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var1.getRotation())});
      }

      if (var1.getFlipH() == 1 || var1.getFlipV() == 1) {
         var2.n5(";flip:");
         if (var1.getFlipH() == 1) {
            var2.n5(" x");
         }

         if (var1.getFlipV() == 1) {
            var2.n5(" y");
         }
      }

      var0.k5(var2.toString());
   }

   public static Dictionary<String, String> l6(String var0) {
      Dictionary var1 = new Dictionary();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         while (var2 < var0.length() && var0.charAt(var2) <= ' ') {
            var2++;
         }

         int var3 = var2;

         while (var2 < var0.length() && var0.charAt(var2) != ':' && var0.charAt(var2) != ';') {
            var2++;
         }

         if (var0.charAt(var2) == ';') {
            var2++;
         } else {
            int var4 = var2;

            while (var3 < var4 && var0.charAt(var4 - 1) <= ' ') {
               var4--;
            }

            var2++;

            while (var2 < var0.length() && var0.charAt(var2) <= ' ') {
               var2++;
            }

            int var5 = var2;

            while (var2 < var0.length() && var0.charAt(var2) != ';') {
               var2++;
            }

            int var6 = var2;

            while (var5 < var6 && var0.charAt(var6 - 1) <= ' ') {
               var6--;
            }

            if (var3 < var4 && var5 < var6) {
               var1.set_Item(
                  com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(var0, var3, var4 - var3)),
                  com.aspose.slides.ms.System.d1.l6(var0, var5, var6 - var5)
               );
            }
         }
      }

      return var1;
   }

   private static float n5(Dictionary<String, String> var0, String var1) {
      return var0.containsKey(var1) ? new com.aspose.slides.internal.n8e.u5((String)var0.get_Item(var1)).x8() : 0.0F;
   }

   private static float l6(Dictionary<String, String> var0, String var1) {
      return var0.containsKey(var1) ? new com.aspose.slides.internal.n8e.u5((String)var0.get_Item(var1)).u3() : 0.0F;
   }
}
