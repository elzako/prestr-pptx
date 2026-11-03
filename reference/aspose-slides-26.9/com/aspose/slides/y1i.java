package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

class y1i {
   private boolean n5;
   private String l6;
   private w2w k5 = null;
   private SortedList<Long, Long> u3;

   y1i(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Font's name doesn't specified!");
      }

      this.l6 = com.aspose.slides.ms.System.d1.l6(var1);
      if (com.aspose.slides.ms.System.d1.n5(this.l6)) {
         throw new ArgumentException("Input font-name can't be empty!");
      }

      if (com.aspose.slides.ms.System.d1.u3(this.l6, ',') >= 0) {
         throw new ArgumentException("Single font name can't contains a comma delimiter!");
      }

      this.n5(false);
      this.k5 = new w2w();
      this.u3 = new SortedList<>();
   }

   final String n5() {
      return this.l6;
   }

   final w2w l6() {
      return this.k5;
   }

   final boolean k5() {
      return this.n5;
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }
}
