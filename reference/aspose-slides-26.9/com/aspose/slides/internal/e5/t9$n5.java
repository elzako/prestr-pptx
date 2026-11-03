package com.aspose.slides.internal.e5;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;

public class t9$n5 implements t2$n5 {
   private t2 n5;
   private t9 l6;
   private int k5;
   private int u3 = 0;

   public t9$n5(t9 var1) {
      this.l6 = var1;
      this.n5 = var1.u3;
      this.k5 = 0;
      this.u3 = 0;
   }

   public final t2 s7() {
      if (this.n5 == null) {
         throw new Exception("Element was not found");
      }

      if (this.k5 != 0) {
         if (this.n5.l6 == null || this.n5.l6.n5 == null) {
            throw new Exception("Element was not found");
         }

         this.n5 = this.n5.l6.n5;
      }

      this.k5++;
      this.u3 |= 3;
      return this.n5;
   }

   public final t2 x8() {
      if (this.n5.l6 != null && this.n5.l6.l6 != null) {
         this.k5--;
         this.n5 = this.n5.l6.l6;
         this.u3 |= 3;
         return this.n5;
      } else {
         throw new Exception("Element was not found");
      }
   }

   public final void n5(t2 var1) {
      if ((this.u3 & 1) == 1) {
         if (this.n5 == this.l6.u3) {
            this.l6.u3 = var1;
         } else {
            t2.n5(this.n5.l6.l6, var1);
         }

         if (this.n5.l6 != null && this.n5.l6.n5 != null) {
            t2.n5(var1, this.n5.l6.n5);
         }

         if (this.n5 == this.l6.a6) {
            this.l6.a6 = var1;
         }
      } else {
         throw new InvalidOperationException();
      }
   }

   public final void l6(t2 var1) {
      if (this.k5 == -1) {
         if (this.n5 != null) {
            t2.n5(var1, this.n5);
         }

         this.l6.u3 = var1;
         this.k5 = 0;
         this.n5 = var1;
         if (this.l6.a6 == null) {
            this.l6.a6 = var1;
         }
      } else {
         if (this.n5.l6 != null && this.n5.l6.n5 != null) {
            t2.n5(var1, this.n5.l6.n5);
         }

         t2.n5(this.n5, var1);
         if (this.n5 == this.l6.a6) {
            this.l6.a6 = var1;
         }
      }

      this.u3 &= 0;
   }

   @Override
   public final boolean l6() {
      return this.n5 != null && (this.k5 == 0 || this.n5.l6 != null && this.n5.l6.n5 != null);
   }

   @Override
   public final boolean u3() {
      return this.k5 != 0 || this.n5.l6 != null && this.n5.l6.l6 != null;
   }

   @Override
   public final int u9() {
      return this.k5 + 1;
   }

   @Override
   public final int h0() {
      return this.k5 - 1;
   }

   @Override
   public final void n5() {
      if ((this.u3 & 2) != 2) {
         throw new InvalidOperationException();
      }

      this.l6.l6(this.n5);
      if (this.k5 == 0) {
         this.n5 = this.l6.u3;
      } else if (this.n5.l6 != null && this.n5.l6.l6 != null) {
         this.n5 = this.n5.l6.l6;
         this.k5--;
      } else {
         this.n5 = null;
      }

      this.u3 &= 0;
   }

   @Override
   public final t2 t2() {
      this.n5 = this.l6.u3;
      this.k5 = 0;
      return this.n5;
   }

   @Override
   public final t2 c8() {
      return this.s7();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public t2 a6() {
      return this.x8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public t2 k5() {
      return this.s7();
   }

}
