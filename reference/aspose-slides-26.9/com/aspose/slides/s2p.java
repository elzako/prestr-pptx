package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.Xml.XmlDocument;

final class s2p {
   private final SortedList<String, s5c> n5 = new SortedList<>();
   private String l6 = "";

   public s2p(String var1, s5c var2) {
      this.l6 = var1;
      this.n5(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, var2);
   }

   public final void n5(String var1, s5c var2) {
      this.n5(this.l6, var1, var2);
   }

   public final void n5(String var1, String var2, s5c var3) {
      String var4 = var1;
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5(new Object[]{'#', var2}));
      }

      this.n5.set_Item(var4, var3);
   }

   public final com.aspose.slides.ms.System.Xml.m8 n5(String var1, String var2, String var3, XmlDocument var4) {
      if (this.n5.size() > 0) {
         String var5 = com.aspose.slides.ms.System.d1.n5(new Object[]{var3, '#', var2});
         int var6 = this.n5.indexOfKey(var5);
         if (var6 < 0) {
            var6 = this.n5.indexOfKey(var3);
         }

         if (var6 < 0) {
            var6 = this.n5.indexOfKey(com.aspose.slides.ms.System.d1.n5);
         }

         if (var6 >= 0) {
            return this.n5.getValues().get_Item(var6).n5(var1, var2, var3, var4);
         }
      }

      return new w9f(var1, var2, var3, var4);
   }
}
