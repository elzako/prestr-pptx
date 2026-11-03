package com.aspose.slides.internal.w3u;

import com.aspose.slides.Collections.Generic.Dictionary;

class u3 {
   private static final Dictionary<Integer, Integer> n5 = new Dictionary<>();
   private static final Dictionary<Integer, Integer> l6 = new Dictionary<>();

   public static int n5(int var0) {
      return l6.get_Item(var0);
   }

   static {
      n5.addItem(2, 1);
      n5.addItem(4, 2);
      n5.addItem(8, 3);
      n5.addItem(16, 4);
      n5.addItem(32, 5);
      n5.addItem(64, 6);
      n5.addItem(128, 7);
      n5.addItem(256, 8);
      l6.addItem(1, 2);
      l6.addItem(2, 4);
      l6.addItem(3, 8);
      l6.addItem(4, 16);
      l6.addItem(5, 32);
      l6.addItem(6, 64);
      l6.addItem(7, 128);
      l6.addItem(8, 256);
   }
}
