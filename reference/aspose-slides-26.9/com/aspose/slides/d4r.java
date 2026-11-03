package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class d4r {
   private double n5;
   private double l6;
   private double k5;

   public d4r(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentNullException("value");
      }

      String var2 = com.aspose.slides.ms.System.d1.n5(var1, "(", "");
      var2 = com.aspose.slides.ms.System.d1.n5(var2, ")", "");
      if (!"".equals(var2)) {
         String[] var3 = com.aspose.slides.ms.System.d1.n5(var2, ' ');
         if (var3.length < 3) {
            return;
         }

         this.n5 = t2f.y4(var3[0]);
         this.l6 = t2f.y4(var3[1]);
         this.k5 = t2f.y4(var3[2]);
      }
   }
}
