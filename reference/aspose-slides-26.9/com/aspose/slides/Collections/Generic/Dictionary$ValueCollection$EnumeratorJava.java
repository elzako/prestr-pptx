package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@Deprecated
@j3
public class Dictionary$ValueCollection$EnumeratorJava<TKey, TValue>
   extends h0<Dictionary$ValueCollection$EnumeratorJava>
   implements IGenericEnumerator<TValue> {
   private Dictionary$EnumeratorJava<TKey, TValue> l6 = new Dictionary$EnumeratorJava<>();
   private static final u9 k5 = new u9("Version", "Comparer", "HashSize", "KeyValuePairs");
   // $VF: synthetic field
   static final boolean n5 = !Dictionary.class.desiredAssertionStatus();

   public Dictionary$ValueCollection$EnumeratorJava() {
   }

   Dictionary$ValueCollection$EnumeratorJava(Dictionary<TKey, TValue> host) {
      host.l6().CloneTo(this.l6);
   }

   @Override
   public void dispose() {
      this.l6.dispose();
   }

   @Override
   public boolean hasNext() {
      return this.l6.hasNext();
   }

   @Override
   public TValue next() {
      return this.l6.next().getValue();
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }

   @Override
   public void reset() {
      this.l6.reset();
   }

   public void CloneTo(Dictionary$ValueCollection$EnumeratorJava that) {
      this.l6.CloneTo(that.l6);
   }

   public Dictionary$ValueCollection$EnumeratorJava Clone() {
      Dictionary$ValueCollection$EnumeratorJava var1 = new Dictionary$ValueCollection$EnumeratorJava();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(Dictionary$ValueCollection$EnumeratorJava var1) {
      return j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof Dictionary$ValueCollection$EnumeratorJava) ? false : this.n5((Dictionary$ValueCollection$EnumeratorJava)obj);
      }
   }

   public static boolean equals(Dictionary$ValueCollection$EnumeratorJava obj1, Dictionary$ValueCollection$EnumeratorJava obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      return this.l6 != null ? this.l6.hashCode() : 0;
   }
}
