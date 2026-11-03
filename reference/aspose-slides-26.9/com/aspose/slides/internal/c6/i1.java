package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.Collections.Generic.List;
import java.util.regex.Pattern;

public class i1 extends t2 {
   private final int[] n5;

   public i1(IPresentation var1, z8 var2) {
      super(var1, var2);
      this.n5 = n5(var2.l6(), var2.a6());
   }

   @Override
   protected com.aspose.slides.ms.System.c4 l6() {
      return com.aspose.slides.internal.v6g.k5.s7(12, 9);
   }

   @Override
   protected com.aspose.slides.ms.System.c4 n5(z8 var1) {
      return com.aspose.slides.internal.v6g.k5.s7(var1.l6().size(), 9);
   }

   @Override
   protected y1 n5(IPresentation var1, z8 var2, int var3, int var4) {
      return new f2(var1, var2, this.n5, var3, var4);
   }

   private static int[] n5(List<String> var0, long var1) {
      String var3 = "^\\d+\\.\\s+";
      String var4 = "^[^\\w\\s]\\s+";
      int[] var5 = new int[var0.size()];
      boolean var6 = false;

      for (int var7 = 0; var7 < var0.size(); var7++) {
         if (Pattern.compile("^\\d+\\.\\s+").matcher((CharSequence)var0.get_Item(var7)).find()) {
            var6 = true;
            var5[var7] = 2;
            var0.set_Item(var7, ((String)var0.get_Item(var7)).replaceAll("^\\d+\\.\\s+", ""));
         } else if (Pattern.compile("^[^\\w\\s]\\s+").matcher((CharSequence)var0.get_Item(var7)).find()) {
            var6 = true;
            var5[var7] = 1;
            var0.set_Item(var7, ((String)var0.get_Item(var7)).replaceAll("^[^\\w\\s]\\s+", ""));
         } else {
            var5[var7] = 0;
         }
      }

      if (!var6) {
         for (int var8 = 0; var8 < var5.length; var8++) {
            var5[var8] = (int)var1;
         }
      }

      return var5;
   }
}
