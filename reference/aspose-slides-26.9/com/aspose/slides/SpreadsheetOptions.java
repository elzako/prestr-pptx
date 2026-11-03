package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.Locale;

public class SpreadsheetOptions implements ISpreadsheetOptions {
   private boolean n5 = false;
   private com.aspose.slides.internal.x7n.l6 l6 = new com.aspose.slides.internal.x7n.l6("en-US");

   @Override
   public final Locale getPreferredCulture() {
      return com.aspose.slides.internal.x7n.l6.n5(this.n5());
   }

   com.aspose.slides.internal.x7n.l6 n5() {
      return this.l6;
   }

   @Override
   public final void setPreferredCulture(Locale value) {
      this.n5(com.aspose.slides.internal.x7n.l6.n5(value));
   }

   void n5(com.aspose.slides.internal.x7n.l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.l6 = var1;
   }

   @Override
   public final boolean getRecoverWorkbookFromChartCache() {
      return this.n5;
   }

   @Override
   public final void setRecoverWorkbookFromChartCache(boolean value) {
      this.n5 = value;
   }
}
