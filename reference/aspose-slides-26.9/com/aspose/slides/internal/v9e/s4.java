package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public class s4 extends d1 {
   public s4() {
      super(4);
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.n5(var1, this.u3, "name");
      if (var1.u9()) {
         this.n3(var1);
         var1.h0();
         if (this.h0 != -1 && this.l6 != null) {
            throw XsltException.create("The variable or parameter '{0}' cannot have both a 'select' attribute and non-empty content.", this.a6);
         }
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (this.h0 != -1) {
               Object var3 = var1.k5(var2, this.h0);
               var1.n5(this.u3, var3);
               var2.s7();
            } else if (this.l6 == null) {
               var1.n5(this.u3, com.aspose.slides.ms.System.d1.n5);
               var2.s7();
            } else {
               v4 var5 = new v4(this.u9);
               var1.n5(var5);
               var1.n5(var2);
               var2.n5(1);
            }
            break;
         case 1:
            y0 var4 = var1.t9();
            var1.n5(this.u3, ((v4)var4).n5());
            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid execution state inside VariableAction.Execute");
      }
   }
}
