package com.aspose.slides.internal.m2;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.j7.c8;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;

public class n5 extends l6 {
   private final Stack<s7> n5 = new Stack<>();
   private a0 l6;

   public final a0 n5() {
      return this.l6;
   }

   @Override
   public void l6(r4 var1) {
      if (this.l6() != null) {
         this.n5.push(this.l6());
      }

      super.l6(var1);
   }

   @Override
   public void n5(r4 var1) {
      if (var1.u3() != null) {
         m1 var2 = c8.n5(var1.u3());

         try {
            this.l6().l6(var2);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }

      if (this.l6 == null) {
         this.l6 = new a0(this.l6());
      } else {
         this.l6.k5(this.l6());
      }

      if (this.n5.size() != 0) {
         this.n5(this.n5.pop());
      }
   }
}
