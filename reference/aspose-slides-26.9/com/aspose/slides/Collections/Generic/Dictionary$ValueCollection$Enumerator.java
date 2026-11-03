package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class Dictionary$ValueCollection$Enumerator<TKey, TValue> extends h0<Dictionary$ValueCollection$Enumerator> implements IGenericEnumerator<TValue> {
   private Dictionary$Enumerator<TKey, TValue> l6 = new Dictionary$Enumerator<>();
   private static final u9 k5 = new u9("Version", "Comparer", "HashSize", "KeyValuePairs");
   // $VF: synthetic field
   static final boolean n5 = !Dictionary.class.desiredAssertionStatus();

   public Dictionary$ValueCollection$Enumerator() {
   }

   Dictionary$ValueCollection$Enumerator(Dictionary<TKey, TValue> host) {
      host.n5().CloneTo(this.l6);
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
      return this.l6.n5.getValue();
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }

   @Override
   public void reset() {
      this.l6.reset();
   }

   public void CloneTo(Dictionary$ValueCollection$Enumerator that) {
      this.l6.CloneTo(that.l6);
   }

   public Dictionary$ValueCollection$Enumerator Clone() {
      Dictionary$ValueCollection$Enumerator var1 = new Dictionary$ValueCollection$Enumerator();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(Dictionary$ValueCollection$Enumerator var1) {
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
         return !(obj instanceof Dictionary$ValueCollection$Enumerator) ? false : this.n5((Dictionary$ValueCollection$Enumerator)obj);
      }
   }

   public static boolean equals(Dictionary$ValueCollection$Enumerator obj1, Dictionary$ValueCollection$Enumerator obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      return this.l6 != null ? this.l6.hashCode() : 0;
   }
}
