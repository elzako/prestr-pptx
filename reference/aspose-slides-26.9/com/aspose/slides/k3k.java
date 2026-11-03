package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

final class k3k extends MathElementBase implements IMathElement {
   private z4a n5;
   private final e3a u3;
   private PortionFormat a6;

   public final h4n l6() {
      return this.u3;
   }

   final z4a k5() {
      return this.n5;
   }

   final void n5(z4a var1) {
      this.n5 = var1;
   }

   public final IPortionFormat a6() {
      return this.a6;
   }

   public k3k() {
      this.u3 = new e3a();
      this.a6 = new PortionFormat();
   }

   public k3k(String var1, PortionFormat var2) {
      if (var1 == null) {
         throw new ArgumentNullException("text");
      }

      this.u3 = new e3a();
      this.u3.n5(new o6z(var1));
      PortionFormat var3 = var2;
      if (var3 == null) {
         var3 = new PortionFormat();
      }

      this.a6 = var3;
   }

   @Override
   public final IMathElement[] getChildren() {
      return k5;
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
