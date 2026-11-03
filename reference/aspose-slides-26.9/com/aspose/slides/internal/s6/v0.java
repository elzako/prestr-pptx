package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.Queue;

final class v0 {
   private Queue<a5> n5 = new Queue<>();

   public v0() {
      this.n5 = new Queue<>();
   }

   public v0(int var1) {
      this.n5 = new Queue<>(var1);
   }

   public final void n5(a5 var1) {
      this.n5.enqueue(var1);
   }

   public final a5 n5() {
      return this.n5.dequeue();
   }
}
