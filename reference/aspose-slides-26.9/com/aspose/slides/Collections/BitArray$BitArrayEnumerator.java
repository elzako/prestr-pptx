package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.v4;

@j3
class BitArray$BitArrayEnumerator implements IEnumerator, v4, Cloneable {
   private BitArray n5;
   private boolean l6;
   private int k5;
   private int u3;

   @Override
   public Object deepClone() {
      return this.n5();
   }

   private BitArray$BitArrayEnumerator() {
   }

   public BitArray$BitArrayEnumerator(BitArray ba) {
      this.k5 = -1;
      this.n5 = ba;
      this.u3 = BitArray.n5(ba);
   }

   @Override
   public Object next() {
      if (this.k5 == -1) {
         throw new InvalidOperationException("Enum not started");
      } else if (this.k5 >= this.n5.size()) {
         throw new InvalidOperationException("Enum Ended");
      } else {
         return this.l6;
      }
   }

   @Override
   public boolean hasNext() {
      this.l6();
      if (this.k5 < this.n5.size() - 1) {
         this.l6 = this.n5.get_Item(++this.k5);
         return true;
      } else {
         this.k5 = this.n5.size();
         return false;
      }
   }

   @Override
   public void reset() {
      this.l6();
      this.k5 = -1;
   }

   @Override
   public void remove() {
      throw new NotImplementedException();
   }

   private void l6() {
      if (this.u3 != BitArray.n5(this.n5)) {
         throw new InvalidOperationException();
      }
   }

   protected Object n5() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      BitArray$BitArrayEnumerator var1 = new BitArray$BitArrayEnumerator();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      return var1;
   }
}
