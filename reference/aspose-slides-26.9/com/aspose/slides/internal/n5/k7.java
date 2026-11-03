package com.aspose.slides.internal.n5;

public class k7 extends z3 {
   public Object l6;

   public k7() {
   }

   public k7(int var1, e2 var2, Object var3) {
      super(var1, var2);
      this.l6 = var3;
   }

   public int n5() {
      return this.n5;
   }

   @Override
   public String toString() {
      if (this.l6 != null && this.u9 != null) {
         return "MissingTokenException(inserted " + this.l6 + " at " + this.u9.l6() + ")";
      } else {
         return this.u9 != null ? "MissingTokenException(at " + this.u9.l6() + ")" : "MissingTokenException";
      }
   }
}
