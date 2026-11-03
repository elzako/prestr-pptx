package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class w3u implements z9l {
   public final String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "$", "ppt_x", "#ppt_x", "ppt_y", "#ppt_y", "ppt_w", "#ppt_w", "ppt_h", "#ppt_h"
   );

   public w3u(String var1) {
      this.n5 = var1;
   }

   public static boolean n5(String var0) {
      switch (l6.n5(var0)) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            return true;
         default:
            return false;
      }
   }

   @Override
   public final float n5(r9g var1) {
      switch (l6.n5(this.n5)) {
         case 0:
            return var1.a6();
         case 1:
         case 2:
            return var1.n5();
         case 3:
         case 4:
            return var1.l6();
         case 5:
         case 6:
            return var1.k5();
         case 7:
         case 8:
            return var1.u3();
         default:
            throw new NotImplementedException();
      }
   }
}
