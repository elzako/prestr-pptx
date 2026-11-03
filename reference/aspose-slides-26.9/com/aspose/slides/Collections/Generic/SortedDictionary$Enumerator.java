package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;

public class SortedDictionary$Enumerator<TKey, TValue>
   extends h0<SortedDictionary$Enumerator>
   implements IGenericEnumerator<KeyValuePair<TKey, TValue>>,
   IDisposable {
   private RBTree$NodeEnumerator l6 = new RBTree$NodeEnumerator();
   private KeyValuePair<TKey, TValue> k5 = new KeyValuePair<>();
   // $VF: synthetic field
   static final boolean n5 = !SortedDictionary.class.desiredAssertionStatus();

   public SortedDictionary$Enumerator() {
   }

   SortedDictionary$Enumerator(SortedDictionary<TKey, TValue> dic) {
      this();
      SortedDictionary.n5(dic).u3().CloneTo(this.l6);
   }

   KeyValuePair<TKey, TValue> n5() {
      return this.k5;
   }

   public KeyValuePair<TKey, TValue> next() {
      return this.n5();
   }

   boolean l6() {
      if (!this.l6.hasNext()) {
         return false;
      }

      ((SortedDictionary$Node)this.l6.next()).n5().CloneTo(this.k5);
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

   private SortedDictionary$Node a6() {
      this.l6.l6();
      return (SortedDictionary$Node)this.l6.next();
   }

   public IDictionaryEnumerator getIDictionaryEnumerator() {
      return new SortedDictionary$Enumerator$1(this);
   }

   public IEnumerator getIEnumerator() {
      return new SortedDictionary$Enumerator$2(this);
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

   public void CloneTo(SortedDictionary$Enumerator that) {
      this.l6.CloneTo(that.l6);
      this.k5.CloneTo(that.k5);
   }

   public SortedDictionary$Enumerator Clone() {
      SortedDictionary$Enumerator var1 = new SortedDictionary$Enumerator();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean l6(SortedDictionary$Enumerator var1) {
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
         return !(obj instanceof SortedDictionary$Enumerator) ? false : this.l6((SortedDictionary$Enumerator)obj);
      }
   }

   public static boolean equals(SortedDictionary$Enumerator obj1, SortedDictionary$Enumerator obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   // $VF: synthetic method
   static SortedDictionary$Node n5(SortedDictionary$Enumerator var0) {
      return var0.a6();
   }
}
