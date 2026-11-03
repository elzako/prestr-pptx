package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.z8$n5;

class s7$l6 extends z8$n5 {
   private s7 h0;

   public s7$l6(int var1, s7 var2) {
      super(var1);
      this.h0 = var2;
   }

   @Override
   public a5 n5(int var1, w1 var2, boolean var3, boolean var4) {
      a5 var5 = super.n5(var1, var2, var3, var4);
      if (var5 != null && var5.a6() == 110) {
         var5 = var2.u9(246);
         if (var5.a6() == 110) {
            return this.k5(var2);
         }
      }

      return var5;
   }

   private a5 k5(w1 var1) {
      a5 var2 = var1.u3(245);
      if (var2 == null) {
         return null;
      } else {
         int var3 = var2.a6();
         if (var3 == 70) {
            return com.aspose.slides.internal.e5.s7.n5(this.h0, 135, "START");
         } else if (var3 == 39) {
            return com.aspose.slides.internal.e5.s7.n5(this.h0, 39, "END");
         } else if (var3 == 135) {
            return com.aspose.slides.internal.e5.s7.n5(this.h0, 135, "START");
         } else if (var3 == 23) {
            return com.aspose.slides.internal.e5.s7.n5(this.h0, 23, "CENTER");
         } else if (var3 == 73) {
            return com.aspose.slides.internal.e5.s7.n5(this.h0, 73, var1.a6(267).a6());
         } else {
            return var3 == 120 ? com.aspose.slides.internal.e5.s7.n5(this.h0, 120, var1.a6(267).a6()) : null;
         }
      }
   }
}
