package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
class SortedList$Enumerator<TKey, TValue> extends h0<SortedList$Enumerator> implements IGenericEnumerator, IDictionaryEnumerator, IDisposable {
   private SortedList<TKey, TValue> n5;
   private TKey l6;
   private TValue k5;
   private int u3;
   private int a6;
   private int u9;

   public SortedList$Enumerator() {
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
      if (this.u3 == 0 || this.u3 == this.n5.size() + 1) {
         SortedList$ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
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

   public SortedList$Enumerator(SortedList<TKey, TValue> sortedList, int getEnumeratorRetType) {
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

      if ((this.u3 & 4294967295L) < (this.n5.size() & 4294967295L)) {
         this.l6 = (TKey)SortedList.l6(this.n5)[this.u3];
         this.k5 = (TValue)SortedList.k5(this.n5)[this.u3];
         this.u3++;
         return true;
      } else {
         this.u3 = this.n5.size() + 1;
         this.l6 = null;
         this.k5 = null;
         return false;
      }
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

   public void n5(SortedList$Enumerator var1) {
      var1 = var1 == null ? new SortedList$Enumerator() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
   }

   public SortedList$Enumerator n5() {
      SortedList$Enumerator var1 = new SortedList$Enumerator();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean c8(SortedList$Enumerator var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5) && var1.u3 == this.u3 && var1.a6 == this.a6 && var1.u9 == this.u9;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof SortedList$Enumerator) ? false : this.c8((SortedList$Enumerator)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public SortedList$Enumerator Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(SortedList$Enumerator bridgeArg0) {
      this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   static SortedList l6(SortedList$Enumerator var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static Object k5(SortedList$Enumerator var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Object u3(SortedList$Enumerator var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int a6(SortedList$Enumerator var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static int u9(SortedList$Enumerator var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static int h0(SortedList$Enumerator var0) {
      return var0.u9;
   }
}
