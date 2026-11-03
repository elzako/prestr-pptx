package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;

public class SortedDictionary$ValueCollection$Enumerator<TKey, TValue>
   extends h0<SortedDictionary$ValueCollection$Enumerator>
   implements IGenericEnumerator<TValue>,
   IDisposable {
   private RBTree$NodeEnumerator l6 = new RBTree$NodeEnumerator();
   private TValue k5;
   // $VF: synthetic field
   static final boolean n5 = !SortedDictionary.class.desiredAssertionStatus();

   public SortedDictionary$ValueCollection$Enumerator() {
   }

   SortedDictionary$ValueCollection$Enumerator(SortedDictionary<TKey, TValue> dictionary) {
      this();
      SortedDictionary.n5(dictionary).u3().CloneTo(this.l6);
   }

   TValue n5() {
      return this.k5;
   }

   @Override
   public TValue next() {
      return this.n5();
   }

   boolean l6() {
      if (!this.l6.hasNext()) {
         return false;
      }

      this.k5 = (TValue)((SortedDictionary$Node)this.l6.next()).l6;
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
      return new SortedDictionary$ValueCollection$Enumerator$1(this);
   }

   void k5() {
      this.l6.reset();
   }

   @Override
   public void reset() {
      this.k5();
   }

   void u3() {
      throw new NotSupportedException();
   }

   @Override
   public void remove() {
      this.u3();
   }

   public void CloneTo(SortedDictionary$ValueCollection$Enumerator that) {
      this.l6.CloneTo(that.l6);
      that.k5 = this.k5;
   }

   public SortedDictionary$ValueCollection$Enumerator Clone() {
      SortedDictionary$ValueCollection$Enumerator var1 = new SortedDictionary$ValueCollection$Enumerator();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean k5(SortedDictionary$ValueCollection$Enumerator var1) {
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
         return !(obj instanceof SortedDictionary$ValueCollection$Enumerator) ? false : this.k5((SortedDictionary$ValueCollection$Enumerator)obj);
      }
   }

   public static boolean equals(SortedDictionary$ValueCollection$Enumerator obj1, SortedDictionary$ValueCollection$Enumerator obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   // $VF: synthetic method
   static RBTree$NodeEnumerator n5(SortedDictionary$ValueCollection$Enumerator var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Object l6(SortedDictionary$ValueCollection$Enumerator var0) {
      return var0.k5;
   }
}
