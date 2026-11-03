package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

class ListDictionary$DictionaryNodeEnumerator implements IDictionaryEnumerator, IEnumerator {
   private ListDictionary n5;
   private boolean l6;
   private ListDictionary$DictionaryNode k5;
   private int u3;

   public ListDictionary$DictionaryNodeEnumerator(ListDictionary dict) {
      this.n5 = dict;
      this.u3 = ListDictionary.n5(dict);
      this.reset();
   }

   private void n5() {
      if (this.u3 != ListDictionary.n5(this.n5)) {
         throw new InvalidOperationException("The ListDictionary's contents changed after this enumerator was instantiated.");
      }
   }

   @Override
   public boolean hasNext() {
      this.n5();
      if (this.k5 == null && !this.l6) {
         return false;
      }

      this.k5 = this.l6 ? ListDictionary.l6(this.n5) : this.k5.k5;
      this.l6 = false;
      return this.k5 != null;
   }

   @Override
   public void reset() {
      this.n5();
      this.l6 = true;
      this.k5 = null;
   }

   @Override
   public Object next() {
      return this.getEntry();
   }

   private ListDictionary$DictionaryNode l6() {
      this.n5();
      if (this.k5 == null) {
         throw new InvalidOperationException("Enumerator is positioned before the collection's first element or after the last element.");
      } else {
         return this.k5;
      }
   }

   @Override
   public DictionaryEntry getEntry() {
      Object var1 = this.l6().n5;
      return new DictionaryEntry(var1, this.k5.l6);
   }

   @Override
   public Object getKey() {
      return this.l6().n5;
   }

   @Override
   public Object getValue() {
      return this.l6().l6;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
