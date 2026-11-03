package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public class u6 implements com.aspose.slides.internal.r4.h0 {
   protected List<y2> n5;
   protected int l6 = 0;
   private y2 k5;

   public u6(y2 var1) {
      this.k5 = var1;
      this.n5 = var1.r4();
   }

   @Override
   public boolean l6() {
      return this.l6 < this.n5.size() || this.k5.l6(this.l6);
   }

   @Override
   public final boolean u3() {
      return this.l6 > 0;
   }

   public final y2 c8() {
      if (this.l6 > 0) {
         return this.n5.get_Item(--this.l6);
      } else {
         throw new InvalidOperationException();
      }
   }

   public final y2 t2() {
      if (this.l6 < this.n5.size()) {
         return this.n5.get_Item(this.l6++);
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public final void n5() {
      if (this.l6 > 0) {
         this.n5.removeAt(--this.l6);
      } else {
         throw new InvalidOperationException();
      }
   }

   public final void n5(y2 var1) {
      throw new InvalidOperationException("LMiter doesn't support add");
   }

   public final void l6(y2 var1) {
      throw new InvalidOperationException("LMiter doesn't support set");
   }

   @Override
   public final int u9() {
      return this.l6;
   }

   @Override
   public final int h0() {
      return this.l6 - 1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void l6(Object bridgeArg0) {
      this.n5((y2)bridgeArg0);
   }


   // $VF: synthetic method
   @Override
   public void n5(Object var1) {
      this.l6((y2)var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y2 a6() {
      return this.c8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y2 k5() {
      return this.t2();
   }

}
