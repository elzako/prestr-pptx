package com.aspose.slides.Collections.Generic;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j3;

@j3
final class SortedList$SortedListKeyEnumerator<TKey, TValue> implements IGenericEnumerator<TKey>, IDisposable {
   private SortedList<TKey, TValue> l6;
   private int k5;
   private int u3;
   private TKey a6;
   // $VF: synthetic field
   final SortedList n5;

   @Override
   public final TKey next() {
      return this.a6;
   }

   public SortedList$SortedListKeyEnumerator(SortedList<TKey, TValue> var1, SortedList sortedList) {
      this.n5 = var1;
      this.l6 = sortedList;
      this.u3 = SortedList.n5(sortedList);
   }

   @Override
   public final void dispose() {
      this.k5 = 0;
      this.a6 = null;
   }

   @Override
   public final boolean hasNext() {
      if (this.u3 != SortedList.n5(this.l6)) {
         SortedList$ThrowHelper.throwInvalidOperationException("failed version");
      }

      if ((this.k5 & 4294967295L) < (this.l6.size() & 4294967295L)) {
         this.a6 = (TKey)SortedList.l6(this.l6)[this.k5];
         this.k5++;
         return true;
      } else {
         this.k5 = this.l6.size() + 1;
         this.a6 = null;
         return false;
      }
   }

   @Override
   public final void reset() {
      if (this.u3 != SortedList.n5(this.l6)) {
         SortedList$ThrowHelper.throwInvalidOperationException("failed version");
      }

      this.k5 = 0;
      this.a6 = null;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
