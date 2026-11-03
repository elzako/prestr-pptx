package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@Deprecated
@j3
public class Dictionary$KeyCollection$EnumeratorJava<TKey, TValue> extends h0<Dictionary$KeyCollection$EnumeratorJava> implements IGenericEnumerator<TKey> {
   private Dictionary$EnumeratorJava<TKey, TValue> l6 = new Dictionary$EnumeratorJava<>();
   private static final u9 k5 = new u9("Version", "Comparer", "HashSize", "KeyValuePairs");
   // $VF: synthetic field
   static final boolean n5 = !Dictionary.class.desiredAssertionStatus();

   public Dictionary$KeyCollection$EnumeratorJava() {
   }

   Dictionary$KeyCollection$EnumeratorJava(Dictionary<TKey, TValue> host) {
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
   public TKey next() {
      return this.l6.next().getKey();
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }

   @Override
   public void reset() {
      this.l6.reset();
   }

   public void CloneTo(Dictionary$KeyCollection$EnumeratorJava that) {
      this.l6.CloneTo(that.l6);
   }

   public Dictionary$KeyCollection$EnumeratorJava Clone() {
      Dictionary$KeyCollection$EnumeratorJava var1 = new Dictionary$KeyCollection$EnumeratorJava();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(Dictionary$KeyCollection$EnumeratorJava var1) {
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
         return !(obj instanceof Dictionary$KeyCollection$EnumeratorJava) ? false : this.n5((Dictionary$KeyCollection$EnumeratorJava)obj);
      }
   }

   public static boolean equals(Dictionary$KeyCollection$EnumeratorJava obj1, Dictionary$KeyCollection$EnumeratorJava obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      return this.l6 != null ? this.l6.hashCode() : 0;
   }
}
