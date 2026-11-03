package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.k4y.g7$n5;

class e5s {
   private static final SortedList<Integer, String> n5 = new SortedList<>();
   private static final SortedList<Integer, String> l6 = new SortedList<>();

   public static void n5(IFilterEffect var0, com.aspose.slides.internal.k4y.n3m var1) {
      u4x var2 = ((FilterEffect)var0).l6();
      var0.setReveal(var1.n5());
      var2.k5(var1.k5());
      var0.setType(n5(var1.l6()));
      var0.setSubtype(l6(var1.l6()));
   }

   public static void n5(IFilterEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      u4x var3 = ((FilterEffect)var0).l6();
      com.aspose.slides.internal.k4y.n3m var4 = (com.aspose.slides.internal.k4y.n3m)var1.n5("animEffect").l6();
      var2[0] = var4.u3();
      var4.n5((byte)var0.getReveal());
      var4.l6(var3.u3());
      String var5 = "";
      if (var0.getSubtype() == 0) {
         var5 = n5.get_Item(var0.getType());
      } else {
         var5 = com.aspose.slides.ms.System.d1.n5(new Object[]{n5.get_Item(var0.getType()), '(', l6.get_Item(var0.getSubtype()), ')'});
      }

      var4.n5(var5);
   }

   private static int n5(String var0) {
      if (var0 == null) {
         return 0;
      }

      String var1 = com.aspose.slides.ms.System.d1.l6(var0);
      int var2 = com.aspose.slides.ms.System.d1.u3(var1, '(');
      if (var2 != -1) {
         var1 = com.aspose.slides.ms.System.d1.l6(var1, 0, var2);
      }

      var2 = n5.indexOfValue(var1);
      return var2 == -1 ? 0 : n5.getKeys().get_Item(var2);
   }

   private static int l6(String var0) {
      if (var0 == null) {
         return 0;
      }

      String var1 = com.aspose.slides.ms.System.d1.l6(var0);
      int var2 = com.aspose.slides.ms.System.d1.u3(var1, '(');
      if (var2 == -1) {
         return 0;
      }

      int var3 = com.aspose.slides.ms.System.d1.u3(var1, ')');
      var1 = com.aspose.slides.ms.System.d1.l6(var1, var2 + 1, var3 - var2 - 1);
      if ("null".equals(var1)) {
         return 0;
      }

      var3 = l6.indexOfValue(var1);
      return var3 == -1 ? 0 : l6.getKeys().get_Item(var3);
   }

   static {
      n5.addItem(0, "");
      n5.addItem(1, "barn");
      n5.addItem(2, "blinds");
      n5.addItem(3, "box");
      n5.addItem(4, "checkerboard");
      n5.addItem(5, "circle");
      n5.addItem(6, "diamond");
      n5.addItem(7, "dissolve");
      n5.addItem(8, "fade");
      n5.addItem(9, "image");
      n5.addItem(10, "pixelate");
      n5.addItem(11, "plus");
      n5.addItem(12, "randombar");
      n5.addItem(13, "slide");
      n5.addItem(14, "stretch");
      n5.addItem(15, "strips");
      n5.addItem(16, "wedge");
      n5.addItem(17, "wheel");
      n5.addItem(18, "wipe");
      l6.addItem(0, "");
      l6.addItem(1, "across");
      l6.addItem(2, "down");
      l6.addItem(3, "downLeft");
      l6.addItem(4, "downRight");
      l6.addItem(5, "fromBottom");
      l6.addItem(6, "fromLeft");
      l6.addItem(7, "fromRight");
      l6.addItem(8, "fromTop");
      l6.addItem(9, "horizontal");
      l6.addItem(10, "in");
      l6.addItem(11, "inHorizontal");
      l6.addItem(12, "inVertical");
      l6.addItem(13, "left");
      l6.addItem(14, "out");
      l6.addItem(15, "outHorizontal");
      l6.addItem(16, "outVertical");
      l6.addItem(17, "right");
      l6.addItem(18, "1");
      l6.addItem(19, "2");
      l6.addItem(20, "3");
      l6.addItem(21, "4");
      l6.addItem(22, "8");
      l6.addItem(23, "up");
      l6.addItem(24, "upLeft");
      l6.addItem(25, "upRight");
      l6.addItem(26, "vertical");
   }
}
