package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class l6$l6 implements IGenericEnumerator<Character> {
   private String n5;
   private int l6;
   private int k5;

   public l6$l6(String var1, int var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var2;
   }

   @Override
   public final boolean hasNext() {
      if (this.l6 + 1 < this.n5.length()) {
         this.l6++;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void reset() {
      this.l6 = this.k5;
   }

   public final Character n5() {
      return this.n5.charAt(this.l6);
   }

   @Override
   public final void dispose() {
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Character next() {
      return this.n5();
   }

}
