package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class r4 implements IGenericCloneable<r4> {
   private n9 n5 = new d0(p6.n5(79, 129, 189));
   private n9 l6 = new d0(p6.n5(56, 93, 138));
   private g6 k5 = new g6();
   private boolean u3;
   private int a6;
   private u2 u9;
   private m7 h0;
   private g5 c8;

   public void n5(n9 var1) {
      if (this.n5 != var1) {
         if (null == var1) {
            throw new ArgumentNullException("value");
         }

         this.n5 = var1.n5();
      }
   }

   public void l6(n9 var1) {
      if (this.l6 != var1) {
         if (null == var1) {
            throw new ArgumentNullException("value");
         }

         this.l6 = var1.n5();
      }
   }

   public void n5(g6 var1) {
      if (this.k5 != var1) {
         if (null == var1) {
            throw new ArgumentNullException("value");
         }

         this.k5 = var1.a6();
      }
   }

   public void n5(boolean var1) {
      this.u3 = var1;
   }

   public void n5(int var1) {
      this.a6 = var1;
   }

   public void n5(u2 var1) {
      if (this.u9 != var1) {
         this.u9 = null != var1 ? var1.n5() : null;
      }
   }

   public void n5(m7 var1) {
      if (this.h0 != var1) {
         this.h0 = var1 != null ? var1.t2() : null;
      }
   }

   public void n5(g5 var1) {
      if (var1 != this.c8) {
         this.c8 = null != var1 ? var1.n5() : null;
      }
   }

   public r4() {
      this.n5 = new d0();
      this.l6 = new d0();
   }

   public r4 n5() {
      r4 var1 = new r4();
      var1.n5(this.n5);
      var1.l6(this.l6);
      var1.n5(this.k5);
      var1.n5(this.c8);
      var1.n5(this.u3);
      var1.n5(this.a6);
      var1.n5(this.h0);
      var1.n5(this.u9);
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 cloneT() {
      return this.n5();
   }

}
