package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class f3p {
   public static <T> String n5(VideoFrame var0, TemplateContext<T> var1) {
      if (var0 == null) {
         throw new InvalidOperationException("Parameter videoFrame can't be null");
      }

      String var2 = var1.getOutput().getResourcePath(var0.getEmbeddedVideo());
      String var3 = var1.getGlobal().get("slidesPath");
      return o6c.n5(var2, var3);
   }
}
