package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;

public final class Input {
   private final ITemplateEngine n5;

   Input(ITemplateEngine templateEngine) {
      this.n5 = templateEngine;
   }

   public final <TContextObject> void addTemplate(String key, String path) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      if (path == null) {
         throw new ArgumentNullException("path");
      }

      if (!com.aspose.slides.internal.z0k.u9.k5(path)) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("\"{0}\" does not exist", new Object[]{path}), "path");
      }

      try {
         this.n5(key, path, com.aspose.slides.internal.v6g.k5.n5(TemplateContext.class));
      } catch (RuntimeException var5) {
         String var4 = com.aspose.slides.ms.System.d1.n5("Unhandled exception on adding template \"{0}\" from file \"{1}\":",new Object[]{ key, path});
         var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.p8.k5(), var5.getMessage()}));
         throw new Exception(var4);
      }
   }

   final <TContextObject> void n5(String var1, r6o<TContextObject> var2) {
      com.aspose.slides.internal.v6g.k5.n5(this.n5, f5l.class).n5(var1, var2);
   }

   private void n5(String var1, String var2, com.aspose.slides.ms.System.y8 var3) {
      this.n5.addTemplate(var1, com.aspose.slides.internal.z0k.u9.t2(var2), var3);
   }
}
