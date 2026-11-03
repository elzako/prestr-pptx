package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Stack;

class c8r {
   private int n5;
   private boolean l6;
   private Stack<Boolean> k5 = new Stack<>();

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void n5(boolean var1) {
      this.k5.push(var1);
   }

   public final boolean l6() {
      return this.k5.peek();
   }

   public final boolean k5() {
      return this.k5.pop();
   }

   public final boolean u3() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }
}
