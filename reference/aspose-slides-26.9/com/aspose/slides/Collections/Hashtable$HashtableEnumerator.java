package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
class Hashtable$HashtableEnumerator implements IDictionaryEnumerator, IEnumerator {
   private int n5;
   private boolean l6;
   private Object k5;
   private Object u3;
   private int a6;
   private Hashtable u9;
   private int h0;

   Hashtable$HashtableEnumerator(Hashtable hashtable, int getObjRetType) {
      this.u9 = hashtable;
      this.n5 = Hashtable.n5(hashtable).length;
      this.h0 = Hashtable.l6(hashtable);
      this.l6 = false;
      this.a6 = getObjRetType;
   }

   @Override
   public boolean hasNext() {
      if (this.h0 != Hashtable.l6(this.u9)) {
         throw new InvalidOperationException("Collection was modified; enumeration operation may not execute");
      }

      while (this.n5 > 0) {
         this.n5--;
         Object var1 = Hashtable.n5(this.u9)[this.n5].n5;
         if (var1 != null && var1 != Hashtable.n5(this.u9)) {
            this.k5 = var1;
            this.u3 = Hashtable.n5(this.u9)[this.n5].l6;
            this.l6 = true;
            return true;
         }
      }

      this.l6 = false;
      return false;
   }

   @Override
   public void reset() {
      if (this.h0 != Hashtable.l6(this.u9)) {
         throw new InvalidOperationException("Collection was modified; enumeration operation may not execute");
      }

      this.l6 = false;
      this.n5 = Hashtable.n5(this.u9).length;
      this.k5 = null;
      this.u3 = null;
   }

   @Override
   public Object next() {
      if (!this.l6) {
         throw new InvalidOperationException("Enumeration has either not started or has already finished");
      } else if (this.a6 == 1) {
         return this.k5;
      } else {
         return this.a6 == 2 ? this.u3 : new DictionaryEntry(this.k5, this.u3);
      }
   }

   @Override
   public DictionaryEntry getEntry() {
      if (!this.l6) {
         throw new InvalidOperationException("Enumeration has either not started or has already finished");
      } else {
         return new DictionaryEntry(this.k5, this.u3);
      }
   }

   @Override
   public Object getKey() {
      if (!this.l6) {
         throw new InvalidOperationException("Enumeration has not started. Call HasNext");
      } else {
         return this.k5;
      }
   }

   @Override
   public Object getValue() {
      if (!this.l6) {
         throw new InvalidOperationException("Enumeration has either not started or has already finished");
      } else {
         return this.u3;
      }
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
