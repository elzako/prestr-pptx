package com.aspose.slides.internal.h9q;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class n5 extends l6 {
   private boolean u3;
   private boolean a6;

   public n5(y1 var1, boolean var2, boolean var3) {
      super(var1);
      this.u3 = var2;
      this.a6 = var3;
   }

   @Override
   protected void n5(w1 var1, w1 var2) {
      this.k5(var1, var2);
      this.u3(var1, var2);
      if (this.u3) {
         this.a6(var1, var2);
      }

      if (this.a6) {
         this.u9(var1, var2);
      }
   }

   private void a6(w1 var1, w1 var2) {
      int var3 = this.u3(var1);
      boolean var4 = var3 % 2 != 0;
      if (var4) {
         var2.n5(this.n5.x8() + this.l6 - var2.l6());
      }
   }

   private void u9(w1 var1, w1 var2) {
      int var3 = this.a6(var1);
      boolean var4 = var3 % 2 != 0;
      if (var4) {
         var2.l6(this.n5.n3() + this.k5 - var2.k5());
      }
   }
}
