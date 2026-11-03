package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class u6e {
   public static String n5(ITable var0, s8z var1) {
      String var2 = com.aspose.slides.ms.System.t9.q0('|');
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      var3.n5(n5(var0, var1, var2));

      for (int var4 = 1; var4 < var0.getRows().size(); var4++) {
         var3.n5(n5(var0.getRows().get_Item(var4), var1, var2));
         if (var4 != var0.getRows().size() - 1) {
            var3.n5(var1.k5());
         }
      }

      return var3.toString();
   }

   private static String n5(ITextFrame var0, s8z var1) {
      return l5d.n5(var0, var1);
   }

   private static String n5(IColumnCollection var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(com.aspose.slides.ms.System.t9.q0('|'));
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IColumn var3 = (IColumn)var2.next();
            String var4 = n5(var3);
            var1.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   private static String n5(ITable var0, s8z var1, String var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      var3.n5(n5(var0.getRows().get_Item(0), var1, var2));
      String var4 = n5(var0.getColumns());
      var3.n5(var1.k5());
      var3.n5(var4);
      var3.n5(var1.k5());
      return var3.toString();
   }

   private static String n5(IRow var0, s8z var1, String var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      for (int var4 = 0; var4 < var0.size(); var4++) {
         if (var4 == 0) {
            var3.n5(var2);
         }

         if (var0.get_Item(var4).getTextFrame() != null) {
            var3.n5(n5(var0.get_Item(var4).getTextFrame(), var1));
         }

         var3.n5(var2);
      }

      return var3.toString();
   }

   private static String n5(IColumn var0) {
      int var1 = l6(var0);
      switch (var1) {
         case 1:
            return ":-:|";
         case 2:
            return "-:|";
         default:
            return "-|";
      }
   }

   private static int l6(IColumn var0) {
      if (var0.size() == 0) {
         return 0;
      }

      boolean[] var1 = new boolean[3];
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            ICell var3 = (ICell)var2.next();
            IGenericEnumerator var4 = var3.getTextFrame().getParagraphs().iterator();

            try {
               while (var4.hasNext()) {
                  IParagraph var5 = (IParagraph)var4.next();
                  switch (var5.getParagraphFormat().getAlignment()) {
                     case 1:
                        var1[0] = true;
                        break;
                     case 2:
                        var1[1] = true;
                        break;
                     default:
                        var1[2] = true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (!var1[1] && !var1[2]) {
         return 1;
      } else {
         return !var1[0] && !var1[2] ? 2 : 0;
      }
   }
}
