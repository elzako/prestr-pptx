package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Generic.Stack;

public abstract class p7 extends l0 implements Cloneable {
   private l0 n5;
   private l0 l6;

   public final l0 l6() {
      return this.n5;
   }

   public final void n5(l0 var1) {
      this.n5 = var1;
   }

   public final l0 k5() {
      return this.l6;
   }

   public final void l6(l0 var1) {
      this.l6 = var1;
   }

   protected final void l6(p7 var1, n2 var2, c5 var3) {
      Stack var4 = new Stack();

      p7 var5;
      for (var5 = this; com.aspose.slides.internal.v6g.k5.l6(var5.n5, n3.class) || com.aspose.slides.internal.v6g.k5.l6(var5.n5, z0.class); var5 = (p7)var5.n5) {
         var4.push(var5);
      }

      var5.n5.n5(var5, var2, var3);

      while (true) {
         if (var5.l6 != null) {
            var5.l6.n5(var5, var2, var3);
         }

         if (var4.size() == 0) {
            return;
         }

         var5 = (p7)var4.pop();
      }
   }

   @Override
   public void n5(p7 var1, n2 var2, c5 var3) {
      this.n5.n5(this, var2, var3);
      if (this.l6 != null) {
         this.l6.n5(this, var2, var3);
      }
   }
}
