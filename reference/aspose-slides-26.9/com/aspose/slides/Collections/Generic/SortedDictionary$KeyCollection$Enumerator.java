package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;

public class SortedDictionary$KeyCollection$Enumerator<TKey, TValue>
   extends h0<SortedDictionary$KeyCollection$Enumerator>
   implements IGenericEnumerator<TKey>,
   IDisposable {
   private RBTree$NodeEnumerator l6 = new RBTree$NodeEnumerator();
   private TKey k5;
   // $VF: synthetic field
   static final boolean n5 = !SortedDictionary.class.desiredAssertionStatus();

   public SortedDictionary$KeyCollection$Enumerator() {
   }

   SortedDictionary$KeyCollection$Enumerator(SortedDictionary<TKey, TValue> dic) {
      this();
      SortedDictionary.n5(dic).u3().CloneTo(this.l6);
   }

   TKey n5() {
      return this.k5;
   }

   @Override
   public TKey next() {
      return this.n5();
   }

   boolean l6() {
      if (!this.l6.hasNext()) {
         return false;
      }

      this.k5 = (TKey)((SortedDictionary$Node)this.l6.next()).n5;
      return true;
   }

   @Override
   public boolean hasNext() {
      return this.l6();
   }

   @Override
   public void dispose() {
      this.l6.dispose();
   }

   public IEnumerator getIEnumerator() {
      return new SortedDictionary$KeyCollection$Enumerator$1(this);
   }

   void k5() {
      this.l6.reset();
   }

   @Override
   public void reset() {
      this.k5();
   }

   public void _remove() {
      throw new NotSupportedException();
   }

   @Override
   public void remove() {
      this._remove();
   }

   public void CloneTo(SortedDictionary$KeyCollection$Enumerator that) {
      this.l6.CloneTo(that.l6);
      that.k5 = this.k5;
   }

   public SortedDictionary$KeyCollection$Enumerator Clone() {
      SortedDictionary$KeyCollection$Enumerator var1 = new SortedDictionary$KeyCollection$Enumerator();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean k5(SortedDictionary$KeyCollection$Enumerator var1) {
      return j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof SortedDictionary$KeyCollection$Enumerator) ? false : this.k5((SortedDictionary$KeyCollection$Enumerator)obj);
      }
   }

   public static boolean equals(SortedDictionary$KeyCollection$Enumerator obj1, SortedDictionary$KeyCollection$Enumerator obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   // $VF: synthetic method
   static RBTree$NodeEnumerator n5(SortedDictionary$KeyCollection$Enumerator var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Object l6(SortedDictionary$KeyCollection$Enumerator var0) {
      return var0.k5;
   }
}
