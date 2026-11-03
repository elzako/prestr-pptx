package com.aspose.slides;

class d0u {
   static <T> boolean n5(Class<T> var0, r0g var1, T[] var2) {
      r0g var3 = var1;

      for (var2[0] = null; var3 != null && var2[0] == null; var3 = var3.getParent_Immediate()) {
         var2[0] = com.aspose.slides.internal.v6g.k5.n5(var3, var0);
      }

      return var2[0] != null;
   }

   static void n5(r0g var0, IPresentationComponent[] var1, ISlideComponent[] var2) {
      r0g var3 = var0;

      for (var1[0] = null; var3 != null && var1[0] == null; var3 = var3.getParent_Immediate()) {
         var1[0] = com.aspose.slides.internal.v6g.k5.n5(var3, IPresentationComponent.class);
      }

      if (var1[0] != null) {
         IPresentationComponent var4 = var1[0];
         var3 = (r0g)var4;
      }

      for (var2[0] = null; var3 != null && var2[0] == null; var3 = var3.getParent_Immediate()) {
         var2[0] = com.aspose.slides.internal.v6g.k5.n5(var3, ISlideComponent.class);
      }
   }

   static void n5(r0g var0, ISlideComponent[] var1, q7p[] var2) {
      r0g var3 = var0;
      var1[0] = null;

      for (var2[0] = null; var3 != null && (var1[0] == null || var2[0] == null); var3 = var3.getParent_Immediate()) {
         if (var1[0] == null) {
            var1[0] = com.aspose.slides.internal.v6g.k5.n5(var3, ISlideComponent.class);
         }

         if (var2[0] == null) {
            var2[0] = com.aspose.slides.internal.v6g.k5.n5(var3, q7p.class);
         }
      }
   }
}
