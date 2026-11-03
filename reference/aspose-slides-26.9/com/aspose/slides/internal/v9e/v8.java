package com.aspose.slides.internal.v9e;

import com.aspose.slides.ms.System.Xml.k6;

public class v8 extends n5 {
   protected k6 n5;
   protected j8 l6;

   public final void n5(k6 var1, j8 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      n5 var3 = null;
      if (this.n5 != null) {
         var3 = this.l6 == null ? var1.l6().n5(var1, var2.a6(), this.n5) : this.l6.l6(var1, var2.a6(), this.n5);
      } else {
         var3 = this.l6 == null ? var1.l6().l6(var1, var2.a6()) : this.l6.k5(var1, var2.a6());
      }

      if (var3 == null) {
         var3 = this.n5(var2.a6());
      }

      if (var3 != null) {
         var2.n5(var3);
      } else {
         var2.s7();
      }
   }

   public final n5 n5(com.aspose.slides.internal.x6s.a6 var1) {
      n5 var2 = null;
      switch (var1.k5()) {
         case 0:
         case 1:
            var2 = u3.n5(this.n5);
            break;
         case 2:
         case 4:
         case 5:
         case 6:
            var2 = p6.n5();
         case 3:
         case 7:
         case 8:
         case 9:
      }

      return var2;
   }
}
