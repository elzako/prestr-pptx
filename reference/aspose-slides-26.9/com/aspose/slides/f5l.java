package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class f5l implements ITemplateEngine {
   private Dictionary<String, o8h> n5 = new Dictionary<>();

   @Override
   public final void addTemplate(String key, String template, com.aspose.slides.ms.System.y8 modelType) {
   }

   @Override
   public final String compile(String key, Object model) {
      if (this.n5.containsKey(key)) {
         o8h var3 = this.n5.get_Item(key);
         if (var3 != null) {
            com.aspose.slides.internal.z0k.r4 var4 = new com.aspose.slides.internal.z0k.r4();
            var3.n5().n5(var4);
            var3.n5().n5(model);
            var3.n5().n5();
            return var4.toString();
         }
      }

      return "";
   }

   final <TContextObject> void n5(String var1, r6o<TContextObject> var2) {
      this.n5.addItem(var1, new b4t(var1, var2));
   }
}
