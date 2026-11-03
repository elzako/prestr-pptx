package com.aspose.slides.internal.t3o;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import java.util.Iterator;
import java.util.Map.Entry;

class k5 implements IDictionaryEnumerator {
   private Entry l6;
   private int k5;
   private Iterator u3;
   // $VF: synthetic field
   final l6 n5;

   k5(l6 var1) {
      this.n5 = var1;
      this.l6 = null;
      this.k5 = this.n5.getVersion();
      this.u3 = this.n5.entrySet().iterator();
   }

   @Override
   public DictionaryEntry getEntry() {
      if (this.l6 == null) {
         throw new InvalidOperationException("Enumeration has either not started or has already finished");
      } else {
         return new DictionaryEntry(this.l6.getKey(), this.l6.getValue());
      }
   }

   @Override
   public Object getKey() {
      if (this.l6 == null) {
         throw new InvalidOperationException("Enumeration has either not started or has already finished");
      } else {
         return this.l6.getKey();
      }
   }

   @Override
   public Object getValue() {
      if (this.l6 == null) {
         throw new InvalidOperationException("Enumeration has either not started or has already finished");
      } else {
         return this.l6.getValue();
      }
   }

   @Override
   public Object next() {
      Object var1 = this.u3.next();
      this.l6 = (Entry)var1;
      return var1;
   }

   @Override
   public boolean hasNext() {
      if (this.k5 != this.n5.getVersion()) {
         throw new InvalidOperationException("Collection was modified; enumeration operation may not execute");
      } else {
         return this.u3.hasNext();
      }
   }

   @Override
   public void reset() {
      this.u3 = this.n5.entrySet().iterator();
      this.l6 = null;
   }

   @Override
   public void remove() {
      this.u3.remove();
   }
}
