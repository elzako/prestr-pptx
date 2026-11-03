package com.aspose.slides;

class h1i {
   static String n5(ISmartArt var0, d9r var1) {
      if (var0 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      s8z var3 = var1.l6;
      ISmartArtNodeCollection var4 = var0.getNodes();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            n5(var2, var4.get_Item(var5), 0, var3);
         }
      }

      return var2.toString();
   }

   private static void n5(com.aspose.slides.internal.l7h.a5 var0, ISmartArtNode var1, int var2, s8z var3) {
      if (var1 != null) {
         int var4 = var2;
         if (!var1.isHidden()) {
            String var5 = n5(var1, var3);
            String var6 = var3.l6(var5, var2);
            var0.n5(var3.u3(var6));
            var4 = var2 + 1;
         }

         ISmartArtNodeCollection var7 = var1.getChildNodes();
         if (var7 != null) {
            for (int var8 = 0; var8 < var7.size(); var8++) {
               n5(var0, var7.get_Item(var8), var4, var3);
            }
         }
      }
   }

   private static String n5(ISmartArtNode var0, s8z var1) {
      String var2 = null;
      if (var0.getTextFrame() != null) {
         var2 = var0.getTextFrame().getText();
      }

      if (var2 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      var2 = com.aspose.slides.ms.System.d1.n5(var2, "\r\n", " ");
      var2 = com.aspose.slides.ms.System.d1.n5(var2, '\r', ' ');
      var2 = com.aspose.slides.ms.System.d1.n5(var2, '\n', ' ');
      var2 = com.aspose.slides.ms.System.d1.n5(var2, '\u000b', ' ');
      var2 = com.aspose.slides.ms.System.d1.l6(var2);
      return var1.c8(var2);
   }
}
