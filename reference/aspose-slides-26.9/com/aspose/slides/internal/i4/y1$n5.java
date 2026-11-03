package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

class y1$n5 implements IGenericEnumerator<KeyValuePair<String, g7>> {
   private y1 n5;
   private IGenericEnumerator<KeyValuePair<String, y2>> l6;
   private KeyValuePair<String, g7> k5 = new KeyValuePair<>();

   public y1$n5(y1 var1) {
      this.n5 = var1;
      this.l6 = var1.l6.iterator();
   }

   @Override
   public final boolean hasNext() {
      KeyValuePair var1 = new KeyValuePair();

      while (this.l6.hasNext()) {
         this.l6.next().CloneTo(var1);
         if (((y2)var1.getValue()).l6()) {
            this.k5 = new KeyValuePair<>((String)var1.getKey(), ((y2)var1.getValue()).n5(this.n5));
            return true;
         }
      }

      return false;
   }

   @Override
   public final void reset() {
      this.l6.reset();
   }

   public final KeyValuePair<String, g7> n5() {
      return this.k5;
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
   public KeyValuePair<String, g7> next() {
      return this.n5();
   }

}
