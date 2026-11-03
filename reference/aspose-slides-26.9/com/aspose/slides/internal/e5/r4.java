package com.aspose.slides.internal.e5;

import com.aspose.slides.exceptions.NotSupportedException;

public class r4 extends k5 {
   private t2 n5;
   private t2$n5 l6 = null;
   private t2 k5;
   private k5 u3 = null;

   public r4(t9 var1) {
      this.n5 = var1;
      this.l6 = var1.x8();
      this.c8();
   }

   public r4(t9 var1, t2 var2) {
      this.n5 = var1;
      this.l6 = var1.k5(var2);
      this.c8();
   }

   public final k5 h0() {
      return (k5)this.clone();
   }

   @Override
   public final Object clone() {
      r4 var1 = (r4)super.deepClone();
      var1.l6 = this.n5.k5(var1.k5);
      var1.l6.k5();
      var1.u3 = (k5)this.u3.deepClone();
      return var1;
   }

   @Override
   public void n5(char var1) {
      if (this.u3 != null) {
         this.u3.n5(var1);
      }
   }

   private void c8() {
      if (this.l6 != null && this.l6.l6()) {
         this.k5 = this.l6.k5();
         this.u3 = this.k5.n3();
      } else {
         this.k5 = null;
         this.u3 = null;
      }
   }

   @Override
   public boolean l6() {
      while (this.u3 != null) {
         if (this.u3.l6()) {
            return true;
         }

         this.c8();
      }

      return false;
   }

   @Override
   public char u3() {
      if (this.u3 != null) {
         return this.u3.u3();
      } else {
         throw new NotSupportedException();
      }
   }

   @Override
   public void n5() {
      if (this.u3 != null) {
         this.u3.n5();
      }
   }
}
