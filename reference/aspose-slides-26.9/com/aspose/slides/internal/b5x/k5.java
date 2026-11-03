package com.aspose.slides.internal.b5x;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.z3;

public class k5 extends com.aspose.slides.internal.i2i.a6 {
   private int u3;

   public k5() {
      this.n5 = "2.16.840.1.113730.1.1";
   }

   public k5(com.aspose.slides.internal.i2i.a6 var1) {
      super(var1);
   }

   @Override
   protected void n5() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.k5.u3());
      if (com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 6) != 3) {
         throw new ArgumentException("Invalid NetscapeCertType extension");
      }

      int var2 = 1;

      while (var2 < var1.u3().length) {
         this.u3 = (this.u3 << 8) + com.aspose.slides.internal.v6g.k5.u3(var1.u3()[var2++], 6);
      }
   }

   public boolean n5(int var1) {
      int var2 = z3.h0(com.aspose.slides.internal.v6g.k5.l6(var1), com.aspose.slides.internal.x7n.l6.k5());
      return (var2 & this.u3) == var2;
   }

   @Override
   public String toString() {
      String var1 = " , ";
      a5 var2 = new a5();
      if (this.n5(128)) {
         var2.n5("SSL Client Authentication");
      }

      if (this.n5(64)) {
         if (var2.l6() > 0) {
            var2.n5(" , ");
         }

         var2.n5("SSL Server Authentication");
      }

      if (this.n5(32)) {
         if (var2.l6() > 0) {
            var2.n5(" , ");
         }

         var2.n5("SMIME");
      }

      if (this.n5(16)) {
         if (var2.l6() > 0) {
            var2.n5(" , ");
         }

         var2.n5("Object Signing");
      }

      if (this.n5(4)) {
         if (var2.l6() > 0) {
            var2.n5(" , ");
         }

         var2.n5("SSL CA");
      }

      if (this.n5(2)) {
         if (var2.l6() > 0) {
            var2.n5(" , ");
         }

         var2.n5("SMIME CA");
      }

      if (this.n5(1)) {
         if (var2.l6() > 0) {
            var2.n5(" , ");
         }

         var2.n5("Object Signing CA");
      }

      var2.n5("(");
      var2.n5(a3.n5(this.u3, "X2", com.aspose.slides.internal.x7n.l6.k5()));
      var2.n5(")");
      var2.n5(p8.k5());
      return var2.toString();
   }
}
