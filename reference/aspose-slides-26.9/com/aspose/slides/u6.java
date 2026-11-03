package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class u6 {
   private static final Dictionary<String, String> n5 = new Dictionary<>();
   private static final Dictionary<String, String> l6 = new Dictionary<>();
   private static final Dictionary<String, Integer> k5 = new Dictionary<>();
   private static final Dictionary<String, Integer> u3 = new Dictionary<>();

   public static void n5(ISetEffect var0, y3e var1, l4h var2) {
      if (n5.containsKey(var1.a6())) {
         var0.setTo(n5.get_Item(var1.a6()));
      } else {
         var2.n5().n5().n5(com.aspose.slides.ms.System.d1.n5("Unknown \"to\" effect: {0}", new Object[]{var1.a6()}), 1);
      }

      if (l6.containsKey(var1.u3())) {
         BehaviorProperty var3 = BehaviorProperty.getOrCreateByValue(l6.get_Item(var1.u3()));
         var0.getProperties().addItem(var3);
      } else {
         n5(var1.u3(), var2);
      }
   }

   public static void n5(IPropertyEffect var0, y3e var1, l4h var2) {
      if (l6.containsKey(var1.u3())) {
         BehaviorProperty var3 = BehaviorProperty.getOrCreateByValue(l6.get_Item(var1.u3()));
         var0.getProperties().addItem(var3);
      } else {
         n5(var1.u3(), var2);
      }
   }

   public static void n5(IFilterEffect var0, y3e var1, l4h var2) {
      String var3 = var1.l6();
      if (com.aspose.slides.ms.System.d1.a6("irisWipe", var3)) {
         var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var3, "-", var1.k5()});
      }

      if (t2f.k5(var1.l6()) && k5.containsKey(var1.l6())) {
         var0.setType(k5.get_Item(var1.l6()));
         if (t2f.k5(var1.k5()) && u3.containsKey(var1.k5())) {
            var0.setSubtype(u3.get_Item(var1.k5()));
         } else {
            var0.setSubtype(0);
         }

         switch (var1.t4()) {
            case 0:
            default:
               var0.setReveal(-1);
               break;
            case 1:
               var0.setReveal(1);
               break;
            case 2:
               var0.setReveal(2);
         }
      } else {
         n5(var1.u3(), var2);
      }
   }

   public static void n5(IPropertyEffect var0, com.aspose.slides.internal.k4y.r2z var1, l4h var2) {
      PointCollection var3 = (PointCollection)var0.getPoints();
      String var4 = t2f.k5(var1.a6()) ? var1.a6() : "";
      var4 = n5(var4);
      if (var1.u3() != null && var1.h0() != null) {
         String[] var5 = com.aspose.slides.ms.System.d1.n5(var1.u3(), ';');
         String[] var6 = com.aspose.slides.ms.System.d1.n5(var1.h0(), ';');
         if (var5.length == var6.length) {
            for (int var7 = 0; var7 < var5.length; var7++) {
               String var8 = var5[var7];
               String var9 = var6[var7];
               var8 = n5(var8);
               float var10 = 0.0F;
               float[] var11 = new float[]{0.0F};
               boolean var12 = com.aspose.slides.ms.System.n1.n5(var9, 111, com.aspose.slides.internal.x7n.l6.k5(), var11);
               var10 = var11[0];
               if (var12) {
                  var3.n5(new Point(var10 * 100.0F, var8, var4));
               }
            }
         }
      }
   }

   private static String n5(String var0) {
      Dictionary$Enumerator var1 = l6.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            var0 = com.aspose.slides.ms.System.d1.n5(var0, (String)var2.getKey(), com.aspose.slides.ms.System.d1.n5("#{0}", new Object[]{var2.getValue()}));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return var0;
   }

   private static void n5(String var0, l4h var1) {
      var1.n5().n5().n5(com.aspose.slides.ms.System.d1.n5("Unknown effect attribute: {0}", new Object[]{var0}), 1);
   }

   static {
      n5.addItem("visible", "visible");
      l6.addItem("visibility", "style.visibility");
      l6.addItem("width", "ppt_w");
      l6.addItem("height", "ppt_h");
      l6.addItem("x", "ppt_x");
      l6.addItem("y", "ppt_y");
      l6.addItem("rotate", "r");
      l6.addItem("skewX", "xshear");
      l6.addItem("skewY", "yshear");
      k5.addItem("", 0);
      k5.addItem("blindsWipe", 2);
      k5.addItem("irisWipe-rectangle", 3);
      k5.addItem("checkerBoardWipe", 4);
      k5.addItem("ellipseWipe", 5);
      k5.addItem("irisWipe-diamond", 6);
      k5.addItem("dissolve", 7);
      k5.addItem("fade", 8);
      k5.addItem("fourBoxWipe", 11);
      k5.addItem("randomBarWipe", 12);
      k5.addItem("waterfallWipe", 15);
      k5.addItem("fanWipe", 16);
      k5.addItem("pinWheelWipe", 17);
      k5.addItem("barWipe", 18);
      u3.addItem("", 0);
      u3.addItem("horizontal", 9);
      u3.addItem("vertical", 26);
      u3.addItem("across", 1);
      u3.addItem("up", 23);
      u3.addItem("down", 2);
      u3.addItem("left", 13);
      u3.addItem("right", 17);
      u3.addItem("cornersIn", 10);
      u3.addItem("cornersOut", 14);
      u3.addItem("horizontalRight", 3);
      u3.addItem("horizontalLeft", 4);
      u3.addItem("verticalRight", 24);
      u3.addItem("verticalLeft", 25);
      u3.addItem("topToBottom", 2);
      u3.addItem("leftToRight", 17);
      u3.addItem("oneBlade", 18);
      u3.addItem("twoBladeHorizontal", 19);
      u3.addItem("twoBladeVertical", 19);
      u3.addItem("fourBlade", 21);
   }
}
