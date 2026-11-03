package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.a3;

public class m1 {
   private int n5;
   private Stack<Integer> l6;

   public m1() {
      this(0);
   }

   public m1(int var1) {
      this.n5 = var1;
      this.l6 = new Stack<>();
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6() {
      this.l6.push(this.n5);
   }

   public final void k5() {
      this.n5 = this.l6.pop();
   }

   @Override
   public String toString() {
      return a3.l6(this.n5);
   }

   public final int[] u3() {
      int[] var1 = new int[this.l6.size()];
      this.l6.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0);
      return var1;
   }
}
