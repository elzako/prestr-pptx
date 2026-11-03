package com.aspose.slides.internal.y1;

import com.aspose.slides.internal.e5.n3;
import com.aspose.slides.internal.z0k.t4;

public class a6 {
   private String n5 = null;
   private t4 l6 = null;
   private u3 k5 = null;
   private n3 u3 = null;

   public a6(String var1, u3 var2, t4 var3) {
      this.n5 = var1;
      this.k5 = var2;
      if (this.k5 == null) {
         this.k5 = u9.n5().l6();
      }

      this.l6 = var3;
      this.l6();
   }

   private void l6() {
      this.u3 = new n3(this.n5, this.k5, this.l6);
   }

   public final com.aspose.slides.internal.w2.l6 n5() {
      if (this.u3 == null) {
         this.l6();
      }

      return this.u3;
   }
}
