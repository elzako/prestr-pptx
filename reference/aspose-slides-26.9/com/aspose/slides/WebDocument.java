package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class WebDocument {
   private final WebDocumentOptions n5;
   private final Input l6;
   private final Output k5;
   private final Storage u3 = new Storage();

   public WebDocument(WebDocumentOptions options) {
      if (options == null) {
         throw new ArgumentNullException("options");
      }

      if (options.getTemplateEngine() == null) {
         throw new ArgumentException("TemplateEngine should not be null", "options");
      }

      if (options.getOutputSaver() == null) {
         throw new ArgumentException("OutputSaver should not be null", "options");
      }

      this.n5 = options;
      this.l6 = new Input(this.n5.getTemplateEngine());
      this.k5 = new Output(this.n5.getTemplateEngine(), this.u3);
   }

   public final void save() {
      IGenericEnumerator var1 = this.k5.n5().iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            this.n5.getOutputSaver().save((String)var2.getKey(), (IOutputFile)var2.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final Input getInput() {
      return this.l6;
   }

   public final Output getOutput() {
      return this.k5;
   }

   public final Storage getGlobal() {
      return this.u3;
   }
}
