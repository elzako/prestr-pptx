package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class g5g {
   private static final Dictionary<String, Integer> n5 = new Dictionary<>();
   private static final Dictionary<Integer, String> l6 = new Dictionary<>();
   private static final Dictionary<Integer, String> k5 = new Dictionary<>();
   private static final Dictionary<String, Integer> u3 = new Dictionary<>();
   private static final Dictionary<String, String> a6 = new Dictionary<>();
   private static final String[] u9 = new String[]{".xlsx", ".xlsm", ".xltx", ".xltm", ".xlsb"};
   private static final String[] h0 = new String[]{
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml",
      "application/vnd.ms-excel.sheet.macroEnabled.main+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml",
      "application/vnd.ms-excel.template.macroEnabled.main+xml",
      "application/vnd.ms-excel.sheet.binary.macroEnabled.main"
   };

   public static int n5(String var0, int var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      int var4 = n5.tryGetValue(var0, var3) ? var3[0] : var1;
      var2 = var3[0];
      return var4;
   }

   public static String n5(int var0) {
      String var1 = null;
      String[] var2 = new String[]{var1};
      boolean var3 = !k5.tryGetValue(var0, var2);
      var1 = var2[0];
      return var3 ? k5.get_Item(0) : var1;
   }

   static {
      List var0 = new List();
      IEnumerator var1 = com.aspose.slides.ms.System.d5.getValues(com.aspose.slides.internal.v6g.k5.n5(WorkbookType.class)).iterator();

      try {
         while (var1.hasNext()) {
            int var2 = com.aspose.slides.internal.v6g.k5.u3(var1.next(), 11);
            if (var2 != -1) {
               var0.addItem(var2);
            }
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
