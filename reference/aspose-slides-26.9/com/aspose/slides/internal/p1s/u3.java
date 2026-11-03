package com.aspose.slides.internal.p1s;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.t9;

public class u3 implements IGenericEnumerator<k5> {
   private String n5;
   private int l6 = -1;
   private int k5;
   private k5 u3;

   public u3(String var1) {
      this.n5 = var1;
      this.k5 = var1.length();
   }

   @Override
   public final void dispose() {
      this.n5 = null;
   }

   @Override
   public final boolean hasNext() {
      if (this.l6 == this.k5 - 1) {
         return false;
      }

      this.l6++;
      char var1 = this.n5.charAt(this.l6);
      this.u3 = new k5(t9.c8(var1));
      this.u3.n5(var1);
      char var2 = '\u0000';
      char[] var3 = new char[]{'\u0000'};

      while (this.n5(var3)) {
         var2 = var3[0];
         boolean var4 = t9.c8(var2);
         if ((!this.u3.n5() || !var4) && (this.u3.n5() || var4)) {
            break;
         }

         this.l6++;
         this.u3.n5(var2);
      }

      return true;
   }

   private boolean n5(char[] var1) {
      int var2 = this.l6 + 1;
      if (var2 < this.k5) {
         var1[0] = this.n5.charAt(var2);
         return true;
      } else {
         var1[0] = 0;
         return false;
      }
   }

   @Override
   public final void reset() {
      this.l6 = -1;
      this.u3 = null;
   }

   public final k5 n5() {
      return this.u3;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k5 next() {
      return this.n5();
   }

}
