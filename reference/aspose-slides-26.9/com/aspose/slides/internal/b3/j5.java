package com.aspose.slides.internal.b3;

import com.aspose.slides.Collections.Stack;
import com.aspose.slides.internal.h2.h2;

public class j5 {
   private h2 n5;
   private com.aspose.slides.internal.e5.w1 l6;
   private com.aspose.slides.internal.e5.t9 k5;
   private Stack u3;

   public j5(h2 var1, com.aspose.slides.internal.e5.w1 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var2.l6();
   }

   public final com.aspose.slides.internal.f2.a6 n5() {
      com.aspose.slides.internal.f2.a6 var1 = this.c8();
      return var1 != null ? var1 : this.n5.l6(this.l6);
   }

   public final com.aspose.slides.internal.f2.k5 l6() {
      return this.l6.u3(103).c8();
   }

   public final com.aspose.slides.internal.e5.t9 k5() {
      return this.k5;
   }

   public final com.aspose.slides.internal.e5.w1 u3() {
      return this.l6;
   }

   public final h2 a6() {
      return this.n5;
   }

   public final void n5(n3 var1) {
      if (this.u3 == null) {
         this.u3 = new Stack();
      }

      this.u3.push(var1);
   }

   public final void u9() {
      if (this.u3 != null) {
         this.u3.pop();
      }
   }

   public final com.aspose.slides.internal.y1.u3 h0() {
      return this.l6.n5() != null ? this.l6.n5().q_() : null;
   }

   private com.aspose.slides.internal.f2.a6 c8() {
      if (this.u3 != null) {
         n3 var1 = (n3)this.u3.peek();
         if (var1 != null) {
            return var1.l6();
         }
      }

      return null;
   }
}
