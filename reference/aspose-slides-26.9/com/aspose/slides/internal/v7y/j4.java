package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.XPathException;

public final class j4 extends f4 {
   private com.aspose.slides.internal.k4s.l6 a6;

   public j4(String var1, String var2) {
      super(var2, var1);
   }

   private j4(j4 var1) {
      super(var1);
      this.a6 = var1.a6;
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      if (var1 == null) {
         throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
      }

      if (this.u3 != var1) {
         this.u3 = var1;
         this.a6 = this.u3.l6(this.n5, this.l6);
         if (this.a6 == null) {
            throw XPathException.create("The variable '{0}' is undefined.", this.n3());
         }
      }
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      if (this.u3 == null) {
         throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
      } else {
         return this.l6(this.a6.n5(this.u3));
      }
   }

   @Override
   public int u9() {
      if (this.a6 != null) {
         return this.n5(this.n5((com.aspose.slides.internal.x6s.h0)null));
      }

      int var1 = this.a6 != null ? this.a6.n5() : 5;
      if (var1 == 6) {
         var1 = 5;
      }

      return var1;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new j4(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
