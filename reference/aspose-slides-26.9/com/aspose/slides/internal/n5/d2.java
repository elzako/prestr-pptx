package com.aspose.slides.internal.n5;

public class d2 extends z3 {
   public d2() {
   }

   public d2(int var1, e2 var2) {
      super(var1, var2);
   }

   public y2 n5() {
      return this.u9;
   }

   @Override
   public String toString() {
      String var1 = ", expected " + this.n5;
      if (this.n5 == 0) {
         var1 = "";
      }

      return this.u9 == null ? "UnwantedTokenException(found=" + null + var1 + ")" : "UnwantedTokenException(found=" + this.u9.l6() + var1 + ")";
   }
}
