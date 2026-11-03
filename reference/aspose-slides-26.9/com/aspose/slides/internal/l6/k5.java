package com.aspose.slides.internal.l6;

import com.aspose.slides.internal.n5.a0;
import com.aspose.slides.internal.n5.d2;
import com.aspose.slides.internal.n5.k7;
import com.aspose.slides.internal.n5.m3;
import com.aspose.slides.internal.n5.w1;
import com.aspose.slides.internal.n5.y2;
import com.aspose.slides.internal.n5.z3;

public class k5 extends u3 {
   public com.aspose.slides.internal.n5.e2 l6;
   public y2 k5;
   public y2 u3;
   public w1 a6;

   public k5(a0 var1, y2 var2, y2 var3, w1 var4) {
      if (var3 == null || var3.u9() < var2.u9() && var3.n5() != -1) {
         var3 = var2;
      }

      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public int s7() {
      return 0;
   }

   @Override
   public String x8() {
      String var1 = null;
      if (this.k5 instanceof y2) {
         int var2 = this.k5.u9();
         int var3 = this.u3.u9();
         if (this.u3.n5() == -1) {
            var3 = ((a0)this.l6).k5();
         }

         var1 = ((a0)this.l6).n5(var2, var3);
      } else if (this.k5 instanceof n3) {
         var1 = ((e2)this.l6).n5(this.k5, this.u3);
      } else {
         var1 = "<unknown>";
      }

      return var1;
   }

   @Override
   public String toString() {
      if (this.a6 instanceof k7) {
         return "<missing type: " + ((k7)this.a6).n5() + ">";
      } else if (this.a6 instanceof d2) {
         return "<extraneous: " + ((d2)this.a6).n5() + ", resync=" + this.x8() + ">";
      } else if (this.a6 instanceof z3) {
         return "<mismatched token: " + this.a6.u9 + ", resync=" + this.x8() + ">";
      } else {
         return this.a6 instanceof m3 ? "<unexpected: " + this.a6.u9 + ", resync=" + this.x8() + ">" : "<error: " + this.x8() + ">";
      }
   }
}
