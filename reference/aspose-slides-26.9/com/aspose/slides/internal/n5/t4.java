package com.aspose.slides.internal.n5;

public class t4 extends w1 {
   public int n5;
   public int l6;

   public t4() {
   }

   public t4(int var1, int var2, e2 var3) {
      super(var3);
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public String toString() {
      return "MismatchedNotSetException(" + this.l6() + " not in [" + this.n5 + "," + this.l6 + "])";
   }
}
