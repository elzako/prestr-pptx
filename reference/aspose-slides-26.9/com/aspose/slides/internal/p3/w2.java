package com.aspose.slides.internal.p3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

public class w2<TParentElement> implements com.aspose.slides.internal.r4.y4<j8> {
   private com.aspose.slides.internal.r4.y4<TParentElement> n5;
   private TParentElement l6;
   private y2 k5;
   private boolean u3;

   public w2(com.aspose.slides.internal.r4.y4<TParentElement> var1) {
      this.n5 = var1;
      this.c8();
   }

   public final y2 u9() {
      if (this.k5 == null && this.l6 != null) {
         this.k5 = this.n5(this.l6);
         this.u3 = true;
      }

      return this.k5;
   }

   protected y2 n5(Object var1) {
      return this.l6(var1).u3();
   }

   protected j8 l6(Object var1) {
      j8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, j8.class);
      if (var2 != null) {
         return var2;
      } else {
         throw new ArgumentException("Cannot obtain Position from the given object.");
      }
   }

   private void c8() {
      if (this.n5.l6()) {
         this.u3 = true;
         this.l6 = this.n5.k5();
      } else {
         this.h0();
      }
   }

   protected boolean u3() {
      y2 var1 = this.n5(this.l6);
      if (this.k5 == null) {
         this.k5 = var1;
      } else if (this.k5 != var1 && var1 != null) {
         this.u3 = false;
         this.k5 = null;
         return false;
      }

      return true;
   }

   protected final void h0() {
      this.u3 = false;
      this.l6 = null;
      this.k5 = null;
   }

   @Override
   public final boolean l6() {
      return this.u3 && this.u3();
   }

   public j8 a6() {
      if (this.u3) {
         j8 var1 = this.l6(this.l6);
         this.c8();
         return var1;
      } else {
         throw new InvalidOperationException("PosIter");
      }
   }

   @Override
   public final void n5() {
      throw new NotSupportedException("PositionIterator doesn't support remove");
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j8 k5() {
      return this.a6();
   }

}
