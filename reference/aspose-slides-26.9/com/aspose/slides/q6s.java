package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class q6s {
   private static final Dictionary<String, Integer> n5 = new Dictionary<>();
   private static final Dictionary<Integer, String> l6 = new Dictionary<>();
   private static final Dictionary<Integer, String> k5 = new Dictionary<>();
   private static final Dictionary<String, Integer> u3 = new Dictionary<>();
   private static final Dictionary<String, String> a6 = new Dictionary<>();
   private static final String[] u9 = new String[]{".pptx", ".pptm", ".ppsx", ".ppsm", ".potx", ".potm"};
   private static final String[] h0 = new String[]{
      "application/vnd.openxmlformats-officedocument.presentationml.presentation.main+xml",
      "application/vnd.ms-powerpoint.presentation.macroEnabled.main+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.slideshow.main+xml",
      "application/vnd.ms-powerpoint.slideshow.macroEnabled.main+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.template.main+xml",
      "application/vnd.ms-powerpoint.template.macroEnabled.main+xml"
   };

   public static int n5(String var0, int var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      int var4 = n5.tryGetValue(var0, var3) ? var3[0] : var1;
      var2 = var3[0];
      return var4;
   }

   public static int n5(int var0) {
      switch (var0) {
         case 0:
            return 1;
         case 1:
            return 3;
         case 2:
            return 4;
         case 3:
            return 5;
         case 4:
            return 6;
         case 5:
            return 7;
         case 6:
            return 12;
         default:
            return 1;
      }
   }

   static {
      List var0 = new List();
      IEnumerator var1 = com.aspose.slides.ms.System.d5.getValues(com.aspose.slides.internal.v6g.k5.n5(b5t.class)).iterator();

      try {
         while (var1.hasNext()) {
            int var2 = com.aspose.slides.internal.v6g.k5.u3(var1.next(), 11);
            var0.addItem(var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            ((IDisposable)var1).dispose();
         }
      }

      for (int var6 = 0; var6 < com.aspose.slides.ms.System.u3.n5((Object)h0).a6(0); var6++) {
         n5.addItem(h0[var6], (Integer)var0.get_Item(var6));
         l6.addItem((Integer)var0.get_Item(var6), h0[var6]);
         k5.addItem((Integer)var0.get_Item(var6), u9[var6]);
         u3.addItem(u9[var6], (Integer)var0.get_Item(var6));
         a6.addItem(h0[var6], u9[var6]);
      }
   }
}
