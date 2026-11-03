package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@Deprecated
@j3
class SortedList$EnumeratorJava<TKey, TValue> extends h0<SortedList$EnumeratorJava> implements IGenericEnumerator, IDictionaryEnumerator, IDisposable {
   private SortedList<TKey, TValue> n5;
   private TKey l6;
   private TValue k5;
   private int u3;
   private int a6;
   private int u9;

   public SortedList$EnumeratorJava() {
   }

   @Override
   public final Object getKey() {
      if (this.u3 == 0 || this.u3 == this.n5.size() + 1) {
         SortedList$ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
      }

      return this.l6;
   }

   @Override
   public final DictionaryEntry getEntry() {
      if (this.u3 == 0 || this.u3 == this.n5.size() + 1) {
         SortedList$ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
      }

      return new DictionaryEntry(this.l6, this.k5);
   }

   @Override
   public final Object next() {
      if (this.a6 != SortedList.n5(this.n5)) {
         SortedList$ThrowHelper.throwInvalidOperationException("failed version");
      }

      if (this.u3 == this.n5.size() + 1) {
         SortedList$ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
      }

      if ((this.u3 & 4294967295L) < (this.n5.size() & 4294967295L)) {
         this.l6 = (TKey)SortedList.l6(this.n5)[this.u3];
         this.k5 = (TValue)SortedList.k5(this.n5)[this.u3];
         this.u3++;
      } else {
         this.u3 = this.n5.size() + 1;
         this.l6 = null;
         this.k5 = null;
      }

      return this.u9 == 2 ? new DictionaryEntry(this.l6, this.k5) : new KeyValuePair(this.l6, this.k5);
   }

   @Override
   public final Object getValue() {
      if (this.u3 == 0 || this.u3 == this.n5.size() + 1) {
         SortedList$ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
      }

      return this.k5;
   }

   public SortedList$EnumeratorJava(SortedList<TKey, TValue> sortedList, int getEnumeratorRetType) {
      this.n5 = sortedList;
      this.u3 = 0;
      this.a6 = SortedList.n5(this.n5);
      this.u9 = getEnumeratorRetType;
      this.l6 = null;
      this.k5 = null;
   }

   @Override
   public final void dispose() {
      this.u3 = 0;
      this.l6 = null;
      this.k5 = null;
   }

   @Override
   public final boolean hasNext() {
      if (this.a6 != SortedList.n5(this.n5)) {
         SortedList$ThrowHelper.throwInvalidOperationException("failed version");
      }

      return (this.u3 & 4294967295L) < (this.n5.size() & 4294967295L);
   }

   @Override
   public final void reset() {
      if (this.a6 != SortedList.n5(this.n5)) {
         SortedList$ThrowHelper.throwInvalidOperationException("failed version");
      }

      this.u3 = 0;
      this.l6 = null;
      this.k5 = null;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   public void n5(SortedList$EnumeratorJava var1) {
      var1 = var1 == null ? new SortedList$EnumeratorJava() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
   }

   public SortedList$EnumeratorJava n5() {
      SortedList$EnumeratorJava var1 = new SortedList$EnumeratorJava();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean n5(SortedList$Enumerator var1) {
      return j8.n5(SortedList$Enumerator.l6(var1), this.n5)
         && j8.n5(SortedList$Enumerator.k5(var1), this.l6)
         && j8.n5(SortedList$Enumerator.u3(var1), this.k5)
         && SortedList$Enumerator.a6(var1) == this.u3
         && SortedList$Enumerator.u9(var1) == this.a6
         && SortedList$Enumerator.h0(var1) == this.u9;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof SortedList$EnumeratorJava) ? false : this.n5((SortedList$Enumerator)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public SortedList$EnumeratorJava Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(SortedList$EnumeratorJava bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
